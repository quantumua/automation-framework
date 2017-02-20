package com.betamedia.automation.framework.pages.common;

import com.betamedia.automation.framework.pages.common.entities.PageElementLocation;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import org.openqa.selenium.server.ClassPathResource;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mbelyaev on 2/16/17.
 */
public final class WebElementRepository {

    private static Map<String, Map<String, String>> locations = new HashMap<>();

    static {
        HeaderColumnNameMappingStrategy<PageElementLocation> strategy = new HeaderColumnNameMappingStrategy<>();
        strategy.setType(PageElementLocation.class);
        CsvToBean<PageElementLocation> csvToBean = new CsvToBean<>();
        try (InputStream resourceInputStream = new ClassPathResource("/pageElementLocations.csv").getInputStream();) {
            csvToBean.parse(strategy, new CSVReader(new InputStreamReader(resourceInputStream))).forEach(el -> {
                        locations.putIfAbsent(el.getPageObjectName(), new HashMap<>());
                        locations.get(el.getPageObjectName()).put(el.getElementId(), el.getXpath());
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize web elements IDs store");
        }
    }

    public static Map<String, String> getLocations(String pageObject) {
        return locations.getOrDefault(pageObject, null);
    }

    public WebElementRepository() {}
}
