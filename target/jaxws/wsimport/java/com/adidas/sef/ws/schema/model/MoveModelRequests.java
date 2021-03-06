
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
 *         &lt;element name="toRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="modelRangeIds" type="{http://www.adidas.com/sef/ws/schema/model}modelRangeIds"/>
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
@XmlType(name = "", propOrder = {
    "userName",
    "toRangeId",
    "modelRangeIds",
    "businessProcess",
    "consumer"
})
@XmlRootElement(name = "moveModelRequests")
public class MoveModelRequests {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long toRangeId;
    @XmlElement(required = true)
    protected ModelRangeIds modelRangeIds;
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
     * Gets the value of the toRangeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getToRangeId() {
        return toRangeId;
    }

    /**
     * Sets the value of the toRangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setToRangeId(Long value) {
        this.toRangeId = value;
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
