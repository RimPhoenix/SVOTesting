package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage {

    private WebDriver driver;
    private By addNewUser = By.xpath("//a[@class='btn btn-primary']");


    public UsersPage(WebDriver driver){this.driver = driver;}



    public AddNewUserPage clickAddNewUser(){
        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.presenceOfElementLocated(addNewUser));
        driver.findElement(addNewUser).click();
        return new AddNewUserPage(driver);
    }

}
