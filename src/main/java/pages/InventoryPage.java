package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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



        private By addProductsBtn = By.xpath("//button[@class='btn btn-primary js-confirm-this']");
        private By pleaseSelectList = By.xpath("//span[contains(text(),'Please select')]");
        private By emptyProductField = By.xpath("//html//body//span//span//span//input");
        private By submitProductBtn = By.xpath("//div[@class='modal-footer']//input[@name='commit']");
        private By searchField = By.xpath("//label[contains(text(),'Search:')]//input");
        private By trashNewProduct = By.xpath("//a[contains(@class,'btn text-primary')]//*[local-name()='svg']");




    public void setAddProductsBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(addProductsBtn)).click();
   }

    public void setPleaseSelectList(){WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(pleaseSelectList)).click();}

    public void setEmptyProductField(){WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(emptyProductField)).click();}

    public void setEmptyProductFieldWithProduct(String product){driver.findElement(emptyProductField).sendKeys(product);}

    public void setSubmitProductBtn(){driver.findElement(submitProductBtn).click();}

    public void setSearchField(String product){driver.findElement(searchField).sendKeys(product);}

    public void setTrashNewProduct(){WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(trashNewProduct));
        driver.findElement(trashNewProduct).click();}

    public String alert_getText(){return driver.switchTo().alert().getText();}

    public void alert_clickToAccept(){driver.switchTo().alert().accept();}


}
