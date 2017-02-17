package com.betamedia.automation.framework.pages.common;

import jsystem.framework.system.SystemManagerImpl;
import org.jsystem.webdriver_so.WebDriverSystemObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public abstract class AbstractPage {

    public static final String WEB_DRIVER_SYSTEM_OBJECT = "webDriverSystemObject";
    protected static WebDriverSystemObject seleniumSystemObject;

    protected static WebDriver getDriver(){
        try {
            seleniumSystemObject = (WebDriverSystemObject) SystemManagerImpl.getInstance().getSystemObject(WEB_DRIVER_SYSTEM_OBJECT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return seleniumSystemObject.getDriver();
    }
}
