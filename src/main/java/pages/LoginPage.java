package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    private static EventFiringWebDriver driver;
    private static void printLoggedInMessage(String loggedInAs){
            System.out.println("You are logged in as " + loggedInAs);
        }

    public LoginPage(EventFiringWebDriver driver) {
        LoginPage.driver = driver;
    }

    //public void login(String userName, String passWord){        }
    public static void adminLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.AdminUserID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys((Constants.AdminPW) + (Keys.ENTER));
        //pwBox.sendKeys(Keys.ENTER);

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("store"))));

        driver.findElement(By.name("store")).click();
        WebElement loginButton = driver.findElement(By.name("button"));
        loginButton.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='/access/profile' and text()='Robbie Moritz']"))));

        printLoggedInMessage("Admin");
        driver.findElement(By.xpath("//a[@href='/access/profile' and text()='Robbie Moritz']"));
    }

    public static void managerLogin() {

        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.ManagerUserID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.ManagerPW);
        pwBox.sendKeys(Keys.ENTER);

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("store"))));

        driver.findElement(By.name("store")).click();
        WebElement loginButton = driver.findElement(By.name("button"));
        loginButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Test1 Manager']")));
        printLoggedInMessage("Test1 Manager");

    }

    public static void level1EmployeeLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.Level1EmployeeID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.Level1EmployeePW);
        WebElement loginButton = driver.findElement(By.name("button"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Test1 Employee']")));
        printLoggedInMessage("Test1 Empoyee");

    }

    public static void level2EmployeeLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.Level2EmployeeID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.Level2EmployeePW);
        pwBox.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Test2 Employee']")));
        printLoggedInMessage("Test2 Employee");

    }

    public static void level3EmployeeLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.Level3EmployeeID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.Level3EmployeePW);
        WebElement loginButton = driver.findElement(By.name("button"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Test3 Employee']")));
        printLoggedInMessage("Test3 Employee");

    }

    public static void noAccessLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.NoAccessID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.NoAccessPW);
        WebElement loginButton = driver.findElement(By.name("button"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Test1 NoAccess']")));
        printLoggedInMessage("Test1 NoAccess");

    }

    public static void storeIPadLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.StoreIPadID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.StoreIPadPW);
        pwBox.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Test2 StoreIpad']")));
        printLoggedInMessage("Test2 StoreIpad");

    }

    public static void successHoldingsStaffLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.SuccessHoldingsStaffID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.SuccessHoldingsStaffPW);
        pwBox.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Test1 SuccessHoldingsStaff']")));
        printLoggedInMessage("Test1 SuccessHoldingsStaff");

    }

    public static void homeOfficeStaffLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.HomeOfficeStaffID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.HomeOfficeStaffPW);
        pwBox.sendKeys(Keys.ENTER);

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("store"))));

        driver.findElement(By.name("store")).click();
        WebElement loginButton = driver.findElement(By.name("button"));
        loginButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Test1 HomeOfficeStaff']")));
        printLoggedInMessage("Test1 HomeOfficeStaff");
    }

    public static void testManagerLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.TestManagerID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.TestManagerPW);
        WebElement loginButton = driver.findElement(By.name("button"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Manager TestCreated']")));
        printLoggedInMessage("Manager TestCreated");
    }
    public static void level1TestEmployeeLogin() {
        WebElement idBox = driver.findElement(By.name("id"));
        idBox.click();
        idBox.sendKeys(Constants.TestEmployeeID);

        WebElement pwBox = driver.findElement(By.name("password"));
        pwBox.click();
        pwBox.sendKeys(Constants.TestEmployeePW);
        WebElement loginButton = driver.findElement(By.name("button"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/access/profile' and text()='Employee TestByManager']")));
        printLoggedInMessage("Employee TestByManager");

    }


}
