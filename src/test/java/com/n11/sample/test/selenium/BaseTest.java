package com.n11.sample.test.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    @Before
    public void before() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.n11.com");
        Thread.sleep(5000);
        driver.findElement(By.className("closeBtn")).click();
    }

    @After
    public void after(){
        driver.quit();
    }

}
