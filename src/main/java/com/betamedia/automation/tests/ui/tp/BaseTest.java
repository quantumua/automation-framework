package com.betamedia.automation.tests.ui.tp;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.tp.TPPages;
import junit.framework.SystemTestCase4;
import org.jsystem.webdriver_so.WebDriverSystemObject;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Created by mbelyaev on 2/21/17.
 */
public class BaseTest extends SystemTestCase4 {


    @BeforeClass
    public static void initSeleniumSystemObject() throws Exception {
        TPPages.initSeleniumSystemObject();
    }

    @Before
    public void openBrowser() throws Exception {
        TPPages.openBrowser();
    }

    @After
    public void closeBrowser() throws Exception {
        TPPages.closeBrowser();
    }
}
