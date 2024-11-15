package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import com.qapitol.util.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage_POM extends BaseClass {
    ConfigReader configReader = new ConfigReader();
    // 1. Constructor
    public LoginPage_POM(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    // 1. WebElements

    @FindBy(xpath = "//input[@id='username']")
    WebElement uNameTxtField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement pwdTxtField;

    @FindBy(xpath = "//label[normalize-space()='Keep me logged in']")
    private WebElement KeepMeLoggedInCheckbox;

    @FindBy(xpath = "//li-icon[@aria-label='LinkedIn']//*[name()='svg']")
    private WebElement verifyLogo;

    @FindBy(xpath = "//button[@aria-label='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin']")
    private WebElement signIn;


    // page action methods

    public boolean isUserNameFieldDisplayed() {
        uNameTxtField.isDisplayed();
        return uNameTxtField.isDisplayed();
    }

    public boolean isPasswordFieldDisplayed() {
        pwdTxtField.isDisplayed();
        return pwdTxtField.isDisplayed();
    }

    public boolean isKeepMeLoggedInCheckboxDisplayed() {
        KeepMeLoggedInCheckbox.isDisplayed();
        return KeepMeLoggedInCheckbox.isDisplayed();

    }

    public boolean isLogoDisplayed() {
        verifyLogo.isDisplayed();
        return verifyLogo.isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        signInButton.isDisplayed();
        return signInButton.isDisplayed();
    }

    public String getLoginPageURL() {
        driver.getCurrentUrl();
        return driver.getCurrentUrl();
    }
    public String getLoginPageTitle(){
        driver.getTitle();
        return driver.getTitle();
    }
    public void clickOnSignInButton(){
        signInButton.click();
    }

    public void enterUserName() {
        uNameTxtField.sendKeys(configReader.getProperty("uName"));

    }

    public void enterPassword() {
        pwdTxtField.sendKeys(configReader.getProperty("pwd"));
    }
    public void clickOnSignIn() {
        signIn.click();
    }


}




