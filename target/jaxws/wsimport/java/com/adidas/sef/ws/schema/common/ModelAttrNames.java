
package com.adidas.sef.ws.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modelAttrNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="modelAttrNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="modelName"/>
 *     &lt;enumeration value="modelNumber"/>
 *     &lt;enumeration value="workingNumber"/>
 *     &lt;enumeration value="gfr"/>
 *     &lt;enumeration value="developmentTypeCode"/>
 *     &lt;enumeration value="carriedOverFrom"/>
 *     &lt;enumeration value="targetFOB"/>
 *     &lt;enumeration value="targetFOBCurrencyCode"/>
 *     &lt;enumeration value="rrp"/>
 *     &lt;enumeration value="rrpCurrencyCode"/>
 *     &lt;enumeration value="modelNameLong"/>
 *     &lt;enumeration value="modelDescr"/>
 *     &lt;enumeration value="rrp2"/>
 *     &lt;enumeration value="rrp2CurrencyCode"/>
 *     &lt;enumeration value="mrktForecast"/>
 *     &lt;enumeration value="mrktForecastLong"/>
 *     &lt;enumeration value="mrktDepartment"/>
 *     &lt;enumeration value="betterPlaceCode"/>
 *     &lt;enumeration value="betterPlaceDescription"/>
 *     &lt;enumeration value="productManagerName"/>
 *     &lt;enumeration value="referenceWorkingNumber"/>
 *     &lt;enumeration value="featuresAndBenefit"/>
 *     &lt;enumeration value="priceSegmentCode"/>
 *     &lt;enumeration value="corporateMrktLineCode"/>
 *     &lt;enumeration value="categoryMrktLineCode"/>
 *     &lt;enumeration value="salesLineCode"/>
 *     &lt;enumeration value="sportsCategoryCode"/>
 *     &lt;enumeration value="productDivision"/>
 *     &lt;enumeration value="productGroupCode"/>
 *     &lt;enumeration value="productTypeCode"/>
 *     &lt;enumeration value="creationCenterCode"/>
 *     &lt;enumeration value="targetSourcingCode"/>
 *     &lt;enumeration value="targetMaterialCode"/>
 *     &lt;enumeration value="targetTechnologyCode"/>
 *     &lt;enumeration value="techConceptCodes"/>
 *     &lt;enumeration value="developmentOrganization"/>
 *     &lt;enumeration value="placeHolderFlag"/>
 *     &lt;enumeration value="placeHolderStyleCount"/>
 *     &lt;enumeration value="salesUnitCode"/>
 *     &lt;enumeration value="constructionTypeCode"/>
 *     &lt;enumeration value="manufacturingCapability"/>
 *     &lt;enumeration value="ageGroupCode"/>
 *     &lt;enumeration value="genderCode"/>
 *     &lt;enumeration value="productClassCode"/>
 *     &lt;enumeration value="quarter"/>
 *     &lt;enumeration value="retailIntroDate"/>
 *     &lt;enumeration value="retailExitDate"/>
 *     &lt;enumeration value="localUsageCodes"/>
 *     &lt;enumeration value="transportLeadTimeCode"/>
 *     &lt;enumeration value="developmentTrackCode"/>
 *     &lt;enumeration value="consumerBenefitCode"/>
 *     &lt;enumeration value="targetConsumerCode"/>
 *     &lt;enumeration value="mrktProposedSize"/>
 *     &lt;enumeration value="sellingRegionCodes"/>
 *     &lt;enumeration value="modelStatus"/>
 *     &lt;enumeration value="replenishmentflag"/>
 *     &lt;enumeration value="factoryName"/>
 *     &lt;enumeration value="projectManagerName"/>
 *     &lt;enumeration value="glblGoInMarginTgtFOB"/>
 *     &lt;enumeration value="glblGoInMarginActFOB"/>
 *     &lt;enumeration value="glblGoInMarginBufferFOB"/>
 *     &lt;enumeration value="glblGoInMarginBVFOB"/>
 *     &lt;enumeration value="buyingVolumeUnit"/>
 *     &lt;enumeration value="lifeCycleStatusCode"/>
 *     &lt;enumeration value="lifeCycleStatusDate"/>
 *     &lt;enumeration value="indicativeGIM"/>
 *     &lt;enumeration value="earliestBuyReadyDate"/>
 *     &lt;enumeration value="buyReadyValidationStatus"/>
 *     &lt;enumeration value="buyReadyStatusDescr"/>
 *     &lt;enumeration value="modelRangeId"/>
 *     &lt;enumeration value="brandCode"/>
 *     &lt;enumeration value="creationDate"/>
 *     &lt;enumeration value="dropDate"/>
 *     &lt;enumeration value="seasonCode"/>
 *     &lt;enumeration value="subBrand"/>
 *     &lt;enumeration value="confidentialFlag"/>
 *     &lt;enumeration value="successfullyRelDwnStreamFlag"/>
 *     &lt;enumeration value="businessSegmentCode"/>
 *     &lt;enumeration value="modelReadyForRelease"/>
 *     &lt;enumeration value="actualArticleCnt"/>
 *     &lt;enumeration value="totalArticleCnt"/>
 *     &lt;enumeration value="midSoleId"/>
 *     &lt;enumeration value="midSoleDescription"/>
 *     &lt;enumeration value="outSoleId"/>
 *     &lt;enumeration value="outSoleDescription"/>
 *     &lt;enumeration value="silhouetteId"/>
 *     &lt;enumeration value="silhouetteDescription"/>
 *     &lt;enumeration value="sampleSize"/>
 *     &lt;enumeration value="sizePage"/>
 *     &lt;enumeration value="sizes"/>
 *     &lt;enumeration value="sizesCode"/>
 *     &lt;enumeration value="sizesIndex"/>
 *     &lt;enumeration value="targetMaterialDescription"/>
 *     &lt;enumeration value="lasts"/>
 *     &lt;enumeration value="additionalCodings"/>
 *     &lt;enumeration value="additionalCodingDescriptions"/>
 *     &lt;enumeration value="firstMonthForecast"/>
 *     &lt;enumeration value="firstMonthForecastLong"/>
 *     &lt;enumeration value="hangTags"/>
 *     &lt;enumeration value="labelGroup"/>
 *     &lt;enumeration value="labels"/>
 *     &lt;enumeration value="marketingModelNames"/>
 *     &lt;enumeration value="packages"/>
 *     &lt;enumeration value="packageNames"/>
 *     &lt;enumeration value="productLevel"/>
 *     &lt;enumeration value="referenceModelNumber"/>
 *     &lt;enumeration value="salesSizeScale"/>
 *     &lt;enumeration value="salesSizeScaleCode"/>
 *     &lt;enumeration value="technologyComponents"/>
 *     &lt;enumeration value="developer"/>
 *     &lt;enumeration value="modelCreationSeason"/>
 *     &lt;enumeration value="referenceModelName"/>
 *     &lt;enumeration value="sourceSystem"/>
 *     &lt;enumeration value="widthProject"/>
 *     &lt;enumeration value="modelId"/>
 *     &lt;enumeration value="seniorDesigner"/>
 *     &lt;enumeration value="seniorDeveloper"/>
 *     &lt;enumeration value="designer"/>
 *     &lt;enumeration value="colorDesigner"/>
 *     &lt;enumeration value="changeRequestFlag"/>
 *     &lt;enumeration value="activeChangeRequestFlag"/>
 *     &lt;enumeration value="macroModelId"/>
 *     &lt;enumeration value="errorFlag"/>
 *     &lt;enumeration value="errorSource"/>
 *     &lt;enumeration value="refLifeCycleStatusCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modelAttrNames")
