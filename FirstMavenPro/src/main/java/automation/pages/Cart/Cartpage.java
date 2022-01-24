package automation.pages.Cart;

import org.openqa.selenium.By;

public class Cartpage {

    public static final By Dresses= By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']");
    public static final By CasualDresses= By.xpath("//ul[@class='tree dynamized']/li/a[contains(text(), 'Casual Dresses')]");
    public static final By Product_div= By.xpath("//ul[@class=\"product_list grid row\"]/li[1]");
    public static final By ProductName= By.xpath("//h1[@itemprop='name']");
    public static final By ProductPrice= By.id("our_price_display");
    public static final By AddToCart= By.xpath("//button/span[contains(text(),\"Add to cart\")]");
    public static final By PopupCross= By.xpath("//span[@class='cross']");
    public static final By Cart_btn= By.xpath("//b[contains(text(),'Cart')]");
    public static final By CartProductName= By.xpath("//td[@class='cart_description']/p/a");
    public static final By CartProductPrice= By.id("product_price_3_13_0");
    public static String ProdTextName;
    public static String PriceTextName;
    public static String CartProdText;
    public static String CartPriceText;

}
