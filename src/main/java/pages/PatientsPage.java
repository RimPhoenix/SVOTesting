package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PatientsPage {

    private WebDriver driver;
    private By searchBox = By.name("search");
    private By resultText = By.id("dt-patient_100");
    private By closeBtn = By.xpath("//div[@id='search-patient-modal']");
    private By addNewPatientBtn = By.xpath("//button[@data-original-title='New Patient']");



    public PatientsPage(WebDriver driver)  {this.driver = driver;}

    public void waitForSearchBox(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(searchBox));
    }

    public void enterText(String text) {driver.findElement(searchBox).sendKeys(text);}

    public String getResult() {return driver.findElement(resultText).getText();}
    //Creating a patient


    public void setCloseBtn(){WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(closeBtn));
        driver.findElement(closeBtn).click();
    }

    public void setAddNewPatientBtn(){ driver.findElement(addNewPatientBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(declineEmail));
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

    private By doctorSelect = By.id("select2-doctor_id_prescription-new-container");
    public void setDoctorSelect(){WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(doctorSelect));
        driver.findElement(doctorSelect).click();}

    private By doctorSelectField = By.xpath("//input[@class='select2-search__field']");
    public void setDoctorSelectField(){driver.findElement(doctorSelectField).sendKeys("Sam" + Keys.ENTER);}

//    public AddNewPatientPage clickAddNewPatient(){
//        driver.findElement(addNewPatientBtn).click();
//        return new AddNewPatientPage(driver);
//    }

}
