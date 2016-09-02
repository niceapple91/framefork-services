
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requiredAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requiredAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeNames" type="{http://www.adidas.com/sef/ws/schema/article}articleModelRangeAttrNames" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requiredAttributes", propOrder = {
    "all",
    "attributeNames"
})
public class RequiredAttributes {

    protected String all;
    protected ArticleModelRangeAttrNames attributeNames;

    /**
     * Gets the value of the all property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAll(String value) {
        this.all = value;
    }

    /**
     * Gets the value of the attributeNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleModelRangeAttrNames }
     *     
     */
    public ArticleModelRangeAttrNames getAttributeNames() {
        return attributeNames;
    }

    /**
     * Sets the value of the attributeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleModelRangeAttrNames }
     *     
     */
    public void setAttributeNames(ArticleModelRangeAttrNames value) {
        this.attributeNames = value;
    }

}
