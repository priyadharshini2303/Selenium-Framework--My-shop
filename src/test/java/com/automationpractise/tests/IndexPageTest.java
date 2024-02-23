package com.automationpractise.tests;

import com.automationpractise.pages.IndexPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexPageTest extends basetests{
    @Test(description = "To verify the logo")
    public void verifyLogo(){
        IndexPage indexPage = new IndexPage();

        boolean result = indexPage.ValidateLogo();
        Assert.assertTrue(result);
    }
    @Test(description = "To verify the title")
    public static void verifyTitle(){
        String actualtitle = IndexPage.getmystoretitle();
        Assert.assertEquals(actualtitle,"My Shop");
    }



}
