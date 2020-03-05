package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PatientsPage {

    private WebDriver driver;
    private By searchBox = By.name("search");
    private By resultText = By.id("dt-patient_100");
    private By closeBtn = By.xpath("//div[@id='search-patient-modal']");
    private By addNewPatientBtn = By.xpath("//button[@class='btn btn-primary']");



    public PatientsPage(WebDriver driver)  {this.driver = driver;}

    public void waitForSearchBox(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(searchBox));
    }

    public void enterText(String text) {driver.findElement(searchBox).sendKeys(text);}

    public String getResult() {return driver.findElement(resultText).getText();}
    //Creating a patient

    public void setAddNewPatientBtn(){ driver.findElement(addNewPatientBtn).click();}

    public PatientsPage setCloseBtn(){driver.findElement(closeBtn).click();
        return null;
    }


    public AddNewPatientPage clickAddNewPatient(){
        driver.findElement(addNewPatientBtn).click();
        return new AddNewPatientPage(driver);
    }

}
