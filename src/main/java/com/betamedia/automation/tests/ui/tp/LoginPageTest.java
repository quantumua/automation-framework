package com.betamedia.automation.tests.ui.tp;

import com.betamedia.automation.framework.pages.tp.TPPages;
import junit.framework.SystemTestCase4;
import org.junit.Test;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class LoginPageTest extends SystemTestCase4 {

    @Test
    public void loginTest(){
        TPPages.loginPage().login();
    }
}
