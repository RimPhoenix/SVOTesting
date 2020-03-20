package orders;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class OrdersTests extends BaseTests {


    @Test

    public void clickOrders(){
        LoginPage.adminLogin();
        var ordersPage = homePage.clickOrders();
    }


}
