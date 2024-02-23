package com.automationpractise.pages;

import com.automationpractise.Reports.ExtentManager;
import com.automationpractise.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumUtils;

public class IndexPage {
    WebDriver driver;
    private static final By SignInBtn = By.xpath("//a[@class='login']");
    private static final By MyStoreLogo = By.xpath("//img[@class='logo img-responsive']");
    private static final By SearchProductBox = By.id("search_query_top");
    private static final By SearchButton = By.name("submit_search");


    public LoginPage ClickOnSign(){
        DriverManager.getDriver().findElement(SignInBtn).click();
        ExtentManager.getExtentTest().pass("click on signin successfully");
        return new LoginPage();
    }
    public boolean ValidateLogo(){
        return SeleniumUtils.isDisplayed(MyStoreLogo);

    }
    public static String getmystoretitle(){
        return DriverManager.getDriver().getTitle();

    }
    public SearchResultpage Searchproduct(String productName){
        SeleniumUtils.type(SearchProductBox, productName);
        SeleniumUtils.scrollByVisibilityOfElement(SearchButton);
        SeleniumUtils.click(SearchButton);
        ExtentManager.getExtentTest().pass("click on search product successfully");
        return new SearchResultpage();


    }
//    public SearchResultpage ClickSearchButton(){
//
//        return new SearchResultpage();
//
//    }


}
