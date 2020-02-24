package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewUserPage {

    private WebDriver driver;
    private By firstNameField = By.xpath("//input[@id='first_name_user-new']");
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
    private String rolesPage = "http://www.svo.sh/hats";
    private By newRoleBtn = By.xpath("//button[@class='btn btn-primary multi-edit show-hat-form collapse show']");

    private Select findUserForRole() {
        return new Select(driver.findElement(newRoleBtn));
    }

    private By roleDesignList = By.id("hat_design_hat-new");

    private Select findRoleDesign() {
        return new Select(driver.findElement(roleDesignList));
    }

    private By roleSubmitBtn = By.xpath("//button[contains(text(),'Submit')]");

    private String logOut = "http://www.svo.sh/access/logout";
    private String deleteManagerPage = "http://www.svo.sh/users/1119/delete";
    private By userSearchField = By.xpath("//label[contains(text(),'Search:')]//input");

    public AddNewUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
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

    public void selectFromRoles(String role) {
        findRole().selectByValue(role);
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
        driver.get(rolesPage);
    }

    public void setNewRoleBtn() {
        driver.findElement(newRoleBtn).click();
    }

    public void selectUserFromRoles(String userID) {
        findUserForRole().selectByValue(userID);
    }

    public void selectRoleDesignForUser(String roleDesign) {
        findRoleDesign().selectByVisibleText(roleDesign);
    }

    public void setRoleSubmitBtn() {
        driver.findElement(roleSubmitBtn).click();
    }

    public void setLogOut() {
        driver.get(logOut);
    }

    public void setDeleteManagerPage() {
        driver.get(deleteManagerPage);
    }

    public void setUserSearchField(String userID) {
        driver.findElement(userSearchField).sendKeys(userID);
    }


}
