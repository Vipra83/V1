package com.seleniumbypavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        // getWindowHandle()

       /* String windowID = driver.getWindowHandle();// return ID of the single browser window
        System.out.println(windowID);//CDwindow-1F1F0B4E4ECC70F67FD154EE1F4F3BA7*/

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        // getWindowHandles()

       Set<String> windowIDs = driver.getWindowHandles();// return ID's of multiple windows

       //First Method -> Iterator()
     /* Iterator<String> it = windowIDs.iterator();

      String parentWindowId = it.next();
      String childWindowId = it.next();

        System.out.println("Parent window Id" + parentWindowId);
        System.out.println("Child window Id" + childWindowId);*/

       List<String> windowIDsList = new ArrayList(windowIDs);

     /*  String parentWindowId = windowIDsList.get(0);
       String childWindowId = windowIDsList.get(1);

        System.out.println("Parent window Id" + parentWindowId);
        System.out.println("Child window Id" + childWindowId);

        // How to use window's ID for switching

        driver.switchTo().window(parentWindowId);
        System.out.println("Parent window Title" + driver.getTitle());

        driver.switchTo().window(childWindowId);
        System.out.println("Child window Title" + driver.getTitle());*/

        // for each loop
       /* for (String winId:windowIDsList) {
            System.out.println(winId);
            String title = driver.switchTo().window(winId).getTitle();
            System.out.println(title);
        }
        driver.close(); // close single browser window
        driver.quit(); // close all the browser windows*/

        for (String winId:windowIDsList) {
            String title = driver.switchTo().window(winId).getTitle();
            if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")){
                driver.close();
            }


        }
    }
}
