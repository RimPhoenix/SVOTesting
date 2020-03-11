package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ManagerToolsPage {

    private WebDriver driver;

    public ManagerToolsPage(WebDriver driver){this.driver = driver;}



    private void clickLink() {driver.findElement(By.linkText("Users")).click();}



    public UsersPage clickUsers() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickLink();
        return new UsersPage(driver);
    }
}
