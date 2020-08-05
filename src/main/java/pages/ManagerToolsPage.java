package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ManagerToolsPage {

    private WebDriver driver;

    public ManagerToolsPage(WebDriver driver){this.driver = driver;}

    private By usersLink = By.xpath("//a[contains(text(),'Users')]");

    private void clickLink() {driver.findElement(usersLink).click();}



    public UsersPage clickUsers() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(usersLink));
        WebElement element = driver.findElement(usersLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        clickLink();
        return new UsersPage(driver);
    }
}
