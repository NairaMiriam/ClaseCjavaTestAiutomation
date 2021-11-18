# new feature
# Tags: optional

Feature: buscar informacion en google
  Yo Como usuario
  Quiero realizar una busqueda de selenium en google
  Para obtener informacion actualizada

  @Id0001 @TestOk
  Scenario: buscar informacion de selenium
    Given que el usuario carga la pagina web de google
    When ingresa el texto "Selenium" a buscar
    Then la aplicacion web de google realiza la busqueda del texto "Selenium"

  @Id0002 @TestFail
  Scenario Outline: buscar informacion de selenium 01
    Given que el usuario carga la pagina web de google
    When ingresa el texto "<sTexto>" a buscar
    Then la aplicacion web de google realiza la busqueda del texto "<sTexto>"
    Examples:
      | sTexto   |
      | Selenium |
      | Cucumber |
      | Facebook |
