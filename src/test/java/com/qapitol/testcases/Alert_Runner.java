package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.AlertHandling;
import com.qapitol.pages.Elements;
import com.qapitol.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert_Runner {

    LoginPage loginPage;
    Elements elements = new Elements();
    AlertHandling alertHandling = new AlertHandling();


    @BeforeMethod
    public void setUp()
    {
        BaseClass.initialize();
    }

    @Test
    public void testLogin() throws InterruptedException {
        alertHandling.promptBoxAlertHandling();
        alertHandling.confirmBoxAlertHandling();
        alertHandling.fiveSecAlertHandling();
    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        elements.teardown();
    }
}
