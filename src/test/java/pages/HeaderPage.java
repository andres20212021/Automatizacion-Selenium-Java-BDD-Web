package pages;

import locators.HeaderLocator;

public class HeaderPage extends BasePage {

    public void goToCart() {
        click(HeaderLocator.CART_LINK);
    }
}