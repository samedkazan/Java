import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AddressPage extends BasePage {
    public AddressPage(WebDriver driver) {
        super(driver);
    }


    public void fillAddressInfo() {
//        Adress bilgileri girildi.
        click(By.xpath("(//a[@title='Yeni adres oluştur'])[1]"));

        type(By.cssSelector("input[placeholder='Ev adresim, iş adresim vb.']"), "Ev"+Math.round(Math.random()*1000000));

        type(By.cssSelector("input[name='first_name']"), "Your Name");

        type(By.cssSelector("input[name='last_name']"), "Your Lastname");

        click(By.cssSelector("input[name='phone_number']"));

        type(By.cssSelector("input[name='phone_number']"), "1111111111");

        selectOpt(By.cssSelector("select[name='city']"), "40");

        selectOpt(By.cssSelector("select[name='township']"), "470");

//      İlçe bilgisi tıklandıktan hemen sonra dropdown menunün yüklenmesi uzun sürdüğü ve element secilemediği için 1 sn statik bekleme yapıldı.
        waitBySeconds(1);

        waitUntilOptionsBePopulated(By.cssSelector("select[name='district']"),By.cssSelector("option[value='35910']"));

        selectOpt(By.cssSelector("select[name='district']"), "35910");

        type(By.cssSelector("textarea[name='line']"), "Your City Township District Address");

        click(By.cssSelector("button[class='button green js-set-country js-prevent-emoji']"));

        waitBySeconds(1);

        waitForElementsToBeClickable(driver,By.cssSelector(".button.block.green.js-proceed-button"),10);

        click(By.cssSelector(".button.block.green.js-proceed-button"));

    }

    private void waitUntilOptionsBePopulated(By selectLocator,By optionLocator){
//        Select in menulerinin yüklenmesi için dinamik bekleme yapıldı.
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(selectLocator,optionLocator ));
    }



}
