package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Elements;
import com.qapitol.pages.LoginPage_POM;
import com.qapitol.util.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.qapitol.base.BaseClass.driver;

public class LoginPageTc_POM {
    LoginPage_POM loginPage;
    Elements elements = new Elements();
    ConfigReader configReader = new ConfigReader();
    @BeforeTest
    public void setUp() {
        BaseClass.initialize();
        BaseClass.navigateToURl(configReader.getProperty("linkedinURL"));
    }
    @AfterTest
    public void quitDriver() throws InterruptedException {
        elements.teardown();
    }
    @Test(priority = 0)
    public void verifyLoginPage() throws InterruptedException {
        System.out.println("Test started : verifyLoginPage");

        loginPage = new LoginPage_POM(driver);
        loginPage.clickOnSignIn();
        loginPage.enterUserName();
        Thread.sleep(2000);
        loginPage.enterPassword();
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.isUserNameFieldDisplayed(),"Username field is not displayed");
        Assert.assertTrue(loginPage.isPasswordFieldDisplayed(),"Password field is not displayed");
        //Assert.assertTrue(loginPage.isKeepMeLoggedInCheckboxDisplayed(),"Keep me logged in checkbox is not displayed");
        Assert.assertTrue(loginPage.isLogoDisplayed(),"Logo is not displayed");
        Assert.assertTrue(loginPage.isSignInButtonDisplayed(),"Login button is not displayed");
        System.out.println("Test Ended : verifyLoginPage");
    }
    @Test(priority = 1)
    public void verifyLoginURL() {
        loginPage = new LoginPage_POM(driver);
        System.out.println("Test started : verifyLoginURL");
        System.out.println(loginPage.getLoginPageURL());
        Assert.assertEquals(loginPage.getLoginPageURL(),configReader.getProperty("linkedinLoginPageURL"),"Loginpage URL is not matched");
        System.out.println("Test Ended : verifyLoginURL");
    }
    @Test(priority = 2)
    public void verifyLoginTitle() {
        System.out.println("Test started : verifyLoginTitle");
        Assert.assertEquals(loginPage.getLoginPageTitle(),configReader.getProperty("linkedinLoginPageTitle"));
        System.out.println("Test Ended : verifyLoginTitle");
    }
    @Test(priority = 3)
    public void verifyLoginFunctionality() throws InterruptedException {
        System.out.println("Test started : verifyLoginFunctionality");
        Thread.sleep(2000);
        loginPage.clickOnSignInButton();
        Thread.sleep(2000);
        System.out.println("Test Ended : verifyLoginFunctionality");
    }
}
