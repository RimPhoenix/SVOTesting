package createUsers;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AddNewPatientPage;
import pages.LoginPage;
import pages.PatientsPage;

public class CreatePatient extends BaseTests {

    @Test

    public void createPatient(){

        LoginPage.level1EmployeeLogin();//change later to testEmployee
        PatientsPage patientsPage = homePage.clickPatients();
        patientsPage.setCloseBtn();
        patientsPage.setAddNewPatientBtn();
        // Creating a patient
        patientsPage.setDeclineEmail();
        patientsPage.setFirstNameField("Test5");
        patientsPage.setLastNameField("Patient" + Keys.ENTER);
        patientsPage.setNewPrescritpion();
        patientsPage.setDoctorSelect();
        patientsPage.setDoctorSelectField();
    }
}
