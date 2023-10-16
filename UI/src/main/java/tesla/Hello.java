package tesla;

import com.digital.driver.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hello {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://demoqa.com/text-box");
       Thread.sleep(3000);

        driver.close();
        driver.quit();

        driver.findElement(By.xpath("username"));

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://demoqa.com/text-box");



    }
}
