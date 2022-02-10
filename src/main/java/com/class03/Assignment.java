package com.class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

       WebElement electronicsLink = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
       WebElement appleLink = driver.findElement(By.xpath("//li/a[text()='Apple']"));

        Actions action = new Actions(driver);
        action.moveToElement(electronicsLink).pause(1000).click(appleLink).build().perform();


    }
}
