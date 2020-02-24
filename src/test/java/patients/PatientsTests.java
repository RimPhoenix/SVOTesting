package patients;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class PatientsTests extends BaseTests {



    @Test
    public void searchForBob(){
        LoginPage.adminLogin();
        var patientsPage = homePage.clickPatients();
       // patientsPage.enterText("Bob" + Keys.ENTER);
        //assertEquals(patientsPage.getResult(), "Bob");
    }
}
