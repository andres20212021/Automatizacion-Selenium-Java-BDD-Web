package pages;

import locators.ProductPageLocator;

public class ProductPage extends BasePage {

    public void addProductToCart() {
        click(ProductPageLocator.ADD_TO_CART_BUTTON);
    }

    public void acceptMessageConfirmation() {
        acceptAlert();
    }
}