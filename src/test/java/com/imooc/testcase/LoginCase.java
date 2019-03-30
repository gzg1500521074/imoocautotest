package com.imooc.testcase;

import com.imooc.business.LoginBusiness;
import com.imooc.common.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginCase extends Base {
    LoginBusiness login = new LoginBusiness();


    // 在调用@Test之前调用@beforeClass
    @Test
    public void testLogin(){
        // login.login(seleniumUtil);
        // seleniumUtil.pause(5000);

        Assert.assertEquals(1,2);
    }


    @Test
    public void testPost1(){
        Assert.assertEquals(1,1);
    }















    // 测试重试机制
    /*@Test
    public void testRetest(){

        *//*
          表示：总共执行3次测试用例，但三次都失败了，所以failures表示为一次，但剩下的两次失败标记为2次跳过，哈哈
        * Total tests run: 3, Failures: 1, Skips: 2
        *
        * *//*
        System.out.println("33333333");
        Assert.assertFalse(true);
    }*/
}
