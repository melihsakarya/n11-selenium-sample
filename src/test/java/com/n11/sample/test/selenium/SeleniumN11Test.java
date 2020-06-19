package com.n11.sample.test.selenium;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumN11Test extends BaseTest{


    @Test
    public void sampleLinkTest(){
        List<WebElement> webElemanlari = driver.findElements(By.tagName("a"));
        System.out.println(webElemanlari.size());
    }

    @Test
    public void sampleInputTest(){
        List<WebElement> webElemanlari = driver.findElements(By.tagName("input"));
        System.out.println(webElemanlari.size());
    }


    @Override
    public void after() {
        super.after();
    }
}
