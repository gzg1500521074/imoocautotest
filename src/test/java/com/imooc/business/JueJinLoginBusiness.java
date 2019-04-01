package com.imooc.business;

import com.imooc.page.LoginPage;
import com.imooc.utils.PropertiesDataProvider;
import com.imooc.utils.SeleniumUtil;
import org.openqa.selenium.WebElement;

public class JueJinLoginBusiness {
    private PropertiesDataProvider prop = new PropertiesDataProvider("data/data.properties");

    private String jueJinUserName;
    private String jieJinPassword;

    public JueJinLoginBusiness(){
        jueJinUserName = prop.getProperties("jueJinUserName");
        jieJinPassword = prop.getProperties("jieJinPassword");
    }

    public void jueJinLogin(SeleniumUtil seleniumUtil){

        WebElement login = seleniumUtil.findElementBy(LoginPage.USER_LOGIN_BUTTON);
        login.click();

        WebElement inputUserName = seleniumUtil.findElementBy(LoginPage.USER_LOGIN_USERNAME);
        inputUserName.sendKeys(jueJinUserName);

        WebElement inputPasswd = seleniumUtil.findElementBy(LoginPage.USER_LOGIN_PASSWORD);
        inputPasswd.sendKeys(jieJinPassword);

        WebElement sigIn = seleniumUtil.findElementBy(LoginPage.CONFIRM_LOGIN_BUTTON);
        sigIn.click();
    }
}
