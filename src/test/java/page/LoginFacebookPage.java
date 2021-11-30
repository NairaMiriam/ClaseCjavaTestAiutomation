package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

@DefaultUrl("https://es-la.facebook.com/")
public class LoginFacebookPage extends WebDriverDOM {

    @FindBy(id = "email")
    private WebElement txtEmail;

    @FindBy(id = "pass")
    private WebElement txtPass;

    @FindBy(name = "login")
    private WebElement btnIniciar;

    @FindBy(className = "_9ay7")
    private WebElement txtEncontrado;

    public void ingresarEmail(String sEmail) {
        waitElementVisible(txtEmail, 10);
        if (txtEmail.isEnabled()) {
            txtEmail.clear();
            txtEmail.sendKeys(sEmail);
        }
    }

    public void ingresarPass(String sEmail) {
        waitElementVisible(txtPass, 10);
        if (txtPass.isEnabled()) {
            txtPass.clear();
            txtPass.sendKeys(sEmail);
        }
    }

    public void clicIngresar() {
        waitElementVisible(btnIniciar, 10);
        if (btnIniciar.isEnabled()) {
            btnIniciar.click();
        }
    }

    public boolean validarCredenciales(String sMensajeError) {
        boolean value = false;
        waitElementVisible(txtEncontrado, 10);
        if (txtEncontrado.getText().contains(sMensajeError)) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }


}
