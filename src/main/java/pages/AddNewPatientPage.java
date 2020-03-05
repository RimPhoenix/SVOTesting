package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewPatientPage {

    private WebDriver driver;


    //Creating a patient
    private By addNewPatientBtn = By.xpath("//button[@class='btn btn-primary']");

    public void setAddNewPatientBtn(){ driver.findElement(addNewPatientBtn).click();}


}
