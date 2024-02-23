package com.automationpractise.pages;

import com.automationpractise.Reports.ExtentManager;
import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class PaymentPage {
    private static final By bankWireMethod = By.xpath("//a[contains(text(),'Pay by bank wire')]");
    private static final By payByCheckMethod = By.xpath("//a[contains(text(),'Pay by check')]");
    public OrderSummary clickOnPaymentMethod(){
        SeleniumUtils.click(payByCheckMethod);
        ExtentManager.getExtentTest().pass("click on payment successfully");
        return new OrderSummary();
    }
}
