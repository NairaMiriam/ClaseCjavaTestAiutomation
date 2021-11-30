package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import org.junit.Assert;
import page.GooglePage;

public class GoogleStep  {

    GooglePage googlePage=new GooglePage();

    @Given("^que el usuario se encuentra en el home de google$")
    public void queElUsuarioSeEncuentraEnElHomeDeGoogle() {
        googlePage.setDriver(WebDriverManager.inicializarBrowser());
        googlePage.open();
    }

    @When("^se ingresa una palabra de busqueda \"([^\"]*)\"$")
    public void seIngresaUnaPalabraDeBusqueda(String sTexto) throws Throwable {
        googlePage.ingresarTexto(sTexto);
    }

    @Then("^la aplicacion muestra el resultado de \"([^\"]*)\"$")
    public void laAplicacionMuestraElResultadoDe(String sTexto) throws Throwable {
        Assert.assertTrue("El texto encontrado no es el esperado",googlePage.validarResultado(sTexto));
    }
}
