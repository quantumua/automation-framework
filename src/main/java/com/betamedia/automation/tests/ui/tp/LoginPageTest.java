package com.betamedia.automation.tests.ui.tp;

import com.betamedia.automation.framework.pages.tp.TPPages;
import jsystem.framework.ParameterProperties;
import jsystem.framework.TestProperties;
import junit.framework.SystemTestCase4;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class LoginPageTest extends SystemTestCase4 {

    private String username;
    private String password;

    @Test
    @TestProperties(name = "login with externally set username/password", paramsInclude = {"username", "password"})
    public void loginWithExternalParams() {
        TPPages.loginPage().goTo().login(username, password);
        TPPages.loginErrorNotification().waitFor();
        TPPages.loginErrorNotification().dismiss();
    }

    @Test
    @TestProperties(name = "check if  login success with hardcoded user data", paramsInclude = {""})
    public void loginTest() {
        report.report("Start successful login test");
        TPPages.loginPage().goTo().login("vasichka", "123123");
        TPPages.disclaimerNotification().waitFor();
        TPPages.disclaimerNotification().accept();
        assertThat(TPPages.topNavigationPage().isLoggedIn(), is(true));
        report.report("Finish successful login test");
    }

    @Test
    @TestProperties(name = "login failed with unauthorized user (hardcoded)", paramsInclude = {""})
    public void failedLoginTest() {
        TPPages.loginPage().goTo().login("randomname", "randompassword");
        TPPages.loginErrorNotification().waitFor();
        TPPages.loginErrorNotification().dismiss();
    }

    @ParameterProperties(description = "username for login")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @ParameterProperties(description = "password for login")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
