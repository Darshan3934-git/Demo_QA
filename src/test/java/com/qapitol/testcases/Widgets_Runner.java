package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Elements;
import com.qapitol.pages.WidgesHandling;
import com.qapitol.util.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Widgets_Runner extends BaseClass {
    ConfigReader configReader = new ConfigReader();
    WidgesHandling widgesHandling =new WidgesHandling();
    Elements elements = new Elements();

    @BeforeMethod
    public void setUp(){
        BaseClass.initialize();
        BaseClass.navigateToURl(configReader.getProperty("widgetsURL"));

    }
    @Test(priority = 0, enabled = true)
    public void widgetsTesting() throws InterruptedException {
        widgesHandling.toolTipHandling();

    }
    @Test(priority = 1, enabled = true)
    public void sliderTesting() throws InterruptedException {
        widgesHandling.sliderHandling();
    }
    @Test(priority = 2, enabled = true)
    public void progessBarTesting() throws InterruptedException {
        widgesHandling.progressbarHandling();
    }
    @AfterMethod
    public void quitDriver() throws InterruptedException {
        elements.teardown();
    }
}
