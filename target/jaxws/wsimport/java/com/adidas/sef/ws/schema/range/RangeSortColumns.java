
package com.adidas.sef.ws.schema.range;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rangeSortColumns.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rangeSortColumns">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rangeName"/>
 *     &lt;enumeration value="seasonCode"/>
 *     &lt;enumeration value="mrktDepartment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rangeSortColumns")
@XmlEnum
public enum RangeSortColumns {

    @XmlEnumValue("rangeName")
    RANGE_NAME("rangeName"),
    @XmlEnumValue("seasonCode")
    SEASON_CODE("seasonCode"),
    @XmlEnumValue("mrktDepartment")
    MRKT_DEPARTMENT("mrktDepartment");
    private final String value;

    RangeSortColumns(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeSortColumns fromValue(String v) {
        for (RangeSortColumns c: RangeSortColumns.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
