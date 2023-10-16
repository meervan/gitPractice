package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BasedTest {

   protected WebDriver driver;

    @BeforeClass
    public void setUpBrowser() {

        // Установка системного свойства для пути к драйверу Chrome

       // System.setProperty("web driver.chrome.driver", "\"C:\\Program Files\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(); // создание нового объекта WebDriver

        driver.manage().window().maximize(); // развернуть на весь экран

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // установить неявное ожидание
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
