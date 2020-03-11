package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


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


    public void setCloseBtn(){WebDriverWait wait = new WebDriverWait(driver, 3);
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
    public void setDoctorSelectField(String doctor){driver.findElement(doctorSelectField).sendKeys(doctor);}

    private By rxType = By.id("rx_type_prescription-new");
    public Select chooseRxType(){return new Select(driver.findElement(rxType));}
    public void selectRxType(String rxType) {chooseRxType().selectByValue(rxType);
    }
    private By prescribedDate = By.id("prescribed_date_prescription-new");
    public void setPrescribedDate(String todaysDate){driver.findElement(prescribedDate).sendKeys(todaysDate);}

    private By odSphPrescription = By.id("od_sph_prescription-new");
    public void setOdSphPrescription(String odSph){driver.findElement(odSphPrescription).sendKeys(odSph);}

    private By osSphPrescription = By.id("os_sph_prescription-new");
    public void setOsSphPrescription(String osSph){driver.findElement(osSphPrescription).sendKeys(osSph);}

    private By fpdOdPrescription = By.id("fpd_od_prescription-new");
    public void setFpdOdPrescription(String fpdOd){driver.findElement(fpdOdPrescription).sendKeys(fpdOd);}

    private By fpdOsPrescription = By.id("fpd_os_prescription-new");
    public void setFpdOsPrescription(String fpdOs){driver.findElement(fpdOsPrescription).sendKeys(fpdOs);}

    private By creatBtn = By.name("commit");
    public void setCreatBtn(){driver.findElement(creatBtn).click();}

    private By clickSearchBtn = By.xpath("//main[@class='container-fluid']//button[1]");
    public void setClickSearchBtn(){driver.findElement(clickSearchBtn).click();}

    private By searchField = By.xpath("//label[contains(text(),'Search:')]//input");
    public void setSearchField(String patient){
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchField)));
        driver.findElement(searchField).sendKeys(patient);}

    private By desiredPatient = By.xpath("//tr[@id='dt-patient_100473']");
    public void setDesiredPatient(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(desiredPatient));
        driver.findElement(desiredPatient).click();
    }

    private By newOrderBtn = By.xpath("//main[@class='container-fluid']//a[2]");
    public void setNewOrderBtn(){driver.findElement(newOrderBtn).click();}

    private By addJobBtn = By.xpath("//a[contains(text(),'Add Job')]");
    public void setAddJobBtn(){WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.elementToBeClickable(addJobBtn));
        driver.findElement(addJobBtn).click();}

    private By clickRx = By.id("select2-job_rx_id--container");
    public void setClickRx(){WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(clickRx));driver.findElement(clickRx).click();}

    private By chooseRx = By.xpath("//input[@class='select2-search__field']");
    public void setChooseRx(String rx){WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(chooseRx));driver.findElement(chooseRx).sendKeys(rx);}



}
