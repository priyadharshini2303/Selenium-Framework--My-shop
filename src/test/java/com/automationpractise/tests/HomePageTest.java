package com.automationpractise.tests;

import com.automationpractise.pages.HomePage;
import com.automationpractise.pages.IndexPage;
import com.automationpractise.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends basetests {
    private IndexPage indexPage;
    private HomePage homePage;
    private LoginPage loginPage;
    @Test(description = "orderHistoryandDetailsTest")
    public void orderHistoryandDetailsTest(){
        indexPage = new IndexPage();
        loginPage =indexPage.ClickOnSign();
        homePage =loginPage.login("ADMIN@xyz.com","admin123");
        boolean result =homePage.validateOrderHistory();
        Assert.assertTrue(result);

    }


}
