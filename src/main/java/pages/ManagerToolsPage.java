package pages;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ManagerToolsPage {

    private WebDriver driver;

    public ManagerToolsPage(WebDriver driver){this.driver = driver;}



    private void clickLink(String linkText) {driver.findElement(By.linkText(linkText)).click();}



    public UsersPage clickUsers() {
        clickLink("Users");
        return new UsersPage(driver);
    }
}
