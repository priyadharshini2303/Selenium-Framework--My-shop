package com.automationpractise.driver;

import com.automationpractise.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

public class Driver {
    public static WebDriver driver;
    public static void initDriver(){
        String browserName = ConfigFactory.getConfig().browserName();
        driver = DriverFactory.getDriver(browserName);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get(ConfigFactory.getConfig().url());
    }
    public static void quitDriver(){
        DriverManager.getDriver().quit();
    }
}
