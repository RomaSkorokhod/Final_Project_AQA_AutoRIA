import org.testng.annotations.Test;

public class AutoRIA_3Registration_Page_Test extends BaseTest{
    @Test
    public void registeredWithoutEmail(){
        AutoRIA_3Registration_Page.enterTheOffice();
        AutoRIA_3Registration_Page.frame();
        AutoRIA_3Registration_Page.registration();
        AutoRIA_3Registration_Page.loginForm();
        AutoRIA_3Registration_Page.name();
        AutoRIA_3Registration_Page.secondName();
        AutoRIA_3Registration_Page.email();
        AutoRIA_3Registration_Page.checkBox();
        AutoRIA_3Registration_Page.registrationButton();

    }
}
