package page;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Locale;

public class Test01 {

    WebDriver driver;
    String pathBase = System.getProperty("user.dir");
    String pathDriver = pathBase + "/src/test/resources/driver/chromedriver.exe";

   // @Test
    public void buscarGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Actions actions = new Actions(driver);

        String texto = "Hola Mundo";
        WebElement txtBuscar = driver.findElement(By.name("q"));
        txtBuscar.clear();
        txtBuscar.sendKeys(texto);
        txtBuscar.sendKeys(Keys.ENTER);
        //actions.moveToElement(txtBuscar).click().perform();
        //txtBuscar.submit();
//        Thread.sleep(3000);
//        WebElement btnBuscar=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]"));
//        btnBuscar.click();

        Thread.sleep(3000);
        WebElement textoEncontrado = driver.findElement(By.className("SPZz6b"));
        System.out.println(textoEncontrado.getText());

        Assert.assertEquals("Los textos no son iguales", textoEncontrado.getText().toLowerCase(Locale.ROOT), texto.toLowerCase(Locale.ROOT));

       driver.close();
    }


}
