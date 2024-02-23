package com.automationpractise.pages;

import com.automationpractise.driver.DriverManager;
import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class HomePage {

    private static final By OrderHistory = By.xpath("//span[text()='Order history and details']");
    private static final By ViewMyCustomerAccount = By.xpath("//span[text()='Admin admin']");

    public String getcurrURL(){
        return SeleniumUtils.getCurrUrl(ViewMyCustomerAccount);

    }
//    public String getCurrURL(){
//
////        return DriverManager.getDriver().getCurrentUrl(OrderHistory);
//        return SeleniumUtils.getCurrUrl(OrderHistory);
//
//
//    }

    public boolean validateOrderHistory(){
        return SeleniumUtils.isDisplayed(OrderHistory);
    }


}
