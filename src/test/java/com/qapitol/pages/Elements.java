package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Elements extends BaseClass {

    public void textBox() throws InterruptedException {
        // open site
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();

        // Navigate to Element Section
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement clickOnElements = driver.findElement(By.xpath("((//div[@class='category-cards']//*[name()='svg'])[1])"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", clickOnElements);
        clickOnElements.click();

        // Click on Textbox Section
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();

        // Enter full name
        WebElement clickOnFullNameFiled = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        clickOnFullNameFiled.click();
        clickOnFullNameFiled.sendKeys("Deepak");

        // Enter email address
        WebElement clickOnEmailFiled = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        clickOnEmailFiled.click();
        clickOnEmailFiled.sendKeys("name@example.com");

        // Enter current address
        WebElement clickOnCurrentAddressField = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        //clickOnCurrentAddressField.click();
        clickOnCurrentAddressField.sendKeys("Bengaluru");

        // Enter permanent address
        WebElement clickOnPermanentAddressField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        clickOnPermanentAddressField.sendKeys("Maharashtra");

        // Click on submit button
        WebElement clickOnSubmitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        JavascriptExecutor jsd = (JavascriptExecutor) driver;
        jsd.executeScript("arguments[0].scrollIntoView(true);", clickOnSubmitButton);
        clickOnSubmitButton.click();
        Thread.sleep(5000);
    }
    public void checkBox() throws InterruptedException {
        // Click on checkbox Section
        WebElement clickOnCheckBoxSection =driver.findElement(By.xpath("//span[text()='Check Box']"));
        JavascriptExecutor jsd = (JavascriptExecutor) driver;
        jsd.executeScript("arguments[0].scrollIntoView(true);", clickOnCheckBoxSection);
        clickOnCheckBoxSection.click();

        // Click on checkbox
        WebElement clickOnCheckBox =driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        JavascriptExecutor jsdd = (JavascriptExecutor) driver;
        jsdd.executeScript("arguments[0].scrollIntoView(true);", clickOnCheckBox);
        clickOnCheckBox.click();
        Thread.sleep(5000);
    }
    public void radioButton() throws InterruptedException {
        // Click on checkbox Section
        WebElement clickOnRadioBoxSection =driver.findElement(By.xpath("//span[text()='Radio Button']"));
        JavascriptExecutor jsd = (JavascriptExecutor) driver;
        jsd.executeScript("arguments[0].scrollIntoView(true);", clickOnRadioBoxSection);
        clickOnRadioBoxSection.click();

        // Click on radiobox yes button
        WebElement clickOnRadioBox =driver.findElement(By.xpath("//input[@id='yesRadio']"));
        JavascriptExecutor jsdd = (JavascriptExecutor) driver;
        jsdd.executeScript("arguments[0].scrollIntoView(true);", clickOnRadioBox);
        jsdd.executeScript("arguments[0].click();", clickOnRadioBox);
        Thread.sleep(5000);
    }

    public void Buttons() throws InterruptedException {
        // Click on buttons Section
        WebElement clickOnButtonsSection =driver.findElement(By.xpath("//span[text()='Buttons']"));
        JavascriptExecutor jsd = (JavascriptExecutor) driver;
        jsd.executeScript("arguments[0].scrollIntoView(true);", clickOnButtonsSection);
        clickOnButtonsSection.click();

        // Click on click me button
        WebElement clickOnClickMeButton =driver.findElement(By.xpath("//button[text()='Click Me']"));
        JavascriptExecutor jsdd = (JavascriptExecutor) driver;
        jsdd.executeScript("arguments[0].scrollIntoView(true);", clickOnClickMeButton);
        clickOnClickMeButton.click();
        Thread.sleep(5000);
    }

    public void links() throws InterruptedException {
        // Click on buttons Section
        WebElement clickOnLinksSection =driver.findElement(By.xpath("//span[text()='Links']"));
        JavascriptExecutor jsd = (JavascriptExecutor) driver;
        jsd.executeScript("arguments[0].scrollIntoView(true);", clickOnLinksSection);
        clickOnLinksSection.click();

        // Click on link home link
        WebElement clickOnHomeLink =driver.findElement(By.xpath("//a[@id='simpleLink']"));
        JavascriptExecutor jsdd = (JavascriptExecutor) driver;
        jsdd.executeScript("arguments[0].scrollIntoView(true);", clickOnHomeLink);
        clickOnHomeLink.click();
        Thread.sleep(5000);
    }

        public void teardown() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();

        }


}
