package com.automation.framework;

import com.automation.framework.utils.EmailUtil;
import org.testng.TestNG;

import java.util.Collections;

public class TestRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("testng.xml"));
        testng.run();
        EmailUtil.sendEmailWithReport("recipient@example.com", "sender@example.com", "localhost", "extent.html");
    }
}