package com.betamedia.automation.framework.pages.tp.login.impl;

import com.betamedia.automation.framework.pages.tp.login.DisclaimerNotification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

/**
 * Created by mbelyaev on 2/16/17.
 */
public class DisclaimerNotificationImpl implements DisclaimerNotification {
    private WebDriver driver;
    private By disclaimerCheckbox;
    private By disclaimerSubmitBtn;

    public DisclaimerNotificationImpl(WebDriver driver, Map<String, String> locations) {
        this.driver = driver;
        this.disclaimerCheckbox = By.xpath(locations.get("disclaimerCheckbox"));
        this.disclaimerSubmitBtn = By.xpath(locations.get("disclaimerSubmitBtn"));
    }

    @Override
    public void accept() {
        driver.findElement(disclaimerCheckbox).click();
        driver.findElement(disclaimerSubmitBtn).click();
    }

    @Override
    public boolean isAt() {
        return driver.findElement(disclaimerCheckbox).isDisplayed();
    }
}