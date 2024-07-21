package com.herokuapp.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests {

    public void loginTest() {

        WebDriver webDriver = new ChromeDriver();

        String url = "https://the-internet.herokuapp.com/login";
        webDriver.get(url);

        webDriver.manage().window().maximize();

    }
}
