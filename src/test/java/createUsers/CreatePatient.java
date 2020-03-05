package createUsers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddNewUserPage;
import pages.LoginPage;

public class CreatePatient extends BaseTests {

    @Test

    public void createPatient(){

        LoginPage.level1EmployeeLogin();//change later to testEmployee

    }
}
