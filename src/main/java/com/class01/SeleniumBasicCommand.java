package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommand {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.close();

    }

}