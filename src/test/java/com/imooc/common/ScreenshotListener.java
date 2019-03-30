package com.imooc.common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.Console;
import java.io.File;
import java.io.IOException;

public class ScreenshotListener extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("failed 3333333333!!!!!!!!!!!!!");

        Base base = (Base)tr.getInstance();
        WebDriver driver = base.getDriver();

        takeScreenShot(driver);

        super.onTestFailure(tr);
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
    }


    // 截图
    public void takeScreenShot( WebDriver driver){

        long date = System.currentTimeMillis();
        String userPath = System.getProperty("user.dir");  // 当前工程或项目的绝对路径
        String screenshotName = String.valueOf(date) + ".png";
        String screenshotPath = userPath + "/" + "logs/" + screenshotName;
        File currScreenFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            System.out.println("开始截图");
            FileUtils.copyFile(currScreenFile, new File(screenshotPath));
            System.out.println("结束截图");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

