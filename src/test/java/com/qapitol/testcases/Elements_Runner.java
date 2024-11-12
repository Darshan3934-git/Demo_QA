package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Elements;
import com.qapitol.pages.LoginPage;
import org.testng.annotations.*;

public class Elements_Runner extends BaseClass {
    LoginPage loginPage;
    Elements elements = new Elements();

    @BeforeMethod
    public void setUp()
    {
        BaseClass.initialize();
    }

    @Test
    public void testLogin() throws InterruptedException {
        elements.textBox();
        elements.checkBox();
        elements.radioButton();
        elements.Buttons();
        elements.links();


    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        elements.teardown();
    }
}
