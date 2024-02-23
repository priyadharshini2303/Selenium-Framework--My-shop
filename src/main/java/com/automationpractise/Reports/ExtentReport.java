package com.automationpractise.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    private ExtentReport(){}
    public static ExtentReports extent;
    public static ExtentTest extentTest;
    public static void initReports(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("User.dir")+"/test-output/ExtentReport/"+"/mystore.html");
        extent.attachReporter(spark);
        extent.setSystemInfo("HostName", "MyHost");
        extent.setSystemInfo("ProjectName", "MyStoreProject");
        extent.setSystemInfo("Tester", "priya");
        extent.setSystemInfo("OS", "Win10");
        extent.setSystemInfo("Browser", "Chrome");

    }
    public static void flushReports(){

        extent.flush();
    }
    public static void createTest(String testCaseName){

        extentTest = extent.createTest(testCaseName);
        ExtentManager.setExtentTest(extentTest);
    }
}
