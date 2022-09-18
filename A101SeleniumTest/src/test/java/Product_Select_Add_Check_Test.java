import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Product_Select_Add_Check_Test extends BaseTest {
    HomePage homePage ;
    ProductPage productPage;

    ProductsDetailPage productsDetailPage;
    CartPage cartPage;
    AccountPage accountPage;
    AddressPage addressPage;
    CheckoutPage checkoutPage;

    @Test
    @Order(1)
    public void pass_the_cookie(){
        homePage = new HomePage(driver);
        homePage.cookieAccept();

    }
    @Test
    @Order(2)
    public void click_to_navbar() {

        homePage.clickNavBar();

    }
    @Test
    @Order(3)
    public void click_to_menu(){
        productPage = new ProductPage(driver);
        productPage.clickMenu();

    }
    @Test
    @Order(4)
    public void select_a_category(){

        productPage.selectCategory();

    }
    @Test
    @Order(5)
    public void select_a_product(){

        productPage.selectProduct(0);
    }
    @Test
    @Order(6)
    public void check_color(){
        productsDetailPage = new ProductsDetailPage(driver);
//    İstenilen renk kontrolü yapıldı.
        Assertions.assertTrue(productsDetailPage.color().contains("Siyah"),"Siyah Degil");
    }
    @Test
    @Order(7)
    public void add_to_cart(){
        productsDetailPage.addToCart();

    }
    @Test
    @Order(8)
    public void show_the_cart(){
        productsDetailPage.showCart();

    }
    @Test
    @Order(9)
    public void confirm_to_cart(){
        cartPage = new CartPage(driver);
        cartPage.confirmCart();

    }
    @Test
    @Order(10)
    public void continue_without_a_member(){
        accountPage = new AccountPage(driver);
        accountPage.continueWithoutMember();
    }
    @Test
    @Order(11)
    public void email_verification(){
        accountPage.emailVerification();

    }
    @Test
    @Order(12)
    public void fill_address_info(){
        addressPage= new AddressPage(driver);
        addressPage.fillAddressInfo();

    }
    @Test
    @Order(13)
    public void fill_card_infos_and_check_redirect_to_screen(){
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillCardInfo();
//    Sayfaya yönlendirildiği kontrol edildi.
        Assertions.assertFalse(checkoutPage.cardText(),"Sayfaya Yönlendirilmedi");
    }







}
