
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for macroModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="macroModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="midSoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="midSoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outSoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outSoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="silhouetteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="silhouetteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "macroModel", propOrder = {
    "midSoleId",
    "midSoleDescription",
    "outSoleId",
    "outSoleDescription",
    "silhouetteId",
    "silhouetteDescription"
})
public class MacroModel {

    protected String midSoleId;
    protected String midSoleDescription;
    protected String outSoleId;
    protected String outSoleDescription;
    protected String silhouetteId;
    protected String silhouetteDescription;

    /**
     * Gets the value of the midSoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidSoleId() {
        return midSoleId;
    }

    /**
     * Sets the value of the midSoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidSoleId(String value) {
        this.midSoleId = value;
    }

    /**
     * Gets the value of the midSoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidSoleDescription() {
        return midSoleDescription;
    }

    /**
     * Sets the value of the midSoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidSoleDescription(String value) {
        this.midSoleDescription = value;
    }

    /**
     * Gets the value of the outSoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoleId() {
        return outSoleId;
    }

    /**
     * Sets the value of the outSoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoleId(String value) {
        this.outSoleId = value;
    }

    /**
     * Gets the value of the outSoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoleDescription() {
        return outSoleDescription;
    }

    /**
     * Sets the value of the outSoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoleDescription(String value) {
        this.outSoleDescription = value;
    }

    /**
     * Gets the value of the silhouetteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilhouetteId() {
        return silhouetteId;
    }

    /**
     * Sets the value of the silhouetteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilhouetteId(String value) {
        this.silhouetteId = value;
    }

    /**
     * Gets the value of the silhouetteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilhouetteDescription() {
        return silhouetteDescription;
    }

    /**
     * Sets the value of the silhouetteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilhouetteDescription(String value) {
        this.silhouetteDescription = value;
    }

}
