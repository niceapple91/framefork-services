
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for releaseModelRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="releaseModelRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelRangeIds" type="{http://www.adidas.com/sef/ws/schema/model}modelRangeIds"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="releaseArticles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "releaseModelRequests", propOrder = {
    "modelRangeIds",
    "userName",
    "releaseArticles",
    "businessProcess",
    "consumer"
})
public class ReleaseModelRequests {

    @XmlElement(required = true)
    protected ModelRangeIds modelRangeIds;
    @XmlElement(required = true)
    protected String userName;
    protected String releaseArticles;
    protected String businessProcess;
    @XmlElement(required = true)
    protected String consumer;

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
     * Gets the value of the releaseArticles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseArticles() {
        return releaseArticles;
    }

    /**
     * Sets the value of the releaseArticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseArticles(String value) {
        this.releaseArticles = value;
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
