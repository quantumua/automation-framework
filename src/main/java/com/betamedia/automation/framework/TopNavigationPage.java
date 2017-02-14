package com.betamedia.automation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mbelyaev on 2/14/17.
 */
public class TopNavigationPage {

    @FindBy(how = How.LINK_TEXT, using = "About")
    private WebElement aboutLink;

    public void about()
    {
        aboutLink.click();
    }


}
