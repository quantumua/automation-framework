package com.betamedia.automation.framework.pages.tp.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Map;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class TopNavigationPageImpl implements TopNavigationPage {

    private WebDriver driver;
    private By loginBtn;
    private By myAccountBtn;

    public TopNavigationPageImpl(WebDriver driver, Map<String, String> locations) {
        this.driver = driver;
        this.loginBtn = By.xpath(locations.get("loginBtn"));
        this.myAccountBtn = By.xpath(locations.get("myAccountBtn"));
    }

    @Override
    public boolean isLoggedIn() {
        return driver.findElement(myAccountBtn).isDisplayed();
    }

    @Override
    public void logIn() {
        driver.findElement(loginBtn).click();
    }
}
