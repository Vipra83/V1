package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FacebookLogin {
    public static void main(String[] args) {

      //  System.setProperty("webdriver.chrome.driver","C://Users//vipra//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

     /*  String expectedValue = "Facebook";
       String actualValue = driver.getTitle();
       Assert.assertTrue(expectedValue, actualValue, "Title Mismatch");*/

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vippatel1983@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Vipra1938");

        driver.findElement(By.name("login")).click();

        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Vipra Patel')]"));
        System.out.println(ele.getText());

      //  Assert.assertTrue(ele.isDisplayed(),"name is missing from homepage");




    }
}