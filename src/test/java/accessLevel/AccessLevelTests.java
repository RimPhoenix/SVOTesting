package accessLevel;

import base.BaseTests;
import clickLinks.ClickLinksTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;


public class AccessLevelTests extends ClickLinksTests {

    private void homePageListed(){
        System.out.println(driver.getTitle() + "  HomePage listed after login");
    }

    @Test
    public void testAccessForAdmin(){
        LoginPage.adminLogin();
        homePageListed();
        testURLs();
    }

    @Test
    public void testAccessForManager(){
        LoginPage.managerLogin();
        homePageListed();
        testURLs();
    }

    @Test
    public void testAccessForLevel1Employee(){
        LoginPage.level1EmployeeLogin();
        homePageListed();testURLs();
    }

    @Test
    public void testAccessForLevel2Employee(){
        LoginPage.level2EmployeeLogin();
        homePageListed();
        testURLs();
    }

    @Test
    public void testAccessForLevel3Employee(){
        LoginPage.level3EmployeeLogin();
        homePageListed();
        testURLs();
    }

    @Test
    public void testAccessForNoAccess(){
        LoginPage.noAccessLogin();
        homePageListed();
        testURLs();
    }

    @Test
    public void testAccessForStoreIPad(){
        LoginPage.storeIPadLogin();
        homePageListed();
        testURLs();
    }

    @Test
    public void testAccessForSuccessHoldingsStaff(){
        LoginPage.successHoldingsStaffLogin();
        homePageListed();
        testURLs();
    }

    @Test
    public void testAccessForHomeOfficeStaff(){
        LoginPage.homeOfficeStaffLogin();
        homePageListed();
        testURLs();
    }
    @Test
    public void testAccessForNotSignedIn(){
        testURLs();
    }




}
