package com.soap.bussiness.article;

import com.soap.bussiness.transformers.ListPropertiesTransformer;
import com.soap.properties.SimplePropertyCreator;
import com.adidas.sef.ws.schema.common.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class ArticlePropertyReader {

    public Map<String, Object> getArticleProperty() {
        Map<String, Object> properties = new HashMap<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        ListPropertiesTransformer transformer = new ListPropertiesTransformer();
        properties.put("productManagerName", reader.getProperty("productManagerName"));
        properties.put("developmentTypeCode", reader.getProperty("developmentTypeCodeTN"));
        properties.put("creationCenter", reader.getProperty("creationCenterCode"));
        properties.put("mrktForecast", reader.getProperty("mrktForecast"));
        properties.put("rrp", reader.getProperty("rrp"));
        properties.put("rrp2", reader.getProperty("rrp2"));
        properties.put("rrpCurrencyCode", reader.getProperty("rrpCurrencyCode"));
        properties.put("rrp2CurrencyCode", reader.getProperty("rrp2CurrencyCode"));
        properties.put("mrktDepartment", reader.getProperty("mrktDepartment"));
        properties.put("betterPlaceCode", reader.getProperty("betterPlaceCode"));
        properties.put("leadColorway", reader.getProperty("leadColorway"));
        properties.put("physicalColorway", reader.getProperty("physicalColorway"));
        properties.put("specialUsageCode", reader.getProperty("specialUsageCode"));
        properties.put("splUsage", reader.getProperty("splUsage"));
        properties.put("targetFOB", reader.getProperty("targetFOB"));
        properties.put("targetFOBCurrencyCode", reader.getProperty("targetFOBCurrencyCode"));
        properties.put("quarter", reader.getProperty("quarter"));
        properties.put("mandatoryRangeCode", reader.getProperty("mandatoryRangeCode"));
        properties.put("articleTypeCode", reader.getProperty("articleTypeCode"));
        properties.put("priceSegmentCode", reader.getProperty("priceSegmentCode"));
        properties.put("targetConsumerCode", reader.getProperty("targetConsumerCode"));
        properties.put("baseArticleNumber", reader.getProperty("baseArticleNumber"));
        properties.put("firstMonthForecast", reader.getProperty("firstMonthForecast"));
        properties.put("productFit", reader.getProperty("productFit"));
        properties.put("seniorDesigner", reader.getProperty("seniorDesigner"));
        properties.put("seniorDeveloper", reader.getProperty("seniorDeveloper"));
        XMLGregorianCalendar retailIntroDate;
        XMLGregorianCalendar retailExitDate;
        try {
            retailIntroDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(reader.getProperty("retailIntroDate"));
            properties.put("retailIntroDate", retailIntroDate);
            retailExitDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(reader.getProperty("retailExitDate"));
            properties.put("retailExitDate", retailExitDate);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        properties.put("brandAssetCode",transformer.getProperty(BrandAssets.class, "brandAssetCode", "brandAssetCode"));
        properties.put("sellingRegionCode", reader.getProperty("sellingRegionCode"));
        properties.put("distributionChannel", reader.getProperty("distributionChannel"));
        properties.put("additionalCoding",transformer.getProperty(AdditionalCodings.class, "additionalCoding", "additionalCoding"));
        return properties;
    }

}
