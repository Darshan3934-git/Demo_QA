package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.AlertHandling;
import com.qapitol.pages.Elements;
import com.qapitol.pages.FrameHandling;
import com.qapitol.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frame_Runner extends BaseClass {
    Elements elements = new Elements();
    FrameHandling frameHandling = new FrameHandling();

    @BeforeMethod
    public void setUp()
    {
        BaseClass.initialize();
    }

    @Test(priority = 1)
    public void frameHandler() throws InterruptedException {
        BaseClass.navigateToURl("https://demoqa.com/frames");
        frameHandling.frameHandling();
    }
    @Test (priority = 0)
    public void nestedFrameHandler() throws InterruptedException {
        BaseClass.navigateToURl("https://demoqa.com/nestedframes");
        frameHandling.nestedFrameHandling();

    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        elements.teardown();
    }
}
