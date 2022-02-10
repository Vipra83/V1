package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Alert window with OK button
      /*  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();*/

        // Alert window with OK and Cancel Button
      /*  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
       // driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();*/

        // Alert window with input box, Capture text from alert.
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);

        Alert alertWindow = driver.switchTo().alert();
        System.out.println("The message displayed : " + alertWindow.getText());
        alertWindow.sendKeys("Welcome");
        alertWindow.accept();




    }
}
