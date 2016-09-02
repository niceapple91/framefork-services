
package com.adidas.sef.ws.schema.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.Errors;


/**
 * <p>Java class for getModelRangeAttrsByIdResponses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getModelRangeAttrsByIdResponses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getModelRangeAttrsResponse" type="{http://www.adidas.com/sef/ws/schema/model}getModelRangeAttrsResponse" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getModelRangeAttrsByIdResponses", propOrder = {
    "getModelRangeAttrsResponse",
    "errors",
    "dbTimeStamp"
})
public class GetModelRangeAttrsByIdResponses {

    @XmlElement(nillable = true)
    protected List<GetModelRangeAttrsResponse> getModelRangeAttrsResponse;
    protected Errors errors;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dbTimeStamp;

    /**
     * Gets the value of the getModelRangeAttrsResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getModelRangeAttrsResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetModelRangeAttrsResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetModelRangeAttrsResponse }
     * 
     * 
     */
    public List<GetModelRangeAttrsResponse> getGetModelRangeAttrsResponse() {
        if (getModelRangeAttrsResponse == null) {
            getModelRangeAttrsResponse = new ArrayList<GetModelRangeAttrsResponse>();
        }
        return this.getModelRangeAttrsResponse;
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
