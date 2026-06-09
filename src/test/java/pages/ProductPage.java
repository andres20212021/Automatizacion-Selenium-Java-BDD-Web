package pages;

import locators.ProductPageLocator;

public class ProductPage extends BasePage {

    public void addProductToCart() {
        click(ProductPageLocator.ADD_TO_CART_BUTTON);
    }

    public void acceptMessageConfirmation() {
        acceptAlert();
    }

    public String getProductName() {
        return getText(ProductPageLocator.PRODUCT_NAME).trim();
    }

    public int getProductPrice() {

        String priceText = getText(ProductPageLocator.PRODUCT_PRICE);

        priceText = priceText
                .replace("$", "")
                .replace("*includes tax", "")
                .trim();

        return Integer.parseInt(priceText);
    }
}