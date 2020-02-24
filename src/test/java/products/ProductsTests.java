package products;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class ProductsTests extends BaseTests {



    @Test
    public void clickProducts(){
        LoginPage.adminLogin();
        var productsPage = homePage.clickProducts();
    }

}
