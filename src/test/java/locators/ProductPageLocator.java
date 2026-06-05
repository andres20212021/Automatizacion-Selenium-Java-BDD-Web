package locators;

import org.openqa.selenium.By;

public class ProductPageLocator {
    private ProductPageLocator() {
    }
    public static final By ADD_TO_CART_BUTTON =
            By.xpath("//a[text()='Add to cart']");
}
