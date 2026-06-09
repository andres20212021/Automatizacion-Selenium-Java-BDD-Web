package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.CartPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.ProductPage;

public class CartSteps {
    private int selectedProductPrice;
    private String selectedProductName;

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
    @And("obtengo la informacion del producto seleccionado")
    public void obtengoLaInformacionDelProductoSeleccionado() {

        selectedProductName = productPage.getProductName();
        selectedProductPrice = productPage.getProductPrice();

        System.out.println("Producto seleccionado: " + selectedProductName);
        System.out.println("Precio seleccionado: " + selectedProductPrice);
    }

    @And("accede al carrito de compras")
    public void elUsuarioIngresaAlCarrito() {
        headerPage.goToCart();
    }

    @Then("valido que el producto seleccionado se visualice en el carrito")
    public void validoQueElProductoSeleccionadoSeVisualiceEnElCarrito() {

        Assertions.assertTrue(
                cartPage.productVisibleInCart(selectedProductName),
                "El producto " + selectedProductName + " no se visualiza en el carrito"
        );
    }

    @And("valido que el precio del producto seleccionado corresponda en el carrito")
    public void validoQueElPrecioDelProductoSeleccionadoCorrespondaEnElCarrito() {

        int precioActualCarrito = cartPage.getProductPriceInCart(selectedProductName);

        System.out.println("Producto seleccionado: " + selectedProductName);
        System.out.println("Precio capturado en detalle: " + selectedProductPrice);
        System.out.println("Precio visualizado en carrito: " + precioActualCarrito);

        Assertions.assertEquals(
                selectedProductPrice,
                precioActualCarrito,
                "El precio del producto " + selectedProductName +
                        " no corresponde. Se esperaba " + selectedProductPrice +
                        ", pero en el carrito se visualizó " + precioActualCarrito
        );
    }



}