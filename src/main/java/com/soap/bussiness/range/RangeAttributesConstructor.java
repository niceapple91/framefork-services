package com.soap.bussiness.range;

import java.math.BigDecimal;
import java.util.Map;
import com.adidas.sef.ws.schema.range.*;

public class RangeAttributesConstructor {

    public CreateRangeRequest createRange(Map<String, Object> attributesRange){
        CreateRangeRequest newRange = new CreateRangeRequest();
        newRange.setBrandCode((String)attributesRange.get("brandCode"));
        newRange.setSeasonCode((String)attributesRange.get("seasonCode"));
        newRange.setMrktDepartment((String)attributesRange.get("mrktDepartment"));
        newRange.setRangeName(rangeNameGeneration());
        newRange.setProductDivision((String)attributesRange.get("productDivision"));
        newRange.setProductManagers((ProductManagers)attributesRange.get("productManagers"));
        newRange.setTargetGoInMarginPct((Float)attributesRange.get("targetGoInMarginPct"));
        newRange.setTargetNetSalesAmount((BigDecimal)attributesRange.get("targetNetSalesAmount"));
        newRange.setTargetVolumeUnits((Long)attributesRange.get("targetVolumeUnits"));
        newRange.setTargetModelCount((Long)attributesRange.get("targetModelCount"));
        newRange.setTargetArticleCount((Long)attributesRange.get("targetArticleCount"));
        newRange.setTargetSilhouetteCount((Long)attributesRange.get("targetSilhouetteCount"));
        newRange.setTargetToolingCount((Long)attributesRange.get("targetToolingCount"));
        return newRange;
    }

    private String rangeNameGeneration(){
        String rangeName = "AutomationRange" + System.currentTimeMillis() + ((int)(Math.random()*10));
        return rangeName;
    }

}
