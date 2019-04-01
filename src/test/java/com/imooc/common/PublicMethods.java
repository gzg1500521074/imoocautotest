package com.imooc.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PublicMethods {

    public boolean isElementExist(WebDriver driver, By locator, int timeoutSeconds) {
        driver.manage().timeouts().implicitlyWait(timeoutSeconds, TimeUnit.SECONDS);
        try {
            driver.findElement(locator);
                      return true;
                    } catch (Exception e) {
                       return false;
                   } finally {
                        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                   }
    }
}
