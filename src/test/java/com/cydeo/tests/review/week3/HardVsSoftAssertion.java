package com.cydeo.tests.review.week3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HardvsSoftAssertion {
    /// TC#1: Registration Form Page Testing
    //    // 1. Open Chrome browser
    //    // 2. Go to https://practice.cydeo.com/registration_form
    //    // 3. Verify title is as expected:
    //    // Expected: "Registration Form"
    //    // 4. Select "SDET" from Job title dropdown
    //    // 5. Verify "SDET" is selected
        WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

    }

    @Test
    public void registration_form_hardAssert_test(){

        // 3. Verify title is as expected:
        //    // Expected: "Registration Form"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Registration Form";

        Assert.assertTrue(actualTitle.equals(expectedTitle),"Title verification is failed");
        Assert.assertEquals(actualTitle,expectedTitle, "Title verification is failed");


        // 4. Select "SDET" from Job title dropdown

        Select selectJobTitle = new Select(driver.findElement(By.name("job_title")));
        selectJobTitle.selectByVisibleText("SDET");

        // 5. Verify "SDET" is selected

        Assert.assertTrue(selectJobTitle.getFirstSelectedOption().getText().equals("SDET"));



    }

    @Test
    public void registration_form_SoftAssert_test(){

        // 3. Verify title is as expected:
        //    // Expected: "Registration Form"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Registration Form";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);


        // 4. Select "SDET" from Job title dropdown

        Select selectJobTitle = new Select(driver.findElement(By.name("job_title")));
        selectJobTitle.selectByVisibleText("SDET");

        // 5. Verify "SDET" is selected

        String actualSelectedOption = selectJobTitle.getFirstSelectedOption().getText();
        String expectedSelected = "SDET";





    }
}
