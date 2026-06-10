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

    public void clickPlaceOrder() {
        click(CartPageLocator.PLACE_ORDER_BUTTON);
    }

    public void fillPurchaseForm(String name,String country,String city,String creditCard,String month,String year)
    {
        write(CartPageLocator.NAME_INPUT, name);
        write(CartPageLocator.COUNTRY_INPUT, country);
        write(CartPageLocator.CITY_INPUT, city);
        write(CartPageLocator.CREDIT_CARD_INPUT, creditCard);
        write(CartPageLocator.MONTH_INPUT, month);
        write(CartPageLocator.YEAR_INPUT, year);
    }

    public void clickPurchase() {
        click(CartPageLocator.PURCHASE_BUTTON);
    }

    public String getSuccessTitle() {
        return getText(CartPageLocator.SUCCESS_TITLE).trim();
    }

    public String getSuccessDetails() {
        return getText(CartPageLocator.SUCCESS_DETAILS).trim();
    }

}