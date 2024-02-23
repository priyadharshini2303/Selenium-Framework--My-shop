package com.automationpractise.pages;

import com.automationpractise.Reports.ExtentManager;
import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class OrderPage {
    private static final By unitPrice = By.xpath("//td[@class='cart_unit']/span/span");
    private static final By clickCard = By.cssSelector("a[title='View my shopping cart']");
    private static final By proceedToCheckOut = By.xpath("//span[text()='Proceed to checkout']");


    public void clickcardone(){
        SeleniumUtils.click(clickCard);

    }
    public LoginPage clickOnCheckOut(){
        SeleniumUtils.click(proceedToCheckOut);
        ExtentManager.getExtentTest().pass("click on orderpageClickoncheckout successfully");
        return new LoginPage();
    }
}
