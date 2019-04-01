package com.imooc.testcase;

import com.imooc.business.JueJinLoginBusiness;
import com.imooc.business.LoginBusiness;
import com.imooc.common.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class JueJinLogin extends Base {
        JueJinLoginBusiness login = new JueJinLoginBusiness();

        @Test
        public void jueJinLogin(){
            login.jueJinLogin(seleniumUtil);
            seleniumUtil.pause(5000);
            //Assert.assertTrue(user-dropdown-list);

            // Assert.assertEquals(1,2);
        }
        @Test(dependsOnMethods = "jueJinLogin" )
        public void writeArticle(){

        }

}
