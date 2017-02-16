package com.betamedia.automation.tests.ui.tp;

import com.betamedia.automation.framework.pages.tp.TPPages;
import junit.framework.SystemTestCase4;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class LoginPageTest extends SystemTestCase4 {

    @Test
    public void loginTest(){
        TPPages.loginPage().goTo();
        TPPages.loginPage().login();
        TPPages.disclaimerNotification().waitFor();
        TPPages.disclaimerNotification().accept();
        assertThat(TPPages.topNavigationPage().isLoggedIn(), is(true));
    }

    @Test
    public void failedLoginTest(){
    }
}
