package locators;

import org.openqa.selenium.By;
public class HomePageLocator {
    private HomePageLocator() {
    }
    public static By categoryByName(String categoryName) {
        return By.xpath("//a[@id='itemc' and normalize-space(.)='" + categoryName + "']");
    }
    public static final By PRODUCT_CARDS = By.cssSelector(".card.h-100");

    public static By productByName(String productName) {
        return By.xpath("//a[text()='" + productName + "']");
    }

}
