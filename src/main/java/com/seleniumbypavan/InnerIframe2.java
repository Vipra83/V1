package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIframe2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

        driver.manage().window().maximize();


    }
}
