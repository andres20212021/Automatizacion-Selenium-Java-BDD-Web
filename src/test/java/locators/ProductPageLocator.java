package locators;

import org.openqa.selenium.By;

public class ProductPageLocator {
    private ProductPageLocator() {
    }
    public static final By ADD_TO_CART_BUTTON =By.xpath("//a[text()='Add to cart']");
    public static final By PRODUCT_NAME = By.cssSelector("h2.name");//samsung
    public static final By PRODUCT_PRICE = By.cssSelector("h3.price-container");

}
