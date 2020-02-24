package signIns;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class SignInsTests extends BaseTests {


    @Test
    public void clickSignIns(){
        LoginPage.adminLogin();
        var signIns = homePage.clickSignIns();
    }
}
