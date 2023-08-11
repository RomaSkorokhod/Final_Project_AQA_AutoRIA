package pages;

import functions.*;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver driver;
    static Waiters wait;
    static Action action;
    static Assertions assertions;
    static Elements elements;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new Waiters(driver);
        action = new Action(driver);
        assertions = new Assertions(driver);
        elements = new Elements(driver);
    }
}