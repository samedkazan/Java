import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }


    public void confirmCart() {
//        Sepeti onayla butonuna tıklandı.
        click(By.cssSelector(".button.green.checkout-button.block.js-checkout-button"));
    }
}


