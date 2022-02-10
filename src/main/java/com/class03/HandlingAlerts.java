package com.class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();
        WebElement jsAlertBtn3 = driver.findElement(By.xpath("//button[text()='Click for JS prompt']"));
        jsAlertBtn3.click();

        Alert alert = driver.switchTo().alert();

        alert.getText();
        alert.sendKeys("Test Input");
        Thread.sleep(5000);
        alert.accept();
       // alert.dismiss();

    }
}
