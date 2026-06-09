package pages;

import locators.CartPageLocator;

public class CartPage extends BasePage {

    public boolean productVisibleInCart(String productName) {
        return isElementDisplayed(CartPageLocator.productByName(productName));
    }

    public int getProductPriceInCart(String productName) {
        String priceText = getText(CartPageLocator.productPriceByName(productName));
        return Integer.parseInt(priceText.trim());
    }
}