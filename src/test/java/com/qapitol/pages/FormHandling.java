package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FormHandling extends BaseClass {

    public void formHandling() throws InterruptedException {

        // click on first name text field
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        WebElement firstNameFiled = driver.findElement(By.id("firstName"));
        firstNameFiled.click();
        firstNameFiled.sendKeys("Darshan");
        Thread.sleep(3000);


        // click on last name  field
        WebElement lastNameFiled = driver.findElement(By.id("lastName"));
        lastNameFiled.click();
        lastNameFiled.sendKeys("wagh");
        Thread.sleep(3000);


        // click on email name  field
        WebElement emailFiled = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFiled.click();
        emailFiled.sendKeys("darsh.wagh123@gmail.com");
        Thread.sleep(3000);


        // Select gender
        WebElement genderFiled = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
        BaseClass.clickOnElement(genderFiled);
        Thread.sleep(3000);


        // enter mobile number
        WebElement mobileNumberFiled = driver.findElement(By.xpath("//input[@id='userNumber']"));
        mobileNumberFiled.click();
        mobileNumberFiled.sendKeys("8888123412");
        Thread.sleep(3000);

        // select DOB
        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        BaseClass.clickOnElement(dateOfBirth);
        Thread.sleep(3000);

        // Select Month
        WebElement selectMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select monthSelect = new Select(selectMonth);
        monthSelect.selectByValue("4");
        Thread.sleep(3000);

        // Select year
        WebElement selectYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select yearSelect = new Select(selectYear);
        yearSelect.selectByValue("1996");
        Thread.sleep(3000);

        // Select day
        WebElement selectDay = driver.findElement(By.xpath("//div[text()='13']"));
        selectDay.click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,350)", "");


        // select subject
        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Maths");

        // add hobbies
        WebElement hobbies = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
        BaseClass.clickOnElement(hobbies);

        // Address
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("Bengaluru");

        /*// State and City
        WebElement stateDropdown = driver.findElement(By.xpath("//div[text()='Select State']"));
        Select stateSelect = new Select(stateDropdown);
        stateSelect.selectByVisibleText("Uttar Pradesh");

        WebElement cityDropdown = driver.findElement(By.xpath("//div[@id='city']"));
        Select citySelect = new Select(cityDropdown);
        citySelect.selectByVisibleText("Delhi");

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click()*/;
    }












}
