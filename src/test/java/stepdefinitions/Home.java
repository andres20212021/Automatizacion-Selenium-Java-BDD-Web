package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;

public class Home {
    HomePage homePage = new HomePage();

    @Given("el usuario abre la pagina principal de Demoblaze")
    public void elUsuarioAbreLaPaginaPrincipalDeDemoblaze() {
        homePage.openDemoblaze();
    }
    @When("el usuario selecciona la categoria {string}")
    public void el_usuario_selecciona_la_categoria(String categoria) {
        homePage.seleccionarCategoria(categoria);
    }

    @Then("valido que se visualicen {int} productos de la categoria {string}")
    public void valido_que_se_visualicen_productos_de_la_categoria(int cantidadEsperada, String categoria)
    {   int cantidadActual = homePage.obtenerElementos();
        Assertions.assertEquals(cantidadEsperada,cantidadActual,"Se esperaban exactamente " + cantidadEsperada +
                        " productos para la categoria " + categoria +
                        ", pero se visualizaron " + cantidadActual);

    }
}