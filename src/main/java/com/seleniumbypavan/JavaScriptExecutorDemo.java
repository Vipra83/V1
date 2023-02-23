package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

      //  JavascriptExecutor js = (JavascriptExecutor)driver;
      //  js.executeScript(Script, args);
     WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
     JavaScriptUtil.drawBorder(logo,driver);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("target//screenshot//screenshot.png"));
    }
}
