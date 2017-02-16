package com.betamedia.automation.framework.pages.tp.login;

import com.betamedia.automation.framework.pages.tp.TPPages;
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
    public void login() {
        driver.findElement(usernameField).sendKeys("vasichka");
        driver.findElement(passwordField).sendKeys("123123");
        driver.findElement(submitButton).click();
    }

    @Override
    public void failedLogin() {
    }

    @Override
    public void goTo() {
        TPPages.topNavigationPage().login();
    }
}
