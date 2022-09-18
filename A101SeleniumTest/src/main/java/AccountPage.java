import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }


    public void continueWithoutMember() {
//        Üye olmadan devam et butonuna tıklandı
        click(By.cssSelector("a[title='ÜYE OLMADAN DEVAM ET']"));
    }

    public void emailVerification() {
//        Email onaylaması için text gönderildi ve butona tıklandı.
        type(By.cssSelector("input[name='user_email']"),"youremailadress@mail.com");
        click(By.cssSelector("button[class='button block green']"));

    }
}
