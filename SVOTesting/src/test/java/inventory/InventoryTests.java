package inventory;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class InventoryTests extends BaseTests {



    @Test
    public void clickInventory(){
        LoginPage.adminLogin();
        var inventory = homePage.clickInventory();
    }

}
