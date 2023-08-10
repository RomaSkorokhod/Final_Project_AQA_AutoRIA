package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoRIA_2SearchAndBuyOfAutoParts_Page extends BasePage {

    public AutoRIA_2SearchAndBuyOfAutoParts_Page(WebDriver driver) {
        super(driver);
    }

    static class Locators {
        final static By acceptCookies = By.xpath("//label[@class='js-close c-notifier-btn']");
        private final static By InputSearchText = By.id("js-search-text");
        private final static By VolkswagenBeetleParts = By.xpath("//h2[contains(text(),'Volkswagen Beetle 1.6TDI 03L130277b')]");
        private final static By VolkswagenBeetlePartBuy = By.xpath("//span[@class='js-buy-text']");
        private final static By BuyOtherParts = By.xpath("//a[@class='go-shop show-more-simple close-js']");
        private final static By Basket = By.xpath("//a[@title='Кошик']");
        private final static By DelOrder = By.xpath("//span[@class='ticket__remove']");
        private final static By AutoOil = By.xpath("//h2[contains(text(),'Мастило трансмісійне 1л 08886')]");
        private final static By AutoOilBuy = By.xpath("//span[@class='js-buy-text']");
        private final static By autoLamp = By.xpath("//h2[contains(text(),'H11 Bosch 1987302084')]");
        private final static By autoLampBuy = By.xpath("//span[@class='js-buy-text']");
        private final static By startStopButton = By.xpath("//h2[contains(text(),'start-stop Ford Escape MK4 20')]");
        private final static By startStopButtonBuy = By.xpath("//span[@class='js-buy-text']");
        private final static By BuyOrder = By.xpath("//span[contains(text(),'Оформити замовлення')]");
    }

    static class Labels {
        final static String url = "https://auto.ria.com/uk/";
        private final static String url2 = "https://zapchasti.ria.com/uk/";
        private final static String VolkswagenInputText = "форсунка для Volkswagen Beetle";
        private final static String AutoOilInputText = "Мастило трансмісійне 1л 08886";
        private final static String LampInputText = "Лампа H11 Bosch";
        private final static String ButtonInputText = "start-stop Ford Escape MK4 20";

    }

    public void openPage(){driver.get(Labels.url);}
    public void acceptCookies(){
        elements.findElement(Locators.acceptCookies);
        elements.clickOnElement(Locators.acceptCookies);
    }
    public void openPageAutoParts(){driver.get(Labels.url2);}
    public void inputSearchTextVW(){elements.inputDataThenEnter(Locators.InputSearchText, Labels.VolkswagenInputText);}
    public void volkswagenBeetleParts() {elements.findElement(Locators.VolkswagenBeetleParts);
    elements.clickOnElement(Locators.VolkswagenBeetleParts);}
    public void volkswagenBeetlePartBuy() {elements.findElement(Locators.VolkswagenBeetlePartBuy);
    elements.clickOnElement(Locators.VolkswagenBeetlePartBuy);}
    public void buyOtherParts() {elements.findElement(Locators.BuyOtherParts);
    elements.clickOnElement(Locators.BuyOtherParts);}
    public void basket() {elements.findElement(Locators.Basket);
        elements.clickOnElement(Locators.Basket);}
    public void delOrder() {elements.findElement(Locators.DelOrder);
    elements.clickOnElement(Locators.DelOrder);}
    public void inputSearchTextAutoOil(){elements.inputDataThenEnter(Locators.InputSearchText, Labels.AutoOilInputText);}
    public void autoOil() {elements.findElement(Locators.AutoOil);
        elements.clickOnElement(Locators.AutoOil);}
    public void autoOilBuy() {elements.findElement(Locators.AutoOilBuy);
        elements.clickOnElement(Locators.AutoOilBuy);}
    public void inputSearchTextAutoLamp(){elements.inputDataThenEnter(Locators.InputSearchText, Labels.LampInputText);}
    public void autoLamp() {elements.findElement(Locators.autoLamp);
        elements.clickOnElement(Locators.autoLamp);}
    public void autoLampBuy() {elements.findElement(Locators.autoLampBuy);
        elements.clickOnElement(Locators.autoLampBuy);}
    public void inputSearchTextStartButton(){elements.inputDataThenEnter(Locators.InputSearchText, Labels.ButtonInputText);}
    public void startStopButton() {elements.findElement(Locators.startStopButton);
        elements.clickOnElement(Locators.startStopButton);}
    public void startStopButtonBuy() {elements.findElement(Locators.startStopButtonBuy);
        elements.clickOnElement(Locators.startStopButtonBuy);}
    public void BuyOrder() {elements.findElement(Locators.BuyOrder);
        elements.clickOnElement(Locators.BuyOrder);}
}
