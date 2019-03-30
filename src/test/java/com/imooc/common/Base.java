package com.imooc.common;

import com.imooc.utils.PropertiesDataProvider;
import com.imooc.utils.SeleniumUtil;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Properties;

public class Base {
    protected SeleniumUtil seleniumUtil = null;  // 对于定义的对象最好赋值为null
    private static Logger log = Logger.getLogger(Base.class);  // new Base().getClass() == Base.class,它们表示类类型


    @BeforeClass
    public void openBrowser(){
        Properties props = System.getProperties();              // 获得系统属性集
        String currentPlatform = props.getProperty("os.name");  // 操作系统名称

        System.out.println("当前操作系统是:[" + currentPlatform + "]");

        // 这里只操作不同操作系统下的谷歌浏览器,webdriver.chrome.driver固定写法，其它浏览器查网
        if (currentPlatform.toLowerCase().contains("win")) {
            System.out.println("当前操作系统是win");
            System.setProperty("webdriver.chrome.driver", "drivers/chrome/win/chromedriver");
        }else if (currentPlatform.toLowerCase().contains("linux")) {
            System.out.println("当前操作系统是linux");
            System.setProperty("webdriver.chrome.driver", "drivers/chrome/linux/chromedriver");
        }else if (currentPlatform.toLowerCase().contains("mac")){
            System.out.println("当前操作系统是mac");
            System.setProperty("webdriver.chrome.driver", "drivers/chrome/mac/chromedriver");
        }else{
            Assert.fail("未知操作系统，请选择 mac windows linux 三者之间的操作系统");
        }

        // 调用selenium封装类
        seleniumUtil = new SeleniumUtil();
        seleniumUtil.openBrowser();
    }


    @AfterClass
    public void closeBrowser(){
        if(seleniumUtil != null){
            seleniumUtil.quit();
        }else {
            log.error("浏览器driver没有获得对象,退出操作失败");
            Assert.fail("浏览器driver没有获得对象,退出操作失败");
        }
    }


    // 获取driver
    public WebDriver getDriver(){
        return seleniumUtil.getDriver();
    }
}
