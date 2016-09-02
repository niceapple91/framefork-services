
package com.adidas.sef.ws.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreviousValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProposedValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeInfo", propOrder = {
    "objectType",
    "objectNumber",
    "attributeName",
    "previousValue",
    "proposedValue"
})
public class ChangeInfo {

    @XmlElement(name = "ObjectType", required = true)
    protected String objectType;
    @XmlElement(name = "ObjectNumber")
    protected String objectNumber;
    @XmlElement(name = "AttributeName", required = true)
    protected String attributeName;
    @XmlElement(name = "PreviousValue", required = true)
    protected String previousValue;
    @XmlElement(name = "ProposedValue", required = true)
    protected String proposedValue;

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNumber() {
        return objectNumber;
    }

    /**
     * Sets the value of the objectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNumber(String value) {
        this.objectNumber = value;
    }

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the previousValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousValue() {
        return previousValue;
    }

    /**
     * Sets the value of the previousValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousValue(String value) {
        this.previousValue = value;
    }

    /**
     * Gets the value of the proposedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposedValue() {
        return proposedValue;
    }

    /**
     * Sets the value of the proposedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposedValue(String value) {
        this.proposedValue = value;
    }

}
