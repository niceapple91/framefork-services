
package com.adidas.sef.ws.schema.range;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getRangesWithSubsetAttrResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRangesWithSubsetAttrResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rangePlanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rangeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRangesWithSubsetAttrResponse", propOrder = {
    "rangePlanId",
    "rangeName",
    "seasonCode",
    "mrktDepartment",
    "dbTimeStamp"
})
public class GetRangesWithSubsetAttrResponse {

    protected long rangePlanId;
    protected String rangeName;
    protected String seasonCode;
    protected String mrktDepartment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dbTimeStamp;

    /**
     * Gets the value of the rangePlanId property.
     * 
     */
    public long getRangePlanId() {
        return rangePlanId;
    }

    /**
     * Sets the value of the rangePlanId property.
     * 
     */
    public void setRangePlanId(long value) {
        this.rangePlanId = value;
    }

    /**
     * Gets the value of the rangeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeName() {
        return rangeName;
    }

    /**
     * Sets the value of the rangeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeName(String value) {
        this.rangeName = value;
    }

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
     * Gets the value of the mrktDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrktDepartment() {
        return mrktDepartment;
    }

    /**
     * Sets the value of the mrktDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrktDepartment(String value) {
        this.mrktDepartment = value;
    }

    /**
     * Gets the value of the dbTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDbTimeStamp() {
        return dbTimeStamp;
    }

    /**
     * Sets the value of the dbTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDbTimeStamp(XMLGregorianCalendar value) {
        this.dbTimeStamp = value;
    }

}
