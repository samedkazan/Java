import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement find(By locator) {//Find için method atıyoruz.
        return driver.findElement(locator);

    }

    public List<WebElement> findAll(By locator) {//findall için method atıyoruz.
        return driver.findElements(locator);
    }

    public void click(By locator) {//click için method atıyoruz.

        find(locator).click();
    }

    public void type(By locator, String text) {//sendkeys için method atıyoruz.

        find(locator).sendKeys(text);
    }

    public void waitBySeconds(long seconds) {//statik bekleme için method atıyoruz.
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static WebElement waitForElementsToBeClickable(WebDriver driver, By locator, int second) {//element tıklanabilir olana kadar beklemesi için method atıyoruz.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    public void selectOpt(By locator, String value) {//select elementi için method atıyoruz.
        WebElement selectElement = driver.findElement(locator);
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue(value);


    }


}
