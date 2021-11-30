package page;

import generic.WebDriverDOM;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

    @DefaultUrl("https://demoqa.com/")
    public class DemoQaPage extends WebDriverDOM {
    @FindBy(className = "category-cards")
    private WebElement categoria;

    @FindBy(xpath = "//div[@class='category-cards']")
    private WebElement categoria1;

    @FindBy(xpath = "//div[@class='accordion']/div[1]/div/ul")
    private WebElement opcionMenu;

    @FindBy(xpath = "//button[@class='rct-collapse rct-collapse-btn']")
    private WebElement btnHome;

    @FindBy(xpath = "//li[@class='rct-node rct-node-parent rct-node-expanded']")
    private WebElement cbxHome;


    public void seleccionarCategoria(String sCategoria) {
        waitElementVisible(categoria, 5);
        List<WebElement> listCategoria = categoria.findElements(By.className("card-body"));
        System.out.printf("lista 01:" + listCategoria.get(1).getText() + "\n");
        List<WebElement> listCategoria1 = categoria.findElements(By.xpath("//div/div/div[3]/h5"));
        System.out.printf("lista 02:" + listCategoria1.get(1).getText() + "\n");
        List<WebElement> listObj = categoria.findElements(By.className("card-up"));

        System.out.printf(listObj.size() + "");

        for (int i = 0; i < listCategoria.size(); i++) {
            if (listCategoria.get(i).getText().equals(sCategoria)) {
                System.out.printf(listCategoria.get(i).getText());

                listObj.get(i).click();
                break;
            }
        }

    }


    public void seleccionarOpcionMenu(String sMenu) {
        waitElementVisible(opcionMenu, 5);
        List<WebElement> listMenu = opcionMenu.findElements(By.xpath("//li"));
        System.out.printf("lista menu 01:" + listMenu.get(1).getText() + "\n");

        for (int i = 0; i < listMenu.size(); i++) {
            if (listMenu.get(i).getText().contains(sMenu)) {
                System.out.printf(listMenu.get(i).getText());
                listMenu.get(i).click();
                break;
            }
        }

    }

    public void clicHome() {
        waitElementVisible(btnHome, 5);
        btnHome.click();
    }

    public void seleccionarCbxHome(String sCbxHome) {
        waitElementVisible(cbxHome, 5);
        List<WebElement> listOpcionHome = cbxHome.findElements(By.xpath("//ol//li/span/label/span[1]"));
        List<WebElement> listCbxHome = cbxHome.findElements(By.xpath("//ol//li/span/label/span[3]"));

        for (int i = 0; i < listCbxHome.size(); i++) {
            if (listCbxHome.get(i).getText().equals(sCbxHome)) {
                System.out.printf(listCbxHome.get(i).getText()+"   Test ___  \n");
                listOpcionHome.get(i).click();
                break;
            } else {
                System.out.printf("\n" + "No se encontro el elemento buscado");
            }
        }
    }
}
