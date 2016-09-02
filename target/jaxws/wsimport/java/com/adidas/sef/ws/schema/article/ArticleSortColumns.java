
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for articleSortColumns.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="articleSortColumns">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATIONDATE"/>
 *     &lt;enumeration value="SPLECIALUSAGE"/>
 *     &lt;enumeration value="RETLINTRODATE"/>
 *     &lt;enumeration value="ACTFOB"/>
 *     &lt;enumeration value="RRP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "articleSortColumns")
@XmlEnum
public enum ArticleSortColumns {

    CREATIONDATE,
    SPLECIALUSAGE,
    RETLINTRODATE,
    ACTFOB,
    RRP;

    public String value() {
        return name();
    }

    public static ArticleSortColumns fromValue(String v) {
        return valueOf(v);
    }

}
