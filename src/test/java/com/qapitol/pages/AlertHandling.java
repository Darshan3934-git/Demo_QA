package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHandling extends BaseClass {
    public void promptBoxAlertHandling() throws InterruptedException {

        // open site
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();

        Thread.sleep(2000);
        WebElement clickOnPromptBoxButton = driver.findElement(By.xpath("//button[contains(@id,'promtButton')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1000);");
        js.executeScript("arguments[0].click();", clickOnPromptBoxButton);

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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1000);");
        js.executeScript("arguments[0].click();", clickOnConfirmBoxButton);
        Alert alt = driver.switchTo().alert();
        alt.accept();

    }
    public void fiveSecAlertHandling() throws InterruptedException {
        Thread.sleep(2000);
        WebElement clickOnConfirmBoxButton = driver.findElement(By.xpath("//button[contains(@id,'timerAlertButton')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", clickOnConfirmBoxButton);
        Thread.sleep(6000);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@id,'timerAlertButton')]")));
        Alert alt = driver.switchTo().alert();
        alt.accept();

    }
}
