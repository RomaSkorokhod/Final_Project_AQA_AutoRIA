import org.testng.annotations.Test;

public class AutoRIA_1SearchOfTransport_Test extends BaseTest {

    @Test (priority = 4)
    public void SearchAutoHouse(){
        AutoRIA_1SearchOfTransport_Page.startPage();
        AutoRIA_1SearchOfTransport_Page.selectAutoHouse();
        AutoRIA_1SearchOfTransport_Page.brandAutoHouse();
        AutoRIA_1SearchOfTransport_Page.modelAutoHouse();
        AutoRIA_1SearchOfTransport_Page.region();
        AutoRIA_1SearchOfTransport_Page.year();
        AutoRIA_1SearchOfTransport_Page.yearFrom2010();
        AutoRIA_1SearchOfTransport_Page.yearTo();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.price();
        AutoRIA_1SearchOfTransport_Page.priceFrom20k();
        AutoRIA_1SearchOfTransport_Page.priceTo40k();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.searchButton();
    }
    @Test (priority = 2)
    public void SearchMotorcycle(){
        AutoRIA_1SearchOfTransport_Page.startPage();
        AutoRIA_1SearchOfTransport_Page.selectMotorcycle();
        AutoRIA_1SearchOfTransport_Page.brandMotoHonda();
        AutoRIA_1SearchOfTransport_Page.modelMotoGl1800();
        AutoRIA_1SearchOfTransport_Page.region();
        AutoRIA_1SearchOfTransport_Page.year();
        AutoRIA_1SearchOfTransport_Page.yearFrom2015();
        AutoRIA_1SearchOfTransport_Page.yearTo();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.price();
        AutoRIA_1SearchOfTransport_Page.priceFrom20k();
        AutoRIA_1SearchOfTransport_Page.priceTo30k();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.searchButton();
    }
    @Test (priority = 5)
    public void SearchWaterTransport() {
        AutoRIA_1SearchOfTransport_Page.startPage();
        AutoRIA_1SearchOfTransport_Page.selectWaterTransport();
        AutoRIA_1SearchOfTransport_Page.brandBRP();
        AutoRIA_1SearchOfTransport_Page.modelRXP();
        AutoRIA_1SearchOfTransport_Page.region();
        AutoRIA_1SearchOfTransport_Page.year();
        AutoRIA_1SearchOfTransport_Page.yearFrom2015();
        AutoRIA_1SearchOfTransport_Page.yearTo();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.price();
        AutoRIA_1SearchOfTransport_Page.priceFrom15k();
        AutoRIA_1SearchOfTransport_Page.priceTo20k();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.searchButton();
    }
    @Test (priority = 1)
    public void SearchAuto() {
        AutoRIA_1SearchOfTransport_Page.selectAuto();
        AutoRIA_1SearchOfTransport_Page.brandBMW();
        AutoRIA_1SearchOfTransport_Page.model4Series();
        AutoRIA_1SearchOfTransport_Page.region();
        AutoRIA_1SearchOfTransport_Page.year();
        AutoRIA_1SearchOfTransport_Page.yearFrom2020();
        AutoRIA_1SearchOfTransport_Page.yearTo();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.price();
        AutoRIA_1SearchOfTransport_Page.priceFrom50k();
        AutoRIA_1SearchOfTransport_Page.priceTo70k();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.vin();
        AutoRIA_1SearchOfTransport_Page.searchButton();
    }
    @Test (priority = 3)
    public void SearchBus() {
        AutoRIA_1SearchOfTransport_Page.startPage();
        AutoRIA_1SearchOfTransport_Page.selectBus();
        AutoRIA_1SearchOfTransport_Page.brandVW();
        AutoRIA_1SearchOfTransport_Page.modelCrafter();
        AutoRIA_1SearchOfTransport_Page.region();
        AutoRIA_1SearchOfTransport_Page.year();
        AutoRIA_1SearchOfTransport_Page.yearFrom2015();
        AutoRIA_1SearchOfTransport_Page.yearTo();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.price();
        AutoRIA_1SearchOfTransport_Page.priceFrom15k();
        AutoRIA_1SearchOfTransport_Page.priceTo30k();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.vin();
        AutoRIA_1SearchOfTransport_Page.searchButton();
    }
    @Test (priority = 6)
    public void SearchSportCar() {
        AutoRIA_1SearchOfTransport_Page.startPage();
        AutoRIA_1SearchOfTransport_Page.selectAuto();
        AutoRIA_1SearchOfTransport_Page.brandFord();
        AutoRIA_1SearchOfTransport_Page.modelMustang();
        AutoRIA_1SearchOfTransport_Page.region();
        AutoRIA_1SearchOfTransport_Page.year();
        AutoRIA_1SearchOfTransport_Page.yearFrom2015();
        AutoRIA_1SearchOfTransport_Page.yearTo();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.price();
        AutoRIA_1SearchOfTransport_Page.priceFrom20k();
        AutoRIA_1SearchOfTransport_Page.priceTo30k();
        AutoRIA_1SearchOfTransport_Page.closedForm();
        AutoRIA_1SearchOfTransport_Page.vin();
        AutoRIA_1SearchOfTransport_Page.searchButton();
    }
}
