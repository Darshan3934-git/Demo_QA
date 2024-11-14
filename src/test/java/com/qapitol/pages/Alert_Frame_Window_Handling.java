package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.*;

import java.time.Duration;

public class Alert_Frame_Window_Handling extends BaseClass {
    public JavascriptExecutor js = (JavascriptExecutor) driver;

    public void promptBoxAlertHandling() throws InterruptedException {

        //  click on alert sec
        WebElement progressBar = driver.findElement(By.xpath("//span[text()='Alerts']"));
        BaseClass .scrollToElement(progressBar);
        BaseClass.clickOnElement(progressBar);

        Thread.sleep(2000);
        WebElement clickOnPromptBoxButton = driver.findElement(By.xpath("//button[contains(@id,'promtButton')]"));
        BaseClass .scrollToElement(clickOnPromptBoxButton);
        BaseClass.clickOnElement(clickOnPromptBoxButton);

		// print text in alert
		Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        String text =alt.getText();
		System.out.println("Alert Text :"+text);

		//send data in alert
		Thread.sleep(2000);
		alt.sendKeys("My Name is Darshan");

		// click or accept button
		Thread.sleep(2000);
		alt.accept();

		// cancel or reject button
		Thread.sleep(2000);
	    //alt.dismiss();
    }
    public void confirmBoxAlertHandling() throws InterruptedException {
        Thread.sleep(2000);
        WebElement clickOnConfirmBoxButton = driver.findElement(By.xpath("//button[contains(@id,'confirmButton')]"));
        BaseClass .scrollToElement(clickOnConfirmBoxButton);
        BaseClass.clickOnElement(clickOnConfirmBoxButton);
        Alert alt = driver.switchTo().alert();
        alt.accept();
    }
    public void fiveSecAlertHandling() throws InterruptedException {
        Thread.sleep(2000);
        WebElement clickOnConfirmBoxButton = driver.findElement(By.xpath("//button[contains(@id,'timerAlertButton')]"));
        BaseClass.clickOnElement(clickOnConfirmBoxButton);
        Thread.sleep(6000);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@id,'timerAlertButton')]")));
        Alert alt = driver.switchTo().alert();
        alt.accept();

    }

    public void frameHandling() {
        //  click on frame sec
        WebElement progressBar = driver.findElement(By.xpath("//span[text()='Frames']"));
        BaseClass .scrollToElement(progressBar);
        BaseClass.clickOnElement(progressBar);

        WebElement f1= 	driver.findElement(By.id("frame1"));
        driver.switchTo().frame(f1); // move control to frame
        WebElement ele =driver.findElement(By.id("sampleHeading"));//fpt text  NoSuchElementException
        String data =ele.getText();
        System.out.println("Text :"+data);
        driver.switchTo().defaultContent();
    }
    public void nestedFrameHandling() {
        driver.switchTo().frame(0);
        //driver.switchTo().frame(0);
        driver.switchTo().defaultContent();
    }
}
