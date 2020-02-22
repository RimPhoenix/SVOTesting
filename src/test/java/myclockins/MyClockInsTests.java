package myclockins;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class MyClockInsTests extends BaseTests {



    @Test
    public void clickMyClockIns(){
        LoginPage.adminLogin();
        var myClockInsPage = homePage.clickMyClockIns();
    }

}
