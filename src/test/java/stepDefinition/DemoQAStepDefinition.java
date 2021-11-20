package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import generic.WebDriverMaganager;
import page.DemoQAPage;

import util.Util.*;

import static util.Util.getValueDataTable;

public class DemoQAStepDefinition {
    DemoQAPage demoQAPage = new DemoQAPage();

    @Given("^que el usuario se encuentra en el home de Demo QA$")
    public void queElUsuarioSeEncuentraEnElHomeDeDemoQA() {
        demoQAPage.setDriver(WebDriverMaganager.inicializarBrowser());
        demoQAPage.open();
    }

    @And("^seleciona la opcion de categoria \"([^\"]*)\"$")
    public void selecionaLaOpcionDeCategoria(String sCategoria) throws Throwable {
        demoQAPage.seleccionarCategoria(sCategoria);
    }

    @And("^Seleccionar la opcion del menu \"([^\"]*)\"$")
    public void seleccionarLaOpcionDelMenu(String sMenu) throws Throwable {
        demoQAPage.seleccionarOpcionMenu(sMenu);
    }

    @When("^ingresamos informacion al formulario \"([^\"]*)\" y \"([^\"]*)\"$")
    public void ingresamosInformacionAlFormularioY(String arg0, String arg1) throws Throwable {

    }

    @When("^obtiene los datos del Frame$")
    public void obtieneLosDatosDelFrame() {
        demoQAPage.obtenerDatosIframe();
    }


    @When("^ingresamos informacion al formulario$")
    public void ingresamosInformacionAlFormulario(DataTable dataTable) {
        String name = getValueDataTable(dataTable, "sName");
        String email = getValueDataTable(dataTable, "sEmail");
        System.out.println(name+"     "+ email);
    }


}
