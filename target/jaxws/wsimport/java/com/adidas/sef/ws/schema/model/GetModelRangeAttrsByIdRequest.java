
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getModelRangeAttrsByIdRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getModelRangeAttrsByIdRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelRangeIds" type="{http://www.adidas.com/sef/ws/schema/model}modelRangeIds"/>
 *         &lt;element name="requiredAttributes" type="{http://www.adidas.com/sef/ws/schema/model}requiredAttributes"/>
 *         &lt;element name="businessProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getModelRangeAttrsByIdRequest", propOrder = {
    "userName",
    "modelRangeIds",
    "requiredAttributes",
    "businessProcess",
    "consumer"
})
public class GetModelRangeAttrsByIdRequest {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected ModelRangeIds modelRangeIds;
    @XmlElement(required = true)
    protected RequiredAttributes requiredAttributes;
    protected String businessProcess;
    @XmlElement(required = true)
    protected String consumer;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the modelRangeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ModelRangeIds }
     *     
     */
    public ModelRangeIds getModelRangeIds() {
        return modelRangeIds;
    }

    /**
     * Sets the value of the modelRangeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelRangeIds }
     *     
     */
    public void setModelRangeIds(ModelRangeIds value) {
        this.modelRangeIds = value;
    }

    /**
     * Gets the value of the requiredAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredAttributes }
     *     
     */
    public RequiredAttributes getRequiredAttributes() {
        return requiredAttributes;
    }

    /**
     * Sets the value of the requiredAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredAttributes }
     *     
     */
    public void setRequiredAttributes(RequiredAttributes value) {
        this.requiredAttributes = value;
    }

    /**
     * Gets the value of the businessProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProcess() {
        return businessProcess;
    }

    /**
     * Sets the value of the businessProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProcess(String value) {
        this.businessProcess = value;
    }

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumer(String value) {
        this.consumer = value;
    }

}
