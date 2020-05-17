package inventory;

import base.BaseTests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class InventoryTests extends BaseTests {



    @Test
    public void clickInventory(){
        LoginPage.adminLogin();
        var inventory = homePage.clickInventory();

    }

    @Test
    public void inventoryCycle() throws InterruptedException {
        loginPage.adminLogin();
        InventoryPage inventoryPage = homePage.clickInventory();
        System.out.println(inventoryPage.getTitle());
        inventoryPage.setAddProductsBtn();
        inventoryPage.setPleaseSelectList();
        inventoryPage.setEmptyProductField();
        inventoryPage.setEmptyProductFieldWithProduct("346" + Keys.ENTER);
        inventoryPage.setSubmitProductBtn();
        inventoryPage.setSearchField("346 1500" + Keys.ENTER);
        System.out.println("New Product added to the Inventory");
        inventoryPage.setTrashNewProduct();
        inventoryPage.alert_getText();
        String text = inventoryPage.alert_getText();
        assertEquals(text, "Are you sure you want to delete 1500 forms - 100 pack?", "Wrong Item, don't delete");
        inventoryPage.alert_clickToAccept();
        System.out.println("Same New Product removed from the Inventory");



    }


}
