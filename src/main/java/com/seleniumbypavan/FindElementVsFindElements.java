package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        // findElement() --> Return the single Web element

        //1
       /* WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("ABC");

        //2
        WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(ele.getText());

        //3
        WebElement searchButton = driver.findElement(By.xpath("//button[normalize-space()='login']"));*/

        // findElements() --> Return multiple Web elements

        //1
        List<WebElement>links = driver.findElements(By.xpath(" //div[@class='footer-upper']//a"));
        System.out.println("Number of elements Captured: " + links.size());

        for (WebElement ele : links){
            System.out.println(ele.getText());
        }

        //2
        List<WebElement> logo = driver.findElements(By.xpath(" //img[@alt='nopCommerce demo store']"));
        System.out.println(logo.size());

        //3
       // List<WebElement> elements = driver.findElements(By.xpath("//img[contains,title'Electronics']"));
       // System.out.println(elements.size());

    }
}
