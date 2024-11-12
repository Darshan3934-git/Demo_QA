package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Elements;
import com.qapitol.pages.WidgesHandling;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Widgets_Runner extends BaseClass {
    WidgesHandling widgesHandling =new WidgesHandling();
    Elements elements = new Elements();

    @BeforeTest
    public void setUp(){
        BaseClass.initialize();
    }
    @Test
    public void WidgetsTest() throws InterruptedException {
        BaseClass.navigateToURl("https://demoqa.com/widgets");
        widgesHandling.WidgesHandling();
        //widgesHandling.clickOnTooltip();
        widgesHandling.SliderHandling();
    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        elements.teardown();
    }
}
