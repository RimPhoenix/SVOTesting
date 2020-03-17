package myclockins;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class ClockInTests extends BaseTests {


    @Test

    public void clockIn() {
        //Login
        LoginPage.adminLogin();
        //Clock In
        homePage.setClockInBtn();
        String clockInConfirm = homePage.setConfirmClockIn_Out();
        assertEquals(clockInConfirm, "On The Clock", "Not confirmed, might not be clocked in");
        //Clock Out
        homePage.setClockInBtn();
        String clockOutConfirm = homePage.setConfirmClockIn_Out();
        assertEquals(clockOutConfirm, "None Clocked In", "Not confirmed, might still be clocked in");
    }

}
