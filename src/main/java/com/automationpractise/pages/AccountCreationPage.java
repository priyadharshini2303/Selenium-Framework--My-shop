package com.automationpractise.pages;

import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class AccountCreationPage{
    private static final By FromTitle = By.xpath("//h1[text()='Create an account']");
    private static final By ClickMr = By.id("uniform-id_gender1");
    private static final By  Clickmrs  = By.id("id_gender2");
    private static final By FirstName = By.name("customer_firstname");
    private static final By LastName = By.name("customer_lastname");
    private static final By Password = By.name("passwd");
    private static final By Days = By.name("days");
    private static final By Months = By.name("months");
    private static final By Years = By.name("years");
    private static final By newsletter = By.name("newsletter");
    private static final By registerBtn = By.name("submitAccount");


//    public void createAccount(String gender,String fName,
//                              String lName,
//                              String pswd,
//                              String day,
//                              String month,
//                              String year) {
//        if (gender.equalsIgnoreCase("mr")) {
//            SeleniumUtils.click(ClickMr);
//        } else {
//            SeleniumUtils.click(Clickmrs);
//        }
//        SeleniumUtils.type(FirstName,fName);
//        SeleniumUtils.type(LastName,lName);
//        SeleniumUtils.type(Password,pswd);
//        SeleniumUtils.selectByValue(Days,day);
//        SeleniumUtils.selectByValue(Months,month);
//        SeleniumUtils.selectByValue(Years,year);
//        SeleniumUtils.click(newsletter);
//    }
    public HomePage validateRegistration() {
        SeleniumUtils.click(registerBtn);
        return new HomePage();
    }
    public boolean validateAcountCreatePage(){

        return SeleniumUtils.isDisplayed(FromTitle);
    }




}
