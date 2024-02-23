package com.automationpractise.tests;

import com.automationpractise.pages.AddToCard;
import com.automationpractise.pages.IndexPage;
import com.automationpractise.pages.SearchResultpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCardPageTest extends basetests {
    private IndexPage indexPage;
    private AddToCard addToCard;
    private SearchResultpage searchResultPage;


    @Test(description = "VerifyAddToCardPageTest")
    public void verifyAddToCardPageTest()  {
        indexPage =new IndexPage();
        searchResultPage = new SearchResultpage();
        SearchResultpage SearchResultpage = indexPage.Searchproduct("t-shirt");
        searchResultPage.clickOnProduct();
//        addToCard.enterQuantity("2");
        addToCard = new AddToCard();
        addToCard.SelectSize();
//        addToCard.colourChangeprt();
        addToCard.clickOnAddToCart();
//        boolean result =addToCard.validateAddtoCart();
//        Assert.assertTrue(result);


    }

}
