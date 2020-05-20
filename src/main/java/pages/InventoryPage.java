package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {

    private WebDriver driver;

    public InventoryPage(WebDriver driver)  {this.driver = driver;}
    public String getTitle() {
        WebDriverWait wait = new WebDriverWait(driver, 6);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(addProductsBtn));
        wait.until(ExpectedConditions.visibilityOf(element));
        return driver.getTitle();
    }


       // private By showDataEntries = By.id("DataTables_Table_1_length");
        private By addProductsBtn = By.xpath("//button[@class='btn btn-primary js-confirm-this']");
        private By pleaseSelectList = By.xpath("//span[contains(text(),'Please select')]");
        private By emptyProductField = By.xpath("//html//body//span//span//span//input");
        private By submitProductBtn = By.xpath("//div[@class='modal-footer']//input[@name='commit']");
        private By searchField = By.xpath("//label[contains(text(),'Search:')]//input");
        private By trashNewProduct = By.xpath("//a[contains(@class,'btn text-primary')]//*[local-name()='svg']");
        private By checkInventoriedItem = By.xpath("//a[contains(text(),'Spray Cleaner 4oz')]");
        private By checkBatchID = By.xpath("//a[contains(text(),'110')]");
        private By quantityBefore = By.cssSelector("body.access-grid:nth-child(2) main.container-fluid:nth-child(4) div.batches.show div.card div.card-body table.nowrap.responsive.table.table-sm:nth-child(3) thead:nth-child(1) tr:nth-child(1) > th.text-center:nth-child(3)");
        private By quantityBeforeAmount = By.cssSelector("body.access-grid:nth-child(2) main.container-fluid:nth-child(4) div.batches.show div.card div.card-body table.nowrap.responsive.table.table-sm:nth-child(3) tbody:nth-child(2) tr:nth-child(1) > td.text-center:nth-child(3)");
        private By quantityAfter = By.cssSelector("body.access-grid:nth-child(2) main.container-fluid:nth-child(4) div.batches.show div.card div.card-body table.nowrap.responsive.table.table-sm:nth-child(3) thead:nth-child(1) tr:nth-child(1) > th.text-center:nth-child(4)");
        private By quantityAfterAmount = By.cssSelector("body.access-grid:nth-child(2) main.container-fluid:nth-child(4) div.batches.show div.card div.card-body table.nowrap.responsive.table.table-sm:nth-child(3) tbody:nth-child(2) tr:nth-child(1) > td.text-center:nth-child(4)");
        private By inventoryItemQuantity = By.id("quantity_inventoried_item-164");
        private By updateCheckedBtn = By.xpath("//form[@id='new_batch']");
        private By reasonForChangeList = By.xpath("//select[@id='note_text']");

//    private Select chooseShownDataEntries() {return new Select(driver.findElement(showDataEntries));}
//
//    public void selectNumberOfDataEntries(String option) {WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(showDataEntries));
//        chooseShownDataEntries().selectByVisibleText(option);}

    public void setAddProductsBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(addProductsBtn)).click();   }

    public void setPleaseSelectList(){WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(pleaseSelectList)).click();}

    public void setEmptyProductField(){WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(emptyProductField)).click();}

    public void setEmptyProductFieldWithProduct(String product){driver.findElement(emptyProductField).sendKeys(product);}

    public void setSubmitProductBtn(){driver.findElement(submitProductBtn).click();}

    public void setSearchField(String product){driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys(product);}

    public void setTrashNewProduct(){WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(trashNewProduct));
        driver.findElement(trashNewProduct).click();}

    public String alert_getText(){return driver.switchTo().alert().getText();}

    public void alert_clickToAccept(){driver.switchTo().alert().accept();}

    public void setCheckInventoriedItem(){WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.elementToBeClickable(checkInventoriedItem)).click(); }

    public void setCheckBatchID(){WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.elementToBeClickable(checkBatchID)).click(); }

    public String setQuantityBefore(){return driver.findElement(quantityBefore).getText();}

    public String setQuantityBeforeAmount(){return driver.findElement(quantityBeforeAmount).getText();}

    public String setQuantityAfter(){return driver.findElement(quantityAfter).getText();}

    public String setQuantityAfterAmount(){return driver.findElement(quantityAfterAmount).getText();}

    public String inventoryItemQuantityValue() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(inventoryItemQuantity));
        return driver.findElement(inventoryItemQuantity).getAttribute("value");}

    public void setInventoryItemQuantity(){driver.findElement(inventoryItemQuantity).sendKeys(Keys.ARROW_UP);}

    public void setUpdateCheckedBtn(){WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.elementToBeClickable(updateCheckedBtn)).click();}

    private Select chooseReasonForChange() {return new Select(driver.findElement(reasonForChangeList));}

    public void selectFromReasonForChange(String option) {chooseReasonForChange().selectByVisibleText(option);}

    public void resetInventoryItemQuantity(){driver.findElement(inventoryItemQuantity).sendKeys(Keys.ARROW_DOWN);}


}
