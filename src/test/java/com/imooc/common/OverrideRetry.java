package com.imooc.common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class OverrideRetry implements IRetryAnalyzer {
    private int count = 1;
    private int max_count = 2;

    @Override
    public boolean retry(ITestResult result) {
        System.out.println("执行用例："+result.getName()+"，第"+count+"次失败");
        if (count < max_count) {
            count++;
            return true;
        }

        return false;
    }
}