
package com.adidas.sef.ws.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rangeAttrNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rangeAttrNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="quarter"/>
 *     &lt;enumeration value="targetGoInMarginPct"/>
 *     &lt;enumeration value="targetNetSalesAmount"/>
 *     &lt;enumeration value="targetVolumeUnits"/>
 *     &lt;enumeration value="targetModelCount"/>
 *     &lt;enumeration value="targetArticleCount"/>
 *     &lt;enumeration value="actGoInMarginPct"/>
 *     &lt;enumeration value="actNetSalesAmnt"/>
 *     &lt;enumeration value="actMrktForecast"/>
 *     &lt;enumeration value="actBuyingVolume"/>
 *     &lt;enumeration value="actModelCnt"/>
 *     &lt;enumeration value="actArticleCnt"/>
 *     &lt;enumeration value="newModelCnt"/>
 *     &lt;enumeration value="carryOverModelCnt"/>
 *     &lt;enumeration value="newArticleCnt"/>
 *     &lt;enumeration value="carryOverArticleCnt"/>
 *     &lt;enumeration value="confidentialList"/>
 *     &lt;enumeration value="confidentialFlag"/>
 *     &lt;enumeration value="newClrArticleCnt"/>
 *     &lt;enumeration value="mrktDepartment"/>
 *     &lt;enumeration value="rangeName"/>
 *     &lt;enumeration value="creationDate"/>
 *     &lt;enumeration value="rangePlanId"/>
 *     &lt;enumeration value="seasonCode"/>
 *     &lt;enumeration value="productDivision"/>
 *     &lt;enumeration value="totalModelCnt"/>
 *     &lt;enumeration value="totalArticleCnt"/>
 *     &lt;enumeration value="brandCode"/>
 *     &lt;enumeration value="rangeStatus"/>
 *     &lt;enumeration value="targetSilhouetteCount"/>
 *     &lt;enumeration value="targetToolingCount"/>
 *     &lt;enumeration value="actualSilhouetteCount"/>
 *     &lt;enumeration value="actualToolingCount"/>
 *     &lt;enumeration value="rangeNumber"/>
 *     &lt;enumeration value="subBrand"/>
 *     &lt;enumeration value="startDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rangeAttrNames")
@XmlEnum
public enum RangeAttrNames {

    @XmlEnumValue("quarter")
    QUARTER("quarter"),
    @XmlEnumValue("targetGoInMarginPct")
    TARGET_GO_IN_MARGIN_PCT("targetGoInMarginPct"),
    @XmlEnumValue("targetNetSalesAmount")
    TARGET_NET_SALES_AMOUNT("targetNetSalesAmount"),
    @XmlEnumValue("targetVolumeUnits")
    TARGET_VOLUME_UNITS("targetVolumeUnits"),
    @XmlEnumValue("targetModelCount")
    TARGET_MODEL_COUNT("targetModelCount"),
    @XmlEnumValue("targetArticleCount")
    TARGET_ARTICLE_COUNT("targetArticleCount"),
    @XmlEnumValue("actGoInMarginPct")
    ACT_GO_IN_MARGIN_PCT("actGoInMarginPct"),
    @XmlEnumValue("actNetSalesAmnt")
    ACT_NET_SALES_AMNT("actNetSalesAmnt"),
    @XmlEnumValue("actMrktForecast")
    ACT_MRKT_FORECAST("actMrktForecast"),
    @XmlEnumValue("actBuyingVolume")
    ACT_BUYING_VOLUME("actBuyingVolume"),
    @XmlEnumValue("actModelCnt")
    ACT_MODEL_CNT("actModelCnt"),
    @XmlEnumValue("actArticleCnt")
    ACT_ARTICLE_CNT("actArticleCnt"),
    @XmlEnumValue("newModelCnt")
    NEW_MODEL_CNT("newModelCnt"),
    @XmlEnumValue("carryOverModelCnt")
    CARRY_OVER_MODEL_CNT("carryOverModelCnt"),
    @XmlEnumValue("newArticleCnt")
    NEW_ARTICLE_CNT("newArticleCnt"),
    @XmlEnumValue("carryOverArticleCnt")
    CARRY_OVER_ARTICLE_CNT("carryOverArticleCnt"),
    @XmlEnumValue("confidentialList")
    CONFIDENTIAL_LIST("confidentialList"),
    @XmlEnumValue("confidentialFlag")
    CONFIDENTIAL_FLAG("confidentialFlag"),
    @XmlEnumValue("newClrArticleCnt")
    NEW_CLR_ARTICLE_CNT("newClrArticleCnt"),
    @XmlEnumValue("mrktDepartment")
    MRKT_DEPARTMENT("mrktDepartment"),
    @XmlEnumValue("rangeName")
    RANGE_NAME("rangeName"),
    @XmlEnumValue("creationDate")
    CREATION_DATE("creationDate"),
    @XmlEnumValue("rangePlanId")
    RANGE_PLAN_ID("rangePlanId"),
    @XmlEnumValue("seasonCode")
    SEASON_CODE("seasonCode"),
    @XmlEnumValue("productDivision")
    PRODUCT_DIVISION("productDivision"),
    @XmlEnumValue("totalModelCnt")
    TOTAL_MODEL_CNT("totalModelCnt"),
    @XmlEnumValue("totalArticleCnt")
    TOTAL_ARTICLE_CNT("totalArticleCnt"),
    @XmlEnumValue("brandCode")
    BRAND_CODE("brandCode"),
    @XmlEnumValue("rangeStatus")
    RANGE_STATUS("rangeStatus"),
    @XmlEnumValue("targetSilhouetteCount")
    TARGET_SILHOUETTE_COUNT("targetSilhouetteCount"),
    @XmlEnumValue("targetToolingCount")
    TARGET_TOOLING_COUNT("targetToolingCount"),
    @XmlEnumValue("actualSilhouetteCount")
    ACTUAL_SILHOUETTE_COUNT("actualSilhouetteCount"),
    @XmlEnumValue("actualToolingCount")
    ACTUAL_TOOLING_COUNT("actualToolingCount"),
    @XmlEnumValue("rangeNumber")
    RANGE_NUMBER("rangeNumber"),
    @XmlEnumValue("subBrand")
    SUB_BRAND("subBrand"),
    @XmlEnumValue("startDate")
    START_DATE("startDate");
    private final String value;

    RangeAttrNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeAttrNames fromValue(String v) {
        for (RangeAttrNames c: RangeAttrNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
