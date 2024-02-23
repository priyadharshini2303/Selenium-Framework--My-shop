package com.automationpractise.pages;

import com.automationpractise.Reports.ExtentManager;
import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class LoginPage {
    private static final By UserName = By.id("email");
    private static final By Password = By.id("passwd");
    private static final By SignInBtn = By.id("SubmitLogin");
    private static final By EmailForNewAccount = By.name("email_create");
    private static final By CreateNewAccountBtn = By.name("SubmitCreate");



    public HomePage login(String Username, String password){
        SeleniumUtils.type(UserName, Username);
        SeleniumUtils.type(Password, password);
        SeleniumUtils.click(SignInBtn);
        ExtentManager.getExtentTest().pass("Click on login successfully");
        return new HomePage();
    }


    public AddressPage login1(String Username,String password) {
        SeleniumUtils.type(UserName, Username);
        SeleniumUtils.type(Password, password);
        SeleniumUtils.click(SignInBtn);
        return new AddressPage();
    }

    public AccountCreationPage createNewAccount(String newEmail){
        SeleniumUtils.type(EmailForNewAccount, newEmail);
        SeleniumUtils.click(CreateNewAccountBtn);
        return new AccountCreationPage();
    }




}
