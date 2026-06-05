package pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.StaleElementReferenceException;
public class BasePage {
    private static final int TIMEOUT_SECONDS = 10;
    public void navigateTo(String url) {
        DriverManager.getDriver().get(url);
    }
    protected WebElement find(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(TIMEOUT_SECONDS));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException ex) {
            return Assertions.fail("Timeout: El elemento no se hizo visible a tiempo: " + locator);
        }
    }
    protected List<WebElement> findAll(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(TIMEOUT_SECONDS));
            return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        } catch (TimeoutException ex) {
            return Assertions.fail("Timeout: Los elementos no se hicieron visibles a tiempo: " + locator);
        }
    }
    protected WebElement findClickable(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(TIMEOUT_SECONDS));
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (TimeoutException ex) {
            return Assertions.fail("Timeout: El elemento no estuvo disponible para hacer click: " + locator);
        }
    }
    protected void waitUntilNumberOfElementsChanges(By locator, int previousCount) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(TIMEOUT_SECONDS));
           // wait.ignoring(StaleElementReferenceException.class);
            wait.until(driver ->driver.findElements(locator).size() != previousCount);

        } catch (TimeoutException ex) {
            Assertions.fail("Timeout: La cantidad de elementos no cambió para el locator: " + locator);
        }
    }
    protected void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(TIMEOUT_SECONDS));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public boolean isElementDisplayed(By locator) {
        return find(locator).isDisplayed();
    }

    public void click(By locator) {
        find(locator).click();
    }
    public void write(By locator, String text) {
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }
    public String getText(By locator) {
        return find(locator).getText();
    }
    public boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }
    public  List<WebElement>  getElements(By locator) {
        return findAll(locator);
    }
}