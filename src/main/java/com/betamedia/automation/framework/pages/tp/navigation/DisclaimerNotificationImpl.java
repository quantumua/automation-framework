package com.betamedia.automation.framework.pages.tp.navigation;

import com.betamedia.automation.framework.pages.tp.TPPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

/**
 * Created by mbelyaev on 2/16/17.
 */
public class DisclaimerNotificationImpl implements DisclaimerNotification{
    @FindBy(how = How.ID, using = "checkboxDisclaimer")
    private WebElement disclaimerCheckbox;
    @FindBy(how = How.ID, using = "disclaimer_submit")
    private WebElement disclaimerSubmitBtn;

    @Override
    public void accept(){
        disclaimerCheckbox.click();
        disclaimerSubmitBtn.click();
    }

    @Override
    public void waitFor() {
        if(disclaimerCheckbox.isDisplayed()){
            return;
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TPPages.disclaimerNotification().waitFor();
    }
}