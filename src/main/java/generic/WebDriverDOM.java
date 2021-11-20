package generic;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDOM extends PageObject {

    public void waitElementSendKeys(WebElement element, String value, int tiempoEsperado) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tiempoEsperado);
        WebElement elements = wait.until(ExpectedConditions.visibilityOf(element));
        elements.sendKeys(value);
    }

    public boolean waitElementIsVisible(WebElement element, int tiempoEspera) {
        boolean value = false;
        for (int i = 0; i <= tiempoEspera; i++) {
            try {
                Thread.sleep(500);
                value = element.isDisplayed();
                break;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        return value;
    }
}
