
package com.adidas.sef.ws.schema.range;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRangeRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRangeRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ranges" type="{http://www.adidas.com/sef/ws/schema/range}Ranges" minOccurs="0"/>
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
@XmlType(name = "updateRangeRequests", propOrder = {
    "userName",
    "ranges",
    "businessProcess",
    "consumer"
})
public class UpdateRangeRequests {

    @XmlElement(required = true)
    protected String userName;
    protected Ranges ranges;
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
     * Gets the value of the ranges property.
     * 
     * @return
     *     possible object is
     *     {@link Ranges }
     *     
     */
    public Ranges getRanges() {
        return ranges;
    }

    /**
     * Sets the value of the ranges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ranges }
     *     
     */
    public void setRanges(Ranges value) {
        this.ranges = value;
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
