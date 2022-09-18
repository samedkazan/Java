import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void cookieAccept() {
//        Cookie'leri kabul et seçeneğine tıklar.
        click(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']"));


    }

    public void clickNavBar() {
//        Giyim&Aksesuar seceneğine tıklar.
        click(By.xpath("//a[normalize-space()='Giyim & aksesuar']"));


    }
}

