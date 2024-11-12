package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameHandling extends BaseClass {

    public void frameHandling() {
        WebElement f1= 	driver.findElement(By.id("frame1"));
        driver.switchTo().frame(f1); // move control to frame
        WebElement ele =driver.findElement(By.id("sampleHeading"));//fpt text  NoSuchElementException
        String data =ele.getText();
        System.out.println("Text :"+data);
        driver.switchTo().defaultContent();
    }

    public void nestedFrameHandling() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        driver.switchTo().defaultContent();
    }

}
