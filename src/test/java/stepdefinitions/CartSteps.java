package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.CartPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.ProductPage;

public class CartSteps {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    HeaderPage headerPage = new HeaderPage();
    CartPage cartPage = new CartPage();

    @And("el usuario selecciona el producto {string}")
    public void elUsuarioSeleccionaElProducto(String productName) {
        homePage.seleccionarProducto(productName);
    }

    @And("agrega el producto al carrito")
    public void elUsuarioAgregaElProductoAlCarrito() {
        productPage.addProductToCart();
    }

    @And("confirma el mensaje de producto agregado")
    public void elUsuarioAceptaElMensajeDeConfirmacion() {
        productPage.acceptMessageConfirmation();
    }

    @And("accede al carrito de compras")
    public void elUsuarioIngresaAlCarrito() {
        headerPage.goToCart();
    }

    @Then("valido que el producto {string} se visualice en el carrito")
    public void validoQueElProductoSeVisualiceEnElCarrito(String productName) {
        Assertions.assertTrue(
                cartPage.productVisibleInCart(productName),
                "El producto " + productName + " no se visualiza en el carrito"
        );
    }
}