package com.qapitol.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.qapitol.base.BaseClass;
import com.qapitol.base.ExtentReport;
import com.qapitol.pages.Elements;
import com.qapitol.util.ConfigReader;
import org.testng.annotations.*;

public class Elements_Runner extends BaseClass {
    Elements elements = new Elements();
    ConfigReader configReader = new ConfigReader();
    ExtentTest test;

    @BeforeMethod
    public void setUp()
    {
        BaseClass.initialize();
        BaseClass.navigateToURl(configReader.getProperty("elementURL"));
        // Extend report
        ExtentReport.initializeExtentReport();
        test = ExtentReport.startTest("Element Section Testing");

    }

    @Test(priority = 0, enabled = false)
    public void testBoxTesting() throws InterruptedException {
        elements.textBox();
    }
    @Test(priority = 1, enabled = true)
    public void checkBoxTesting() throws InterruptedException {
        elements.checkBox();
    }
    @Test(priority = 2, enabled = true)
    public void radioButton() throws InterruptedException {
    }
    @Test(priority = 3, enabled = true)
    public void ButtonsTesting() throws InterruptedException {
        elements.Buttons();
    }
    @Test(priority = 4,enabled = true)
    public void linksTesting() throws InterruptedException {
        elements.links();
    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        elements.teardown();

        ExtentReport.endTest();
    }
}
