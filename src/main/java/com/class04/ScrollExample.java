package com.class04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("https://www.minted.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='bx-creative-1303201']"));

        driver.findElement(By.xpath("//input[@id='bx-element-1303201-Gu64MsV-input']")).sendKeys("vipra123@gmail.com");





    }
}
