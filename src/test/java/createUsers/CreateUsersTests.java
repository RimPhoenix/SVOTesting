package createUsers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddNewUserPage;
import pages.LoginPage;

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
//        addNewUserPage.setFirstNameField("Manager");
//        addNewUserPage.setLastNameField("TestCreated");
//        addNewUserPage.setIdField("1129");
//        addNewUserPage.selectFromRoles("manager");
//        addNewUserPage.selectStore("North Little Rock");
//        addNewUserPage.setEditPW();
//        addNewUserPage.setPwField("testmanager");
//        addNewUserPage.setDeclineEmail();
//        addNewUserPage.setSubmitBtn();
        addNewUserPage.setRolesPage();
        addNewUserPage.setNewRoleBtn();
        addNewUserPage.setNewRoleField();
        addNewUserPage.selectUserFromRoles("1129");
        addNewUserPage.selectRoleDesignForUser("6");
        addNewUserPage.setRoleSubmitBtn();

        addNewUserPage.setLogOut();
        LoginPage.testManagerLogin();

        homePage.clickManagerTools().clickUsers().clickAddNewUser();
//        addNewUserPage.setFirstNameField("Employee");
//        addNewUserPage.setLastNameField("TestByManager");
//        addNewUserPage.setIdField("1130");
//        addNewUserPage.selectFromRoles("level_1_employee");
//        addNewUserPage.selectStore("North Little Rock");
//        addNewUserPage.setEditPW();
//        addNewUserPage.setPwField("testemployee");
//        addNewUserPage.setDeclineEmail();
//        addNewUserPage.setSubmitBtn();




        //delete TestCreated Manager
        addNewUserPage.setLogOut();
        LoginPage.adminLogin();
        homePage.clickManagerTools().clickUsers();
        addNewUserPage.setDeleteManagerPage();
        addNewUserPage.setSubmitBtn();


    }

}


