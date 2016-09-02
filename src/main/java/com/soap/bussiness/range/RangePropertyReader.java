package com.soap.bussiness.range;

import com.soap.properties.SimplePropertyCreator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RangePropertyReader {

    public Map<String, Object> getRangeProperty(){
        Map<String, Object> properties = new HashMap<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        properties.put("brandCode",reader.getProperty("brandCode"));
        properties.put("seasonCode",reader.getProperty("seasonCode"));
        properties.put("mrktDepartment",reader.getProperty("mrktDepartment"));
        properties.put("productDivision",reader.getProperty("productDivision"));
        properties.put("targetGoInMarginPct",Float.valueOf(reader.getProperty("targetGoInMarginPct")));
        properties.put("targetNetSalesAmount", new BigDecimal(reader.getProperty("targetNetSalesAmount")));
        properties.put("targetVolumeUnits",Long.valueOf(reader.getProperty("targetVolumeUnits")));
        properties.put("targetVolumeUnits",Long.valueOf(reader.getProperty("targetModelCount")));
        properties.put("targetVolumeUnits",Long.valueOf(reader.getProperty("targetArticleCount")));
        properties.put("targetVolumeUnits",Long.valueOf(reader.getProperty("targetSilhouetteCount")));
        properties.put("targetVolumeUnits",Long.valueOf(reader.getProperty("targetToolingCount")));
        return properties;
    }

    public Map<String, String> getRequestHeader(){
        Map<String, String> properties = new HashMap<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        properties.put("username",reader.getProperty("username"));
        properties.put("businessProcess",reader.getProperty("businessProcess"));
        properties.put("consumer",reader.getProperty("consumer"));
        return properties;
    }
}
