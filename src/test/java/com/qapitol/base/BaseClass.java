package com.qapitol.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;

    public static void initialize() {
        driver = new ChromeDriver();
    }
    public static String navigateToURl(String URL) {
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();
        return URL;
    }
}
