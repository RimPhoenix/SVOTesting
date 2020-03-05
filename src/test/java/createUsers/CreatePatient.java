package createUsers;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AddNewPatientPage;
import pages.LoginPage;
import pages.PatientsPage;

public class CreatePatient extends BaseTests {

    @Test

    public void createPatient(){

        LoginPage.level1EmployeeLogin();//change later to testEmployee
        PatientsPage patientsPage = homePage.clickPatients().setCloseBtn();
        AddNewPatientPage addNewPatientPage = patientsPage.clickAddNewPatient();

        // Creating a patient
        addNewPatientPage.setDeclineEmail();
        addNewPatientPage.setFirstNameField("Test5");
        addNewPatientPage.setLastNameField("Patient" + Keys.ENTER);
        addNewPatientPage.setNewPrescritpion();
        addNewPatientPage.setDoctorSelect();
    }
}
