# new feature
# Tags: optional

Feature: Pruebas Demo QA
  Como Usuario
  Quiero validar el Formulario de la aplicacion Demo QA
  Para Realizar un registro de un cliente

  Scenario Outline: Validar Formulario con datos validos
    Given que el usuario se encuentra en el home de Demo QA
    And seleciona la opcion de categoria "<sCategoria>"
    And Seleccionar la opcion del menu "<sMenu>"
    When ingresamos informacion al formulario "<sName>" y "<sEmail>"
    Examples:
      | sCategoria | sMenu    | sName | sEmail          |
      | Elements   | Text Box | Naira | naira@gmail.com |

  @Alerts
  Scenario Outline: Validar Frames con datos validos
    Given que el usuario se encuentra en el home de Demo QA
    And seleciona la opcion de categoria "<sCategoria>"
    And Seleccionar la opcion del menu "<sMenu>"
    When obtiene los datos del Frame
    Examples:
      | sCategoria | sMenu  |
      | Alerts     | Frames |


  @ol
  Scenario Outline: Validar Formulario con datos validos oe
    Given que el usuario se encuentra en el home de Demo QA
    And seleciona la opcion de categoria "<sCategoria>"
    And Seleccionar la opcion del menu "<sMenu>"
    When ingresamos informacion al formulario
      | sName | sEmail          |
      | Naira | naira@gmail.com |
    Examples:
      | sCategoria | sMenu    |
      | Elements   | Text Box |