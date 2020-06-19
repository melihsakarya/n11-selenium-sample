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

    @Test
    public void loginTest(){

        clickBy(By.className("btnSignIn"));
        setById("email", "melih@testinium.com");
        setById("password", "123456");
        clickBy(By.id("loginButton"));
    }




}

//N11 e girip kullanici sifre girip login ol