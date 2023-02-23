package com.class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
       WebElement signInLink = driver.findElement(By.xpath("//span[@id='gh-ug']/a"));

       Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(signInLink).keyUp(Keys.CONTROL).build().perform();
    }
}
