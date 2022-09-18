import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {
    WebDriver driver;

    @BeforeAll
    public void setUp(){
//        Sayfayı ayağa kaldırıyoruz.

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.a101.com.tr/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();




    }
    @AfterAll
    public void tearDown(){
//        Sayfayı kapatıyoruz



    }



}
