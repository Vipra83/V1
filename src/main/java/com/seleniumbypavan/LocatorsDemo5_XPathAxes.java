package com.seleniumbypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo5_XPathAxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://users//vipra//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        //self
       String text = driver.findElement(By.xpath("//a[contains(text(),'Mahanagar Gas')]/self::a")).getText();
        System.out.println(text);

        //Parent
        text = driver.findElement(By.xpath("//a[contains(text(),'Mahanagar Gas')]/parent::td")).getText();
        System.out.println(text);

        //child
        List<WebElement> child = driver.findElements(By.xpath("//a[contains(text(),'Mahanagar Gas')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements:" + child.size());

        //Ancestor
        text = driver.findElement(By.xpath("//a[contains(text(),'Mahanagar Gas')]/ancestor::tr")).getText();
        System.out.println(text);




    }
}
