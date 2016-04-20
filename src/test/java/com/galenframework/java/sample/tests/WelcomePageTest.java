package com.galenframework.java.sample.tests;

import com.galenframework.java.sample.components.GalenTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;


public class WelcomePageTest extends GalenTestBase {

    @Test(dataProvider = "devices")
    public void welcomePage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        System.out.println("device = " + device);
        System.out.println("device tags = " + device.getTags());
        checkLayout("/specs/welcomePage.spec", device.getTags());
    }

   // @Test(dataProvider = "devices")
    public void loginPage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        getDriver().findElement(By.xpath("//button[.='Login']")).click();
        checkLayout("/specs/loginPage.spec", device.getTags());
    }

}
