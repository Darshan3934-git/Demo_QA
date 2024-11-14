package com.qapitol.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {


    private static ExtentReports extent;
    private static ExtentTest test;

    // Initialize the ExtentReports object
    public static ExtentReports initializeExtentReport() {
        // Set the path where the report will be saved
        String reportPath = System.getProperty("user.dir") + "/src/test-output/ExtentReport.html";

        // Create an ExtentHtmlReporter to generate an HTML report
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

        // Initialize ExtentReports with the HTML reporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        return extent;
    }

    // Start a new test
    public static ExtentTest startTest(String testName) {
        test = extent.createTest(testName);
        return test;
    }

    // End the test
    public static void endTest() {
        extent.flush();  // Writes the report to disk
    }

    // Get the current test instance
    public static ExtentTest getTest() {
        return test;
    }
}
