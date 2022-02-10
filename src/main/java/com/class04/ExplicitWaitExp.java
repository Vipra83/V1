package com.class04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExp {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();

        // Explicit wait syntax for Selenium version < 4
       // WebDriverWait wait = new WebDriverWait(driver,60);

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!]"))).getText();
    }
}
