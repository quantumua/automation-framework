package com.betamedia.automation.framework;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by mbelyaev on 2/14/17.
 */

public class Browser {
    private static String baseUrl = "http://localhost:12142/";

    private static WebDriver webDriver = new ChromeDriver();

    public static void initialize()
    {
        goTo("");
    }


    public static WebDriver getDriver() {
        return webDriver;
    }

    public static String getTitle()
    {
        return webDriver.getTitle();
    }

    public static void goTo(String url)
    {
        webDriver.navigate().to(baseUrl + url);
    }
}
