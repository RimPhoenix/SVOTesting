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
        patientsPage.setOdSelect("113" + Keys.ENTER);
        patientsPage.setOsChoice();
        patientsPage.setOsSelect("101" + Keys.ENTER);
        patientsPage.setTrayNumber("1");
        patientsPage.setSegHeight("10");
        patientsPage.setAddOns();
        patientsPage.setAddOnsChoice();
        patientsPage.setNotes("Here are some notes");

        patientsPage.setFrameChoice();
        patientsPage.setFrameSelect("465050" + Keys.ARROW_DOWN + Keys.ENTER);

        patientsPage.setInternalNotes("Here is an internal note");

        patientsPage.setCreateOrderBtn();
        patientsPage.setCreateOrderBtn();

        patientsPage.selectFromPaymentType("cash");
        patientsPage.setTotalBtn();
        patientsPage.setAddPaymentBtn();
        //String totalAmt = patientsPage.setTotal();
        //patientsPage.setPaymentField(totalAmt);







//        Clock Out
//        homePage.setClockInBtn();
//        assertEquals(homePage.setConfirmClockIn_Out(), "None Clocked In", "Not confirmed, might still be clocked in");

    }
}
