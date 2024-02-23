package com.automationpractise.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver driver;
    public static WebDriver getDriver(String browserName){


        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().browserVersion("122.0.6261.58").setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else if (browserName.equalsIgnoreCase("firebox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else  {
            System.err.println("Error initializing WebDriver: " );
            // Handle the exception or rethrow as needed
        }
        return driver;
        // Handle the error or throw an exception as needed
    }

}

