package page;

import generic.WebDriverDOM;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@DefaultUrl("https://demoqa.com/")
public class DemoQAPage extends WebDriverDOM {

    @FindBy(className = "category-cards")
    WebElement categoriaPadre;


    @FindBy(className = "(//ul[@class='menu-list'])[1]")
    WebElement opcMenuPadre;

    @FindBy(id = "sampleHeading")
    WebElement valueIframe;

    public void seleccionarCategoria(String sCategoria) {
        waitElementIsVisible(categoriaPadre, 10);
        List<WebElement> listCategoria = categoriaPadre.findElements(By.className("card-body"));
        System.out.println(listCategoria.size() + "   ---   " + listCategoria.get(1).getText());

        List<WebElement> listObj = categoriaPadre.findElements(By.className("card-up"));

        for (int i = 0; i < listCategoria.size(); i++) {
            if (listCategoria.get(i).getText().contains(sCategoria)) {
                listObj.get(i).click();
                break;
            }
        }
    }


    public void seleccionarOpcionMenu(String sMenu) {
        Actions actions=new Actions(getDriver());
        WebElement element=retornaWebElement(sMenu);
        waitElementIsVisible(element, 10);
        System.out.println(element.getText());
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();

    }

    public WebElement retornaWebElement(String sMenu) {
        sMenu = sMenu.trim();
        WebElement element;
        //div[@class='element-list collapse show']/ul/li/span[contains(text(),"Check Box")]
        String value = "//div[@class='element-list collapse show']/ul/li/span[contains(text(),'" + sMenu + "')]";
        return element = getDriver().findElement(By.xpath(value));
    }

    public void obtenerDatosIframe() {
        WebElement iframeElement= getDriver().findElement(By.id("frame1"));
        getDriver().switchTo().frame(iframeElement);

        waitElementIsVisible(valueIframe, 10);
        System.out.println(valueIframe.getText());
    }
}
