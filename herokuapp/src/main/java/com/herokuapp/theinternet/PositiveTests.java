package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests {

    @Test
    public void loginTest() {

        System.out.println("Test is started");
        WebDriver webDriver = new ChromeDriver();

        String url = "https://the-internet.herokuapp.com/login";
        webDriver.get(url);
        extractedSleep(1);

        webDriver.manage().window().maximize();
        extractedSleep(1);

        WebElement username = webDriver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        extractedSleep(1);

        WebElement password = webDriver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");

        String expectedUrl = "https://the-internet.herokuapp.com/secure";
        String actualUrl = webDriver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl, "Actual message is not as expected");


        WebElement loginButton = webDriver.findElement(By.tagName("button"));
        loginButton.click();


        WebElement logoutButton = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));

        Assert.assertTrue(logoutButton.isDisplayed(), "Logout button is shown");
        WebElement message = webDriver.findElement(By.cssSelector("div#flash"));

        String expectedMessage = "message is shown";
        String actualMessage = message.getText();

        Assert.assertEquals(expectedMessage, actualMessage);
        webDriver.close();
        System.out.println("Page is opened");


    }

    private void extractedSleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
