import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import java.util.List;

public class ProductPage extends BasePage {
    By categoryLocator= By.cssSelector(".js-filter-link[href='/giyim-aksesuar/dizalti-corap/']");
    By imgLocator = By.cssSelector("img[class=' lazyloaded']");
    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public void clickMenu() {
//      Kadın iç giyim sekmesine tıklar.
        click(By.cssSelector("a[data-value='1565']"));
    }

    public void selectCategory() {
//        Dizaltı çorap sekmesine tıklar.
        //Site Hemen Yüklenmediği İçin Dinamik Bekleme Yapıldı.
        waitForElementsToBeClickable(driver,categoryLocator,10).click();


    }

    public void selectProduct(int i) {
//          Element listesine gidip i indexi seçilip tıklandı.
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        //Bu sayfaya özel element listesini almak için private bir method oluşturuldu.
        //Liste yüklenmesi için dinamik bekleme yapıldı.
        waitForElementsToBeClickable(driver,By.xpath("(//h1[contains(text(),'Dizaltı Çorap')])[1]"),10);
        return findAll(imgLocator);
    }
}
