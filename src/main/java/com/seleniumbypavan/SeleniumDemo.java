package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class SeleniumDemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://frontend.nopcommerce.com/");
        System.out.println("Title of the web page is : " + driver.getTitle());
        System.out.println("Current URL the web page is : " + driver.getCurrentUrl());

        System.out.println(driver.getPageSource());
    }
}
