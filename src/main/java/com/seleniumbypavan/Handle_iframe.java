package com.seleniumbypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_iframe {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C://Users//vipra//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();

        driver.switchTo().frame("packageListFrame"); //name of the frame
        driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium')]")).click();
        driver.switchTo().defaultContent(); //go back to main page

        Thread.sleep(3000);

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
        driver.switchTo().defaultContent(); //go back to main page

        Thread.sleep(3000);
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
    }
}
