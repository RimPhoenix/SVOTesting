package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncomingShipmentsPage {

    private WebDriver driver;

    public IncomingShipmentsPage(WebDriver driver) {this.driver = driver;}

    public String getTitle() {
        WebDriverWait wait = new WebDriverWait(driver, 6);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(newPackingSlipBtn));
        wait.until(ExpectedConditions.visibilityOf(element));
        return driver.getTitle(); }

    private By newPackingSlipBtn = By.xpath("//body[contains(@class,'')]/main[contains(@class,'container-fluid')]/div[contains(@class,'packing_slips index')]/a[1]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]");
    private By packingSlipDestination = By.id("packing_slip_destination_id");
    private By packingSlipTrackingNumber = By.id("packing_slip_tracking_number");
    private By createPackingSlipBtn = By.xpath("//button[contains(@class,'btn btn-primary')]");
    private By addItemBtn = By.xpath("//a[contains(@class,'btn btn-info')]");
    private By itemField = By.id("select2-line_item_inventoried_item_sku-line_item-new-container");
    private By itemSearchField = By.className("select2-search__field");
    private By changeQuantity = By.id("line_item_quantity-line_item-new");
    private By addLineItemBtn = By.xpath("//div[contains(@class,'modal-footer')]//input[contains(@name,'commit')]");
    private By lineItemProduct1 = By.xpath("//tr[1]//td[1]");
    private By lineItemProduct1Page2 = By.xpath("//table[2]//tbody[1]//tr[1]//td[1]");
    private By lineItemProduct1Qty = By.xpath("//tr[1]//td[2]");
    private By lineItemProduct2 = By.xpath("//tr[2]//td[1]");
    private By lineItemProduct2Page2 = By.xpath("//table[2]//tbody[1]//tr[2]//td[1]");
    private By getLineItemProduct2Qty = By.xpath("//tr[2]//td[2]");
    private By lineItemProduct3 = By.xpath("//tr[3]//td[1]");
    private By lineItemProduct3Page2 = By.xpath("//table[2]//tbody[1]//tr[3]//td[1]");
    private By lineItemProduct3Qty = By.xpath("//tr[3]//td[2]");
    private By packingSlipNote = By.id("note_text");
    private By addNoteBtn = By.xpath("//form[@id='new_note']//input[contains(@name,'commit')]");
    private By changeLineItemQty = By.xpath("//tr[3]//td[2]//input[1]");
    private By updatePackingSlipBtn = By.xpath("//div[contains(@class,'form-buttons')]//button[1]");
    private By shipBtn = By.partialLinkText("Ship");
    private By trackingNumber = By.xpath("//tr[5]//td[1]");
    private By trackingStatus = By.xpath("//tr[2]//td[1]");
    private By receivedBtn = By.xpath("//a[contains(text(),'Received')]");
    private By packingSlipsLink = By.linkText("Packing Slips");
    private By deliveryStatus = By.xpath("//tr[1]//td[3]");


    public void setNewPackingSlipBtn() {driver.findElement(newPackingSlipBtn).click();    }

    private Select chooseDestination() {return new Select(driver.findElement(packingSlipDestination));}

    public void selectPackageDestination(String option) {chooseDestination().selectByVisibleText(option);}

    public void setPackingSlipTrackingNumber(String trackingNumber){driver.findElement(packingSlipTrackingNumber).clear();
         driver.findElement(packingSlipTrackingNumber).sendKeys(trackingNumber);}

    public void setCreatePackingSlipBtn() {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(createPackingSlipBtn)).click();}

    public void setAddItemBtn() {driver.findElement(addItemBtn).click();}

    public void setItemField() {driver.findElement(itemField).click();}

    public void setItemSearchField(String item) {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(itemSearchField)).sendKeys(item); }

    public void setChangeQuantity(String quantity) {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(changeQuantity)).clear();
        driver.findElement(changeQuantity).sendKeys(quantity);}

    public void setAddLineItemBtn() {driver.findElement(addLineItemBtn).click();}

    public String LineItemProduct1Text() {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(lineItemProduct1));
        return driver.findElement(lineItemProduct1).getText();}

    public String LineItemProduct2Text() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(lineItemProduct2));
        return driver.findElement(lineItemProduct2).getText();}

    public String LineItemProduct3Text() {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(lineItemProduct3));
        return driver.findElement(lineItemProduct3).getText();}

    public void setPackingSlipNote(String note){
        driver.findElement(packingSlipNote).sendKeys(note);    }

    public void setAddNoteBtn(){WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.elementToBeClickable(addNoteBtn)).click();}

    public void setChangeLineItemQty(String quantity) {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(changeLineItemQty)).clear();
        driver.findElement(changeLineItemQty).sendKeys(quantity);}

    public void setUpdatePackingSlipBtn(){driver.findElement(updatePackingSlipBtn).click();}

    public String LineItemProduct1TextPage2() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(lineItemProduct1Page2));
        return driver.findElement(lineItemProduct1Page2).getText();}

    public String LineItemProduct2TextPage2() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(lineItemProduct2Page2));
        return driver.findElement(lineItemProduct2Page2).getText();}

    public String LineItemProduct3TextPage2() {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(lineItemProduct3Page2));
        return driver.findElement(lineItemProduct3Page2).getText();}

    public String LineItemProduct1QtyText() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(lineItemProduct1Qty));
        return driver.findElement(lineItemProduct1Qty).getText();}

    public String LineItemProduct2QtyText() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(getLineItemProduct2Qty));
        return driver.findElement(getLineItemProduct2Qty).getText();}

    public String LineItemProduct3QtyText() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(lineItemProduct3Qty));
        return driver.findElement(lineItemProduct3Qty).getText();}

    public void setShipBtn(){driver.findElement(shipBtn).click();}

    public String trackingNumberText() {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(trackingNumber));
        return driver.findElement(trackingNumber).getText();}

    public String trackingStatusText() {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(trackingStatus));
        return driver.findElement(trackingStatus).getText();}

    public void setReceivedBtn() {driver.findElement(receivedBtn).click();}

    public void setPackingSlipsLink() {WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(packingSlipsLink));
        driver.findElement(packingSlipsLink).click();}

    public String deliveredStatusText() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(deliveryStatus));
        return driver.findElement(deliveryStatus).getText();}
}