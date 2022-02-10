package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropImages {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

        WebElement item1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement item2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
        WebElement item3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
        WebElement item4 = driver.findElement(By.xpath(" //img[@alt='On top of Kozi kopka']"));

        WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));

        Actions act = new Actions(driver);

        // Moved both the items in to trash..
        act.dragAndDrop(item1,trash).perform();
        act.dragAndDrop(item2,trash).perform();
        act.dragAndDrop(item3,trash).perform();
        act.dragAndDrop(item4,trash).perform();



    }
}
