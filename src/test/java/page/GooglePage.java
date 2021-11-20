package page;

import generic.WebDriverDOM;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://google.com/")
public class GooglePage extends WebDriverDOM {

    @FindBy(name = "q")
    private WebElement txtBuscar;

    @FindBy(className = "SPZz6b")
    private WebElement textoEncontrado;

    public void ingresarTexto(String xTexto) throws InterruptedException {
        waitElementSendKeys(txtBuscar,xTexto,10);
        txtBuscar.sendKeys(Keys.ENTER);
    }

}
