package com.automationpractise.tests;

import com.automationpractise.pages.AddToCard;
import com.automationpractise.pages.IndexPage;
import com.automationpractise.pages.OrderPage;
import com.automationpractise.pages.SearchResultpage;
import org.testng.annotations.Test;

public class OrderPageTest extends basetests{
    private IndexPage indexPage;
    private SearchResultpage searchResultPage;
    private AddToCard addToCard;
    private OrderPage orderPage;
    @Test(description = "verifyOrderPageTest")
    public void verifyOrderPageTest(){
        indexPage =new IndexPage();
        searchResultPage = new SearchResultpage();
        SearchResultpage SearchResultpage = indexPage.Searchproduct("t-shirt");
        searchResultPage.clickOnProduct();
//        addToCard.enterQuantity("2");
        addToCard = new AddToCard();
        addToCard.SelectSize();
//        addToCard.colourChangeprt();
        addToCard.clickOnAddToCart();
        orderPage = addToCard.clickOnCheckOut();


    }
}
