package com.imooc.page;

import org.openqa.selenium.By;

public class LoginPage {

    public static final By LP_A_LOGIN = By.id("js-signin-btn");
    /**用户名输入框*/
    public static final By LP_INPUT_USERNAME = By.name("email");

    /**密码输入框*/
    public static final By LP_INPUT_PASSWORD = By.name("password");

    /**登录按钮*/
    public static final By LP_BUTTON_LOGIN = By.xpath("//*[@id=\"signup-form\"]/div[5]/input");
}
