package com.class05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadAssignment {
   WebDriver driver;

   @BeforeMethod
   public void setUp() {

       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

       driver.get("https://demoqa.com/automation-practice-form");
       driver.manage().window().maximize();
   }

   @Test
   public void uploadPicture(){

        WebElement fileUploadInput = driver.findElement(By.id("uploadPicture"));
        fileUploadInput.sendKeys("C:\\Users\\vipra\\eclipse-workspace\\SeleniumFramework\\src\\main\\resources\\data\\fileupload.txt");

        WebElement fileUploadBtn = driver.findElement(By.id("submit"));
        fileUploadBtn.click();

    }
}
