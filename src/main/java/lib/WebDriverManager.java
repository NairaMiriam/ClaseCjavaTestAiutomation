package lib;

import generic.WebDriverDOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static parameters.parametros.*;

public class WebDriverManager extends WebDriverDOM {

    public static WebDriver inicializarBrowser() {

        System.setProperty("webdriver.chrome.driver", pathDriverChrome);
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
