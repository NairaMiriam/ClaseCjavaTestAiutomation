package generic;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class WebDriverDOM extends PageObject {

    public boolean waitElementVisible(WebElement element, int tiempo) {
        boolean value = false;
        for (int i = 0; i <= tiempo; i++) {
            try {
                Thread.sleep(500);
                value = element.isDisplayed();
            } catch (Exception e) {
            }
        }
        return value;
    }
}
