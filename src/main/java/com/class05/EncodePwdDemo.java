package com.class05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodePwdDemo {
    public static void main(String[] args) {

    /*    String password = "admin123";

       byte[] encodedPwd = Base64.encodeBase64(password.getBytes());
        System.out.println(new String(encodedPwd));*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //decode password
        byte[] decodePwd = Base64.decodeBase64("YWRtaW4xMjM=");

        driver.findElement(By.id("txtPassword")).sendKeys(new String(decodePwd));
        driver.findElement(By.id("btnLogin")).click();
    }
}
