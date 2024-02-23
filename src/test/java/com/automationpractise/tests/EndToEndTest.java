package com.automationpractise.tests;

import com.automationpractise.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends basetests{
    private IndexPage indexPage;
    private AddToCard addToCard;
    private SearchResultpage searchResultPage;
    private LoginPage loginPage;
    private OrderPage orderPage;
    private AddressPage addressPage;
    private ShippingPage shippingPage;
    private PaymentPage paymentPage;
    private OrderSummary orderSummary;
    private OrderConfirmationPage orderConfirmationPage;
    @Test(description = "Verifyendtoendtest")
    public  void VerifyEndToEndTest(){
        indexPage =new IndexPage();
        searchResultPage = new SearchResultpage();
        SearchResultpage SearchResultpage = indexPage.Searchproduct("t-shirt");
        searchResultPage.clickOnProduct();
        addToCard = new AddToCard();
        addToCard.SelectSize();
        addToCard.clickOnAddToCart();
        orderPage = addToCard.clickOnCheckOut();
        orderPage.clickcardone();
       loginPage = orderPage.clickOnCheckOut();

       addressPage=loginPage.login1("ADMIN@xyz.com","admin123");
       shippingPage=addressPage.clickOnCheckOut();
       shippingPage.checkTheTerms();
       paymentPage=shippingPage.clickOnProceedToCheckOut();
       orderSummary=paymentPage.clickOnPaymentMethod();
       orderConfirmationPage=orderSummary.clickOnconfirmOrderBtn();
       orderConfirmationPage.validateConfirmMessage();
       String actualMessage =orderConfirmationPage.validateConfirmMessage();
       String expectedMessage = "Your order on My Shop is complete.";
        Assert.assertEquals(actualMessage, expectedMessage);
       


    }
}



