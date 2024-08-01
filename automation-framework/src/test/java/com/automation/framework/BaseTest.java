package com.automation.framework;

import com.automation.framework.utils.ExtentReportManager;
import com.automation.framework.utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        ExtentReportManager.createInstance();
    }

    @BeforeMethod
    public void initialize() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenshotUtil.captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }

    @AfterTest
    public void cleanUp() {
        ExtentReportManager.flush();
    }
}