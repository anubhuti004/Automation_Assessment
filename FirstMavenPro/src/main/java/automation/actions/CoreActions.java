package automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreActions {
    protected final WebDriver bot;
    protected final WebDriverWait delay;


    protected CoreActions(WebDriver bot) {
        this.bot = bot;
        this.delay = new WebDriverWait(bot, 10); //
    }

    protected boolean waitForVisibility(By element) {
        boolean isVisible = true;
        try {
            delay.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException te) {
            isVisible = false;
        }
        return isVisible;
    }

    protected void click(By element) {
        bot.findElement(element).click();
    }

    protected void enterText(By element, String text) {
        bot.findElement(element).sendKeys(text);
    }   //Doubt

    protected String pageTitle() {return bot.getTitle(); }

//    //Method to check if a Web element exists or not
    protected boolean checkElement(By element) {
        if(bot.findElement(element)!=null){
            return true;
        }
        else{
            return false;
        }
    }

    protected void clickPopupElement(By element) {
        delay.until(ExpectedConditions.visibilityOfElementLocated(element));
        delay.until(ExpectedConditions.elementToBeClickable(element));
        bot.findElement(element).click();
    }

    protected String textRetriever(By element){
        return bot.findElement(element).getText();
    }

    //Doubt
    public static void sleep(double sec) {
        try {
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



