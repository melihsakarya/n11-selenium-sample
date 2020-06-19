package com.n11.sample.test.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest2 {

    @Test
    public void sampleTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedrivermac");
        WebDriver driver = new ChromeDriver();

        driver.quit();
    }
}
