package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverEx {
    public static void main(String[] args) {

       // System.setProperty("webdriver.edge.driver","src//main//resources//driver//edgedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");

    }
}
