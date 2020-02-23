package patients;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.*;

public class PatientsTests extends BaseTests {



    @Test
    public void searchForBob(){
        LoginPage.adminLogin();
        var patientsPage = homePage.clickPatients();
       // patientsPage.enterText("Bob" + Keys.ENTER);
        //assertEquals(patientsPage.getResult(), "Bob");
    }
}
