
package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.WebDriverManager;
import page.DemoQaPage;

public class DemoQAStep {

    DemoQaPage demoQaPage = new DemoQaPage();

    @Given("^que el usuario se encuentra en el home de demo qa$")
    public void queElUsuarioSeEncuentraEnElHomeDeDemoQa() {
        demoQaPage.setDriver(WebDriverManager.inicializarBrowser());
        demoQaPage.open();
    }

    @And("^seleciona la cateroria \"([^\"]*)\"$")
    public void selecionaLaCateroria(String sCategoria) throws Throwable {
        demoQaPage.seleccionarCategoria(sCategoria);
    }

    @And("^Selecciona la opcion del menu de la categoria \"([^\"]*)\"$")
    public void seleccionaLaOpcionDelMenuDeLaCategoria(String sMenu) throws Throwable {
        demoQaPage.seleccionarOpcionMenu(sMenu);
    }
    @When("^selecciona el menu home$")
    public void seleccionaElMenuHome() {
        demoQaPage.clicHome();

    }

    @Then("^se obtine la opcion del menu \"([^\"]*)\"$")
    public void seObtineLaOpcionDelMenu(String arg0) throws Throwable {
        demoQaPage.seleccionarCbxHome(arg0);
    }

    @And("^presiona clic en el menu \"([^\"]*)\"$")
    public void presionaClicEnElMenu(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}
