package closingReport;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class ClosingReportTests extends BaseTests {

    @Test


    public void clickClosingReport(){
        LoginPage.adminLogin();
        var closingReport = homePage.clickClosingReport();
    }
}
