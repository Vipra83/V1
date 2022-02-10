package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement drpCountryEle = driver.findElement(By.id("input-country"));
        Select drpCounty = new Select(drpCountryEle);

       // drpCounty.selectByVisibleText("Switzerland");
       // drpCounty.selectByValue("13");
       // drpCounty.selectByIndex(12);

        // Selecting option from dropdown without using methods
        List<WebElement> listOptions = drpCounty.getOptions();

        for (WebElement option:listOptions){
            if(option.getText().equals("Cuba")){
                option.click();
                break;
            }


        }


    }
}
