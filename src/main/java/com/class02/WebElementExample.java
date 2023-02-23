package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementExample {
    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "C://Users//vipra//Downloads//chromedriver_win32//chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();

            driver.get("https://www.ebay.com/");

            WebElement searchBox = driver.findElement(By.id("gh-ac"));
            searchBox.sendKeys("TV");

            String text = searchBox.getAttribute("placeholder");
            System.out.println(text);

            WebElement searchBtn = driver.findElement(By.id("gh-btn"));
            searchBtn.click();

            WebElement footerText = driver.findElement(By.xpath("//td[@class='gf-legal]"));
            System.out.println(footerText.getText());

        }

    }
