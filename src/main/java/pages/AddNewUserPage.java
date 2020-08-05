package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewUserPage {

    private WebDriver driver;
    private By firstNameField = By.id("first_name_user-new");
    private By lastNameField = By.id("last_name_user-new");
    private By idField = By.id("user_id_user-new");
    private By roleField = By.id("role_user-new");

    private Select findRole() {
        return new Select(driver.findElement(roleField));
    }

    private By storeField = By.id("store_ids_user-new");

    private Select chooseStore() {
        return new Select(driver.findElement(storeField));
    }

    private By editPW = By.id("edit_pw");
    private By pwField = By.id("password_user-new");
    private By declineEmail = By.id("declined_email_user-new");
    private By submitBtn = By.name("commit");
    private By newRoleBtn = By.xpath("//*[@class='svg-inline--fa fa-user-cog fa-w-20']");
    private By newRoleField = By.id("select2-user_hat-new-container");
    private By selectSearchField = By.xpath("//input[@class='select2-search__field']");


    private By roleDesignList = By.id("hat_design_hat-new");

    private Select findRoleDesign() {
        return new Select(driver.findElement(roleDesignList));
    }

    private By roleSubmitBtn = By.xpath("//button[contains(text(),'Submit')]");
    private By userSearchField = By.xpath("//label[contains(text(),'Search:')]//input");

    public AddNewUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
    public void setNewRoleField() { WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(newRoleField));
        driver.findElement(newRoleField).click(); }
    public void setFirstNameField(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(firstNameField));
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setIdField(String idNumber) {
        driver.findElement(idField).sendKeys(idNumber);
    }

    public void selectFromRoles(String role) { findRole().selectByValue(role);
    }

    public void selectStore(String store) {
        chooseStore().selectByVisibleText(store);
    }

    public void setEditPW() {
        driver.findElement(editPW).click();
    }

    public void setDeclineEmail() {
        driver.findElement(declineEmail).click();
    }

    public void setPwField(String password) {
        driver.findElement(pwField).sendKeys(password);
    }

    public void setSubmitBtn() {
        driver.findElement(submitBtn).click();
    }

    public void setRolesPage() {
        String rolesPage = "http://www.svo.sh/hats";
        driver.get(rolesPage);
    }

    public void setNewRoleBtn() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(newRoleBtn));
        driver.findElement(newRoleBtn).click();
    }

    public void selectUserFromRoles(String userID) {driver.findElement(selectSearchField).sendKeys(userID + (Keys.ENTER));
    }

    public void selectRoleDesignForUser(String roleDesign) {
        findRoleDesign().selectByValue(roleDesign);
    }

    public void setRoleSubmitBtn() {
        driver.findElement(roleSubmitBtn).click();
    }

    public void setLogOut() {
        String logOut = "http://www.svo.sh/access/logout";
        driver.get(logOut);
    }

    public void setDeleteManagerPage() {
        String deleteManagerPage = "http://www.svo.sh/users/1128/delete";
        driver.get(deleteManagerPage);
    }

    public void setUserSearchField(String userID) {
        driver.findElement(userSearchField).sendKeys(userID);
    }

    private By idAddBtn = By.xpath("//button[@class='btn btn-outline-primary']");
    public void clickIdAddBtn(){driver.findElement(idAddBtn).click();}








}
