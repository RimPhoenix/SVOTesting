package lab;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LabTests extends BaseTests {



    @Test
    public void clickLab(){
        LoginPage.adminLogin();
        var labPage = homePage.clickLab();
    }
}
