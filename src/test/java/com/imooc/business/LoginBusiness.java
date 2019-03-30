package com.imooc.business;

import com.imooc.page.LoginPage;
import com.imooc.utils.PropertiesDataProvider;
import com.imooc.utils.SeleniumUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginBusiness {
    private PropertiesDataProvider prop = new PropertiesDataProvider("data/data.properties");

    private String userName;
    private String passwd;

    public LoginBusiness(){
        userName = prop.getProperties("userName");
        passwd = prop.getProperties("passwd");
    }

    public void login(SeleniumUtil seleniumUtil){

        WebElement login = seleniumUtil.findElementBy(LoginPage.LP_A_LOGIN);
        login.click();

        WebElement inputUserName = seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME);
        inputUserName.sendKeys(userName);

        WebElement inputPasswd = seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSWORD);
        inputPasswd.sendKeys(passwd);

        WebElement sigIn = seleniumUtil.findElementBy(LoginPage.LP_BUTTON_LOGIN);
        sigIn.click();
    }
}
