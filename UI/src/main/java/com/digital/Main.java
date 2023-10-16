package com.digital;


import com.digital.driver.Driver;
import com.digital.driver.FireFoxWebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

          FireFoxWebDriver.loadFireFoxWebDriver();


    }
    WebDriver driver;
    @BeforeClass
    public void setIp(){
        driver = Driver.getDriver();// мы сделали его не зависимым от значения Браузеров

    }

    @Test
    void test1(){
        driver.get("https://www.google.com/");

    }
    @Test
    void test12(){
        driver.get("https://www.google.com/");

    }
    @Test
    void test13(){
        driver.get("https://www.google.com/");
    }
    @Test
    void test14(){
        driver.get("https://www.google.com/");

    }
    @Test
    void test15(){
        driver.get("https://www.google.com/");

    }
    @Test
    void test16(){
        driver.get("https://www.google.com/");

    }







}