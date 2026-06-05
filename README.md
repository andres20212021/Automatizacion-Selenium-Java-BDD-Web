# Automatización Selenium Java BDD Web

Framework de automatización web desarrollado con **Java**, **Selenium WebDriver**, **Cucumber BDD**, **JUnit 5**, **Maven** y **Allure Report**.

El objetivo de este proyecto es automatizar pruebas funcionales sobre la página **Demoblaze**,aplicando buenas prácticas de automatización,
patrón **Page Object Model**, separación de responsabilidades, reportes visuales y evidencia automática cuando una prueba falla.

---

## Tecnologías utilizadas

| Tecnología         | Uso                                          |
|--------------------|----------------------------------------------|
| Java 21            | Lenguaje principal del proyecto              |
| Maven              | Gestión de dependencias y ejecución          |
| Selenium WebDriver | Automatización del navegador                 |
| Cucumber BDD       | Definición de escenarios en lenguaje Gherkin |
| JUnit 5            | Motor de ejecución de pruebas                |
| Allure Report      | Generación de reportes visuales              |
| IntelliJ IDEA      | IDE utilizado para desarrollo                |
| Git / GitHub       | Control de versiones y repositorio remoto    |

---

# Cómo visualizar el reporte

Una vez finalizada la ejecución de las pruebas de regresión en GitHub Actions, el reporte de resultados se publica automáticamente en GitHub Pages mediante Allure Report.

Para visualizar el reporte, ingrese a la ejecución del pipeline y se visualizara esta imagen.

![Allure Report URL](imagenes/AllureReportURL.png)

Luego haga clic en el enlace que se visualiza en la imagen.

Desde esta URL podrá revisar el detalle de los escenarios ejecutados, el estado de cada prueba, los errores encontrados y las evidencias adjuntas, como capturas de pantalla en caso de fallos.

## Sitio bajo prueba

El sitio utilizado para las pruebas automatizadas es:

```text
https://www.demoblaze.com/index.html

