package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class WidgesHandling extends BaseClass {

    public void WidgesHandling() {
       WebElement widges=  driver.findElement(By.xpath("//span[text()='Tool Tips']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1000);");
        js.executeScript("arguments[0].click();", widges);
    }
    public void clickOnTooltip () throws InterruptedException {
        WebElement clickOnTooltipButton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Actions action = new Actions(driver);
        action.moveToElement(clickOnTooltipButton).click().perform();

        Thread.sleep(5000);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement clickOnTooltip = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
        System.out.println("Test4");

        String tooltipText = clickOnTooltip.getText();
        System.out.println("tooltip message :"+tooltipText);

        }

        public void sliderHandling() throws InterruptedException {
        // click on slider section
        WebElement slider = driver.findElement(By.xpath("//span[text()='Slider']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("window.scrollTo(0, 500);");
            Thread.sleep(5000);
            slider.click();
            Thread.sleep(5000);

            //  click on slider bar
            WebElement sliderTab = driver.findElement(By.xpath("//input[@type='range']"));
            js.executeScript("window.scrollTo(0, 500);");
            Actions actions = new Actions(driver);
            actions.clickAndHold(sliderTab).moveByOffset(60, 0).release().perform();

            WebElement sliderVerify = driver.findElement(By.id("sliderValue"));
            String str = sliderVerify.getAttribute("value");
            System.out.println("Slided value is : "+str);
            Assert.assertEquals(str,"64");
            Assert.assertEquals(sliderVerify.getAttribute("value"),"64");



        }

    public void progressbarHandling() throws InterruptedException {
        // click on progress bar section
        WebElement progressBar = driver.findElement(By.xpath("//span[text()='Progress Bar']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");
        progressBar.click();

        //  click on start button
        WebElement clickOnStartButton = driver.findElement(By.xpath("//*[text()='Start']"));
        js.executeScript("window.scrollTo(0, 500);");

        clickOnStartButton.click();
        Thread.sleep(5000);

        // click on stop button
        WebElement clickOnStopButton = driver.findElement(By.xpath("//*[text()='Stop']"));
        clickOnStopButton.click();
    }






}
