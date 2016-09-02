
package com.adidas.sef.ws.schema.range;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTechRangeIdRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTechRangeIdRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rangeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTechRangeIdRequest", propOrder = {
    "seasonCode",
    "rangeNumber"
})
public class GetTechRangeIdRequest {

    @XmlElement(required = true)
    protected String seasonCode;
    @XmlElement(required = true)
    protected String rangeNumber;

    /**
     * Gets the value of the seasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonCode() {
        return seasonCode;
    }

    /**
     * Sets the value of the seasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonCode(String value) {
        this.seasonCode = value;
    }

    /**
     * Gets the value of the rangeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeNumber() {
        return rangeNumber;
    }

    /**
     * Sets the value of the rangeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeNumber(String value) {
        this.rangeNumber = value;
    }

}
