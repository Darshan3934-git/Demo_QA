package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
    LoginPage loginPage;

    @BeforeTest
    public void setUp()
    {
        BaseClass.initialize();

    }

    @Test
    public void testLogin() {
        BaseClass.initialize();
        LoginPage loginPage = new LoginPage();
        loginPage.login("123","134");

    }
    @AfterTest
    public void quitDriver() throws InterruptedException {
        loginPage.teardown();

    }
}
