package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddNewUserPage {

    private WebDriver driver;
    private By firstNameField = By.xpath("//input[@id='first_name_user-new']");
    private By lastNameField = By.id("last_name_user-new");
    private By idField = By.id("user_id_user-new");
    private By roleField = By.id("role_user-new");
    private Select findRole() {return new Select(driver.findElement(roleField));}

    public AddNewUserPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setIdField(String idNumber) {
        driver.findElement(idField).sendKeys(idNumber);
    }

    public void selectFromRoles(String role) {findRole().selectByValue(role); }

    
}
