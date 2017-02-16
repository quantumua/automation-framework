package com.betamedia.automation.framework.pages.common;

import com.betamedia.automation.framework.pages.common.entities.PageElementLocation;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import org.openqa.jetty.util.Resource;
import org.openqa.selenium.server.ClassPathResource;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mbelyaev on 2/16/17.
 */
public final class PropertiesRepository {

    private static Map<String, Map<String, String>> elementLocations = new HashMap<>();

    static {
        HeaderColumnNameMappingStrategy<PageElementLocation> strategy = new HeaderColumnNameMappingStrategy<>();
        strategy.setType(PageElementLocation.class);
        CsvToBean<PageElementLocation> csvToBean = new CsvToBean<>();
        try {
            Resource resource = new ClassPathResource("/pageElementLocations.csv");
            InputStream resourceInputStream = resource.getInputStream();
            csvToBean.parse(strategy, new CSVReader(new InputStreamReader(resourceInputStream))).forEach(el -> {
                        elementLocations.putIfAbsent(el.getPageObjectName(), new HashMap<>());
                        elementLocations.get(el.getPageObjectName()).put(el.getElementId(), el.getXpath());
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> getElementLocations(String pageObject) {
        return elementLocations.getOrDefault(pageObject, null);
    }

    public PropertiesRepository() {}
}
