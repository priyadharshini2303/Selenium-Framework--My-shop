package com.automationpractise.Listeners;

import com.automationpractise.Reports.ExtentManager;
import com.automationpractise.Reports.ExtentReport;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.Screenshotutils;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result){
        ExtentReport.createTest(result.getName());

    }
    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentManager.getExtentTest().pass(result.getName()+" is passed");

    }
    @Override
    public void onTestFailure(ITestResult result) {

        ExtentManager.getExtentTest().fail(result.getName()+" is failed");
        ExtentManager.getExtentTest().fail(result.getName()+" is failed",
                MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshotutils.getScreenshot()).build());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext context) {
        ExtentReport.initReports();

    }
    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.flushReports();
    }

}


