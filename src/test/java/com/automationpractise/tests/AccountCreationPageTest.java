package com.automationpractise.tests;

import com.automationpractise.pages.AccountCreationPage;
import com.automationpractise.pages.IndexPage;
import com.automationpractise.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountCreationPageTest extends basetests{
    private IndexPage indexPage;
    private LoginPage loginPage;
    private AccountCreationPage accountCreationPage;
    @Test(description = "CreateAccountPageTest")
    public void verifyCreateAccountPageTest (){
      IndexPage indexPage = new IndexPage();
      loginPage=indexPage.ClickOnSign();
      accountCreationPage=loginPage.createNewAccount("priyss@gmail.com");
      Boolean result = accountCreationPage.validateAcountCreatePage();
        Assert.assertTrue(result);
    }



}
