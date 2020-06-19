package com.n11.sample.test.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

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

    public void setById(String id, String value){
        WebElement loginElement =driver.findElement(By.id(id));
        loginElement.click();
        loginElement.clear();
        loginElement.sendKeys(value);
    }

    public void clickBy(By by){
        WebElement loginButton = driver.findElement(by);
        loginButton.click();
    }


}
