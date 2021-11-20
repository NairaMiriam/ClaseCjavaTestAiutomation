package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static parameters.Parameters.*;

public class WebDriverMaganager extends WebDriverDOM {

    public static WebDriver inicializarBrowser() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        WebDriver webDriver = new ChromeDriver();
        //  webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
