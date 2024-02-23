package com.automationpractise.tests;

import com.automationpractise.TestData.TestData;
import com.automationpractise.pages.HomePage;
import com.automationpractise.pages.IndexPage;
import com.automationpractise.pages.LoginPage;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;


public class LoginPageTest extends basetests {
    private IndexPage indexPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @DataSupplier
    public StreamEx<TestData> getData() {
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("TestDataset (1).xlsx")
                .read();
    }


    @Test (dataProvider = "getData")
    public void loginTest(TestData testData) {
        indexPage = new IndexPage();
        indexPage.ClickOnSign();
        LoginPage loginPage = new LoginPage();
        loginPage.login(testData.Username, testData.password);
        homePage = new HomePage();
//        String actualURL = homePage.getcurrURL();
//        String expectedURL = "http://www.automationpractice.pl/index.php?controller=history";
//        Assert.assertEquals(actualURL,expectedURL);

    }
//    @DataSupplier
//    public Object[][] getDatas() {
//        return new Object[][] {
//                {"ADMIN@xyz.com", "admin123"}
//
//                // Add more data sets as needed
//        };
//    }


//

}









