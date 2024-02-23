package com.automationpractise.pages;

import com.automationpractise.Reports.ExtentManager;
import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class OrderConfirmationPage {
    private static final By confirmMessag = By.xpath("//p[@class='alert alert-success']");
    public String validateConfirmMessage(){
        String confirmMsg = SeleniumUtils.getText(confirmMessag);
        ExtentManager.getExtentTest().pass(" get confirm Message successfully");
        return confirmMsg;
    }
}
