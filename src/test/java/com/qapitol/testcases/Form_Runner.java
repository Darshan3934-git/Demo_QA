package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Elements;
import com.qapitol.pages.FormHandling;
import com.qapitol.util.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Form_Runner {
    ConfigReader configReader = new ConfigReader();
    Elements elements = new Elements();
    FormHandling formHandling = new FormHandling();


    @BeforeMethod
    public void setUp()
    {
        BaseClass.initialize();
        BaseClass.navigateToURl(configReader.getProperty("practiceFormURL"));
    }

    @Test(enabled = true)
    public void testLogin() throws InterruptedException {
        formHandling.formHandling();

    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        elements.teardown();
    }
}
