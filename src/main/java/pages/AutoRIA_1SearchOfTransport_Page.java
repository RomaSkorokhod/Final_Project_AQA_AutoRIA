package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoRIA_1SearchOfTransport_Page extends BasePage {
    public AutoRIA_1SearchOfTransport_Page(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private final static By acceptCookies = By.xpath("//label[@class='js-close c-notifier-btn']");
    }


    private static class Labels {
        private final static String url = "https://auto.ria.com/uk/";
    }
}