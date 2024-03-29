package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktopsMenu = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        Thread.sleep(2000);
        WebElement macMenuItem = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(desktopsMenu).moveToElement(macMenuItem).click().perform();
    }
}
