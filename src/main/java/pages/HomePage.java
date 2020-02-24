package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class HomePage {

        private WebDriver driver;

        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        private By clockInBtn = By.xpath("//div[@class='d-lg-block d-none']//input[@name='commit']");
        private By confirmClockIn = By.xpath("//h3[@class='clocked-in-header']");
        private By confirmClockOut = By.xpath("//h3[@class='h5 clocked-in-header']");

        private void clickLink(String linkText) {driver.findElement(By.linkText(linkText)).click();}

        public void setClockInBtn(){driver.findElement(clockInBtn).click();}
        public String setConfirmClockIn(){return driver.findElement(confirmClockIn).getText();}
        public String setConfirmClockOut(){return driver.findElement(confirmClockOut).getText();}

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
