package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoRIA_1SearchOfTransport_Page extends BasePage {
    public AutoRIA_1SearchOfTransport_Page(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private final static By acceptCookies = By.xpath("//label[@class='js-close c-notifier-btn']");
        private final static By categorySelect = By.id("categories");
    }


    private static class Labels {
        private final static String url = "https://auto.ria.com/uk/";
        private final static String selectValueCategory = "8";
    }

    public void openPage(){driver.get(Labels.url);}
    public void acceptCookies() {
        elements.findElement(Locators.acceptCookies);
        elements.clickOnElement(Locators.acceptCookies);
    }



}