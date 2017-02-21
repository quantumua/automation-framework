package com.betamedia.automation.framework.pages.common;

import com.betamedia.automation.framework.pages.tp.TPPages;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mbelyaev on 2/17/17.
 */
public interface Notification extends Location {
    default void waitFor() {
        WebDriverWait wait = new WebDriverWait(TPPages.getDriver(), 60);
        wait.until(ExpectedConditions.elementToBeClickable(getLocator()));
    }
}
