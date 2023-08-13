package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoRIA_1SearchOfTransport_Page extends BasePage {
    public AutoRIA_1SearchOfTransport_Page(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private final static By categorySelect = By.id("categories");
        private final static By selectAuto = By.xpath("//option[@value='1']");
        private final static By selectAutoHouse = By.xpath("//option[@value='8']");
        private final static By selectMotorcycle = By.xpath("//option[@value='2']");
        private final static By selectWaterTransport = By.xpath("//option[@value='3']");
        private final static By selectBus = By.xpath("//option[@value='7']");
        private final static By brandSelect = By.id("brandTooltipBrandAutocompleteInput-brand");
        private final static By brandBMW = By.xpath("//a[@data-value='9']");
        private final static By brandFord = By.xpath("//a[@data-value='24']");
        private final static By brandVW = By.xpath("//a[@data-value='84']");
        private final static By brandMers = By.xpath("//a[@data-value='48']");
        private final static By brandHonda = By.xpath("//a[@data-value='28']");
        private final static By brandBRP = By.xpath("//a[@data-value='1471']");
        private final static By modelSelect = By.id("brandTooltipBrandAutocompleteInput-model");
        private final static By modelMustang = By.xpath("//a[@data-value='2047']");
        private final static By modelSprinter = By.xpath("//a[@data-value='35249']");
        private final static By modelGL = By.xpath("//a[@data-value='55174']");
        private final static By modelRXP = By.xpath("//a[@data-value='29421']");
        private final static By model4Series = By.xpath("//a[@data-value='44037']");
        private final static By modelCrafter = By.xpath("//a[@data-value='60426']");
        private final static By inputRegion = By.id("brandTooltipBrandAutocompleteInput-region");
        private final static By region = By.xpath("//a[text()='Київська обл.']");
        private final static By year = By.xpath("//label[@for='forYear']");
        private final static By yearFrom = By.id("yearFrom");
        private final static By selectYearFrom2010 = By.xpath("//option[@value='2010']");
        private final static By selectYearFrom2015 = By.xpath("//option[@value='2015']");
        private final static By selectYearFrom2020 = By.xpath("//option[@value='2020']");
        private final static By yearTo = By.id("yearTo");
        private final static By selectYearTo = By.xpath("//select[@id='yearTo']//option[@value='2023']");
        private final static By clickOnForm = By.id("mainSearchForm");
        private final static By price = By.xpath("//label[@for='forPrice']");
        private final static By priceFrom = By.id("priceFrom");
        private final static By priceTo = By.id("priceTo");
        private final static By searchButton = By.xpath("//button[@type='submit']");
        private final static By vin = By.xpath("//label[@for='verifiedVIN']");

    }


    private static class Labels {
        private final static String startPage = "https://auto.ria.com/uk/";
        private final static String bmw = "BMW";
        private final static String ford = "Ford";
        private final static String vw = "Volkswagen";
        private final static String mers = "Mercedes-Benz";
        private final static String sprinter = "sprinter";
        private final static String region = "Київська обл.";
        private final static String priceSelectFrom50k = "50000";
        private final static String priceSelectFrom15k = "15000";
        private final static String priceSelectFrom20k = "20000";
        private final static String priceSelectTo20k = "20000";
        private final static String priceSelectTo30k = "30000";
        private final static String priceSelectTo40k = "40000";
        private final static String priceSelectTo70k = "70000";
        private final static String honda = "Honda";
        private final static String gl1800 = "GL 1800 Gold Wing";
        private final static String brp = "BRP";
        private final static String rxp = "RXP-X";
        private final static String crafter = "Crafter";
        private final static String mustang = "Mustang";
        private final static String series4 = "4 Series Gran Coupe";

    }
    public  void startPage(){driver.get(Labels.startPage);}
    public void selectAutoHouse(){
        elements.findElement(Locators.categorySelect);
        elements.clickOnElement(Locators.selectAutoHouse);}
    public void brandAutoHouse(){
        elements.inputDataThenEnter(Locators.brandSelect, Labels.mers);
        elements.findElement(Locators.brandMers).click();}
    public void modelAutoHouse(){
        elements.inputDataThenEnter(Locators.modelSelect, Labels.sprinter);
        elements.findElement(Locators.modelSprinter).click();}
    public void region(){
        elements.inputData(Locators.inputRegion, Labels.region);
        elements.findElement(Locators.region).click();}
    public void year(){
        elements.findElement(Locators.year).click();}
    public void yearFrom2010(){
        elements.findElement(Locators.yearFrom);
        elements.clickOnElement(Locators.selectYearFrom2010);}
    public void yearTo(){
        elements.findElement(Locators.yearTo);
        elements.clickOnElement(Locators.selectYearTo);}
    public void closedForm(){
        elements.findElement(Locators.clickOnForm).click();}
    public void price(){
        elements.findElement(Locators.price).click();}
    public void priceFrom20k(){
        elements.findElement(Locators.priceFrom).click();
        elements.inputData(Locators.priceFrom, Labels.priceSelectFrom20k);}
    public void priceTo40k(){
        elements.findElement(Locators.priceTo).click();
        elements.inputData(Locators.priceTo, Labels.priceSelectTo40k);}
    public void searchButton(){
        elements.findElement(Locators.searchButton).click();}
    public void vin(){
        elements.findElement(Locators.vin).click();}
    public void selectMotorcycle(){
        elements.findElement(Locators.categorySelect);
        elements.clickOnElement(Locators.selectMotorcycle);}
    public void brandMotoHonda(){
        elements.inputDataThenEnter(Locators.brandSelect, Labels.honda);
        elements.findElement(Locators.brandHonda).click();}
    public void modelMotoGl1800(){
        elements.inputDataThenEnter(Locators.modelSelect, Labels.gl1800);
        elements.findElement(Locators.modelGL).click();}
    public void yearFrom2015(){
        elements.findElement(Locators.yearFrom);
        elements.clickOnElement(Locators.selectYearFrom2015);}
    public void yearFrom2020(){
        elements.findElement(Locators.yearFrom);
        elements.clickOnElement(Locators.selectYearFrom2020);}
    public void priceTo30k(){
        elements.findElement(Locators.priceTo).click();
        elements.inputData(Locators.priceTo, Labels.priceSelectTo30k);}
    public void selectWaterTransport(){
        elements.findElement(Locators.categorySelect);
        elements.clickOnElement(Locators.selectWaterTransport);}
    public void brandBRP(){
        elements.inputDataThenEnter(Locators.brandSelect, Labels.brp);
        elements.findElement(Locators.brandBRP).click();}
    public void modelRXP(){
        elements.inputDataThenEnter(Locators.modelSelect, Labels.rxp);
        elements.findElement(Locators.modelRXP).click();}
    public void priceFrom15k(){
        elements.findElement(Locators.priceFrom).click();
        elements.inputData(Locators.priceFrom, Labels.priceSelectFrom15k);}
    public void priceFrom50k(){
        elements.findElement(Locators.priceFrom).click();
        elements.inputData(Locators.priceFrom, Labels.priceSelectFrom50k);}
    public void priceTo20k(){
        elements.findElement(Locators.priceTo).click();
        elements.inputData(Locators.priceTo, Labels.priceSelectTo20k);}
    public void priceTo70k(){
        elements.findElement(Locators.priceTo).click();
        elements.inputData(Locators.priceTo, Labels.priceSelectTo70k);}
    public void selectAuto(){
        elements.findElement(Locators.categorySelect);
        elements.clickOnElement(Locators.selectAuto);}
    public void brandBMW(){
        elements.inputDataThenEnter(Locators.brandSelect, Labels.bmw);
        elements.findElement(Locators.brandBMW).click();}
    public void model4Series(){
        elements.inputDataThenEnter(Locators.modelSelect, Labels.series4);
        elements.findElement(Locators.model4Series).click();}
    public void selectBus(){
        elements.findElement(Locators.categorySelect);
        elements.clickOnElement(Locators.selectBus);}
    public void brandVW(){
        elements.inputDataThenEnter(Locators.brandSelect, Labels.vw);
        elements.findElement(Locators.brandVW).click();}
    public void modelCrafter(){
        elements.inputDataThenEnter(Locators.modelSelect, Labels.crafter);
        elements.findElement(Locators.modelCrafter).click();}
    public void brandFord(){
        elements.inputDataThenEnter(Locators.brandSelect, Labels.ford);
        elements.findElement(Locators.brandFord).click();}
    public void modelMustang(){
        elements.inputDataThenEnter(Locators.modelSelect, Labels.mustang);
        elements.findElement(Locators.modelMustang).click();}


}