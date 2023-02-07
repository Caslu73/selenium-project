package com.cydeo.tests.day2_locators_getText_getAtrribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {

    public static void main(String[] args) {

       /* TC #2: Back and forth navigation
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com
        3- Click to A/B Testing from top of the list.
        4- Verify title is:
        Expected: No A/B Test
        5- Go back to home page by using the .back();
        6- Verify title equals:
        Expected: Practice

        */

        WebDriverManager.chromedriver().setup();
        //Open a chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list.
        driver.findElement(By.linkText("A/B Testing")).click();

        //4- Verify title is:
        //        Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String actualTItle = driver.getTitle();

        if(actualTItle.equals(expectedTitle)){
            System.out.println("Title verification Passed");
        }else{
            System.out.println("Title verification Failed");
        }

        // Go back to home page by using the .back();

        driver.navigate().back();

        //6- Verify title equals:
        //        Expected: Practice
        expectedTitle = "Practice";
        actualTItle = driver.getTitle();

        if(expectedTitle.equals(actualTItle)){
            System.out.println("Title verification PASS");
        }else{
            System.out.println("TItle verification FAIL");
        }




    }
}
