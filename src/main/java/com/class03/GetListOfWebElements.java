package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetListOfWebElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        // Login into website


        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(5000);

        List<WebElement> listOfJobMenu = driver.findElements(By.xpath("//a[@id='menu_admin_Job']/following-sibling::ul/li/a"));

        for (WebElement jobMenu : listOfJobMenu) {
            System.out.println(jobMenu.getText());
        }

    }
    }

