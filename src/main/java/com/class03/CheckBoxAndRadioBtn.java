package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioBtn {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement checkBx1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        checkBx1.click();
        if (!checkBx1.isSelected()) {
            checkBx1.click();
        }

        WebElement checkBx2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        checkBx2.click();
        if (!checkBx2.isSelected()) {
            checkBx2.click();
        }


    }

}