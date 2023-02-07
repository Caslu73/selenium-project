package com.cydeo.tests.day04_findElements_checkboxes_radio.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class xpathAndCssSelectorPractices {
    //TC #1: XPATH and cssSelector Practices
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/forgot_password
    //3. Locate all the WebElements on the page using XPATH and/or CSS
    //locator only (total of 6)
    //a. “Home” link
    //b. “Forgot password” header
    //c. “E-mail” text
    //d. E-mail input box
    //e. “Retrieve password” button
    //f. “Powered by Cydeo text
    //4. Verify all web elements are displayed.
    //First solve the task with using cssSelector only. Try to create 2 different
    //cssSelector if possible
    //Then solve the task using XPATH only. Try to create 2 different
    //XPATH locator if possible

    public static void main(String[] args) {
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
        //6 web element total

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2. Go to https://practice.cydeo.com/forgot_password

        driver.get("https://practice.cydeo.com/forgot_password");
        //3 Locate web element
        //a. “Home” link


        WebElement homeLink = driver.findElement(By.cssSelector("a[class = 'nav-link']"));
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href= '/']"));
        //b. “Forgot password” header

        WebElement passwordHeader = driver.findElement(By.cssSelector("div[class='example'] > h2"));

        //c. “E-mail” text

        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailText2 = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns'] > label"));
       // WebElement emailText3 = driver.findElement(By.cssSelector("label.email"));


        //d. E-mail input box

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement emailInputBox2 = driver.findElement(By.cssSelector(" input[name='email']"));
        //e. “Retrieve password” button

        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));
        WebElement retrievePasswordButton2 = driver.findElement(By.cssSelector("button[class ='radius']"));

        //f. “Powered by Cydeo text
        WebElement cydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;'] "));



        //4. Verify all web elements are displayed.

        System.out.println("homeLink.isDisplayed(), expect to be true = " + homeLink.isDisplayed());
        System.out.println("homeLink2.isDisplayed(), expect to be true = " + homeLink2.isDisplayed());
        System.out.println("passwordHeader.isDisplayed(), expect to be true  = " + passwordHeader.isDisplayed());
        System.out.println("emailText.isDisplayed(), expect to be true  = " + emailText.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed(), expect to be true  = " + retrievePasswordButton.isDisplayed());
        System.out.println("retrievePasswordButton2.isDisplayed(), expect to be true  = " + retrievePasswordButton2.isDisplayed());
        System.out.println("cydeoText.isDisplayed(), expect to be true  = " + cydeoText.isDisplayed());

        System.out.println("========================================================");
        System.out.println("Printing text");
        System.out.println(homeLink.getText());
        System.out.println(homeLink2.getText());
        System.out.println(passwordHeader.getText());
        System.out.println(emailText.getText());
        System.out.println(emailText2.getText());
        System.out.println(emailInputBox.getText());
        System.out.println(emailInputBox2.getText());
        System.out.println(retrievePasswordButton.getText());
        System.out.println(retrievePasswordButton2.getText());
        System.out.println(cydeoText.getText());
        driver.close();
    }
}
