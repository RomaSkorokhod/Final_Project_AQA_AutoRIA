package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AutoRIA_1SearchOfTransport_Page extends BasePage {
    public AutoRIA_1SearchOfTransport_Page(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private final static By categorySelect = By.id("categories");
        private final static By selectAutoHouse = By.xpath("//option[@value='8']");
        private final static By brandAutoHouse = By.id("brandTooltipBrandAutocompleteInput-brand");
        private final static By brandAutoHouseMers = By.xpath("//a[@data-value='48']");
        private final static By modelAutoHouse = By.id("brandTooltipBrandAutocompleteInput-model");
        private final static By modelAutoHouseSprinter = By.xpath("//a[@data-value='35249']");
        private final static By inputRegion = By.id("brandTooltipBrandAutocompleteInput-region");
        private final static By region = By.xpath("//a[text()='Київська обл.']");
        private final static By year = By.xpath("//label[@for='forYear']");
        private final static By yearFrom = By.id("yearFrom");
        private final static By selectYearFrom = By.xpath("//option[@value='2004']");
        private final static By yearTo = By.id("yearTo");
        private final static By selectYearTo = By.xpath("//select[@id='yearTo']//option[@value='2021']");
        private final static By clickOnForm = By.id("mainSearchForm");
        private final static By price = By.xpath("//label[@for='forPrice']");
        private final static By priceFrom = By.id("priceFrom");
        private final static By priceTo = By.id("priceTo");
        private final static By searchButton = By.xpath("//button[@type='submit']");
        private final static By vin = By.xpath("//label[@for='verifiedVIN']");

    }


    private static class Labels {
        private final static String url = "https://auto.ria.com/uk/";
        private final static String mers = "Mercedes-Benz";
        private final static String sprinter = "sprinter";
        private final static String region = "Київська обл.";
        private final static String priceSelectFrom = "2000";
        private final static String priceSelectTo = "20000";
    }


    public void categorySelect(){
        elements.findElement(Locators.categorySelect);
        elements.clickOnElement(Locators.selectAutoHouse);}
    public void brandAutoHouse(){
        elements.inputDataThenEnter(Locators.brandAutoHouse, Labels.mers);
        elements.findElement(Locators.brandAutoHouseMers).click();}
    public void modelAutoHouse(){
        elements.inputDataThenEnter(Locators.modelAutoHouse, Labels.sprinter);
        elements.findElement(Locators.modelAutoHouseSprinter).click();}
    public void region(){
        elements.inputData(Locators.inputRegion, Labels.region);
        elements.findElement(Locators.region).click();}
    public void year(){
        elements.findElement(Locators.year).click();}
    public void yearFrom(){
        elements.findElement(Locators.yearFrom);
        elements.clickOnElement(Locators.selectYearFrom);}
    public void yearTo(){
        elements.findElement(Locators.yearTo);
        elements.clickOnElement(Locators.selectYearTo);}
    public void clickOnForm(){
        elements.findElement(Locators.clickOnForm).click();}
    public void price(){
        elements.findElement(Locators.price).click();}
    public void priceFrom(){
        elements.findElement(Locators.priceFrom).click();
        elements.inputData(Locators.priceFrom, Labels.priceSelectFrom);}
    public void priceTo(){
        elements.findElement(Locators.priceTo).click();
        elements.inputData(Locators.priceTo, Labels.priceSelectTo);}
    public void searchButton(){
        elements.findElement(Locators.searchButton).click();}
    public void vin(){
        elements.findElement(Locators.vin).click();}

}