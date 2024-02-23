package utils;

import com.automationpractise.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshotutils {
    private Screenshotutils(){}
    public static String getScreenshot(){
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }

}
