package orders;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Constants;

public class OrdersTests extends BaseTests {


    @Test

    public void clickOrders(){
        LoginPage.adminLogin();
        var ordersPage = homePage.clickOrders();
    }
}
