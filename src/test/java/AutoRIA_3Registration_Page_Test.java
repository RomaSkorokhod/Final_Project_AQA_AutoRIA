import org.testng.annotations.Test;

public class AutoRIA_3Registration_Page_Test extends BaseTest {

    @Test (priority = 1)
    public void registeredWithoutEmail(){
        AutoRIA_3Registration_Page.enterTheOffice();
        AutoRIA_3Registration_Page.frame();
        AutoRIA_3Registration_Page.registration();
        AutoRIA_3Registration_Page.name();
        AutoRIA_3Registration_Page.secondName();
        AutoRIA_3Registration_Page.checkBox();
        AutoRIA_3Registration_Page.registrationButton();
        waiters.waitSomeMilliseconds(2000);
        AutoRIA_3Registration_Page.refresh();
    }
    @Test (priority = 2)
    public void registeredWithoutName(){
        AutoRIA_3Registration_Page.frame();
        AutoRIA_3Registration_Page.registration();
        AutoRIA_3Registration_Page.secondName();
        AutoRIA_3Registration_Page.validEmail();
        AutoRIA_3Registration_Page.checkBox();
        AutoRIA_3Registration_Page.registrationButton();
        waiters.waitSomeMilliseconds(2000);
        AutoRIA_3Registration_Page.refresh();
    }
    @Test (priority = 3)
    public void registeredNotValidEmail() {
        AutoRIA_3Registration_Page.frame();
        AutoRIA_3Registration_Page.registration();
        AutoRIA_3Registration_Page.name();
        AutoRIA_3Registration_Page.secondName();
        AutoRIA_3Registration_Page.notValidEmail();
        AutoRIA_3Registration_Page.checkBox();
        AutoRIA_3Registration_Page.registrationButton();
        waiters.waitSomeMilliseconds(2000);
        AutoRIA_3Registration_Page.refresh();

    }
    @Test (priority = 4)
    public void registeredWithoutSecondName(){
        AutoRIA_3Registration_Page.frame();
        AutoRIA_3Registration_Page.registration();
        AutoRIA_3Registration_Page.name();
        AutoRIA_3Registration_Page.validEmail();
        AutoRIA_3Registration_Page.checkBox();
        AutoRIA_3Registration_Page.registrationButton();
        waiters.waitSomeMilliseconds(2000);
        AutoRIA_3Registration_Page.refresh();

    }
    @Test (priority = 5)
    public void registeredNotValidPhoneNumber() {
        AutoRIA_3Registration_Page.frame();
        AutoRIA_3Registration_Page.registration();
        AutoRIA_3Registration_Page.name();
        AutoRIA_3Registration_Page.secondName();
        AutoRIA_3Registration_Page.notValidPhoneNumber();
        AutoRIA_3Registration_Page.checkBox();
        AutoRIA_3Registration_Page.registrationButton();
        waiters.waitSomeMilliseconds(2000);
        AutoRIA_3Registration_Page.refresh();

    }
    @Test (priority = 6)
    public void successfulRegistration() {
        AutoRIA_3Registration_Page.frame();
        AutoRIA_3Registration_Page.registration();
        AutoRIA_3Registration_Page.name();
        AutoRIA_3Registration_Page.secondName();
        AutoRIA_3Registration_Page.email();
        AutoRIA_3Registration_Page.checkBox();
        AutoRIA_3Registration_Page.registrationButton();
    }
}

