package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");

       WebElement emailInputBox = driver.findElement(By.id("Email"));
       emailInputBox.clear();
       emailInputBox.sendKeys("adm123@gmail.com");

       //Capturing text from input box
        System.out.println("Result from getAttribute() method :" + emailInputBox.getAttribute("value"));
        System.out.println("Result from getText() method :" + emailInputBox.getText());

        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        System.out.println(loginButton.getAttribute("type"));
        System.out.println(loginButton.getAttribute("class"));

        System.out.println(loginButton.getText());

    }
}
