package createUsers;

import base.BaseTests;
import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AddNewUserPage;
import pages.ManagerToolsPage;

import pages.LoginPage;


public class CreateTests extends BaseTests {




    @Test

public void clickAddNewUser() {

    LoginPage.adminLogin();
    var addNewUser = homePage.clickManagerTools().clickUsers().clickAddNewUser();
    waitForLoad(driver);
    System.out.println(driver.getTitle());
    assertEquals(addNewUser.getTitle(), "SVO Users", "Title did not match");
}

@Test
    public void CreateManager() {
    LoginPage.adminLogin();
    AddNewUserPage addNewUserPage = homePage.clickManagerTools().clickUsers().clickAddNewUser();
    addNewUserPage.setFirstNameField("Manager");
    addNewUserPage.setLastNameField("TestCreated");
    addNewUserPage.setIdField("1119");
    addNewUserPage.selectFromRoles("manager");
    addNewUserPage.selectStore("North Little Rock");
    addNewUserPage.setEditPW();
    addNewUserPage.setPwField("testmanager");
    addNewUserPage.setDeclineEmail();
    addNewUserPage.setSubmitBtn();
    addNewUserPage.setLogOut();
    LoginPage.testManagerLogin();
    homePage.clickManagerTools().clickUsers().clickAddNewUser();
    addNewUserPage.setFirstNameField("Employee");

    //delete TestCreated Manager
    addNewUserPage.setLogOut();
    LoginPage.adminLogin();
    homePage.clickManagerTools().clickUsers();
    addNewUserPage.setDeleteManagerPage();
    addNewUserPage.setSubmitBtn();








}

}


