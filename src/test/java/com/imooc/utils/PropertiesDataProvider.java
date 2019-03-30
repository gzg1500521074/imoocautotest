package com.imooc.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDataProvider {
    private Properties prop;

    public PropertiesDataProvider(String filePath) {
        prop = new Properties();
        try {

            // 通过输入缓冲流进行读取配置文件
            InputStream InputStream = new BufferedInputStream(new FileInputStream(filePath));
            // 加载输入流
            prop.load(InputStream);

        } catch (Exception e) {
            System.out.println("初始化配置文件失败");
            e.printStackTrace();
        }
    }

    public String getProperties(String key){
        return prop.getProperty(key);
    }
}
