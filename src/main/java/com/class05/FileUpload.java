package com.class05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {

 WebDriver driver;
 @BeforeMethod

  public void setUp(){
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();

  driver.get("http://the-internet.herokuapp.com/upload");
  driver.manage().window().maximize();

 }
  @Test
 public void fileUpload(){

  WebElement fileUpload = driver.findElement(By.id("file-upload"));
  fileUpload.sendKeys("C:\\Users\\vipra\\eclipse-workspace\\SeleniumFramework\\src\\main\\resources\\data\\fileUpload.txt");

  WebElement fileUploadBtn = driver.findElement(By.id("file-submit"));
  fileUploadBtn.click();
 }



}
