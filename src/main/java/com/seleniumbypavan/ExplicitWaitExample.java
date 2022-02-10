package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']"))).click();
    }
}
