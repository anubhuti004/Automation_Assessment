package Basic;

import automation.pages.Bot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicActionIntegration {

    protected WebDriver bot;  // varibale bot type webdriver
    protected static final String URL = "http://automationpractice.com/";

    @BeforeClass
    public void openBrowser() {
        bot = new Bot().getBot();
        bot.get(URL);
    }

    protected static void stepLog(String step) {   //To print steps
        Logger.step(step);
    }

    @AfterClass
    public void close() {bot.quit();
    }
}

