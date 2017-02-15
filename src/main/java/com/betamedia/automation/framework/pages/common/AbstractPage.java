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
    protected static WebDriver driver;
    protected static WebDriverSystemObject seleniumSystemObject;

    protected static <T> T getPage(Class<T> clazz) {
        T page;
        try {
            page = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }

        initWebElements(page);

        return page;
    }

    private static <T> void initWebElements(T page) {
        try {
            seleniumSystemObject = (WebDriverSystemObject) SystemManagerImpl.getInstance().getSystemObject(WEB_DRIVER_SYSTEM_OBJECT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        driver = seleniumSystemObject.getDriver();
        PageFactory.initElements(driver, page);
    }
}
