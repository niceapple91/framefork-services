
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.Errors;
import com.adidas.sef.ws.schema.common.RespSummary;
import com.adidas.sef.ws.schema.common.Summary;


/**
 * <p>Java class for releaseModelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="releaseModelResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summary" type="{http://www.adidas.com/sef/ws/schema/common}summary"/>
 *         &lt;element name="releaseModelResSummary" type="{http://www.adidas.com/sef/ws/schema/common}respSummary" minOccurs="0"/>
 *         &lt;element name="releaseArticleResSummary" type="{http://www.adidas.com/sef/ws/schema/common}respSummary" minOccurs="0"/>
 *         &lt;element name="releaseRangeResSummary" type="{http://www.adidas.com/sef/ws/schema/common}respSummary" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://www.adidas.com/sef/ws/schema/common}errors" minOccurs="0"/>
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
@XmlType(name = "releaseModelResponse", propOrder = {
    "summary",
    "releaseModelResSummary",
    "releaseArticleResSummary",
    "releaseRangeResSummary",
    "errors",
    "dbTimeStamp"
})
public class ReleaseModelResponse {

    @XmlElement(required = true)
    protected Summary summary;
    protected RespSummary releaseModelResSummary;
    protected RespSummary releaseArticleResSummary;
    protected RespSummary releaseRangeResSummary;
    protected Errors errors;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dbTimeStamp;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Summary }
     *     
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary }
     *     
     */
    public void setSummary(Summary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the releaseModelResSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RespSummary }
     *     
     */
    public RespSummary getReleaseModelResSummary() {
        return releaseModelResSummary;
    }

    /**
     * Sets the value of the releaseModelResSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSummary }
     *     
     */
    public void setReleaseModelResSummary(RespSummary value) {
        this.releaseModelResSummary = value;
    }

    /**
     * Gets the value of the releaseArticleResSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RespSummary }
     *     
     */
    public RespSummary getReleaseArticleResSummary() {
        return releaseArticleResSummary;
    }

    /**
     * Sets the value of the releaseArticleResSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSummary }
     *     
     */
    public void setReleaseArticleResSummary(RespSummary value) {
        this.releaseArticleResSummary = value;
    }

    /**
     * Gets the value of the releaseRangeResSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RespSummary }
     *     
     */
    public RespSummary getReleaseRangeResSummary() {
        return releaseRangeResSummary;
    }

    /**
     * Sets the value of the releaseRangeResSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSummary }
     *     
     */
    public void setReleaseRangeResSummary(RespSummary value) {
        this.releaseRangeResSummary = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
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
