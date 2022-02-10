package com.class04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExm {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Implicit wait,  Selenium Version < 4 - Syntax is
        // It applies to command so if element is not present in the DOM then implicit wait will work
        // If element is present in DOM but not visible then we've to use explicit wait because
        // Selenium will be able to find out element & it'll not wait for element to be visible
        // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.manage().window().maximize();

        // Implicit wait,  Selenium Version >= 4 - Syntax is
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();

        // Option 1 - Static wait - Not recommended
        // Thread.sleep(5000);

        // "Hello World" - element is not present in the DOM so selenium will wait maximum
        // 60 seconds till element is present in the DOM after that it'll throw exception
        driver.findElement(By.xpath("//h4[normalize-space()='Hello World!")).getText();




    }
}
