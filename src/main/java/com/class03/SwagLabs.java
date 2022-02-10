package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwagLabs {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement logIn = driver.findElement(By.id("login-button"));
        logIn.click();

        WebElement dropdown = driver.findElement(By.id("select[@class='product_sort_container']"));
        Select dropSelect = new Select(dropdown);
        dropSelect.selectByIndex(3);


    }
}
