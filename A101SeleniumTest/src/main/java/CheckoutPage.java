import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


public class CheckoutPage  extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }


    public void fillCardInfo() {
//        Kart bilgileri girildi.
        type(By.cssSelector("div[class='form-area js-new-creditcard-area'] input[name='name']"),"Your Name");
        click(By.cssSelector(".js-masterpassbin-payment-card"));
        type(By.cssSelector(".js-masterpassbin-payment-card"),"0000000000000000");
        type(By.cssSelector("div[class='form-area js-new-creditcard-area'] input[name='card_cvv']"),"000");
        clickPseudoElements(By.xpath("//div[@class='payment-area js-payment-tab-content active']//div[@class='checkbox']"),-123,0);

    }
    //    Pseudo elementler selector ile seçilemediğinden mouse hareketi ile check edilmesi tercih edildi.Bu sayfaya özel olduğu için private yapıldı.
    private void clickPseudoElements(By locator,int x,int y){

        Actions build = new Actions(driver);
        build.moveToElement(find(locator)).moveByOffset(x,y).click().build().perform();

    }

    public Boolean cardText() {
//        Ödeme Sayfasında bilgileri doğru giremediğimizden dolayı siparişi tamamla kısmına basılıyor mu onu kontrol edip
//        yönlendirildiği bilgisini verdim.

        try {
            waitForElementsToBeClickable(driver,By.cssSelector(".order-complete"),5);
            click(By.cssSelector(".order-complete"));
            System.out.println("Odeme Sayfasina Yonlendi");
            return false;
        } catch(Exception e){
            return true;
        }

    }
}

