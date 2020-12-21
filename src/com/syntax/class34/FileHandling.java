package com.syntax.class34;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        String path="C:\\Syntax\\Eclipse_workspace\\JavaBatch8\\src\\com\\syntax\\class34\\Credentials.properties";

        FileInputStream fileInputStream=new FileInputStream(path);


        Properties properties=new Properties();
        properties.load(fileInputStream);
        String user=properties.getProperty("username");
        String pass=properties.getProperty("password");
        int number=Integer.parseInt(properties.getProperty("phoneNumber"));




        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys(user);
        driver.findElement(By.id("pass")).sendKeys(pass);



    }
}
