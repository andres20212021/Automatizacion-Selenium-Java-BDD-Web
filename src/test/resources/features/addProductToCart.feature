@regression
Feature: Agregar producto al carrito en Demoblaze

  Como usuario de la tienda Demoblaze
  Quiero agregar un producto al carrito
  Para validar que el producto seleccionado quede registrado correctamente

  Background:
    Given el usuario abre la pagina principal de Demoblaze

  Scenario: Agregar producto Phones al carrito
    When el usuario selecciona la categoria "Phones"
    And el usuario selecciona el producto "Samsung galaxy s6"
    And agrega el producto al carrito
    And confirma el mensaje de producto agregado
    And accede al carrito de compras
    Then valido que el producto "Samsung galaxy s6" se visualice en el carrito