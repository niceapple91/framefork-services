
package com.adidas.sef.ws.schema.range;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRangeNullAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updateRangeNullAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="targetGoInMarginPct"/>
 *     &lt;enumeration value="targetNetSalesAmount"/>
 *     &lt;enumeration value="targetVolumeUnits"/>
 *     &lt;enumeration value="targetModelCount"/>
 *     &lt;enumeration value="targetArticleCount"/>
 *     &lt;enumeration value="productManagers"/>
 *     &lt;enumeration value="targetSilhouetteCount"/>
 *     &lt;enumeration value="targetToolingCount"/>
 *     &lt;enumeration value="brandCode"/>
 *     &lt;enumeration value="mrktDepartment"/>
 *     &lt;enumeration value="productDivision"/>
 *     &lt;enumeration value="seasonCode"/>
 *     &lt;enumeration value="confidentialFlag"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updateRangeNullAttribute")
@XmlEnum
public enum UpdateRangeNullAttribute {

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
    @XmlEnumValue("productManagers")
    PRODUCT_MANAGERS("productManagers"),
    @XmlEnumValue("targetSilhouetteCount")
    TARGET_SILHOUETTE_COUNT("targetSilhouetteCount"),
    @XmlEnumValue("targetToolingCount")
    TARGET_TOOLING_COUNT("targetToolingCount"),
    @XmlEnumValue("brandCode")
    BRAND_CODE("brandCode"),
    @XmlEnumValue("mrktDepartment")
    MRKT_DEPARTMENT("mrktDepartment"),
    @XmlEnumValue("productDivision")
    PRODUCT_DIVISION("productDivision"),
    @XmlEnumValue("seasonCode")
    SEASON_CODE("seasonCode"),
    @XmlEnumValue("confidentialFlag")
    CONFIDENTIAL_FLAG("confidentialFlag");
    private final String value;

    UpdateRangeNullAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateRangeNullAttribute fromValue(String v) {
        for (UpdateRangeNullAttribute c: UpdateRangeNullAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
