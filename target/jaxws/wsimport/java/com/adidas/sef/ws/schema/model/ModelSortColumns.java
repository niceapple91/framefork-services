
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modelSortColumns.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="modelSortColumns">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="creationDate"/>
 *     &lt;enumeration value="modelName"/>
 *     &lt;enumeration value="workingNumber"/>
 *     &lt;enumeration value="targetFOB"/>
 *     &lt;enumeration value="rrp"/>
 *     &lt;enumeration value="mrktForecast"/>
 *     &lt;enumeration value="retailIntroDate"/>
 *     &lt;enumeration value="buyingVolumeUnit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modelSortColumns")
@XmlEnum
public enum ModelSortColumns {

    @XmlEnumValue("creationDate")
    CREATION_DATE("creationDate"),
    @XmlEnumValue("modelName")
    MODEL_NAME("modelName"),
    @XmlEnumValue("workingNumber")
    WORKING_NUMBER("workingNumber"),
    @XmlEnumValue("targetFOB")
    TARGET_FOB("targetFOB"),
    @XmlEnumValue("rrp")
    RRP("rrp"),
    @XmlEnumValue("mrktForecast")
    MRKT_FORECAST("mrktForecast"),
    @XmlEnumValue("retailIntroDate")
    RETAIL_INTRO_DATE("retailIntroDate"),
    @XmlEnumValue("buyingVolumeUnit")
    BUYING_VOLUME_UNIT("buyingVolumeUnit");
    private final String value;

    ModelSortColumns(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModelSortColumns fromValue(String v) {
        for (ModelSortColumns c: ModelSortColumns.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
