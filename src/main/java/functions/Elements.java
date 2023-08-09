package functions;

import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elements {
    static final Logger logger = LoggerFactory.getLogger(Elements.class);
    private final WebDriver driver;
    private final Waiters waiters;

    public Elements(WebDriver driver) {
        this.driver = driver;
        waiters = new Waiters(driver);
    }

    public WebElement findElement(By locator) {
        try {
            waiters.waitForVisibilityOf(locator);
            return driver.findElement(locator);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }

    public WebElement findElementByXpath(String xpath) {
        try {
            waiters.waitForVisibilityOf(By.xpath(xpath));
            return driver.findElement(By.xpath(xpath));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getElementText(WebElement element) {
        waiters.waitForVisibilityOf(element);
        return element.getText();
    }

    public String getElementText(By locator) {
        waiters.waitForVisibilityOf(locator);
        return driver.findElement(locator).getText();
    }

    public String getTitleText() {
        logger.info("Getting page title");
        return driver.getTitle();
    }

    public void clickOnElement(By locator) {
        WebElement element = waiters.waitForPresenceOfElementLocatedReturn(locator);
        element.click();
    }

    public void clickOnElementByXpath(String xpath) {
        findElementByXpath(xpath).click();
    }

    public void switchToWindow(String descriptor) {
        logger.info("Switching to another window " + descriptor);
        driver.switchTo().window(descriptor);
    }

    public void inputDataThenEnter(By locator, String input) {
        findElement(locator).clear();
        findElement(locator).sendKeys(input + "\n");
    }

    public void inputData(By locator, String input) {
        findElement(locator).clear();
        findElement(locator).sendKeys(input);
    }

    public void windowScrollToElement(By locator) {
        logger.info("Scrolling window to element " + locator);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", findElement(locator));
    }

    public void waitSomeTime(int milliseconds) {
        waiters.waitSomeMilliseconds(milliseconds);
    }

    public void inputDataAndThenEnter(String volkswagenInputText) {
    }
}