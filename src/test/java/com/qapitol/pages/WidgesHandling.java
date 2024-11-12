package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

        public void SliderHandling() throws InterruptedException {
        // click on slider section
        WebElement slider = driver.findElement(By.xpath("//span[text()='Slider']"));
            slider.click();
            Thread.sleep(5000);

            //  click on slider bar
            WebElement sliderTab = driver.findElement(By.xpath("//input[@type='range']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, 500);");
            Actions actions = new Actions(driver);
            actions.clickAndHold(sliderTab).moveByOffset(60, 0).release().perform();
        }






}
