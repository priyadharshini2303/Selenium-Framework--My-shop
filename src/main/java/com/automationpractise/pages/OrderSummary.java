package com.automationpractise.pages;

import com.automationpractise.Reports.ExtentManager;
import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class OrderSummary {
    private static final By confirmOrderBtn = By.xpath("//span[contains(text(),'I confirm my order')]");
    public OrderConfirmationPage clickOnconfirmOrderBtn(){
        SeleniumUtils.click(confirmOrderBtn);
        ExtentManager.getExtentTest().pass("click on ordersummary successfully");
        return new OrderConfirmationPage();
    }
}
