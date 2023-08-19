package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoRIA_3Registration_Page extends BasePage {
    public AutoRIA_3Registration_Page(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private final static By enterTheOffice = By.xpath("//span[@class='tl']");
        private final static By frame = By.id("login_frame");
        private final static By registration = By.xpath("//a[contains(text(),'Зареєструватися на AUTO.RIA')]");
        private final static By name = By.id("registrationform-name");
        private final static By secondName = By.id("registrationform-second_name");
        private final static By email = By.id("registrationform-email");
        private final static By validEmail = By.id("registrationform-email");
        private final static By notValidEmail = By.id("registrationform-email");
        private final static By checkBox = By.xpath("//label[@for='registrationform-agree']");
        private final static By registrationButton = By.id("registration_button");

    }

    private static class Labels {
        private final static String validName = "Andrew";
        private final static String validSecondName = "Shevchenko";
        private final static String validEmail = "sheva@ukr.net";
        private final static String notValidEmail = "shevaukr.net";
        private final static String validNewEmail = "sheva3684@ukr.net";
    }

    public void enterTheOffice() {elements.findElement(Locators.enterTheOffice);
        elements.clickOnElement(Locators.enterTheOffice);}
    public void frame() {elements.findElement(Locators.frame);
        driver.switchTo().frame("login_frame");}
    public void registration() {elements.findElement(Locators.registration);
        elements.clickOnElement(Locators.registration);}
    public void name(){elements.inputData(Locators.name, Labels.validName);}
    public void secondName(){elements.inputData(Locators.secondName, Labels.validSecondName);}
    public void validEmail(){elements.inputData(Locators.validEmail, Labels.validEmail);}
    public void checkBox(){elements.clickOnElement(Locators.checkBox);}
    public void registrationButton() {elements.clickOnElement(Locators.registrationButton);}
    public void notValidEmail(){elements.inputData(Locators.notValidEmail, Labels.notValidEmail);}
    public void email(){elements.inputData(Locators.email, Labels.validEmail);}
    public void newemail(){elements.inputData(Locators.email, Labels.validNewEmail);}
    public void refresh(){driver.navigate().refresh();
    }
}
