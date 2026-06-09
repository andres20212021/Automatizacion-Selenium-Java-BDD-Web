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
}
