package com.cydeo.tests.day02_locators_getText_getAtrribute.Tastks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    /*
    HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy”
     */

    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

       // 3. Search for “wooden spoon”
        //a. Identify web element of the search box
       WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));

        //b. Write "wooden spoon" in the located search box and press ENTER
       searchBox.sendKeys("wooden spoon" + Keys.ENTER);

       //4. Verify title:
        //Expected: “Wooden spoon - Etsy”

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification Passed");
        }else{
            System.out.println("Title verification Fail");
        }




    }
}
