package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://google.com/")
public class GooglePage extends WebDriverDOM {
    @FindBy(name = "q")
    private WebElement txtBuscar;
    @FindBy(xpath = "//div[@class='SPZz6b']/h2")
    private WebElement txtEncontrado;

    public void ingresarTexto(String sTexto) {
        waitElementVisible(txtBuscar, 10);
        if (txtBuscar.isEnabled()) {
            txtBuscar.clear();
            txtBuscar.sendKeys(sTexto);
            txtBuscar.submit();
        }
    }

    public boolean validarResultado(String sTexto) {
        waitElementVisible(txtEncontrado, 10);
        if (txtEncontrado.isEnabled()) {
            if (txtEncontrado.getText().contains(sTexto)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
