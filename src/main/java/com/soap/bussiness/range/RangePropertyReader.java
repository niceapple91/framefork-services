package com.soap.bussiness.range;

import com.soap.bussiness.transformers.ListPropertiesTransformer;
import com.soap.properties.SimplePropertyCreator;
import com.adidas.sef.ws.schema.range.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RangePropertyReader {

    public Map<String, Object> getRangeProperty(){
        Map<String, Object> properties = new HashMap<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        ListPropertiesTransformer transformer = new ListPropertiesTransformer();
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

        //list of properties
        properties.put("productManagers",transformer.getProperty(ProductManagers.class, "productManagerName", "productManagerName"));

        return properties;
    }

}
