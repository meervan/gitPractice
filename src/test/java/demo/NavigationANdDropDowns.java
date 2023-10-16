package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class NavigationANdDropDowns extends BasedTest{
     @Test
    void demo1() throws InterruptedException {
         driver.navigate().to("https://nambafood.kg/");
         driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click();
         Thread.sleep(3000);
         driver.navigate().back();
         Thread.sleep(3000); driver.navigate().forward();
         driver.navigate().refresh();
         Thread.sleep(3000);
     }

    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectColor= driver.findElement(By.id("oldSelectMenu"));
        Select select= new Select(selectColor);
//        select.selectByVisibleText("Green");
//
//        Thread.sleep(3000);
//        select.selectByValue("3");
//
//        select.selectByIndex(7);
//       // select.deselectByIndex(7);


        List<WebElement> selectedOption= select.getOptions();
//        for(WebElement option: selectedOption){
//            System.out.println(option.getText());
//        }
        selectRandomColor(select, selectedOption);

    }
    @Test
    public void selectRandomColor(Select select, List<WebElement> selectedOption) throws InterruptedException {

        Random randomColor= new Random();
        int indexColor= randomColor.nextInt(selectedOption.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);

        Thread.sleep(7000);
    }
}



