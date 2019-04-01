package com.imooc.page;

import org.openqa.selenium.By;

 // Page Object模式是一种自动化测试设计模式，将页面定位和业务操作分开，提高用例的可维护性.

public class LoginPage {

    //慕课网登陆

    public static final By LP_A_LOGIN = By.id("js-signin-btn");
    /**用户名输入框*/
    public static final By LP_INPUT_USERNAME = By.name("email");

    /**密码输入框*/
    public static final By LP_INPUT_PASSWORD = By.name("password");

    /**登录按钮*/
    public static final By LP_BUTTON_LOGIN = By.xpath("//*[@id=\"signup-form\"]/div[5]/input");

    //掘金网登陆
    public static final By USER_LOGIN_BUTTON = By.className("login");
    public static final By USER_LOGIN_USERNAME = By.name("loginPhoneOrEmail");
    public static final By USER_LOGIN_PASSWORD = By.name("loginPassword");
    public static final By CONFIRM_LOGIN_BUTTON = By.xpath("//button[@class='btn']");

    //掘金网-写文章
    public static final By WRITE_ARTICLE = By.className("add-btn");


}
