package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class HomePage {

        private WebDriver driver;

        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        private void clickLink(String linkText) {driver.findElement(By.linkText(linkText)).click();}

        public PatientsPage clickPatients(){
            clickLink("Patients");
            return new PatientsPage(driver);
        }

        public LabPage clickLab(){
            clickLink("Lab");
            return new LabPage(driver);
        }

        public OrdersPage clickOrders(){
            clickLink("Orders");
            return new OrdersPage(driver);
        }

        public ProductsPage clickProducts(){
            clickLink("Products");
            return new ProductsPage(driver);
        }

        public MyClockInsPage clickMyClockIns(){
            clickLink("My Clock-ins");
            return new MyClockInsPage(driver);
        }

        public SignInsPage clickSignIns(){
            clickLink("Sign Ins");
            return new SignInsPage(driver);
        }

        public InventoryPage clickInventory(){
            clickLink("Inventory");
            return new InventoryPage(driver);
        }

        public ClosingReportPage clickClosingReport(){
            clickLink("Closing Report");
            return new ClosingReportPage(driver);
        }

        public ManagerToolsPage clickManagerTools(){
            clickLink("Manager Tools");
            return new ManagerToolsPage(driver);
        }
}
