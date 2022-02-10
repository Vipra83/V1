package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropAction {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        WebElement rome = driver.findElement(By.id("box6"));
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement unitedStates = driver.findElement(By.id("box103"));

        Actions act = new Actions(driver);
        act.dragAndDrop(rome,italy).perform();
        act.dragAndDrop(washington,unitedStates).perform();


    }
}
