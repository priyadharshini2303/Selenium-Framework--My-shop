package com.automationpractise.pages;

import com.automationpractise.Reports.ExtentManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

import java.time.Duration;


public class AddToCard {
    private static final By quantity = By.id("quantity_wanted");
    private static final By Size = By.name("group_1");
    private static final By colourChange = By.id("color_14");
    private static final By addToCardBtn = By.xpath("//span[text()='Add to cart']");
    private static final By addToCartMessag = By.xpath("//span[@class='ajax_cart_product_txt_s  unvisible']");
    private static final By proceedToCheckOutBtn = By.xpath("//span[contains(text(),'Proceed to checkout')]");
    public void enterQuantity(String quantity1){
        SeleniumUtils.type(quantity, quantity1);

    }
    public void SelectSize(){
        SeleniumUtils.selectByVisibleText(Size,"M");
    }

    public void colourChangeprt(){
        SeleniumUtils.click(colourChange);
    }
    public void clickOnAddToCart(){
        SeleniumUtils.click(addToCardBtn);
    }
//    public boolean validateAddtoCart()  {
//        WebElement addToCartMessage = SeleniumUtils.
//
//        return addToCartMessage.isDisplayed();
//    }
    public OrderPage clickOnCheckOut(){

        SeleniumUtils.Jclick1(proceedToCheckOutBtn, Duration.ofSeconds(500));
        ExtentManager.getExtentTest().pass("click on AddToCard successfully");
        return new OrderPage();
    }

}
