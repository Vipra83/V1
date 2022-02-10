package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        // Create web element pointing to <Select> tag
        WebElement catDropdown = driver.findElement(By.id("//select[@id='gh-cat']"));

        // Create object of Select class & pass web element as constructor argument
        Select catDropdownSelect = new Select(catDropdown);

        Thread.sleep(5000);
        catDropdownSelect.selectByIndex(12);

        Thread.sleep(5000);
        catDropdownSelect.selectByValue("11116");

        Thread.sleep(5000);
        catDropdownSelect.selectByVisibleText("Books");

        List<WebElement> listOfOption = catDropdownSelect.getOptions();

        // Print data from list using enhance(for each) for loop
        for (WebElement listOption : listOfOption){
            System.out.println(listOption.getText());
        }

        // Print data from list using index based for loop
        for (int i = 0; i < listOfOption.size(); i++) {
            System.out.println(listOfOption.get(i).getText());

        }










    }
}
