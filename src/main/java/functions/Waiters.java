package functions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.function.Function;

public class Waiters {
    static final Logger logger = LoggerFactory.getLogger(Waiters.class);
    private final WebDriver driver;
    private static final long EXPLICITLY_WAIT = 20L;

    public Waiters(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForPresenceOfElementLocatedReturn(By locator) {
        logger.info("Waiting for presence of element located " + locator.toString());
        return fluentWait(EXPLICITLY_WAIT).until(ExpectedConditions
                .presenceOfElementLocated(locator));
    }

    public void waitForVisibilityOf(WebElement element) {
        logger.info("Waiting for visibility of element " + element.toString());
        waitForFunction(ExpectedConditions
                .visibilityOf(element), EXPLICITLY_WAIT);
    }

    public void waitForVisibilityOf(By locator) {
        logger.info("Waiting for visibility of element " + locator.toString());
        waitForFunction(ExpectedConditions
                .visibilityOf(driver.findElement(locator)), EXPLICITLY_WAIT);
    }

    private FluentWait<WebDriver> fluentWait(Long duration) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(duration))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(InvalidElementStateException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    private void waitForFunction(Function function, Long timeOutInSeconds) {
        logger.info("Waiting for function");
        FluentWait<WebDriver> wait = fluentWait(timeOutInSeconds);
        wait.until(function);
    }

    public void waitSomeMilliseconds(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}