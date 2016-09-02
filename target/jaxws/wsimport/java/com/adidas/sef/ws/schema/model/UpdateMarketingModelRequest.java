
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
 *         &lt;element name="marketingModelOldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketingModelNewName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "marketingModelOldName",
    "marketingModelNewName",
    "consumer",
    "businessProcess"
})
@XmlRootElement(name = "updateMarketingModelRequest")
public class UpdateMarketingModelRequest {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String marketingModelOldName;
    @XmlElement(required = true)
    protected String marketingModelNewName;
    @XmlElement(required = true)
    protected String consumer;
    protected String businessProcess;

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
     * Gets the value of the marketingModelOldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingModelOldName() {
        return marketingModelOldName;
    }

    /**
     * Sets the value of the marketingModelOldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingModelOldName(String value) {
        this.marketingModelOldName = value;
    }

    /**
     * Gets the value of the marketingModelNewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingModelNewName() {
        return marketingModelNewName;
    }

    /**
     * Sets the value of the marketingModelNewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingModelNewName(String value) {
        this.marketingModelNewName = value;
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

}
