Feature: Buscador
  Buscador de la página
  Scenario: busca dato
    Given Estando en la página principal
    When introduzco un dato
    Then debería ver el dato en la caja de búsqueda