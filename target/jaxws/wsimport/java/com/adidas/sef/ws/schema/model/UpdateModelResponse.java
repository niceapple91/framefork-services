
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
 * <p>Java class for updateModelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateModelResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summary" type="{http://www.adidas.com/sef/ws/schema/common}summary"/>
 *         &lt;element name="updateModelRespSummary" type="{http://www.adidas.com/sef/ws/schema/common}respSummary" minOccurs="0"/>
 *         &lt;element name="updateArticleRespSummary" type="{http://www.adidas.com/sef/ws/schema/common}respSummary" minOccurs="0"/>
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
@XmlType(name = "updateModelResponse", propOrder = {
    "summary",
    "updateModelRespSummary",
    "updateArticleRespSummary",
    "errors",
    "dbTimeStamp"
})
public class UpdateModelResponse {

    @XmlElement(required = true)
    protected Summary summary;
    protected RespSummary updateModelRespSummary;
    protected RespSummary updateArticleRespSummary;
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
     * Gets the value of the updateModelRespSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RespSummary }
     *     
     */
    public RespSummary getUpdateModelRespSummary() {
        return updateModelRespSummary;
    }

    /**
     * Sets the value of the updateModelRespSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSummary }
     *     
     */
    public void setUpdateModelRespSummary(RespSummary value) {
        this.updateModelRespSummary = value;
    }

    /**
     * Gets the value of the updateArticleRespSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RespSummary }
     *     
     */
    public RespSummary getUpdateArticleRespSummary() {
        return updateArticleRespSummary;
    }

    /**
     * Sets the value of the updateArticleRespSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSummary }
     *     
     */
    public void setUpdateArticleRespSummary(RespSummary value) {
        this.updateArticleRespSummary = value;
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
