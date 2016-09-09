package com.soap.bussiness.article;

import java.math.BigDecimal;
import java.util.Map;
import com.adidas.sef.ws.schema.article.*;

import javax.xml.datatype.XMLGregorianCalendar;

public class ArticlesAttributesConstructor {

    public CreateArticleRequest createArticle(Map<String, Object> attributesArticle, String modelRangeId) {
        CreateArticleRequest newArticle = new CreateArticleRequest();
        newArticle.setModelRangeId(Long.parseLong(modelRangeId));
        newArticle.setProductManagerName((String)attributesArticle.get("productManagerName"));
        newArticle.setDevelopmentTypeCode((String)attributesArticle.get("developmentTypeCode"));
        newArticle.setCreationCenter((String)attributesArticle.get("creationCenter"));
        newArticle.setMrktForecast((BigDecimal)attributesArticle.get("mrktForecast"));
        newArticle.setRrp((BigDecimal)attributesArticle.get("rrp"));
        newArticle.setRrpCurrencyCode((String)attributesArticle.get("rrpCurrencyCode"));
        newArticle.setRrp2((BigDecimal)attributesArticle.get("rrp2"));
        newArticle.setRrp2CurrencyCode((String)attributesArticle.get("rrp2CurrencyCode"));
        newArticle.setMrktDepartment((String)attributesArticle.get("mrktDepartment"));
        newArticle.setBetterPlaceCode((String)attributesArticle.get("betterPlaceCode"));
        newArticle.setLeadColorway((String)attributesArticle.get("leadColorway"));
        newArticle.setPhysicalColorway((String)attributesArticle.get("physicalColorway"));
        newArticle.setSpecialUsageCode((String)attributesArticle.get("specialUsageCode"));
        newArticle.setSplUsage((String)attributesArticle.get("splUsage"));
        newArticle.setTargetFOB((BigDecimal)attributesArticle.get("targetFOB"));
        newArticle.setTargetFOBCurrencyCode((String)attributesArticle.get("targetFOBCurrencyCode"));
        newArticle.setQuarter((String)attributesArticle.get("quarter"));
        newArticle.setMandatoryRangeCode((String)attributesArticle.get("mandatoryRangeCode"));
        newArticle.setArticleTypeCode((String)attributesArticle.get("articleTypeCode"));
        newArticle.setPriceSegmentCode((String)attributesArticle.get("priceSegmentCode"));
        newArticle.setTargetConsumerCode((String)attributesArticle.get("targetConsumerCode"));
        newArticle.setBaseArticleNumber((String)attributesArticle.get("baseArticleNumber"));
        newArticle.setFirstMonthForecast((BigDecimal)attributesArticle.get("firstMonthForecast"));
        newArticle.setProductFit((String)attributesArticle.get("productFit"));
        newArticle.setSeniorDesigner((String)attributesArticle.get("seniorDesigner"));
        newArticle.setSeniorDeveloper((String)attributesArticle.get("seniorDeveloper"));
        newArticle.setRetailIntroDate((XMLGregorianCalendar)attributesArticle.get("retailIntroDate"));
        newArticle.setRetailExitDate((XMLGregorianCalendar)attributesArticle.get("retailExitDate"));
        newArticle.setBrandAssets((BrandAssets)attributesArticle.get("brandAssetCode"));
        newArticle.SellingRegionCodes.getSellingRegionCode().add((String)attributesArticle.get("sellingRegionCode"));
        newArticle.DistributionChannels.getDistributionChannels().add((String)attributesArticle.get("distributionChannel"));
        newArticle.setAdditionalCodings((AdditionalCodings)attributesArticle.get("additionalCoding"));

    }

}
