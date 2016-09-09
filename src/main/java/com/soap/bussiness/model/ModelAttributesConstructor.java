package com.soap.bussiness.model;

import java.math.BigDecimal;
import java.util.Map;
import com.adidas.sef.ws.schema.model.*;
import com.adidas.sef.ws.schema.common.*;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Created by Администратор on 04.09.2016.
 */
public class ModelAttributesConstructor {

    public CreateNewModels.CreateModel createModel(Map<String, Object> attributesModel, String rangePlanId){
        CreateNewModels.CreateModel newModel = new CreateNewModels.CreateModel();
        newModel.setRangePlanId(Long.parseLong(rangePlanId));
        newModel.setBrandCode((String)attributesModel.get("brandCode"));
        newModel.setModelNameShort((String)attributesModel.get("modelNameShort"));
        newModel.setCreationCenterCode((String)attributesModel.get("creationCenterCode"));
        newModel.setGenderCode((String)attributesModel.get("genderCode"));
        newModel.setAgeGroupCode((String)attributesModel.get("ageGroupCode"));
        newModel.setProductClassCode((String)attributesModel.get("productClassCode"));
        newModel.setProductManagerName((String)attributesModel.get("productManagerName"));
        newModel.setSubBrand((String)attributesModel.get("subBrand"));
        newModel.setDevelopmentOrganization((String)attributesModel.get("developmentOrganization"));
        newModel.setModelDescr((String)attributesModel.get("modelDescr"));
        newModel.setModelNameLong((String)attributesModel.get("modelNameLong"));
        newModel.setDevelopmentTypeCode((String)attributesModel.get("developmentTypeCode"));
        newModel.setTargetFOB((BigDecimal)attributesModel.get("targetFOB"));
        newModel.setTargetFOBCurrencyCode((String)attributesModel.get("targetFOBCurrencyCode"));
        newModel.setRrp((BigDecimal)attributesModel.get("rrp"));
        newModel.setRrpCurrencyCode((String)attributesModel.get("rrpCurrencyCode"));
        newModel.setRrp2((BigDecimal)attributesModel.get("rrp2"));
        newModel.setRrp2CurrencyCode((String)attributesModel.get("rrp2CurrencyCode"));
        newModel.setMrktForecast((BigDecimal)attributesModel.get("mrktForecast"));
        newModel.setBetterPlaceCode((String)attributesModel.get("betterPlaceCode"));
        newModel.setFeaturesAndBenefit((String)attributesModel.get("featuresAndBenefit"));
        newModel.setPriceSegmentCode((String)attributesModel.get("priceSegmentCode"));
        newModel.setCorporateMrktLineCode((String)attributesModel.get("corporateMrktLineCode"));
        newModel.setCategoryMrktLineCode((String)attributesModel.get("categoryMrktLineCode"));
        newModel.setSalesLineCode((String)attributesModel.get("salesLineCode"));
        newModel.setSportsCategory((String)attributesModel.get("sportsCategory"));
        newModel.setProductTypeCode((String)attributesModel.get("productTypeCode"));
        newModel.setTargetSourcingCode((String)attributesModel.get("targetSourcingCode"));
        newModel.setTargetMaterialCode((String)attributesModel.get("targetMaterialCode"));
        newModel.setTargetTechnologyCode((String)attributesModel.get("targetTechnologyCode"));
        newModel.setPlaceholderFlag((String)attributesModel.get("placeholderFlag"));
        newModel.setSalesUnitCode((String)attributesModel.get("salesUnitCode"));
        newModel.setManufacturingCapability((String)attributesModel.get("manufacturingCapability"));
        newModel.setQuarter((String)attributesModel.get("quarter"));
        newModel.setRetailIntroDate((XMLGregorianCalendar)attributesModel.get("retailIntroDate"));
        newModel.setRetailExitDate((XMLGregorianCalendar)attributesModel.get("retailExitDate"));
//        newModel.setTransporationLeadTime((String)attributesModel.get("transporationLeadTime"));
        newModel.setDevelopmentTrackCode((String)attributesModel.get("developmentTrackCode"));
        newModel.setConsumerBenefit((String)attributesModel.get("consumerBenefit"));
        newModel.setTargetConsumerCode((String)attributesModel.get("targetConsumerCode"));
        newModel.setMrktProposedSize((String)attributesModel.get("mrktProposedSize"));
//        newModel.setReplenishmentFlag((String)attributesModel.get("replenishmentFlag"));
        newModel.setSizePage((String)attributesModel.get("sizePage"));
        newModel.setTargetMaterialDescription((String)attributesModel.get("targetMaterialDescription"));
        newModel.setLabelGroup((String)attributesModel.get("labelGroup"));
        newModel.setProductLevel((String)attributesModel.get("productLevel") + " ");
        newModel.setFirstMonthForecast((BigDecimal)attributesModel.get("firstMonthForecast"));
        newModel.setTechConceptCodes((TechConceptCodes)attributesModel.get("techConceptCode"));
        newModel.setSellingRegionCodes((SellingRegionCodes)attributesModel.get("sellingRegionCode"));
        newModel.setSizes((Sizes)attributesModel.get("size"));
        newModel.setLasts((Lasts)attributesModel.get("last"));
        newModel.setAdditionalCodings((AdditionalCodings)attributesModel.get("additionalCoding"));
        newModel.setHangTags((HangTags)attributesModel.get("hangTag"));
        newModel.setMarketingModelNames((MarketingModelNames)attributesModel.get("marketingModelName"));
        newModel.setPackages((Packages)attributesModel.get("packageCode"));
        newModel.setTechnologyComponents((TechnologyComponents)attributesModel.get("technologyComponent"));
        newModel.setMacroModel((MacroModel)attributesModel.get("macroModel"));
        newModel.setConstructionTypeCode((String)attributesModel.get("constructionTypeCode"));
        return newModel;
    }

}
