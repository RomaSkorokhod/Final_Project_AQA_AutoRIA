package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Action {
    static final Logger logger = LoggerFactory.getLogger(Action.class);
    private final WebDriver driver;
    private final Elements elements;
    private final Actions actions;

    public Action(WebDriver driver) {
        this.driver = driver;
        elements = new Elements(driver);
        actions = new Actions(driver);
    }

    public void CtrlClickElement(WebElement element) {
        actions.moveToElement(element).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
    }

    public void moveToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }
}