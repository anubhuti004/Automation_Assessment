package Pagetest.Home;

import Basic.BasicActionIntegration;
import automation.actions.HomePageImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

@Test
@Epic("EPIC 1")
public class SuccessMessage extends BasicActionIntegration {

    HomePageImpl contact;


    @Test
    @Description("Creating ContactPageImpl objects before class")
    public void initImpl() {
        contact = new HomePageImpl(bot);
    }

    @Test(dependsOnMethods = "initImpl")
    @Description("Verifying Success Message")
    @Owner("Anubhuti Anand")

    public void test_to_open_the_correct_site_and_get_success_message(){
        stepLog("Verify correct site is opened");
        contact.verifySite();

        stepLog("Click “Contact Us”");
        contact.clickContactUs();


        stepLog("Select “Customer Service” from  Subject heading");
        contact.customerService();

        stepLog("Enter valid email address, add some message and click send");
        contact.enterEmailID("abc@gmail.com");
        contact.enterMessage("Sending Random Message Text");
        contact.submit();

        stepLog("Verify Success Message");
        contact.verifySuccessMessage();
    }
}