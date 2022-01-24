package Pagetest.cart;

import Basic.BasicActionIntegration;
import automation.actions.ShopCartImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

@Epic("Epic 2")
public class CartTest extends BasicActionIntegration {

    ShopCartImpl shop;

//1- Open Application
//2- Click on Dresses | Casual Dresses
//3- Select one Item from Result and add to cart
//4- Open the cart and verify the same item added in cart and price is correct

    @Test
    @Description("Creating ShopCartPageImpl objects before class")
    public void initImpl() { shop = new ShopCartImpl(bot); }

    @Test(dependsOnMethods = "initImpl")
    @Description("Add product to the cart and verify whether the right product and correct price is added")
    @Owner("Anubhuti Anand")
    public void add_to_cart_and_verify_name_and_price(){
        stepLog("Click on Dresses and then Casual Dresses");
        shop.clickDresses();
        shop.clickCasualDresses();

        stepLog("Select one item from result and add to cart");
        shop.selectProduct();
        shop.addToCart();

        stepLog("Close the popup");
        shop.closePopup();

        stepLog("Open the cart");
        shop.openCart();

        stepLog("Verify that same item is added in the cart and its price is correct");
        shop.nameCheck();
        shop.priceCheck();
    }
}


