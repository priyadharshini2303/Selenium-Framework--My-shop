package utils;

import com.automationpractise.config.ConfigFactory;
import com.automationpractise.driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static com.automationpractise.driver.Driver.driver;


public class SeleniumUtils {
    public static void click(By by) {
        WebElement element = waituntilElementpresent(by);
        element.click();
    }



    public static void Jclick1(By by, Duration waitDuration) {
        WebElement element = WaituntilElementPresent(by, waitDuration);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].click();",element);
//        element.click();
    }
    public static WebElement WaituntilElementPresent(By by, Duration waitDuration) {
        long seconds = waitDuration.getSeconds();
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), seconds);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void sendkeys(By by, String value){
        WebElement element = waituntilElementpresent(by);
        element.sendKeys(value);
    }

    public static boolean isDisplayed(By by){
        WebElement element = waituntilElementpresent(by);
        return element.isDisplayed();

    }
    public static void scrollByVisibilityOfElement(By by){
        WebElement element = waituntilElementpresent(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public static boolean isEnabled(By by) {
        WebElement element = waituntilElementpresent(by);
        return element.isEnabled();
    }
    public static String getText(By by){
        WebElement element = waituntilElementpresent(by);
        return element.getText();

    }
    public static void dropdown(By by){
        WebElement element = waituntilElementpresent(by);
        Select select = new Select(element);
        select.selectByVisibleText("M");
    }
    

    public static String getCurrUrl(By by) {
        WebElement element = waituntilElementpresent(by);
        return element.getAttribute("href");
//        if (element != null) {
//            return element.getAttribute("href");
//        } else {
//            System.out.println("Element specified by the locator was not found.");
//            return null; // or throw an exception, depending on your requirements
//        }
    }



    public static void selectByValue(By by, String Value){
        WebElement element = waituntilElementpresent(by);
        Select select = new Select(element);
        select.selectByValue(Value);


    }
    public static void selectByVisibleText(By by, String Value) {
        WebElement element = waituntilElementpresent(by);
        Select select = new Select(element);
        select.selectByVisibleText(Value);
    }

    public static void type(By by, String text){
        WebElement element = waituntilElementpresent(by);
        element.sendKeys(text);

    }
    public static void mouseHover(By by){
        WebElement element = waituntilElementpresent(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }


    private static WebElement waituntilElementpresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
