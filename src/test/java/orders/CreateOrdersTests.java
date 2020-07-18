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
        int trayNumber = (19);
        LoginPage.adminLogin();
        switch (homePage.setConfirmClockIn_Out()) {
            case "On The Clock":
                assertEquals(homePage.setConfirmClockIn_Out(), "On The Clock", "Not confirmed, you might be clocked out");
                System.out.println(homePage.setConfirmClockIn_Out());
                break;
            default:
                assertEquals(homePage.setConfirmClockIn_Out(), "None Clocked In", "Not confirmed, you might be clocked in");
                homePage.setClockInBtn();
                System.out.println(homePage.setConfirmClockIn_Out());
                break;
        }
        PatientsPage patientsPage = homePage.clickPatients();
        patientsPage.setCloseBtn();
        patientsPage.setClickSearchBtn();
        patientsPage.setSearchField("test200310173");
        patientsPage.setDesiredPatient();
        patientsPage.setNewOrderBtn();
        patientsPage.setAddJobBtn();
        patientsPage.setClickRx();
        patientsPage.setChooseRx("03" + Keys.ENTER);
        patientsPage.setTimePromised();
        patientsPage.setOdChoice();
        patientsPage.setOdSelect("4100" + Keys.ENTER);
        patientsPage.setOsChoice();
        patientsPage.setOsSelect("4122" + Keys.ENTER);
        patientsPage.setTrayNumber("20");
        patientsPage.setSegHeight("10");
        patientsPage.setAddOns();
        patientsPage.setAddOnsChoice();
        patientsPage.setNotes("Here are some notes");
        patientsPage.setFrameChoice();
        patientsPage.setFrameSelect("485782" + Keys.ARROW_DOWN + Keys.ENTER);
        patientsPage.setInternalNotes("Here is an internal note");
        patientsPage.setCreateOrderBtn();
        patientsPage.setCreateOrderBtn();
        patientsPage.selectFromPaymentType("cash");
        patientsPage.setTotalBtn();
        patientsPage.setAddPaymentBtn();
        patientsPage.setPaidInFull();
        patientsPage.setSubmitToLabBtn();
//        String totalAmt = patientsPage.setTotal();
//        patientsPage.setPaymentField(totalAmt);





//
//
//        Clock Out
//        homePage.setClockInBtn();
//        assertEquals(homePage.setConfirmClockIn_Out(), "None Clocked In", "Not confirmed, might still be clocked in");

    }
}
