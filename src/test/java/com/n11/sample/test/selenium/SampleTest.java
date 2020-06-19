package com.n11.sample.test.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.List;

public class SampleTest {

    @Test
    public void ilkLinkeTiklama(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedrivermac");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.n11.com");


        List<WebElement> webElemanlari = driver.findElements(By.tagName("a"));
        System.out.println(webElemanlari.size());


        for (WebElement element: webElemanlari) {
            String elementText = element.getText();

            if(elementText.length() > 10){
                System.out.println(elementText.toUpperCase());
            }
        }




        driver.quit();


    }
}
