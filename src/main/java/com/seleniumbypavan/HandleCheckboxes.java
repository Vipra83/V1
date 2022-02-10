package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();

        // select specific checkbox
       // driver.findElement(By.id("monday")).click();

        // select all the checkboxes
     List<WebElement>checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

     //Using for..each loop
       /* for (WebElement listOfChkBoxes:checkBoxes){

            listOfChkBoxes.click();

        }*/
        // Using for loop

       /* for (int i = 0; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();

        }*/

     // select multiple checkboxes by choice monday and sunday

      /*  for (WebElement listOfChkBoxes:checkBoxes){
          String checkBoxName = listOfChkBoxes.getAttribute("id");
          if(checkBoxName.equals("monday") || checkBoxName.equals("sunday")){
              listOfChkBoxes.click();
          }
        }*/

     //4.) Select last 2 checkboxes

        int totalCheckBoxes = checkBoxes.size();

      /*  for (int i = totalCheckBoxes-2;i<totalCheckBoxes;i++){
            checkBoxes.get(i).click();
        }*/

     //5.) Select first 3 checkboxes

        for (int i = 0; i < totalCheckBoxes; i++) {

            if(i < 3){

                checkBoxes.get(i).click();
            }

        }


    }
}
