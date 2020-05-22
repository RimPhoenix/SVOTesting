package inventory;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import static org.testng.Assert.assertEquals;



public class InventoryTests extends BaseTests {



    @Test
    public void clickInventory(){
        LoginPage.adminLogin();
        var inventory = homePage.clickInventory();

    }

    @Test
    public void inventoryCycle() {
        loginPage.adminLogin();
        InventoryPage inventoryPage = homePage.clickInventory();
        System.out.println(inventoryPage.getTitle());
//        String option = "10";
//        inventoryPage.selectNumberOfDataEntries(option);
        inventoryPage.setAddProductsBtn();
        inventoryPage.setPleaseSelectList();
        inventoryPage.setEmptyProductField();
        inventoryPage.setEmptyProductFieldWithProduct("346" + Keys.ENTER);
        inventoryPage.setSubmitProductBtn();
        inventoryPage.setSearchField("346 1500" + Keys.ENTER);
        System.out.println("New Product added to the Inventory");
        inventoryPage.setTrashNewProduct();
        inventoryPage.alert_getText();
        String alertText = inventoryPage.alert_getText();
        assertEquals(alertText, "Are you sure you want to delete 1500 forms - 100 pack?", "Wrong Item, don't delete");
        inventoryPage.alert_clickToAccept();
        System.out.println("Same New Product removed from the Inventory");
        inventoryPage.setSearchField("4oz" + Keys.ENTER);
        inventoryPage.setCheckInventoriedItem();
        System.out.println("Now looking at a 4oz bottle page");
        inventoryPage.setCheckBatchID();
        System.out.println("Now looking at the batch ID for the 4oz bottle");
        String quantityBeforeText = inventoryPage.setQuantityBefore();
        String quantityBeforeAmountText = inventoryPage.setQuantityBeforeAmount();
        String quantityAfterText = inventoryPage.setQuantityAfter();
        String quantityAfterAmountText = inventoryPage.setQuantityAfterAmount();
        System.out.println("Spray Cleaner: " + quantityBeforeText + " " + quantityBeforeAmountText);
        System.out.println("Spray Clearer: " + quantityAfterText + " " + quantityAfterAmountText);
        getWindowManager().goBack();
        getWindowManager().goBack();
        String inventoryValue = inventoryPage.inventoryItemQuantityValue();
        assertEquals(inventoryValue, "5", "Not the correct value");
        inventoryPage.setInventoryItemQuantity();
        inventoryPage.setUpdateCheckedBtn();
        System.out.println("Tried to update the Qty but did not give a reason so it didn't work");
        assertEquals(inventoryValue, "5", "Not the correct value");
        System.out.println("Quantity is: " + inventoryValue);
        String reasonForChange = "Stock Refresh";
        inventoryPage.selectFromReasonForChange(reasonForChange);
        inventoryPage.setUpdateCheckedBtn();
        String newInventoryValue = inventoryPage.inventoryItemQuantityValue();
        assertEquals(newInventoryValue, "6", "Not the correct value");
        System.out.println("After providing a reason we are allowed to change the Qty");
        System.out.println("Quantity is: " + newInventoryValue);
        inventoryPage.resetInventoryItemQuantity();
        inventoryPage.setUpdateCheckedBtn();
        String oldInventoryValue = inventoryPage.inventoryItemQuantityValue();
        assertEquals(oldInventoryValue, "5", "Not the correct value");
        System.out.println("returned the product Qty to the original number");
        System.out.println("Quantity is: " + oldInventoryValue);







    }


}
