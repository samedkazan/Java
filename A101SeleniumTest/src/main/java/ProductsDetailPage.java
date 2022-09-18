import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsDetailPage extends BasePage {


    public ProductsDetailPage(WebDriver driver) {

        super(driver);
    }


    public String color() {
        //Karşılaştırmayı seçilen renk elementine göre yapabilirdik ancak bazı ürünlerde bu kısım olmadığı için
        // ve tüm ürünlerde renk başlıkta yazdığı için böyle tercih edildi.
        String text= find(By.cssSelector(".product-name.js-name")).getText();

        if(text.contains("Siyah")){
            System.out.println("Sectiginiz Urun Siyah");
            return text;
        }else {
            return null;
        }


    }

    public void addToCart() {
//        Sepete ekle butonuna tıklandı.

        click(By.cssSelector(".add-to-basket.button.green.block.with-icon.js-add-basket"));
    }

    public void showCart() {
//        Sepeti görüntüle butonuna tıklandı.
        click(By.cssSelector(".go-to-shop"));
    }
}
