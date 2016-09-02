
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getModelsWithFullAttrRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getModelsWithFullAttrRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getModelRequest" type="{http://www.adidas.com/sef/ws/schema/model}getModelRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getModelsWithFullAttrRequest", propOrder = {
    "getModelRequest"
})
public class GetModelsWithFullAttrRequest {

    @XmlElement(required = true)
    protected GetModelRequest getModelRequest;

    /**
     * Gets the value of the getModelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetModelRequest }
     *     
     */
    public GetModelRequest getGetModelRequest() {
        return getModelRequest;
    }

    /**
     * Sets the value of the getModelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetModelRequest }
     *     
     */
    public void setGetModelRequest(GetModelRequest value) {
        this.getModelRequest = value;
    }

}
