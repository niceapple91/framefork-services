
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for articleAttrNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="articleAttrNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="articleRangeId"/>
 *     &lt;enumeration value="articleNumber"/>
 *     &lt;enumeration value="developmentTypeCode"/>
 *     &lt;enumeration value="carriedOverFrom"/>
 *     &lt;enumeration value="productManagerName"/>
 *     &lt;enumeration value="quarter"/>
 *     &lt;enumeration value="retailIntroDate"/>
 *     &lt;enumeration value="retailExitDate"/>
 *     &lt;enumeration value="transportLeadTimeCode"/>
 *     &lt;enumeration value="mandatoryRangeCode"/>
 *     &lt;enumeration value="speedPropositionCode"/>
 *     &lt;enumeration value="mrktProposedColor"/>
 *     &lt;enumeration value="colorName"/>
 *     &lt;enumeration value="mrktDepartment"/>
 *     &lt;enumeration value="betterPlaceCode"/>
 *     &lt;enumeration value="betterPlaceDescription"/>
 *     &lt;enumeration value="leadColorway"/>
 *     &lt;enumeration value="physicalColorway"/>
 *     &lt;enumeration value="specialUsageCode"/>
 *     &lt;enumeration value="priceSegmentCode"/>
 *     &lt;enumeration value="distributionChannels"/>
 *     &lt;enumeration value="ffmModelCode"/>
 *     &lt;enumeration value="articleTypeCode"/>
 *     &lt;enumeration value="productionFeasibility"/>
 *     &lt;enumeration value="splUsage"/>
 *     &lt;enumeration value="articleStatusCode"/>
 *     &lt;enumeration value="targetFOB"/>
 *     &lt;enumeration value="targetFOBCurrencyCode"/>
 *     &lt;enumeration value="actualFOB"/>
 *     &lt;enumeration value="bufferFOB"/>
 *     &lt;enumeration value="rrp"/>
 *     &lt;enumeration value="rrpCurrencyCode"/>
 *     &lt;enumeration value="mrktForecast"/>
 *     &lt;enumeration value="mrktForecastLong"/>
 *     &lt;enumeration value="developmentTrackCode"/>
 *     &lt;enumeration value="targetConsumerCode"/>
 *     &lt;enumeration value="sellingRegionCodes"/>
 *     &lt;enumeration value="lifeCycleStatusCode"/>
 *     &lt;enumeration value="lifeCycleStatusDate"/>
 *     &lt;enumeration value="glblGoInMarginTgtFOB"/>
 *     &lt;enumeration value="glblGoInMarginBufferFOB"/>
 *     &lt;enumeration value="glblGoInMarginActFOB"/>
 *     &lt;enumeration value="glblGoInMarginBVFOB"/>
 *     &lt;enumeration value="stdGoInMarginTgtFOB"/>
 *     &lt;enumeration value="stdGoInMarginBufferFOB"/>
 *     &lt;enumeration value="stdGoInMarginActFOB"/>
 *     &lt;enumeration value="stdGoInMarginBVFOB"/>
 *     &lt;enumeration value="glblNetSales"/>
 *     &lt;enumeration value="bvNetSales"/>
 *     &lt;enumeration value="buyingVolume"/>
 *     &lt;enumeration value="actualFOBStatus"/>
 *     &lt;enumeration value="businessUnitCode"/>
 *     &lt;enumeration value="buyReadyStatusDescr"/>
 *     &lt;enumeration value="buyReadyValidationStatus"/>
 *     &lt;enumeration value="dropDate"/>
 *     &lt;enumeration value="earliestBuyReadyDate"/>
 *     &lt;enumeration value="glblForecast"/>
 *     &lt;enumeration value="successfullyRelDwnStreamFlag"/>
 *     &lt;enumeration value="replenishmentflag"/>
 *     &lt;enumeration value="seasonCode"/>
 *     &lt;enumeration value="creationDate"/>
 *     &lt;enumeration value="articleReadyForRelease"/>
 *     &lt;enumeration value="additionalCodings"/>
 *     &lt;enumeration value="additionalCodingDescriptions"/>
 *     &lt;enumeration value="baseArticleNumber"/>
 *     &lt;enumeration value="creationCenter"/>
 *     &lt;enumeration value="firstMonthForecast"/>
 *     &lt;enumeration value="firstMonthForecastLong"/>
 *     &lt;enumeration value="productFit"/>
 *     &lt;enumeration value="seniorDesigner"/>
 *     &lt;enumeration value="seniorDeveloper"/>
 *     &lt;enumeration value="rrp2"/>
 *     &lt;enumeration value="rrp2CurrencyCode"/>
 *     &lt;enumeration value="articleCreationSeason"/>
 *     &lt;enumeration value="colorDesigner"/>
 *     &lt;enumeration value="designer"/>
 *     &lt;enumeration value="developer"/>
 *     &lt;enumeration value="loDeveloper"/>
 *     &lt;enumeration value="marketingActivationSignature"/>
 *     &lt;enumeration value="orderLockedIndicator"/>
 *     &lt;enumeration value="sourceSystem"/>
 *     &lt;enumeration value="factoryDeveloper"/>
 *     &lt;enumeration value="marketingActivationDueDate"/>
 *     &lt;enumeration value="brandAssets"/>
 *     &lt;enumeration value="changeRequestFlag"/>
 *     &lt;enumeration value="activeChangeRequestFlag"/>
 *     &lt;enumeration value="confidentialFlag"/>
 *     &lt;enumeration value="errorFlag"/>
 *     &lt;enumeration value="errorSource"/>
 *     &lt;enumeration value="refModelActivationSignature"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "articleAttrNames")
