package page;

import org.jruby.RubyProcess;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGoogle {
    WebDriver driver;
    String pathBase = System.getProperty("user.dir");
    String pathDriver = pathBase + "/src/test/resources/driver/chromedriver.exe";

   // @Test
    public void buscarGoogle() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");

        WebElement txtBuscar = driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input"));
        WebElement txtbus = driver.findElement(By.name("q"));

        txtBuscar.clear();
        txtBuscar.sendKeys("Cucumber");
        txtBuscar.submit();

        WebElement txtEncontrado = driver.findElement(By.xpath("//div[@class='SPZz6b']/h2"));
        String textoEncontrado01 = txtEncontrado.getText();

        System.out.print(textoEncontrado01);

        driver.close();
    }
}
