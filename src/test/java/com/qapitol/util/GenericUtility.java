package com.qapitol.util;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtility {

        //frame wait (use when page object model)
        public void waitAndSwitchToFrame(WebDriver driver, long time, WebElement ele) {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
        }

        //frame wait

        public void waitForFrameBy(WebDriver driver ,long time, String type, String expression) {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
            if(type.equalsIgnoreCase("id")){
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(expression)));
            }else if(type.equalsIgnoreCase("class")) {
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(expression)));
            }else if(type.equalsIgnoreCase("xpath")) {
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(expression)));
            }else if(type.equalsIgnoreCase("css")) {
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(expression)));
            }else if(type.equalsIgnoreCase("name")) {
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(expression)));
            }else if(type.equalsIgnoreCase("tag")) {
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName(expression)));
            }else if(type.equalsIgnoreCase("link")) {
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.linkText(expression)));
            }else if(type.equalsIgnoreCase("partial")) {
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.partialLinkText(expression)));
            }else {
                System.out.println("Invalid Locator type");
            }
        }

        // Alert getText
        public void getTextByAlert(WebDriver driver) {
            String text =driver.switchTo().alert().getText();
            System.out.println("Alert Text :"+text);
        }

        //Alert Sendkeys
        public void SendKeysByAlert(WebDriver driver, String TextMessage) {
            driver.switchTo().alert().sendKeys(TextMessage);
        }
        // Alert Accept method
        public void AcceptByAlert(WebDriver driver) {
            driver.switchTo().alert().accept();
        }

        // Alert RejectMethod
        public void RejectByAlert(WebDriver driver) {
            driver.switchTo().alert().dismiss();
        }

        // NoAlertPresentException
        public boolean IsAlertPresent (WebDriver driver ,long time) {
            try {
                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
                wait.until(ExpectedConditions.alertIsPresent());
                return true;
            }catch(Exception e) {
                System.out.println("No alert...");
                return false;
            }
        }



        // click by JS

        public void ClickByJS(WebDriver driver, WebElement loginbtn) {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();", loginbtn);
        }

        //Generic Method For Scrolling

        public void ScrollByJS (WebDriver driver , WebElement ele) {

            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView(true);", ele);
        }

        public void ScrollByPageDown(WebDriver driver , int numOfScroll) {
            WebElement Ele = driver.findElement(By.xpath("/html"));

            for(int i=0;i<numOfScroll;i++) {
                Ele.sendKeys(Keys.PAGE_DOWN);
            }
        }

        // print all tabnames after login
        public ArrayList<String> getTextOfList(List<WebElement> allEles){
            ArrayList<String> ar = new ArrayList<String>();
            for(int i=0;i<allEles.size();i++) {
                ar.add(allEles.get(i).getText());
            }
            return ar;

        }
        public void WaitForURLContains (WebDriver driver , long time , String expURL) {
            WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(time));
            wait.until(ExpectedConditions.urlContains(expURL));
        }

        public void WaitForURLMatches (WebDriver driver , long time , String expURL) {
            WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(time));
            wait.until(ExpectedConditions.urlMatches(expURL));
        }

        public void WaitForURLToBe (WebDriver driver , long time , String expURL) {
            WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(time));
            wait.until(ExpectedConditions.urlToBe(expURL));
        }



        public void WaitForTitleContains (WebDriver driver , long time , String expTitle) {
            WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(time));
            wait.until(ExpectedConditions.titleContains(expTitle));
        }

        public void WaitForTitleIs (WebDriver driver , long time , String expTitle) {
            WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(time));
            wait.until(ExpectedConditions.titleIs(expTitle));
        }

        public void WaitForVisibilityByEle (WebDriver driver , long time , WebElement ele) {
            // in future use 'page object model with page factory '
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
            wait.until(ExpectedConditions.visibilityOf(ele));

        }


        public void WaitForVisibilityByObj (WebDriver driver , long time , String type , String expression) {

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
            if(type.equalsIgnoreCase("id")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("expression")));
            }else if(type.equalsIgnoreCase("CssSelector")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("expression")));
            }else if(type.equalsIgnoreCase("Xpath")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("expression")));
            }else if(type.equalsIgnoreCase("ClassName")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("expression")));
            }else if(type.equalsIgnoreCase("linktext")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("expression")));
            }else if(type.equalsIgnoreCase("PartialLinktext")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("expression")));
            }else if(type.equalsIgnoreCase("TagName")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("expression")));
            }else if(type.equalsIgnoreCase("Name")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("expression")));
            }else {System.out.println("invalid type locator");

            }
        }


        public void WaitForVisibilityByType (WebDriver driver , long time , String type , String expression) {

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
            if(type.equalsIgnoreCase("id")) {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("expression"))));
            }else if(type.equalsIgnoreCase("css")) {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("expression"))));
            }else if(type.equalsIgnoreCase("Xpath")) {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("expression"))));
            }else if(type.equalsIgnoreCase("ClassName")) {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("expression"))));
            }else if(type.equalsIgnoreCase("linktext")) {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("expression"))));
            }else if(type.equalsIgnoreCase("PartialLinktext")) {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("expression"))));
            }else if(type.equalsIgnoreCase("TagName")) {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("expression"))));
            }else if(type.equalsIgnoreCase("Name")) {
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("expression"))));
            }else {System.out.println("invalid type locator");


            }
        }

        public WebDriver startUp  (String bName, String URL) {
            WebDriver driver =null ;
            if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("Chrome")) {
                // open chrome browser
                ChromeOptions options = new ChromeOptions();

                options.addArguments("--Start-maximized");
                options.addArguments("--disable-notifications");
                //options.addArguments("--headless");
                driver = new ChromeDriver(options);

            }
            else if (bName.equalsIgnoreCase("Edge")) {
                //open EdgeWebDriver
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--Start-maximized");
                options.addArguments("--disable-notifications");
                //options.addArguments("--headless");
                driver = new EdgeDriver(options);


            } else if (bName.equalsIgnoreCase("FF") || (bName.equalsIgnoreCase("FireFox"))) {
                //open FirefoxWebDriver
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--Start-maximized");
                options.addArguments("--disable-notifications");
                //options.addArguments("--headless");
                driver = new FirefoxDriver(options);


            }else{
                System.out.println("*****Invalid Browser Name*******");

            }


            driver.manage().window().setSize(new Dimension(600,600));

            // upto to selenium 3
            //	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // older syntax in depricated mode

            // selenium 4 onwards
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // new syntax
            driver.get(URL);
            return driver;
        }


    }


