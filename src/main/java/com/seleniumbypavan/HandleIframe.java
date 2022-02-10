package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        driver.manage().window().maximize();

        //1st iframe
        driver.switchTo().frame("packageListFrame");// name of the frame
        driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
        driver.switchTo().defaultContent(); // go back to the main page

        Thread.sleep(3000);

        //2nd iframe
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
        driver.switchTo().defaultContent();

        Thread.sleep(5000);

        //3rd iframe
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click(); // Help
        driver.switchTo().defaultContent();
    }
}
