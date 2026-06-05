package locators;

import org.openqa.selenium.By;

public class CartPageLocator {
    private CartPageLocator() {
    }

    public static By productByName(String productName) {
        return By.xpath("//td[text()='" + productName + "']");
    }
}
