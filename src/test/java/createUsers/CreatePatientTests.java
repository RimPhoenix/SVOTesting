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

public class CreatePatientTests extends BaseTests {

    @Test

    public void createPatient(){

        LoginPage.level1EmployeeLogin();//change later to testEmployee
        PatientsPage patientsPage = homePage.clickPatients();
        patientsPage.setCloseBtn();
        patientsPage.setAddNewPatientBtn();
        // Creating a patient
        patientsPage.setDeclineEmail();
        patientsPage.setFirstNameField("Test" + loginDateAndTime);
        patientsPage.setLastNameField("Patient" + Keys.ENTER);
        patientsPage.setNewPrescritpion();
        patientsPage.setDoctorSelect();
        patientsPage.setDoctorSelectField("sam" + Keys.ENTER);
        patientsPage.selectRxType("distance_only");
        patientsPage.setPrescribedDate(todaysDate);
        patientsPage.setOdSphPrescription("1.25");
        patientsPage.setOsSphPrescription("-3.5");
        patientsPage.setFpdOdPrescription("23");
        patientsPage.setFpdOsPrescription("25");
        patientsPage.setCreatBtn(); //creates rx
    }
}
