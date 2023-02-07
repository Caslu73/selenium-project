package com.cydeo.tests.day2_locators_getText_getAtrribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    /*
    TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =  new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //Verify URL contains:
        //Expected : cydeo

        String expectedURL= "cydeo";

        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED");

        }else{
            System.out.println("URL verification FAILED");
        }

        //Verify expected Title
        // Title  : Practice

        String expectedTitle = "Practice";

        String actualTitle = driver.getTitle(); // Return "Practice"

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is Passed");
        }else{
            System.out.println("TItle verification Failed");
        }

        if(driver.getTitle().equals("Practice")){
            System.out.println("Pass");
        }

        //close the browser

        driver.close();




    }
}
