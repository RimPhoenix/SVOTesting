package orders;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PatientsPage;

import static org.testng.Assert.assertEquals;

public class CreateOrdersTests extends BaseTests {

    @Test

    public void createNewOrder(){

        LoginPage.level1EmployeeLogin();
        homePage.setClockInBtn();
        String clockInConfirm = homePage.setConfirmClockIn();
        assertEquals(clockInConfirm, "On The Clock", "Not confirmed, might not be clocked in");
        PatientsPage patientsPage = homePage.clickPatients();
        patientsPage.setCloseBtn();
        patientsPage.setClickSearchBtn();
        patientsPage.setSearchField("test200310173");
        patientsPage.setDesiredPatient();
        patientsPage.setNewOrderBtn();
        patientsPage.setAddJobBtn();
        patientsPage.setClickRx();
        patientsPage.setChooseRx("03" + Keys.ENTER);






        //Clock Out
        homePage.setClockInBtn();
        String clockOutConfirm = homePage.setConfirmClockOut();
        assertEquals(clockOutConfirm, "None Clocked In", "Not confirmed, might still be clocked in");

    }
}
