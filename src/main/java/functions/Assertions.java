package functions;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class Assertions {
    private final WebDriver driver;
    private final Elements elements;
    private final Action action;
    private final Waiters waiters;

    public Assertions(WebDriver driver) {
        this.driver = driver;
        elements = new Elements(driver);
        action = new Action(driver);
        waiters = new Waiters(driver);
    }

    public void equalsOfText(String actualText, String expectedText) {
        assertEquals(actualText, expectedText,
                "I was expecting text " + expectedText + ". And received " + actualText + ".");
    }

    public void equalsOfTextByXpath(String xpath, String expectedText) {
        assertEquals(elements.getElementText(elements.findElementByXpath(xpath)), expectedText,
                "I was expecting text " + expectedText + ". And received " +
                        elements.getElementText(elements.findElementByXpath(xpath)) + ".");
    }
}