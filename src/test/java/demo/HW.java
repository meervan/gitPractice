package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW {

    @Test
    void fillUpTheFormTest() throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); // create new object

        driver.manage().window().maximize(); // make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10)); // set up the time

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstNameInputField = driver.findElement(By.id("firstName"));

        String expectedFirstName = "Jessica";

        firstNameInputField.sendKeys(expectedFirstName);

        WebElement lastNameInputField = driver.findElement(By.id("lastName"));

        String expectedLastName = "Brown";

        lastNameInputField.sendKeys(expectedLastName);

        WebElement emailInputField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "jessica777@gmail.com";

        emailInputField.sendKeys(expectedEmail);



    }
}
