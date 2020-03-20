package lab;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LabPage;
import pages.LoginPage;

public class LabTests extends BaseTests {



    @Test
    public void clickLab(){
        LoginPage.adminLogin();
        LabPage labPage = homePage.clickLab();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        labPage.setTrayInputField("122");//tray number you want to check
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        labPage.setComputerBlockBtn();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        labPage.setSurfaceRxCoatBtn();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        labPage.setTintingUvBtn();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        labPage.setCompletedBtn();
    }
}
