package com.class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RetrieveWord {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        Thread.sleep(3000);

        System.out.println(driver.findElement(By.xpath(" //h4[normalize-space()='Hello World!']")).getText());


    }
}
