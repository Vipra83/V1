package com.seleniumbypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIFrame3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//vipra//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();

        driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));

    }
}
