package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Elements extends BaseClass {

    public void textBox() throws InterruptedException {
          final Logger logger = LogManager.getLogger(Elements.class);

        // Click on Textbox Section
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();

        // Enter full name
        WebElement clickOnFullNameFiled = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        BaseClass.clickOnElement(clickOnFullNameFiled);
        clickOnFullNameFiled.sendKeys("Deepak");
        logger.info("Full Name Entered");


        // Enter email address
        WebElement clickOnEmailFiled = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        BaseClass.scrollToElement(clickOnEmailFiled);
        BaseClass.clickOnElement(clickOnEmailFiled);
        clickOnEmailFiled.sendKeys("name@example.com");
        logger.info("email address Entered");


        // Enter current address
        WebElement clickOnCurrentAddressField = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        BaseClass.scrollToElement(clickOnCurrentAddressField);
        BaseClass.clickOnElement(clickOnCurrentAddressField);
        clickOnCurrentAddressField.sendKeys("Bengaluru");
        logger.info("current address Entered");


        // Enter permanent address
        WebElement clickOnPermanentAddressField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        clickOnPermanentAddressField.sendKeys("Maharashtra");
        logger.info("permanent address Entered");

        // Click on submit button
        WebElement clickOnSubmitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        BaseClass.scrollToElement(clickOnSubmitButton);
        clickOnSubmitButton.click();
        Thread.sleep(5000);
        logger.info("clicked on submit button");


    }
    public void checkBox() throws InterruptedException {
        // Click on checkbox Section

        WebElement clickOnCheckBoxSection =driver.findElement(By.xpath("//span[text()='Check Box']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -250);");
        clickOnCheckBoxSection.click();

        // Click on checkbox
        WebElement clickOnCheckBox =driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        BaseClass.scrollToElement(clickOnCheckBox);
        clickOnCheckBox.click();
        Thread.sleep(5000);
    }
    public void radioButton() throws InterruptedException {
        // Click on checkbox Section
        WebElement clickOnRadioBoxSection =driver.findElement(By.xpath("//span[text()='Radio Button']"));
        BaseClass.scrollToElement(clickOnRadioBoxSection);
        clickOnRadioBoxSection.click();

        // Click on radiobox yes button
        WebElement clickOnRadioBox =driver.findElement(By.xpath("//input[@id='yesRadio']"));
        BaseClass.scrollToElement(clickOnRadioBox);
        BaseClass.clickOnElement(clickOnRadioBox);
        Thread.sleep(5000);
    }

    public void Buttons() throws InterruptedException {
        // Click on buttons Section
        WebElement clickOnButtonsSection =driver.findElement(By.xpath("//span[text()='Buttons']"));
        BaseClass.scrollToElement(clickOnButtonsSection);
        clickOnButtonsSection.click();

        // Click on click me button
        WebElement clickOnClickMeButton =driver.findElement(By.xpath("//button[text()='Click Me']"));
        BaseClass.scrollToElement(clickOnClickMeButton);
        clickOnClickMeButton.click();
        Thread.sleep(5000);
    }

    public void links() throws InterruptedException {
        // Click on buttons Section
        WebElement clickOnLinksSection =driver.findElement(By.xpath("//span[text()='Links']"));
        BaseClass.scrollToElement(clickOnLinksSection);
        clickOnLinksSection.click();

        // Click on link home link
        WebElement clickOnHomeLink =driver.findElement(By.xpath("//a[@id='simpleLink']"));
        BaseClass.scrollToElement(clickOnHomeLink);
        clickOnHomeLink.click();
        Thread.sleep(5000);
    }

        public void teardown() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();

        }


}
