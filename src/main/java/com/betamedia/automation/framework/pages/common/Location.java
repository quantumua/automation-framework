package com.betamedia.automation.framework.pages.common;

import com.betamedia.automation.framework.pages.tp.TPPages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mbelyaev on 2/17/17.
 */
public interface Location {
    By getLocator();

    default void waitFor() {
        WebDriverWait wait = new WebDriverWait(TPPages.getDriver(), 60);
        wait.until(ExpectedConditions.elementToBeClickable(getLocator()));
    }

    default boolean isAt() {
        return TPPages.getDriver().findElements(getLocator()).size() > 0;
    }
}
