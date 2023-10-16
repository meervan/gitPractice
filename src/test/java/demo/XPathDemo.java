package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XPathDemo {



    public class XpathDemo extends BasedTest{

        @Test
        void absoluteXpath() throws InterruptedException {
            driver.get("https://demoqa.com/automation-practice-form");
            WebElement firstNameInputField = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
            firstNameInputField.sendKeys("John");
            Thread.sleep(7000);
        }

        @Test
        void relativeXpath(){
            driver.get("https://demoqa.com/automation-practice-form");
            WebElement lastNameInputField = driver.findElement(By.xpath("//input[@id='lastName']"));
            lastNameInputField.sendKeys("Doe");

            WebElement emailInputField = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));

            WebElement mobNumberInputField = driver.findElement(By.xpath("//*[@id='userNumber']"));

            WebElement registrationFormText = driver.findElement(By.xpath("//*[text()='Student Registration Form']"));

            WebElement contains = driver.findElement(By.xpath("//*[contains(text(),'Student')]"));

            WebElement emailText = driver.findElement(By.xpath("//form/div[2]/div/label"));

            WebElement currentAddress = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]"));

            WebElement parent = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]/../.."));




        }
    }
}
