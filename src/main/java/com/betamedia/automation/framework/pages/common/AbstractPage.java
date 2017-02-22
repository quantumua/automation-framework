package com.betamedia.automation.framework.pages.common;

import com.betamedia.automation.framework.pages.common.annotation.StoredId;
import jsystem.framework.system.SystemManagerImpl;
import org.jsystem.webdriver_so.WebDriverSystemObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public abstract class AbstractPage {

    public static final String WEB_DRIVER_SYSTEM_OBJECT = "webDriverSystemObject";
    protected static WebDriverSystemObject seleniumSystemObject;
    protected static WebDriver driver;
    protected static Map<String, String> locations;

    public static void initSeleniumSystemObject() {
        try {
            seleniumSystemObject = (WebDriverSystemObject) SystemManagerImpl.getInstance().getSystemObject(WEB_DRIVER_SYSTEM_OBJECT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        driver = getDriver();
    }

    public static void openBrowser() throws Exception {
        seleniumSystemObject.openBrowser();
        driver = getDriver();
    }

    public static void closeBrowser() throws Exception {
        seleniumSystemObject.closeBrowser();
    }

    protected static <T> T getPage(Class<T> clazz) {
        T page;
        try {
            page = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        initLocations(clazz);
        initWebElements(page);
        return page;
    }

    private static <T> void initLocations(Class<T> clazz) {
        locations = WebElementRepository.getLocations(clazz.getSimpleName());
    }

    private static <T> void initWebElements(T page) {
        initWebFields(page);
    }

    private static <T> void initWebFields(T page) {
        Field[] declaredFields = page.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(StoredId.class) && field.getType().isAssignableFrom(By.class)) {
                StoredId storedId = field.getAnnotation(StoredId.class);
                try {
                    if (Modifier.isPrivate(field.getModifiers())) {
                        field.setAccessible(true);
                    }
                    field.set(page, By.id(locations.get(storedId.value())));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }

    protected static WebDriver getDriver() {
        return seleniumSystemObject.getDriver();
    }
}
