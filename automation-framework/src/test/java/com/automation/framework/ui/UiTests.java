package com.automation.framework.ui;

import com.automation.framework.BaseTest;
import com.automation.framework.utils.ExtentReportManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UiTests extends BaseTest {
    @Test
    public void testNavigation() {
        driver.get("http://example.com/navigation-url");
        // Perform UI actions and assertions
        ExtentReportManager.getTest().info("Navigated to URL and performed UI actions");
    }
}