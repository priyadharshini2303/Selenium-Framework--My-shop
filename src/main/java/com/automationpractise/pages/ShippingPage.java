package com.automationpractise.pages;

import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class ShippingPage {
    private static final By terms = By.id("cgv");
    private static final By proceedToCheckOutBtn = By.xpath("//button/span[contains(text(),'Proceed to checkout')]");
    public void checkTheTerms(){
        SeleniumUtils.click(terms);
    }
    public PaymentPage clickOnProceedToCheckOut(){
        SeleniumUtils.click(proceedToCheckOutBtn);
        return new PaymentPage();
    }

}
