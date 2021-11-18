package page;

import generic.WebDriverDOM;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://google.com/")
public class GooglePage extends WebDriverDOM {

    @FindBy(name = "q")
    private WebElement txtBuscar;

    @FindBy(className = "SPZz6b")
    private WebElement textoEncontrado;


}
