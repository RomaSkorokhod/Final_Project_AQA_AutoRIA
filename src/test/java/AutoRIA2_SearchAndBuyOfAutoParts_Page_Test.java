import org.testng.annotations.Test;


public class AutoRIA2_SearchAndBuyOfAutoParts_Page_Test extends BaseTest {



    @Test
    public void OpenPageTest(){
        AutoRIA2_SearchAndBuyOfAutoParts_Page.openPage();
        AutoRIA2_SearchAndBuyOfAutoParts_Page.accept();
        AutoRIA2_SearchAndBuyOfAutoParts_Page.openPage2();
        AutoRIA2_SearchAndBuyOfAutoParts_Page.InputSearchText();
        AutoRIA2_SearchAndBuyOfAutoParts_Page.VolkswagenBeetleParts();
        AutoRIA2_SearchAndBuyOfAutoParts_Page.VolkswagenBeetlePartBuy();
        AutoRIA2_SearchAndBuyOfAutoParts_Page.BuyOtherParts();


    }


}
