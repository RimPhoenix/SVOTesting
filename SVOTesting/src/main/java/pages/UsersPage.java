package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersPage {

    private WebDriver driver;
    private By addNewUser = By.cssSelector("a[class*='btn']");


    public UsersPage(WebDriver driver){this.driver = driver;}



    public AddNewUserPage clickAddNewUser(){
        driver.findElement(addNewUser).click();
        return new AddNewUserPage(driver);
    }

}
