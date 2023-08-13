import driver.DriverFactory;
import functions.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pages.*;
import utils.TestResultListener;

import java.time.Duration;

@Listeners(TestResultListener.class)
public class BaseTest {
//    static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver = DriverFactory.startChromeDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Action action = new Action(driver);
    protected Assertions assertions = new Assertions(driver);
    protected Elements elements = new Elements(driver);
    protected Waiters waiters = new Waiters(driver);
    protected AutoRIA_2SearchAndBuyOfAutoParts_Page AutoRIA_2SearchAndBuyOfAutoParts_Page = new AutoRIA_2SearchAndBuyOfAutoParts_Page(driver);
    protected AutoRIA_3Registration_Page AutoRIA_3Registration_Page = new AutoRIA_3Registration_Page(driver);
    protected AutoRIA_1SearchOfTransport_Page AutoRIA_1SearchOfTransport_Page = new AutoRIA_1SearchOfTransport_Page(driver);


    @BeforeSuite
    public void Coockies(){
        AutoRIA_2SearchAndBuyOfAutoParts_Page.openPage();
        AutoRIA_2SearchAndBuyOfAutoParts_Page.acceptCookies();
    }

    @AfterSuite
    public void closeDriver(){waiters.waitSomeMilliseconds(3000);
        driver.quit();
    }

    }
