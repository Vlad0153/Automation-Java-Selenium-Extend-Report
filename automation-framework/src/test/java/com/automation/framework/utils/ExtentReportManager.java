package com.automation.framework.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static void createInstance() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public static ExtentReports getInstance() {
        return extent;
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void startTest(String testName) {
        test = extent.createTest(testName);
    }

    public static void flush() {
        extent.flush();
    }
}