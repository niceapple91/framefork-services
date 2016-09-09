package com.soap.bussiness.model;

import com.soap.bussiness.model.constructorsDAO.MacroModelConstructor;
import com.soap.bussiness.transformers.ListPropertiesTransformer;
import com.soap.properties.SimplePropertyCreator;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.adidas.sef.ws.schema.common.*;

/**
 * Created by Администратор on 04.09.2016.
 */
public class ModelPropertyReader {

    public Map<String, Object> getModelProperty(){
        Map<String, Object> properties = new HashMap<>();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        ListPropertiesTransformer transformer = new ListPropertiesTransformer();
        properties.put("constructionTypeCode",reader.getProperty("constructionTypeCode"));
        properties.put("modelNameShort",reader.getProperty("modelNameShort"));
        properties.put("brandCode",reader.getProperty("brandCode"));
        properties.put("creationCenterCode",reader.getProperty("creationCenterCode"));
        properties.put("genderCode",reader.getProperty("genderCode"));
        properties.put("ageGroupCode",reader.getProperty("ageGroupCode"));
        properties.put("productClassCode",reader.getProperty("productClassCode"));
        properties.put("productManagerName",reader.getProperty("productManagerName"));
        properties.put("subBrand",reader.getProperty("subBrand"));
        properties.put("developmentOrganization",reader.getProperty("developmentOrganization"));
        properties.put("modelDescr",reader.getProperty("modelDescr"));
        properties.put("modelNameLong",reader.getProperty("modelNameLong"));
        properties.put("developmentTypeCode",reader.getProperty("developmentTypeCodeTN"));
        properties.put("targetFOB", new BigDecimal(reader.getProperty("targetFOB")));
        properties.put("targetFOBCurrencyCode",reader.getProperty("targetFOBCurrencyCode"));
        properties.put("rrp", new BigDecimal(reader.getProperty("rrp")));
        properties.put("rrpCurrencyCode",reader.getProperty("rrpCurrencyCode"));
        properties.put("rrp2", new BigDecimal(reader.getProperty("rrp2")));
        properties.put("rrp2CurrencyCode",reader.getProperty("rrp2CurrencyCode"));
        properties.put("mrktForecast", new BigDecimal(reader.getProperty("mrktForecast")));
        properties.put("betterPlaceCode",reader.getProperty("betterPlaceCode"));
        properties.put("referenceWorkingNumber",reader.getProperty("referenceWorkingNumber"));
        properties.put("featuresAndBenefit",reader.getProperty("featuresAndBenefit"));
        properties.put("priceSegmentCode",reader.getProperty("priceSegmentCode"));
        properties.put("corporateMrktLineCode",reader.getProperty("corporateMrktLineCode"));
        properties.put("categoryMrktLineCode",reader.getProperty("categoryMrktLineCode"));
        properties.put("salesLineCode",reader.getProperty("salesLineCode"));
        properties.put("sportsCategory",reader.getProperty("sportsCategory"));
        properties.put("productTypeCode",reader.getProperty("productTypeCode"));
        properties.put("targetSourcingCode",reader.getProperty("targetSourcingCode"));
        properties.put("targetMaterialCode",reader.getProperty("targetMaterialCode"));
        properties.put("targetTechnologyCode",reader.getProperty("targetTechnologyCode"));
        properties.put("placeholderFlag",reader.getProperty("placeholderFlag"));
        properties.put("salesUnitCode",reader.getProperty("salesUnitCode"));
        properties.put("manufacturingCapability",reader.getProperty("manufacturingCapability"));
        properties.put("quarter",reader.getProperty("quarter"));
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
//        properties.put("transporationLeadTime",reader.getProperty("transporationLeadTime"));
        properties.put("developmentTrackCode",reader.getProperty("developmentTrackCode"));
        properties.put("consumerBenefit",reader.getProperty("consumerBenefit"));
        properties.put("targetConsumerCode",reader.getProperty("targetConsumerCode"));
        properties.put("mrktProposedSize",reader.getProperty("mrktProposedSize"));
//        properties.put("replenishmentFlag",reader.getProperty("replenishmentFlag"));
        properties.put("sizePage",reader.getProperty("sizePage"));
        properties.put("targetMaterialDescription",reader.getProperty("targetMaterialDescription"));
        properties.put("labelGroup",reader.getProperty("labelGroup"));
        properties.put("productLevel",reader.getProperty("productLevel"));
        properties.put("firstMonthForecast", new BigDecimal(reader.getProperty("firstMonthForecast")));

        //lists properties creation
        properties.put("techConceptCode",transformer.getProperty(TechConceptCodes.class, "techConceptCode", "techConceptCode"));
        properties.put("sellingRegionCode",transformer.getProperty(SellingRegionCodes.class, "sellingRegionCode", "sellingRegionCode"));
        properties.put("size",transformer.getProperty(Sizes.class, "size", "size"));
        properties.put("last",transformer.getProperty(Lasts.class, "last", "last"));
        properties.put("additionalCoding",transformer.getProperty(AdditionalCodings.class, "additionalCoding", "additionalCoding"));
        properties.put("hangTag",transformer.getProperty(HangTags.class, "hangTag", "hangTag"));
        properties.put("marketingModelName",transformer.getProperty(MarketingModelNames.class, "marketingModelName", "marketingModelName"));
        properties.put("package",transformer.getProperty(Packages.class, "package", "packageCode"));
        properties.put("technologyComponent",transformer.getProperty(TechnologyComponents.class, "technologyComponent", "technologyComponent"));

        properties.put("macroModel", MacroModelConstructor.createTN_MM());
        return properties;
    }
}
