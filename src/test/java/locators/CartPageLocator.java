package locators;

import org.openqa.selenium.By;

public class CartPageLocator {
    private CartPageLocator() {
    }

    public static By productByName(String productName) {
        return By.xpath("//td[text()='" + productName + "']");
    }

    public static By productPriceByName(String productName) {
        return By.xpath("//tbody[@id='tbodyid']//tr[td[normalize-space()='" + productName + "']]/td[3]");//devuelve el elemento  html
    }
    public static final By PLACE_ORDER_BUTTON = By.xpath("//button[text()='Place Order']");

    public static final By NAME_INPUT = By.id("name");

    public static final By COUNTRY_INPUT = By.id("country");

    public static final By CITY_INPUT = By.id("city");

    public static final By CREDIT_CARD_INPUT = By.id("card");

    public static final By MONTH_INPUT = By.id("month");

    public static final By YEAR_INPUT = By.id("year");

    public static final By PURCHASE_BUTTON = By.xpath("//button[text()='Purchase']");

    public static final By SUCCESS_TITLE = By.xpath("//h2[text()='Thank you for your purchase!']");

    public static final By SUCCESS_DETAILS =  By.xpath("//div[contains(@class,'sweet-alert')]//p[contains(@class,'lead')]");

}
