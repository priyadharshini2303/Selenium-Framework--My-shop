package com.automationpractise.tests;

import com.automationpractise.Reports.ExtentReport;
import com.automationpractise.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class basetests {


    @BeforeMethod
    public void setup(){

        Driver.initDriver();
    }
    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}
