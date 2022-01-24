package automation.pages.Home;

import org.openqa.selenium.By;

public class HomePage {
    public static final By ContactUs_button = By.id("contact-link");
    public static final By SelectService = By.xpath("//select[@id='id_contact']/option[@value='2']");
    public static final By EmailId_text = By.id("email");
    public static final By Message_area = By.id("message");
    public static final By Submit_button = By.id("submitMessage");
    public static final By Success_Message = By.xpath("//p[contains(text(),'Your message has been successfully sent to our team.')]");
    public static final By Error_Message = By.xpath("//li[contains(text(),'Invalid email address.')]");
}


