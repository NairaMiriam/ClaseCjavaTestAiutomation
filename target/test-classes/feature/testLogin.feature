# new feature
# Tags: optional

Feature: busqueda google
    Como usuario de la aplicacion google
    Quiero realizar una busqueda
    Para obtener mayor informacion

  Scenario: Buscar texto en google
    Given que el usuario se encuentra en el home de google
    When se ingresa una palabra de busqueda "Cucumber"
    Then la aplicacion muestra el resultado de "Cucumber"