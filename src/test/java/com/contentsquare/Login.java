package com.contentsquare;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public boolean checkLoginScreen(WebDriver driver) {
        String loginPageTitle = "Contentsquare";
        String titleLoginPage = driver.getTitle();
        if (titleLoginPage.contains(loginPageTitle)) {
            return true;
        } else {
            return false;
        }
    }

    public void clickAccount(WebDriver driver) {
        driver.findElement(By.linkText("Log in")).click();
    }

    public void enterLoginDetailsAndClick(WebDriver driver) {
        driver.findElement(By.name("username")).sendKeys("test@test.com");
        driver.findElement(By.name("password")).sendKeys("ThisIs@T3st");
        driver.findElement(By.id("loginBtn")).click();
    }

    public void loginScreenError(WebDriver driver) {
        String errorMessageExpected = "Your Login Name or Password is invalid.";
        String errorMessageActual = driver.findElement(By.id("error_text")).getText();
        Assert.assertTrue(errorMessageActual.contains(errorMessageExpected));
    }
}
