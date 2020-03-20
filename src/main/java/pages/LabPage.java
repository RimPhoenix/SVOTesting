package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LabPage {

    public LabPage(WebDriver driver){this.driver = driver;}
    private WebDriver driver;

    private By trayInputField = By.id("tray-input");
    public void setTrayInputField(String trayNumber){
        driver.findElement(trayInputField).sendKeys(trayNumber);}

    private By computerBlockBtn = By.xpath("//button[contains(text(),'Computer/Block')]");
    public void setComputerBlockBtn(){driver.findElement(computerBlockBtn).click();}

    private By surfaceRxCoatBtn = By.xpath("//button[contains(text(),'Surface/RX + Coat')]");
    public void setSurfaceRxCoatBtn(){driver.findElement(surfaceRxCoatBtn).click();}

    private By tintingUvBtn = By.xpath("//button[contains(text(),'Tinting / UV')]");
    public void setTintingUvBtn(){driver.findElement(tintingUvBtn).click();}

    private By completedBtn = By.xpath("//button[contains(text(),'COMPLETED')]");
    public void setCompletedBtn(){driver.findElement(completedBtn).click();}


}
