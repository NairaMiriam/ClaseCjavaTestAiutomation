package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.WebDriverMaganager;
import page.GooglePage;

public class GoogleStepDefinition {

    GooglePage googlePage=new GooglePage();

    @Given("^que el usuario carga la pagina web de google$")
    public void queElUsuarioCargaLaPaginaWebDeGoogle() {
        googlePage.setDriver(WebDriverMaganager.inicializarBrowser());
        googlePage.open();
    }

    @When("^ingresa el texto \"([^\"]*)\" a buscar$")
    public void ingresaElTextoABuscar(String arg0) throws Throwable {

    }

    @Then("^la aplicacion web de google realiza la busqueda del texto \"([^\"]*)\"$")
    public void laAplicacionWebDeGoogleRealizaLaBusquedaDelTexto(String arg0) throws Throwable {

    }
}
