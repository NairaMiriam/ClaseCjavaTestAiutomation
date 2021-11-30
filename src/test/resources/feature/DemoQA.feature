# new feature
# Tags: optional

Feature: Pruebas demo QA
  Como Usuario
  Quiero validar check box de la aplicacion demo qa
  Para obtener las opciones de home

  @LoginFacebook
  Scenario Outline:Validar la opcion desktop
    Given que el usuario se encuentra en el home de demo qa
    And seleciona la cateroria "<sCategoria>"
    And Selecciona la opcion del menu de la categoria "<sMenu>"
    When selecciona el menu home
    Then se obtine la opcion del menu "<sCbxHome>"
    And presiona clic en el menu "<sMenu>"
    Examples:
      | sCategoria | sMenu     | sCbxHome |
      | Elements   | Check Box | Desktop  |