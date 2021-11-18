package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static parameters.Parameters.*;

public class WebDriverMaganager extends WebDriverDOM {

    public static WebDriver inicializarBrowser() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
