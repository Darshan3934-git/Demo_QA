package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Alert_Frame_Window_Handling;
import com.qapitol.pages.Elements;
import com.qapitol.util.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert_Frame_Windows_Runner {
    ConfigReader configReader = new ConfigReader();
    Elements elements = new Elements();
    Alert_Frame_Window_Handling alertFrameWindowsHandling = new Alert_Frame_Window_Handling();


    @BeforeMethod
    public void setUp() {
        BaseClass.initialize();
        BaseClass.navigateToURl(configReader.getProperty("alertsWindowsURL"));
    }

    @Test(priority = 0,enabled = true)
    public void alertTesting() throws InterruptedException {
        alertFrameWindowsHandling.promptBoxAlertHandling();
        alertFrameWindowsHandling.confirmBoxAlertHandling();
        alertFrameWindowsHandling.fiveSecAlertHandling();
    }

    @Test(priority = 0,enabled = true)
    public void frameTesting() throws InterruptedException {
        alertFrameWindowsHandling.frameHandling();
        alertFrameWindowsHandling.nestedFrameHandling();
    }
    @Test(priority = 0,enabled = false)
    public void windowsTesting() throws InterruptedException {
        alertFrameWindowsHandling.frameHandling();
        alertFrameWindowsHandling.nestedFrameHandling();
    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        elements.teardown();
    }
}
