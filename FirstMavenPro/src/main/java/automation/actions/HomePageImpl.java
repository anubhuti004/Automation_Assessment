package automation.actions;

import automation.pages.Home.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;


public class HomePageImpl extends CoreActions {
    public HomePageImpl(WebDriver bot) {
        super(bot);
    }    //super - web driver initilize

//1  Launch the web application
//2  Verify correct site is opened
//3  Click “Contact Us”
//4  Select “Customer Service” from  Subject heading
//5  Enter valid email address and add some message and click send
//6  Verify Success Message

    @Step("Verifying that correct site is opened")
    public void verifySite() {
        waitForVisibility(HomePage.ContactUs_button);
        Assert.assertEquals(pageTitle(), "My Store");
    }

    @Step("Clicking on Contact Us button")
    public void clickContactUs() {
        click(HomePage.ContactUs_button);
    }

    @Step("Selecting Customer Service")
    public void customerService() {
        sleep(3);
        click(HomePage.SelectService);
    }

    @Step("Entering email address")
    public void enterEmailID(String email) {
        enterText(HomePage.EmailId_text, email);
    }

    @Step("Entering some message")
    public void enterMessage(String message) {
        enterText(HomePage.Message_area, message);
    }

    @Step("Clicking on Submit button")
    public void submit() {
        click(HomePage.Submit_button);
    }

    @Step("Verifying Success Message")
    public void verifySuccessMessage() {
        sleep(2);
        Assert.assertTrue(checkElement(HomePage.Success_Message));

    }

    @Step("Verifying Invalid Error Message")
    public void verifyErrorMessage() {
        sleep(2);
        Assert.assertTrue(checkElement(HomePage.Error_Message));

    }
}



