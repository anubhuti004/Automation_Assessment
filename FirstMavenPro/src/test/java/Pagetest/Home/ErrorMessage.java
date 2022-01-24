package Pagetest.Home;

import Basic.BasicActionIntegration;
import automation.actions.HomePageImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

@Test
@Epic("EPIC 1")
public class ErrorMessage extends BasicActionIntegration {

    HomePageImpl contacterror;


    @Test       //for testing
    @Description("Creating HomePageImpl objects before class")
    public void initImpl() {
        contacterror = new HomePageImpl(bot);      //contacterror is a reference varibale pointing to homepageImpl object.
    }


    @Test(dependsOnMethods = "initImpl")
    @Description(" Verify the error message on sending invalid email id")
    @Owner("Anubhuti Anand")
    public void get_error_message(){
        stepLog("Verify correct site is opened");
        contacterror.verifySite();              //using object they are calling properties of homepageImpl

        stepLog("Click “Contact Us”");
        contacterror.clickContactUs();

        stepLog("Select “Customer Service” from  Subject heading");
        contacterror.customerService();

        stepLog("Enter invalid email address, add some message and click send");
        contacterror.enterEmailID("xyzgmail.com");
        contacterror.enterMessage("Sending Message Text");
        contacterror.submit();

        stepLog("Verify Error Message");
        contacterror.verifyErrorMessage();
    }
}