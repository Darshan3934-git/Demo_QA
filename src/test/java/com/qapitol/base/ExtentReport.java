package com.qapitol.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {


    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports initializeExtentReport() {

        String reportPath = System.getProperty("user.dir") + "/src/test-output/ExtentReport.html";

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        return extent;
    }

    public static ExtentTest startTest(String testName) {
        test = extent.createTest(testName);
        return test;
    }

    public static void endTest() {
        extent.flush();
    }

    public static ExtentTest getTest() {
        return test;
    }
}
