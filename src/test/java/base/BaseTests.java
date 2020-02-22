package base;

import com.google.common.io.Files;
import okio.Timeout;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.ManagerToolsPage;
import utils.WindowManager;
import utils.Constants;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class BaseTests {//extends LoginPage {

    public EventFiringWebDriver driver;
    public WebDriverWait wait;
    protected HomePage homePage;
    protected ManagerToolsPage managerToolsPage;
    protected LoginPage loginPage;



    public void waitForLoad(WebDriver driver){
    ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
        @NullableDecl
        @Override
        public Boolean apply(@NullableDecl WebDriver driver) {
            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
        }
    };
    WebDriverWait wait = new WebDriverWait(driver, 2);
    wait.until(pageLoadCondition);
}

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.get("http://www.svo.sh/access/login?url=http%3A%2F%2Fwww.svo.sh%2Faccess%2Fhome");
        loginPage = new LoginPage(driver);
        //driver.manage().window().maximize();

        //****Before any test can be run, make sure you Login with the account you want from the LoginPage
        //****In the Method TYPE LoginPage.(choose login level)
     }


        @BeforeMethod
            public void goToLogin(){
            var baseUrl = "http://www.svo.sh/";
            driver.get(baseUrl + "access/home");
            waitForLoad(driver);
//            driver.get("http://www.svo.sh/access/home");
            homePage = new HomePage(driver);
        }



    @AfterMethod

    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    // ****** If you want a ScreenShot after every method use this code.
    //    public void takeScreenshot(){
//        var camera = (TakesScreenshot)driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//        //System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
//        try{
//            Files.move(screenshot, new File("resources/screenshots/test.png"));
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);  ***//Runs Test without opening browser
        return options;
    }

  //  @AfterClass
  //  public void tearDown(){
   //     driver.quit();
  //  }




}
