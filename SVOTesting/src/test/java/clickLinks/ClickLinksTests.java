package clickLinks;

import base.BaseTests;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Constants;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ClickLinksTests extends BaseTests {


     String baseUrl = "http://www.svo.sh/";

  //  public ClickLinksTests(WebDriver driver) { this.driver = driver }


    private void checkUrl( String path){
        driver.get(baseUrl + path );        System.out.println(driver.getTitle() + "  -->  " + path);
    }

    @Test
    public void testURLs() {
        //used in the AccessLevelTests, If you want to run this by it's self add a LoginPage.(any login level you desire) before the checkUrl

        checkUrl("admin");        //  driver.get(baseUrl + "admin" );        System.out.println(driver.getTitle());
        checkUrl("notes");
        checkUrl("download/1");         //need correct id number
        checkUrl("station_stops/1");
        checkUrl("constants");
        checkUrl("approved_ip_addresses");
        checkUrl("line_items/1433");         //need correct id number
        checkUrl("payments/1");
        checkUrl("chattels/1");
        checkUrl("access/home");
        checkUrl("access/determine_home");
        checkUrl("access/login");
        checkUrl("access/profile");
        checkUrl("access/edit");
        checkUrl("access/help");          //doesn't have a title
        //checkUrl("access/logout" );          //works but logs you out so all later tests are the login screen, maybe save for last
        //checkUrl("access/timeout" );         //maybe broken, just says true and doesn't have a title, also seems to log you out
        checkUrl("access/picklist");
        checkUrl("insurance_lines");
        checkUrl("access/manager_tools");
        checkUrl("access/admin_tools");
        checkUrl("logs/api");          // (500) error, something went wrong.
        checkUrl("logs");
        checkUrl("logs/patient/100");          // it says :class/:id I am unsure if the :class is an id number as well or a class to be written (500)
        checkUrl("lab");
        checkUrl("api/job_count/2");
        checkUrl("sign_in");
        checkUrl("sign_in/1");
        checkUrl("queries");
        checkUrl("queries/new");
        checkUrl("queries/1");
        checkUrl("queries/1/edit");
        checkUrl("queries/1/delete");
        checkUrl("queries/1/restore");
        checkUrl("query/report_by_sku");
        checkUrl("tray/123");         //no tray found with 1
        checkUrl("clock_in");
        checkUrl("clock_in/20");
        checkUrl("insurance_lines");
        checkUrl("insurance_lines/39");         //no title
        checkUrl("insurance_lines/api");         //(500)
        checkUrl("stations");
        checkUrl("stations/1");         // unspecified
        checkUrl("hat_designs");
        checkUrl("hat_designs/1");
        checkUrl("categories");         //(404)
        checkUrl("categories/1");         //need correct number
        checkUrl("inventoried_items/1");
        checkUrl("inventoried_items/api");
        checkUrl("users");
        checkUrl("users/new");
        checkUrl("users/1887/edit");         //need correct id number (404)
        checkUrl("users/random_id");
        checkUrl("users/1887/delete");         //need correct id number (404)
        checkUrl("users/1887/commissions");         //need correct id number (404)
        checkUrl("stores");
        checkUrl("stores/new");
        checkUrl("stores/1");
        checkUrl("stores/1/edit");          //different format to what is listed in the email
        checkUrl("stores/api");
        checkUrl("stores/1/printer");
        checkUrl("stores/1/delete");
        checkUrl("stores/1/inventory");
        checkUrl("stores/1/closing_report");
        checkUrl("stores/1/labels");
        checkUrl("patients");
        checkUrl("patients/new");
        checkUrl("patients/100");
        checkUrl("patients/100/edit");    //format is different than on the email
        checkUrl("patients/api");
        checkUrl("patients/search");
        checkUrl("patients/advanced_search");    //(500)
        checkUrl("patients/full_name_search");    //empty "data" array page
        checkUrl("patients/email_search");    //empty "data" array page
        checkUrl("patients/100/rx");
        checkUrl("patients/100/policy");
        checkUrl("patients/100/notes");
        checkUrl("patients/100/check_in");
        checkUrl("patients/100/need_help");
        checkUrl("doctors");
        checkUrl("doctors/new");
        checkUrl("doctors/1");
        checkUrl("doctors/1/edit");
        checkUrl("doctors/api");
        checkUrl("doctors/1/delete");
        checkUrl("products");
        checkUrl("products/api");    //(500)
        checkUrl("accessories");
        checkUrl("accessories/new");
        checkUrl("accessories/1");
        checkUrl("accessories/1/price_check");
        checkUrl("cases");
        checkUrl("cases/new");
        checkUrl("cases/1");
        checkUrl("cases/1/edit");
        checkUrl("equipment");
        checkUrl("equipment/new");
        checkUrl("equipment/1");
        checkUrl("equipment/1/edit");
        checkUrl("frames/");
        checkUrl("frames/new");
        checkUrl("frames/10328");
        checkUrl("frames/10328/edit");
        checkUrl("frames/10328/print_bin_label");
        checkUrl("frames/");
        checkUrl("intangibles/");
        checkUrl("intangibles/new");
        checkUrl("intangibles/105");
        checkUrl("intangibles/105/edit");
        checkUrl("lab_supplies/");
        checkUrl("lab_supplies/new");
        checkUrl("lab_supplies/6");
        checkUrl("lab_supplies/6/edit");
        checkUrl("office_supplies/");
        checkUrl("office_supplies/new");
        checkUrl("office_supplies/1");
        checkUrl("office_supplies/1/edit");
        checkUrl("uniforms/");
        checkUrl("uniforms/new");
        checkUrl("uniforms/55");
        checkUrl("uniforms/55/edit");
        checkUrl("jobs/378");
        checkUrl("jobs/378/sms");    //(404)
        checkUrl("jobs/378/lab");    //(404)
        checkUrl("jobs/378/header");    //(404)
        checkUrl("jobs/378/station_stops");    //(404)
        checkUrl("jobs/378/tray_sheet");    //(404)
        checkUrl("jobs/378/print_dymo");    //(404)
        checkUrl("jobs/378/print_bro_label");    //(404)
        checkUrl("hats/");
        checkUrl("hats/1");
        checkUrl("hats/1/edit");
        checkUrl("clock_ins/");
        checkUrl("clock_ins/new");
        checkUrl("clock_ins/20");    //(404)
        checkUrl("clock_ins/20/edit");    //(404)
        checkUrl("clock_ins/user");
        checkUrl("clock_ins/employee_index");
        checkUrl("clock_ins/bulk");
        checkUrl("clock_ins/store_quick");
        checkUrl("clock_ins/20/notes");    //(404)
        checkUrl("packing_slips/");
        checkUrl("packing_slips/new");
        checkUrl("packing_slips/50");    //(404)
        checkUrl("packing_slips/50/edit");    //(404)
        checkUrl("packing_slips/incoming");
        checkUrl("packing_slips/report");
        checkUrl("packing_slips/50/received");
        checkUrl("orders/");
        checkUrl("orders/new");
        checkUrl("orders/519");
        checkUrl("orders/519/edit");
        checkUrl("orders/accessory");
        checkUrl("orders/519/pickup_info");
        checkUrl("orders/519/job");
        checkUrl("orders/519/email_receipt");
        checkUrl("orders/519/view_receipt");
        checkUrl("orders/519/receipt");
        checkUrl("orders/519/print_all_tray_sheets");
        checkUrl("orders/519/print_all_dymos");
        checkUrl("orders/519/print_all_bro_lables");
        checkUrl("daysheets/");
        checkUrl("daysheets/new");
        checkUrl("daysheets/1");
        checkUrl("daysheets/1/edit");
        checkUrl("daysheets/search");
        checkUrl("daysheets/1/view_print_out");
        checkUrl("daysheets/1/print_out");
        checkUrl("daysheets/1/view_pdf");
        checkUrl("prescriptions/1/edit");
        checkUrl("prescriptions/1/restore");
        checkUrl("batches/");
        checkUrl("batches/1");
        checkUrl("batches/api");
        checkUrl("sign_ins/");
        checkUrl("sign_ins/new");
        checkUrl("sign_ins/1");
        checkUrl("sign_ins/store");
        checkUrl("api/v1/users");
        checkUrl("api/v1/users/1887");
        checkUrl("api/v1/jobs");
        checkUrl("api/v1/jobs/1");
        checkUrl("api/v1/1/jobs");
        checkUrl("api/");
        checkUrl("api_update/");
        checkUrl("access/logout" );          //works but logs you out so all later tests are the login screen, maybe save for last
    }

}
