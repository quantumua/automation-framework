package com.betamedia.automation.framework.pages.common.entities;

import com.opencsv.bean.CsvBindByName;

/**
 * Created by mbelyaev on 2/16/17.
 */
public class PageElementLocation {

    @CsvBindByName
    private String pageObjectName;

    @CsvBindByName
    private String elementId;

    @CsvBindByName
    private String xpath;

    public String getPageObjectName() {
        return pageObjectName;
    }

    public String getElementId() {
        return elementId;
    }

    public String getXpath() {
        return xpath;
    }
}
