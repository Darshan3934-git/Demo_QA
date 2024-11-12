package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
    public void login(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

    }

    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }


}
