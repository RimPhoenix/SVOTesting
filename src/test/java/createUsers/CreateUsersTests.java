package createUsers;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AddNewUserPage;
import pages.LoginPage;
import utils.Constants;

import java.util.Collections;

import static org.testng.Assert.assertEquals;


public class CreateUsersTests extends BaseTests {


    @Test

    public void clickAddNewUser() {

        LoginPage.adminLogin();
        var addNewUser = homePage.clickManagerTools().clickUsers().clickAddNewUser();
        waitForLoad(driver);
        System.out.println(driver.getTitle());
        assertEquals(addNewUser.getTitle(), "SVO Users", "Title did not match");

    }

    @Test
    public void createManager() {
        LoginPage.adminLogin();
        AddNewUserPage addNewUserPage = homePage.clickManagerTools().clickUsers().clickAddNewUser();
        assertEquals(addNewUserPage.getTitle(), "SVO Users", "Title did not match");
        System.out.println("Create a Manager");
        addNewUserPage.setFirstNameField("Manager");
        addNewUserPage.setLastNameField("TestCreated");
        //addNewUserPage.setIdField("MngTest"+loginDateAndTime);
        addNewUserPage.setIdField(LoginPage.mngLogin);
        //var mngLogin = ("MngTest"+loginDateAndTime);
        addNewUserPage.selectFromRoles("manager");
        addNewUserPage.selectStore("North Little Rock");
        addNewUserPage.setEditPW();
        addNewUserPage.setPwField(Constants.TestManagerPW);
        addNewUserPage.setDeclineEmail();
        addNewUserPage.setSubmitBtn();
        System.out.println("Create roles for the manager");
        addNewUserPage.setRolesPage();
        addNewUserPage.setNewRoleBtn();
        addNewUserPage.setNewRoleField();
        addNewUserPage.selectUserFromRoles(LoginPage.mngLogin);
        addNewUserPage.selectRoleDesignForUser("6");
        addNewUserPage.setRoleSubmitBtn();

        addNewUserPage.setLogOut();

            LoginPage.testManagerLogin();

        homePage.clickManagerTools().clickUsers().clickAddNewUser();
        System.out.println("Create a level 1 Employee");
        addNewUserPage.setFirstNameField("Employee");
        addNewUserPage.setLastNameField("TestByManager");
        addNewUserPage.clickIdAddBtn();
        addNewUserPage.selectFromRoles("level_1_employee");
        addNewUserPage.selectStore("North Little Rock");
        addNewUserPage.setEditPW();
        addNewUserPage.setPwField(Constants.TestEmployeePW);
        addNewUserPage.setDeclineEmail();
        addNewUserPage.setSubmitBtn();
        addNewUserPage.setLogOut();

        LoginPage.level1EmployeeLogin();
        // Login as Level 1 Employee


        }

        @Test
        public void deleteManager(){
        AddNewUserPage addNewUserPage = homePage.clickManagerTools().clickUsers().clickAddNewUser();
        //delete TestCreated Manager
        addNewUserPage.setLogOut();
        LoginPage.adminLogin();
        homePage.clickManagerTools().clickUsers();
        addNewUserPage.setDeleteManagerPage();
        addNewUserPage.setSubmitBtn();


    }

}


