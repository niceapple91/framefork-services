
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.Errors;
import com.adidas.sef.ws.schema.common.RespSummary;
import com.adidas.sef.ws.schema.common.Summary;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summary" type="{http://www.adidas.com/sef/ws/schema/common}summary"/>
 *         &lt;element name="successResponse" type="{http://www.adidas.com/sef/ws/schema/common}respSummary" minOccurs="0"/>
 *         &lt;element name="errorResponse" type="{http://www.adidas.com/sef/ws/schema/common}errors" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "summary",
    "successResponse",
    "errorResponse",
    "dbTimeStamp"
})
@XmlRootElement(name = "moveModelResponse")
public class MoveModelResponse {

    @XmlElement(required = true)
    protected Summary summary;
    protected RespSummary successResponse;
    protected Errors errorResponse;
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
     * Gets the value of the successResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RespSummary }
     *     
     */
    public RespSummary getSuccessResponse() {
        return successResponse;
    }

    /**
     * Sets the value of the successResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSummary }
     *     
     */
    public void setSuccessResponse(RespSummary value) {
        this.successResponse = value;
    }

    /**
     * Gets the value of the errorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the value of the errorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrorResponse(Errors value) {
        this.errorResponse = value;
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
