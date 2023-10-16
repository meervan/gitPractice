import com.digital.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement searchInp = driver.findElement(By.id("twotabsearchtextbox"));
        searchInp.sendKeys("iphone");

        searchInp.sendKeys(Keys.ENTER);
        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));
        for (WebElement brand:brands){
            System.out.println(brand.getText());
            brand.click();
        //WebElement chechbox = brand.findElement(By.tagName("i"));
        //chechbox.click();
        }

    }
}
