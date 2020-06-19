package com.n11.sample.test.selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class N11SearchTest extends BaseTest{

    @Test
    public void getElectronicCategoriesTest() throws InterruptedException {

        WebElement searchElement = driver.findElement(By.xpath("//*[@id='searchData']"));
        searchElement.click();
        searchElement.clear();
        searchElement.sendKeys("Samsung");

        WebElement searchBtn = driver.findElement(By.className("searchBtn"));
        searchBtn.click();
    }
}
