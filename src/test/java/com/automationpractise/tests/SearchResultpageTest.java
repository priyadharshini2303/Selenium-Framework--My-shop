package com.automationpractise.tests;

import com.automationpractise.pages.IndexPage;
import com.automationpractise.pages.SearchResultpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultpageTest extends basetests {

    private IndexPage indexPage;
    private SearchResultpage searchResultPage;

    @Test(description = "productAvaliabilityTest")
    public void ProductAvialabilityTest(){
        indexPage = new IndexPage();

        indexPage.Searchproduct("t-shirt");
        searchResultPage = new SearchResultpage();
        boolean result =searchResultPage.isProductAvailable();
        Assert.assertTrue(result);

    }
}