@XmlEnum
public enum ModelAttrNames {

    @XmlEnumValue("modelName")
    MODEL_NAME("modelName"),
    @XmlEnumValue("modelNumber")
    MODEL_NUMBER("modelNumber"),
    @XmlEnumValue("workingNumber")
    WORKING_NUMBER("workingNumber"),
    @XmlEnumValue("gfr")
    GFR("gfr"),
    @XmlEnumValue("developmentTypeCode")
    DEVELOPMENT_TYPE_CODE("developmentTypeCode"),
    @XmlEnumValue("carriedOverFrom")
    CARRIED_OVER_FROM("carriedOverFrom"),
    @XmlEnumValue("targetFOB")
    TARGET_FOB("targetFOB"),
    @XmlEnumValue("targetFOBCurrencyCode")
    TARGET_FOB_CURRENCY_CODE("targetFOBCurrencyCode"),
    @XmlEnumValue("rrp")
    RRP("rrp"),
    @XmlEnumValue("rrpCurrencyCode")
    RRP_CURRENCY_CODE("rrpCurrencyCode"),
    @XmlEnumValue("modelNameLong")
    MODEL_NAME_LONG("modelNameLong"),
    @XmlEnumValue("modelDescr")
    MODEL_DESCR("modelDescr"),
    @XmlEnumValue("rrp2")
    RRP_2("rrp2"),
    @XmlEnumValue("rrp2CurrencyCode")
    RRP_2_CURRENCY_CODE("rrp2CurrencyCode"),
    @XmlEnumValue("mrktForecast")
    MRKT_FORECAST("mrktForecast"),
    @XmlEnumValue("mrktForecastLong")
    MRKT_FORECAST_LONG("mrktForecastLong"),
    @XmlEnumValue("mrktDepartment")
    MRKT_DEPARTMENT("mrktDepartment"),
    @XmlEnumValue("betterPlaceCode")
    BETTER_PLACE_CODE("betterPlaceCode"),
    @XmlEnumValue("betterPlaceDescription")
    BETTER_PLACE_DESCRIPTION("betterPlaceDescription"),
    @XmlEnumValue("productManagerName")
    PRODUCT_MANAGER_NAME("productManagerName"),
    @XmlEnumValue("referenceWorkingNumber")
    REFERENCE_WORKING_NUMBER("referenceWorkingNumber"),
    @XmlEnumValue("featuresAndBenefit")
    FEATURES_AND_BENEFIT("featuresAndBenefit"),
    @XmlEnumValue("priceSegmentCode")
    PRICE_SEGMENT_CODE("priceSegmentCode"),
    @XmlEnumValue("corporateMrktLineCode")
    CORPORATE_MRKT_LINE_CODE("corporateMrktLineCode"),
    @XmlEnumValue("categoryMrktLineCode")
    CATEGORY_MRKT_LINE_CODE("categoryMrktLineCode"),
    @XmlEnumValue("salesLineCode")
    SALES_LINE_CODE("salesLineCode"),
    @XmlEnumValue("sportsCategoryCode")
    SPORTS_CATEGORY_CODE("sportsCategoryCode"),
    @XmlEnumValue("productDivision")
    PRODUCT_DIVISION("productDivision"),
    @XmlEnumValue("productGroupCode")
    PRODUCT_GROUP_CODE("productGroupCode"),
    @XmlEnumValue("productTypeCode")
    PRODUCT_TYPE_CODE("productTypeCode"),
    @XmlEnumValue("creationCenterCode")
    CREATION_CENTER_CODE("creationCenterCode"),
    @XmlEnumValue("targetSourcingCode")
    TARGET_SOURCING_CODE("targetSourcingCode"),
    @XmlEnumValue("targetMaterialCode")
    TARGET_MATERIAL_CODE("targetMaterialCode"),
    @XmlEnumValue("targetTechnologyCode")
    TARGET_TECHNOLOGY_CODE("targetTechnologyCode"),
    @XmlEnumValue("techConceptCodes")
    TECH_CONCEPT_CODES("techConceptCodes"),
    @XmlEnumValue("developmentOrganization")
    DEVELOPMENT_ORGANIZATION("developmentOrganization"),
    @XmlEnumValue("placeHolderFlag")
    PLACE_HOLDER_FLAG("placeHolderFlag"),
    @XmlEnumValue("placeHolderStyleCount")
    PLACE_HOLDER_STYLE_COUNT("placeHolderStyleCount"),
    @XmlEnumValue("salesUnitCode")
    SALES_UNIT_CODE("salesUnitCode"),
    @XmlEnumValue("constructionTypeCode")
    CONSTRUCTION_TYPE_CODE("constructionTypeCode"),
    @XmlEnumValue("manufacturingCapability")
    MANUFACTURING_CAPABILITY("manufacturingCapability"),
    @XmlEnumValue("ageGroupCode")
    AGE_GROUP_CODE("ageGroupCode"),
    @XmlEnumValue("genderCode")
    GENDER_CODE("genderCode"),
    @XmlEnumValue("productClassCode")
    PRODUCT_CLASS_CODE("productClassCode"),
    @XmlEnumValue("quarter")
    QUARTER("quarter"),
    @XmlEnumValue("retailIntroDate")
    RETAIL_INTRO_DATE("retailIntroDate"),
    @XmlEnumValue("retailExitDate")
    RETAIL_EXIT_DATE("retailExitDate"),
    @XmlEnumValue("localUsageCodes")
    LOCAL_USAGE_CODES("localUsageCodes"),
    @XmlEnumValue("transportLeadTimeCode")
    TRANSPORT_LEAD_TIME_CODE("transportLeadTimeCode"),
    @XmlEnumValue("developmentTrackCode")
    DEVELOPMENT_TRACK_CODE("developmentTrackCode"),
    @XmlEnumValue("consumerBenefitCode")
    CONSUMER_BENEFIT_CODE("consumerBenefitCode"),
    @XmlEnumValue("targetConsumerCode")
    TARGET_CONSUMER_CODE("targetConsumerCode"),
    @XmlEnumValue("mrktProposedSize")
    MRKT_PROPOSED_SIZE("mrktProposedSize"),
    @XmlEnumValue("sellingRegionCodes")
    SELLING_REGION_CODES("sellingRegionCodes"),
    @XmlEnumValue("modelStatus")
    MODEL_STATUS("modelStatus"),
    @XmlEnumValue("replenishmentflag")
    REPLENISHMENTFLAG("replenishmentflag"),
    @XmlEnumValue("factoryName")
    FACTORY_NAME("factoryName"),
    @XmlEnumValue("projectManagerName")
    PROJECT_MANAGER_NAME("projectManagerName"),
    @XmlEnumValue("glblGoInMarginTgtFOB")
    GLBL_GO_IN_MARGIN_TGT_FOB("glblGoInMarginTgtFOB"),
    @XmlEnumValue("glblGoInMarginActFOB")
    GLBL_GO_IN_MARGIN_ACT_FOB("glblGoInMarginActFOB"),
    @XmlEnumValue("glblGoInMarginBufferFOB")
    GLBL_GO_IN_MARGIN_BUFFER_FOB("glblGoInMarginBufferFOB"),
    @XmlEnumValue("glblGoInMarginBVFOB")
    GLBL_GO_IN_MARGIN_BVFOB("glblGoInMarginBVFOB"),
    @XmlEnumValue("buyingVolumeUnit")
    BUYING_VOLUME_UNIT("buyingVolumeUnit"),
    @XmlEnumValue("lifeCycleStatusCode")
    LIFE_CYCLE_STATUS_CODE("lifeCycleStatusCode"),
    @XmlEnumValue("lifeCycleStatusDate")
    LIFE_CYCLE_STATUS_DATE("lifeCycleStatusDate"),
    @XmlEnumValue("indicativeGIM")
    INDICATIVE_GIM("indicativeGIM"),
    @XmlEnumValue("earliestBuyReadyDate")
    EARLIEST_BUY_READY_DATE("earliestBuyReadyDate"),
    @XmlEnumValue("buyReadyValidationStatus")
    BUY_READY_VALIDATION_STATUS("buyReadyValidationStatus"),
    @XmlEnumValue("buyReadyStatusDescr")
    BUY_READY_STATUS_DESCR("buyReadyStatusDescr"),
    @XmlEnumValue("modelRangeId")
    MODEL_RANGE_ID("modelRangeId"),
    @XmlEnumValue("brandCode")
    BRAND_CODE("brandCode"),
    @XmlEnumValue("creationDate")
    CREATION_DATE("creationDate"),
    @XmlEnumValue("dropDate")
    DROP_DATE("dropDate"),
    @XmlEnumValue("seasonCode")
    SEASON_CODE("seasonCode"),
    @XmlEnumValue("subBrand")
    SUB_BRAND("subBrand"),
    @XmlEnumValue("confidentialFlag")
    CONFIDENTIAL_FLAG("confidentialFlag"),
    @XmlEnumValue("successfullyRelDwnStreamFlag")
    SUCCESSFULLY_REL_DWN_STREAM_FLAG("successfullyRelDwnStreamFlag"),
    @XmlEnumValue("businessSegmentCode")
    BUSINESS_SEGMENT_CODE("businessSegmentCode"),
    @XmlEnumValue("modelReadyForRelease")
    MODEL_READY_FOR_RELEASE("modelReadyForRelease"),
    @XmlEnumValue("actualArticleCnt")
    ACTUAL_ARTICLE_CNT("actualArticleCnt"),
    @XmlEnumValue("totalArticleCnt")
    TOTAL_ARTICLE_CNT("totalArticleCnt"),
    @XmlEnumValue("midSoleId")
    MID_SOLE_ID("midSoleId"),
    @XmlEnumValue("midSoleDescription")
    MID_SOLE_DESCRIPTION("midSoleDescription"),
    @XmlEnumValue("outSoleId")
    OUT_SOLE_ID("outSoleId"),
    @XmlEnumValue("outSoleDescription")
    OUT_SOLE_DESCRIPTION("outSoleDescription"),
    @XmlEnumValue("silhouetteId")
    SILHOUETTE_ID("silhouetteId"),
    @XmlEnumValue("silhouetteDescription")
    SILHOUETTE_DESCRIPTION("silhouetteDescription"),
    @XmlEnumValue("sampleSize")
    SAMPLE_SIZE("sampleSize"),
    @XmlEnumValue("sizePage")
    SIZE_PAGE("sizePage"),
    @XmlEnumValue("sizes")
    SIZES("sizes"),
    @XmlEnumValue("sizesCode")
    SIZES_CODE("sizesCode"),
    @XmlEnumValue("sizesIndex")
    SIZES_INDEX("sizesIndex"),
    @XmlEnumValue("targetMaterialDescription")
    TARGET_MATERIAL_DESCRIPTION("targetMaterialDescription"),
    @XmlEnumValue("lasts")
    LASTS("lasts"),
    @XmlEnumValue("additionalCodings")
    ADDITIONAL_CODINGS("additionalCodings"),
    @XmlEnumValue("additionalCodingDescriptions")
    ADDITIONAL_CODING_DESCRIPTIONS("additionalCodingDescriptions"),
    @XmlEnumValue("firstMonthForecast")
    FIRST_MONTH_FORECAST("firstMonthForecast"),
    @XmlEnumValue("firstMonthForecastLong")
    FIRST_MONTH_FORECAST_LONG("firstMonthForecastLong"),
    @XmlEnumValue("hangTags")
    HANG_TAGS("hangTags"),
    @XmlEnumValue("labelGroup")
    LABEL_GROUP("labelGroup"),
    @XmlEnumValue("labels")
    LABELS("labels"),
    @XmlEnumValue("marketingModelNames")
    MARKETING_MODEL_NAMES("marketingModelNames"),
    @XmlEnumValue("packages")
    PACKAGES("packages"),
    @XmlEnumValue("packageNames")
    PACKAGE_NAMES("packageNames"),
    @XmlEnumValue("productLevel")
    PRODUCT_LEVEL("productLevel"),
    @XmlEnumValue("referenceModelNumber")
    REFERENCE_MODEL_NUMBER("referenceModelNumber"),
    @XmlEnumValue("salesSizeScale")
    SALES_SIZE_SCALE("salesSizeScale"),
    @XmlEnumValue("salesSizeScaleCode")
    SALES_SIZE_SCALE_CODE("salesSizeScaleCode"),
    @XmlEnumValue("technologyComponents")
    TECHNOLOGY_COMPONENTS("technologyComponents"),
    @XmlEnumValue("developer")
    DEVELOPER("developer"),
    @XmlEnumValue("modelCreationSeason")
    MODEL_CREATION_SEASON("modelCreationSeason"),
    @XmlEnumValue("referenceModelName")
    REFERENCE_MODEL_NAME("referenceModelName"),
    @XmlEnumValue("sourceSystem")
    SOURCE_SYSTEM("sourceSystem"),
    @XmlEnumValue("widthProject")
    WIDTH_PROJECT("widthProject"),
    @XmlEnumValue("modelId")
    MODEL_ID("modelId"),
    @XmlEnumValue("seniorDesigner")
    SENIOR_DESIGNER("seniorDesigner"),
    @XmlEnumValue("seniorDeveloper")
    SENIOR_DEVELOPER("seniorDeveloper"),
    @XmlEnumValue("designer")
    DESIGNER("designer"),
    @XmlEnumValue("colorDesigner")
    COLOR_DESIGNER("colorDesigner"),
    @XmlEnumValue("changeRequestFlag")
    CHANGE_REQUEST_FLAG("changeRequestFlag"),
    @XmlEnumValue("activeChangeRequestFlag")
    ACTIVE_CHANGE_REQUEST_FLAG("activeChangeRequestFlag"),
    @XmlEnumValue("macroModelId")
    MACRO_MODEL_ID("macroModelId"),
    @XmlEnumValue("errorFlag")
    ERROR_FLAG("errorFlag"),
    @XmlEnumValue("errorSource")
    ERROR_SOURCE("errorSource"),
    @XmlEnumValue("refLifeCycleStatusCode")
    REF_LIFE_CYCLE_STATUS_CODE("refLifeCycleStatusCode");
    private final String value;

    ModelAttrNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModelAttrNames fromValue(String v) {
        for (ModelAttrNames c: ModelAttrNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