@XmlEnum
public enum ArticleAttrNames {

    @XmlEnumValue("articleRangeId")
    ARTICLE_RANGE_ID("articleRangeId"),
    @XmlEnumValue("articleNumber")
    ARTICLE_NUMBER("articleNumber"),
    @XmlEnumValue("developmentTypeCode")
    DEVELOPMENT_TYPE_CODE("developmentTypeCode"),
    @XmlEnumValue("carriedOverFrom")
    CARRIED_OVER_FROM("carriedOverFrom"),
    @XmlEnumValue("productManagerName")
    PRODUCT_MANAGER_NAME("productManagerName"),
    @XmlEnumValue("quarter")
    QUARTER("quarter"),
    @XmlEnumValue("retailIntroDate")
    RETAIL_INTRO_DATE("retailIntroDate"),
    @XmlEnumValue("retailExitDate")
    RETAIL_EXIT_DATE("retailExitDate"),
    @XmlEnumValue("transportLeadTimeCode")
    TRANSPORT_LEAD_TIME_CODE("transportLeadTimeCode"),
    @XmlEnumValue("mandatoryRangeCode")
    MANDATORY_RANGE_CODE("mandatoryRangeCode"),
    @XmlEnumValue("speedPropositionCode")
    SPEED_PROPOSITION_CODE("speedPropositionCode"),
    @XmlEnumValue("mrktProposedColor")
    MRKT_PROPOSED_COLOR("mrktProposedColor"),
    @XmlEnumValue("colorName")
    COLOR_NAME("colorName"),
    @XmlEnumValue("mrktDepartment")
    MRKT_DEPARTMENT("mrktDepartment"),
    @XmlEnumValue("betterPlaceCode")
    BETTER_PLACE_CODE("betterPlaceCode"),
    @XmlEnumValue("betterPlaceDescription")
    BETTER_PLACE_DESCRIPTION("betterPlaceDescription"),
    @XmlEnumValue("leadColorway")
    LEAD_COLORWAY("leadColorway"),
    @XmlEnumValue("physicalColorway")
    PHYSICAL_COLORWAY("physicalColorway"),
    @XmlEnumValue("specialUsageCode")
    SPECIAL_USAGE_CODE("specialUsageCode"),
    @XmlEnumValue("priceSegmentCode")
    PRICE_SEGMENT_CODE("priceSegmentCode"),
    @XmlEnumValue("distributionChannels")
    DISTRIBUTION_CHANNELS("distributionChannels"),
    @XmlEnumValue("ffmModelCode")
    FFM_MODEL_CODE("ffmModelCode"),
    @XmlEnumValue("articleTypeCode")
    ARTICLE_TYPE_CODE("articleTypeCode"),
    @XmlEnumValue("productionFeasibility")
    PRODUCTION_FEASIBILITY("productionFeasibility"),
    @XmlEnumValue("splUsage")
    SPL_USAGE("splUsage"),
    @XmlEnumValue("articleStatusCode")
    ARTICLE_STATUS_CODE("articleStatusCode"),
    @XmlEnumValue("targetFOB")
    TARGET_FOB("targetFOB"),
    @XmlEnumValue("targetFOBCurrencyCode")
    TARGET_FOB_CURRENCY_CODE("targetFOBCurrencyCode"),
    @XmlEnumValue("actualFOB")
    ACTUAL_FOB("actualFOB"),
    @XmlEnumValue("bufferFOB")
    BUFFER_FOB("bufferFOB"),
    @XmlEnumValue("rrp")
    RRP("rrp"),
    @XmlEnumValue("rrpCurrencyCode")
    RRP_CURRENCY_CODE("rrpCurrencyCode"),
    @XmlEnumValue("mrktForecast")
    MRKT_FORECAST("mrktForecast"),
    @XmlEnumValue("mrktForecastLong")
    MRKT_FORECAST_LONG("mrktForecastLong"),
    @XmlEnumValue("developmentTrackCode")
    DEVELOPMENT_TRACK_CODE("developmentTrackCode"),
    @XmlEnumValue("targetConsumerCode")
    TARGET_CONSUMER_CODE("targetConsumerCode"),
    @XmlEnumValue("sellingRegionCodes")
    SELLING_REGION_CODES("sellingRegionCodes"),
    @XmlEnumValue("lifeCycleStatusCode")
    LIFE_CYCLE_STATUS_CODE("lifeCycleStatusCode"),
    @XmlEnumValue("lifeCycleStatusDate")
    LIFE_CYCLE_STATUS_DATE("lifeCycleStatusDate"),
    @XmlEnumValue("glblGoInMarginTgtFOB")
    GLBL_GO_IN_MARGIN_TGT_FOB("glblGoInMarginTgtFOB"),
    @XmlEnumValue("glblGoInMarginBufferFOB")
    GLBL_GO_IN_MARGIN_BUFFER_FOB("glblGoInMarginBufferFOB"),
    @XmlEnumValue("glblGoInMarginActFOB")
    GLBL_GO_IN_MARGIN_ACT_FOB("glblGoInMarginActFOB"),
    @XmlEnumValue("glblGoInMarginBVFOB")
    GLBL_GO_IN_MARGIN_BVFOB("glblGoInMarginBVFOB"),
    @XmlEnumValue("stdGoInMarginTgtFOB")
    STD_GO_IN_MARGIN_TGT_FOB("stdGoInMarginTgtFOB"),
    @XmlEnumValue("stdGoInMarginBufferFOB")
    STD_GO_IN_MARGIN_BUFFER_FOB("stdGoInMarginBufferFOB"),
    @XmlEnumValue("stdGoInMarginActFOB")
    STD_GO_IN_MARGIN_ACT_FOB("stdGoInMarginActFOB"),
    @XmlEnumValue("stdGoInMarginBVFOB")
    STD_GO_IN_MARGIN_BVFOB("stdGoInMarginBVFOB"),
    @XmlEnumValue("glblNetSales")
    GLBL_NET_SALES("glblNetSales"),
    @XmlEnumValue("bvNetSales")
    BV_NET_SALES("bvNetSales"),
    @XmlEnumValue("buyingVolume")
    BUYING_VOLUME("buyingVolume"),
    @XmlEnumValue("actualFOBStatus")
    ACTUAL_FOB_STATUS("actualFOBStatus"),
    @XmlEnumValue("businessUnitCode")
    BUSINESS_UNIT_CODE("businessUnitCode"),
    @XmlEnumValue("buyReadyStatusDescr")
    BUY_READY_STATUS_DESCR("buyReadyStatusDescr"),
    @XmlEnumValue("buyReadyValidationStatus")
    BUY_READY_VALIDATION_STATUS("buyReadyValidationStatus"),
    @XmlEnumValue("dropDate")
    DROP_DATE("dropDate"),
    @XmlEnumValue("earliestBuyReadyDate")
    EARLIEST_BUY_READY_DATE("earliestBuyReadyDate"),
    @XmlEnumValue("glblForecast")
    GLBL_FORECAST("glblForecast"),
    @XmlEnumValue("successfullyRelDwnStreamFlag")
    SUCCESSFULLY_REL_DWN_STREAM_FLAG("successfullyRelDwnStreamFlag"),
    @XmlEnumValue("replenishmentflag")
    REPLENISHMENTFLAG("replenishmentflag"),
    @XmlEnumValue("seasonCode")
    SEASON_CODE("seasonCode"),
    @XmlEnumValue("creationDate")
    CREATION_DATE("creationDate"),
    @XmlEnumValue("articleReadyForRelease")
    ARTICLE_READY_FOR_RELEASE("articleReadyForRelease"),
    @XmlEnumValue("additionalCodings")
    ADDITIONAL_CODINGS("additionalCodings"),
    @XmlEnumValue("additionalCodingDescriptions")
    ADDITIONAL_CODING_DESCRIPTIONS("additionalCodingDescriptions"),
    @XmlEnumValue("baseArticleNumber")
    BASE_ARTICLE_NUMBER("baseArticleNumber"),
    @XmlEnumValue("creationCenter")
    CREATION_CENTER("creationCenter"),
    @XmlEnumValue("firstMonthForecast")
    FIRST_MONTH_FORECAST("firstMonthForecast"),
    @XmlEnumValue("firstMonthForecastLong")
    FIRST_MONTH_FORECAST_LONG("firstMonthForecastLong"),
    @XmlEnumValue("productFit")
    PRODUCT_FIT("productFit"),
    @XmlEnumValue("seniorDesigner")
    SENIOR_DESIGNER("seniorDesigner"),
    @XmlEnumValue("seniorDeveloper")
    SENIOR_DEVELOPER("seniorDeveloper"),
    @XmlEnumValue("rrp2")
    RRP_2("rrp2"),
    @XmlEnumValue("rrp2CurrencyCode")
    RRP_2_CURRENCY_CODE("rrp2CurrencyCode"),
    @XmlEnumValue("articleCreationSeason")
    ARTICLE_CREATION_SEASON("articleCreationSeason"),
    @XmlEnumValue("colorDesigner")
    COLOR_DESIGNER("colorDesigner"),
    @XmlEnumValue("designer")
    DESIGNER("designer"),
    @XmlEnumValue("developer")
    DEVELOPER("developer"),
    @XmlEnumValue("loDeveloper")
    LO_DEVELOPER("loDeveloper"),
    @XmlEnumValue("marketingActivationSignature")
    MARKETING_ACTIVATION_SIGNATURE("marketingActivationSignature"),
    @XmlEnumValue("orderLockedIndicator")
    ORDER_LOCKED_INDICATOR("orderLockedIndicator"),
    @XmlEnumValue("sourceSystem")
    SOURCE_SYSTEM("sourceSystem"),
    @XmlEnumValue("factoryDeveloper")
    FACTORY_DEVELOPER("factoryDeveloper"),
    @XmlEnumValue("marketingActivationDueDate")
    MARKETING_ACTIVATION_DUE_DATE("marketingActivationDueDate"),
    @XmlEnumValue("brandAssets")
    BRAND_ASSETS("brandAssets"),
    @XmlEnumValue("changeRequestFlag")
    CHANGE_REQUEST_FLAG("changeRequestFlag"),
    @XmlEnumValue("activeChangeRequestFlag")
    ACTIVE_CHANGE_REQUEST_FLAG("activeChangeRequestFlag"),
    @XmlEnumValue("confidentialFlag")
    CONFIDENTIAL_FLAG("confidentialFlag"),
    @XmlEnumValue("errorFlag")
    ERROR_FLAG("errorFlag"),
    @XmlEnumValue("errorSource")
    ERROR_SOURCE("errorSource"),
    @XmlEnumValue("refModelActivationSignature")
    REF_MODEL_ACTIVATION_SIGNATURE("refModelActivationSignature");
    private final String value;

    ArticleAttrNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArticleAttrNames fromValue(String v) {
        for (ArticleAttrNames c: ArticleAttrNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
