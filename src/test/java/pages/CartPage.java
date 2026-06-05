package pages;

import locators.CartPageLocator;

public class CartPage extends BasePage {

    public boolean productVisibleInCart(String productName) {
        return isElementDisplayed(CartPageLocator.productByName(productName));
    }
}