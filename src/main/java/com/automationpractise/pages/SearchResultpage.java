package com.automationpractise.pages;

import com.automationpractise.Reports.ExtentManager;
import org.openqa.selenium.By;
import utils.SeleniumUtils;

public class SearchResultpage{
  private static final By productResult = By.xpath("//*[@id=\"center_column\"]//img");

  public Boolean isProductAvailable(){

      return SeleniumUtils.isDisplayed(productResult);

  }

  public AddToCard clickOnProduct(){
      SeleniumUtils.click(productResult);
      ExtentManager.getExtentTest().pass("click on product successfully");
      return new AddToCard();
  }
}
