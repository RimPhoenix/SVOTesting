package patients;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PatientsPage;

public class PatientsTests extends BaseTests {



    @Test
    public void searchForBob(){
        LoginPage.adminLogin();
        var patientsPage = homePage.clickPatients();
       // patientsPage.enterText("Bob" + Keys.ENTER);
        //assertEquals(patientsPage.getResult(), "Bob");
    }

    @Test

    public void addInsurancePolicy(){
        LoginPage.adminLogin();
        PatientsPage patientsPage = homePage.clickPatients();
        patientsPage.setCloseBtn();
        patientsPage.setClickSearchBtn();
        patientsPage.setSearchField("test200310173");
        patientsPage.setDesiredPatient();
        patientsPage.setAddPolicyBtn();
        patientsPage.selectInsurer("9");
        patientsPage.setMemberIdField("123456");
        patientsPage.setAuthorizationNbrField("456789");
        patientsPage.setSsnEndingField("1234");
        patientsPage.setFrameAllowanceField("10");
        patientsPage.setCoPayField("2");
        patientsPage.setSubmitAddInsurancePolicyBtn();


    }

}
