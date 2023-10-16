package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public  class HomeWork extends BasedTest {
    @Test
    void EatNamba(){
        driver.get("https://nambafood.kg/");//  ссылка на сайт
        WebElement foodEating = driver.findElement(By.xpath("//ul[@class='nav']//a[@href='/food']"));
        foodEating.click();
        WebElement nationalFood = driver.findElement(By.xpath("//div[@class='cat-wrap']/a[1]"));
        nationalFood.click();
        WebElement cafeBarash = driver.findElement(By.xpath("//div[@class='catalog-wrap']/a[@href='/barashek']"));
        cafeBarash.click();
        WebElement orderFirst = driver.findElement(By.xpath("//div[@data-item-id='316106']/div[2]/div[2]"));
        orderFirst.click();
        orderFirst.click();
        WebElement orderFirstBtn = driver.findElement(By.xpath("//div[@data-item-id='316106']/button"));
        orderFirstBtn.click();
        WebElement orderSecond = driver.findElement(By.xpath("//div[@data-item-id='301020']/div[2]/div[2]"));
        orderSecond.click();
        orderSecond.click();
        WebElement orderSecondBtn = driver.findElement(By.xpath("//div[@data-item-id='301020']/button"));
        orderSecondBtn.click();
        WebElement cartBtn = driver.findElement(By.xpath("//div[@id='cart']"));
        cartBtn.click();
        WebElement orderSubmit = driver.findElement(By.xpath("//div[@class='order--actions']/a"));
        orderSubmit.click();
        WebElement nameInput = driver.findElement(By.id("food_order_client_name"));
        nameInput.sendKeys("Katya");


    }

}
