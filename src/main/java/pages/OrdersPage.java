package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersPage {

      private WebDriver driver;

      public OrdersPage(WebDriver driver)  {this.driver = driver;}

      private By traySearchField = By.xpath("//label[contains(text(),'Search:')]//input");
      public void setTraySearchField(String trayNumber){driver.findElement(traySearchField).sendKeys(trayNumber);}

      private By showOnlyRdyPickup = By.xpath("//label[contains(text(),'Show Only Ready for Pickup')]");
      public void setShowOnlyRdyPickup(){driver.findElement(showOnlyRdyPickup).click();}
}
