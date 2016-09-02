
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numberOfModels" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "", propOrder = {
    "userName",
    "modelRangeId",
    "numberOfModels",
    "consumer"
})
@XmlRootElement(name = "duplicateModelRequest")
public class DuplicateModelRequest {

    @XmlElement(required = true, nillable = true)
    protected String userName;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long modelRangeId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long numberOfModels;
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
     * Gets the value of the modelRangeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModelRangeId() {
        return modelRangeId;
    }

    /**
     * Sets the value of the modelRangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModelRangeId(Long value) {
        this.modelRangeId = value;
    }

    /**
     * Gets the value of the numberOfModels property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfModels() {
        return numberOfModels;
    }

    /**
     * Sets the value of the numberOfModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfModels(Long value) {
        this.numberOfModels = value;
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
