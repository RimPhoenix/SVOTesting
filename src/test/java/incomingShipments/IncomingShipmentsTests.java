package incomingShipments;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.IncomingShipmentsPage;
import static org.testng.Assert.*;



public class IncomingShipmentsTests extends BaseTests {

    @Test
    public void packingSlips() throws InterruptedException {

        loginPage.adminLogin();
        IncomingShipmentsPage incomingShipmentsPage = homePage.clickIncomingShipments();
        System.out.println(incomingShipmentsPage.getTitle());
        incomingShipmentsPage.setNewPackingSlipBtn();
        String destination = "Success Holdings";
        incomingShipmentsPage.selectPackageDestination(destination);
        incomingShipmentsPage.setPackingSlipTrackingNumber(trackingNumberDandT);//format YYHHmmss
        incomingShipmentsPage.setCreatePackingSlipBtn();
        incomingShipmentsPage.setAddItemBtn();
        incomingShipmentsPage.setItemField();
        incomingShipmentsPage.setItemSearchField("483125");
        Thread.sleep(20);
        incomingShipmentsPage.setItemSearchField(Keys.ENTER+"");
        String lineItem1Qty = "3";
        incomingShipmentsPage.setChangeQuantity(lineItem1Qty);
        incomingShipmentsPage.setAddLineItemBtn();
        String lineItem1 = incomingShipmentsPage.LineItemProduct1Text();
        assertEquals(lineItem1, "483125 · Contact Cases", "Not the correct item");
        System.out.println("Added "+lineItem1Qty + ": " +lineItem1 + " to the packing slip");
        incomingShipmentsPage.setAddItemBtn();
        incomingShipmentsPage.setItemField();
        incomingShipmentsPage.setItemSearchField("479791");
        Thread.sleep(20);
        incomingShipmentsPage.setItemSearchField(Keys.ENTER+"");
        String lineItem2Qty = "4";
        incomingShipmentsPage.setChangeQuantity(lineItem2Qty);
        incomingShipmentsPage.setAddLineItemBtn();
        String lineItem2 = incomingShipmentsPage.LineItemProduct2Text();
        assertEquals(lineItem2, "479791 · Eyeceptors Backside - Neon Green", "Not the correct item");
        System.out.println("Added "+lineItem2Qty + ": " +lineItem2+ " to the packing slip");
        incomingShipmentsPage.setAddItemBtn();
        incomingShipmentsPage.setItemField();
        incomingShipmentsPage.setItemSearchField("483750");
        Thread.sleep(20);
        incomingShipmentsPage.setItemSearchField(Keys.ENTER+"");
        String lineItem3Qty = "2";
        incomingShipmentsPage.setChangeQuantity(lineItem3Qty);
        incomingShipmentsPage.setAddLineItemBtn();
        String lineItem3 = incomingShipmentsPage.LineItemProduct3Text();
        assertEquals(lineItem3, "483750 · Hard Case", "Not the correct item");
        System.out.println("Added "+lineItem3Qty + ": " +lineItem3 + " to the packing slip");
        incomingShipmentsPage.setPackingSlipNote("Here is the note for the packing slip");
        incomingShipmentsPage.setAddNoteBtn();
        String changeLineItem3Qty = "5";
        incomingShipmentsPage.setChangeLineItemQty(changeLineItem3Qty);
        incomingShipmentsPage.setUpdatePackingSlipBtn();
        String lineItem1AndQty = incomingShipmentsPage.LineItemProduct1TextPage2() + " Qty: " + incomingShipmentsPage.LineItemProduct1QtyText();
        assertEquals(lineItem1AndQty, "483125 · Contact Cases Qty: 3 × $2.00", "Was not the correct number");
        String lineItem2AndQty = incomingShipmentsPage.LineItemProduct2TextPage2() + " Qty: " + incomingShipmentsPage.LineItemProduct2QtyText();
        assertEquals(lineItem2AndQty, "479791 · Eyeceptors Backside - Neon Green Qty: 4 × $5.94", "Was not the correct number");
        String lineItem3AndQty = incomingShipmentsPage.LineItemProduct3TextPage2() + " Qty: " + incomingShipmentsPage.LineItemProduct3QtyText();
        assertEquals(lineItem3AndQty, "483750 · Hard Case Qty: 5 × $1.00", "Was not the correct number");
        System.out.println("All items are confirmed and ready to ship");
        incomingShipmentsPage.setShipBtn();
        String trackingInformation = "Your shipment status: " + incomingShipmentsPage.trackingStatusText() + " And your Shipment No. is: " + incomingShipmentsPage.trackingNumberText();
        System.out.println(trackingInformation);
        incomingShipmentsPage.setReceivedBtn();
        Thread.sleep(50);
        incomingShipmentsPage.setPackingSlipsLink();
        Thread.sleep(50);
        System.out.println(incomingShipmentsPage.getTitle());
        String deliveryStatus = incomingShipmentsPage.deliveredStatusText();
        assertEquals(deliveryStatus, "delivered", "Something is not correct, it is not delivered");
        System.out.println("The items status is now: " + deliveryStatus);
    }
}
