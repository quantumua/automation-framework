package com.betamedia.automation.framework.pages.tp.login.impl;

import com.betamedia.automation.framework.pages.tp.TPPages;
import com.betamedia.automation.framework.pages.tp.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class LoginPageImpl implements LoginPage {

    private WebDriver driver;
    private By usernameField;
    private By passwordField;
    private By submitButton;

    public LoginPageImpl(WebDriver driver,
                         Map<String, String> locations) {
        this.driver = driver;
        this.usernameField = By.xpath(locations.get("usernameField"));
        this.passwordField = By.xpath(locations.get("passwordField"));
        this.submitButton = By.xpath(locations.get("submitButton"));
    }

    @Override
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }

    @Override
    public void goTo() {
        TPPages.topNavigationPage().logIn();
    }

    @Override
    public boolean isAt() {
        return driver.findElement(submitButton).isDisplayed();
    }
}
