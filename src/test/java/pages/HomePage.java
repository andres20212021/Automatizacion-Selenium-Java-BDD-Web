package pages;

import locators.HomePageLocator;
public class HomePage extends BasePage {
    public void openDemoblaze()
    {
        navigateTo("https://www.demoblaze.com/index.html");
    }

    public void seleccionarCategoria(String name) {
        int cantidadAntesDelFiltro = getElements(HomePageLocator.PRODUCT_CARDS).size();
        click(HomePageLocator.categoryByName(name));
        waitUntilNumberOfElementsChanges(HomePageLocator.PRODUCT_CARDS,cantidadAntesDelFiltro);
    }
    public int obtenerElementos()
    {
        return getElements(HomePageLocator.PRODUCT_CARDS).size();
    }

    public void seleccionarProducto(String productName) {
        click(HomePageLocator.productByName(productName));
    }
}