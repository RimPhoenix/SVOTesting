package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddNewPatientPage {

    private WebDriver driver;
    public AddNewPatientPage(WebDriver driver) {
        this.driver = driver;
    }


    private By declineEmail = By.id("declined_email_patient-new");
        public void setDeclineEmail(){driver.findElement(declineEmail).click();}

    private By firstNameField = By.id("first_name_patient-new");
        public void setFirstNameField(String firstName) {
            driver.findElement(firstNameField).sendKeys(firstName);
        }
    private By lastNameField = By.id("last_name_patient-new");
        public void setLastNameField(String lastName) {
            driver.findElement(lastNameField).sendKeys(lastName);
        }
    private By newPrescritpion = By.xpath("//a[@class='btn btn-secondary']");
        public void setNewPrescritpion(){driver.findElement(newPrescritpion).click();}

    private By doctorSelect = By.xpath("//span[@class='select2-selection__rendered']");
        public void setDoctorSelect(){driver.findElement(doctorSelect).sendKeys("Sam" + Keys.ENTER);}
}
