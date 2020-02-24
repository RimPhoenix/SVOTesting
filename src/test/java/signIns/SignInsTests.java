package signIns;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class SignInsTests extends BaseTests {


    @Test
    public void clickSignIns(){
        LoginPage.adminLogin();
        var signIns = homePage.clickSignIns();
    }
}
