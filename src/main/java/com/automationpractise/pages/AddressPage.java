package com.automationpractise.pages;

import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class AddressPage {
    private static final By proceedToCheckOut = By.xpath("//span[text()='Proceed to checkout']");
    public ShippingPage clickOnCheckOut(){
        SeleniumUtils.click(proceedToCheckOut);
        return new ShippingPage();
    }

}
