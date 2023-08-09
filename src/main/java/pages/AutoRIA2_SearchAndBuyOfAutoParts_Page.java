package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoRIA2_SearchAndBuyOfAutoParts_Page extends BasePage {

    public AutoRIA2_SearchAndBuyOfAutoParts_Page(WebDriver driver) {
        super(driver);
    }


    private static class Locators {
        private final static By accept = By.xpath("//label[@class='js-close c-notifier-btn']");
        private final static By InputSearchText = By.id("js-search-text");
        private final static By VolkswagenBeetleParts = By.xpath("//h2[contains(text(),'Volkswagen Beetle 1.6TDI 03L130277b')]");
        private final static By VolkswagenBeetlePartBuy = By.xpath("//span[@class='js-buy-text']");
        private final static By BuyOtherParts = By.xpath("//a[@class='go-shop show-more-simple close-js']");
        private final static By Basket = By.xpath("//a[@title='Кошик']");
        private final static By DelOrder = By.xpath("//span[@class='ticket__remove']");

    }


    private static class Labels {
        private final static String url = "https://auto.ria.com/uk/";
        private final static String url2 = "https://zapchasti.ria.com/uk/";

        private final static String VolkswagenInputText = "форсунка для Volkswagen Beetle";

    }


    public void openPage(){driver.get(Labels.url);}
    public void accept(){
        elements.findElement(Locators.accept);
        elements.clickOnElement(Locators.accept);
    }
    public void openPage2(){driver.get(Labels.url2);}
    public void InputSearchText(){elements.inputDataThenEnter(Locators.InputSearchText, Labels.VolkswagenInputText);}
    public void VolkswagenBeetleParts() {elements.findElement(Locators.VolkswagenBeetleParts);
    elements.clickOnElement(Locators.VolkswagenBeetleParts);}
    public void VolkswagenBeetlePartBuy() {elements.findElement(Locators.VolkswagenBeetlePartBuy);
    elements.clickOnElement(Locators.VolkswagenBeetlePartBuy);}
    public void BuyOtherParts() {elements.findElement(Locators.BuyOtherParts);
    elements.clickOnElement(Locators.BuyOtherParts);}





   /* public void switchToFrame(){
        wait.switchToFrame(Locators.frame);
    }*/
}
