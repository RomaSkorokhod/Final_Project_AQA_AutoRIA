import org.testng.annotations.Test;

public class AutoRIA_1SearchOfTransport_Test extends BaseTest {

    @Test
    public void SearchAutoHouse(){
        AutoRIA_1SearchOfTransport_Page.categorySelect();
        AutoRIA_1SearchOfTransport_Page.brandAutoHouse();
        AutoRIA_1SearchOfTransport_Page.modelAutoHouse();
        AutoRIA_1SearchOfTransport_Page.region();
        AutoRIA_1SearchOfTransport_Page.year();
        AutoRIA_1SearchOfTransport_Page.yearFrom();
        AutoRIA_1SearchOfTransport_Page.yearTo();
        AutoRIA_1SearchOfTransport_Page.clickOnForm();
        AutoRIA_1SearchOfTransport_Page.price();
        AutoRIA_1SearchOfTransport_Page.priceFrom();
        AutoRIA_1SearchOfTransport_Page.priceTo();
        AutoRIA_1SearchOfTransport_Page.clickOnForm();
        AutoRIA_1SearchOfTransport_Page.searchButton();
    }
}
