package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://swisnl.github.io/jQuery-contexMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class='contex-menu-one btn btn-neutral']"));

        Actions act = new Actions(driver);
        act.contextClick(button).perform();//Right click action


    }
}
