package automation.actions;

import automation.pages.Cart.Cartpage;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ShopCartImpl extends CoreActions{



        public ShopCartImpl(WebDriver bot)                //Doubt
        {super(bot);}

    //1  Open Application
//2  Click on Dresses | Casual Dresses
//3  Select one Item from Result and add to cart
//4  Open the cart and verify the same item added in cart and price is correct

    @Step("Clicking on Dresses")
    public void clickDresses(){
        sleep(8);
        click(Cartpage.Dresses);
        sleep(6);
    }

    @Step("Clicking on Casual Dresses")
    public void clickCasualDresses(){
        click(Cartpage.CasualDresses);
    }

    @Step("Selecting the product")
    public void selectProduct(){
        sleep(3);
        click(Cartpage.Product_div);
    }

    @Step("Adding the product to Cart")
    public void addToCart(){
        sleep(3);
        //Saving the product name for verifying with the cart
        Cartpage.ProdTextName= textRetriever(Cartpage.ProductName);

        //Saving the product price for verifying with the cart
        Cartpage.PriceTextName= textRetriever(Cartpage.ProductPrice);

        //Adding the product to cart
        click(Cartpage.AddToCart);


    }

    @Step("Closing the popup")
    public void closePopup(){
        sleep(2);
        clickPopupElement(Cartpage.PopupCross);
    }

    @Step("Opening the Cart")
    public void openCart(){
        sleep(2);
        click(Cartpage.Cart_btn);
    }

    @Step("Verifying the Product Name")
    public void nameCheck(){
        Cartpage.CartProdText =textRetriever(Cartpage.CartProductName);
        Assert.assertEquals(Cartpage.ProdTextName, Cartpage.CartProdText);

    }

    @Step("Verifying the Product Price")
    public void priceCheck(){
            Cartpage.CartPriceText = textRetriever(Cartpage.CartProductPrice);

        Assert.assertEquals(Cartpage.PriceTextName, Cartpage.CartPriceText);

    }
}
