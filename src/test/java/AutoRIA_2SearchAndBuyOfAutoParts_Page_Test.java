import org.testng.annotations.Test;

public class AutoRIA_2SearchAndBuyOfAutoParts_Page_Test extends BaseTest {

    @Test (priority = 1)
    public void BuyVolksWagenPartsAndDel() {
        AutoRIA_2SearchAndBuyOfAutoParts_Page.openPageAutoParts();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.inputSearchTextVW();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.volkswagenBeetleParts();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.volkswagenBeetlePartBuy();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.buyOtherParts();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.basket();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.delOrder();
    }
    @Test (priority = 2)
    public void BuyAutoOilAndDel() {
        AutoRIA_2SearchAndBuyOfAutoParts_Page.openPageAutoParts();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.inputSearchTextAutoOil();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.autoOil();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.autoOilBuy();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.buyOtherParts();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.basket();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.delOrder();
    }
    @Test (priority = 3)
    public void BuyLampAndDel() {
        AutoRIA_2SearchAndBuyOfAutoParts_Page.openPageAutoParts();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.inputSearchTextAutoLamp();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.autoLamp();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.autoLampBuy();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.buyOtherParts();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.basket();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.delOrder();
    }
    @Test (priority = 4)
    public void SearchButtonStartStopAndBuy(){
        AutoRIA_2SearchAndBuyOfAutoParts_Page.openPageAutoParts();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.inputSearchTextStartButton();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.startStopButton();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.startStopButtonBuy();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.BuyOrder();
    }
}




