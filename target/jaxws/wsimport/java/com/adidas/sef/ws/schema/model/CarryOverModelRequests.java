
package com.adidas.sef.ws.schema.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.AdditionalCodings;


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
 *         &lt;element name="carryOverModel" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="rangePlanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="carryOverArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="additionalCodings" type="{http://www.adidas.com/sef/ws/schema/common}additionalCodings" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "carryOverModel",
    "businessProcess",
    "consumer"
})
@XmlRootElement(name = "carryOverModelRequests")
public class CarryOverModelRequests {

    @XmlElement(required = true, nillable = true)
    protected String userName;
    @XmlElement(required = true)
    protected List<CarryOverModelRequests.CarryOverModel> carryOverModel;
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
     * Gets the value of the carryOverModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOverModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOverModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarryOverModelRequests.CarryOverModel }
     * 
     * 
     */
    public List<CarryOverModelRequests.CarryOverModel> getCarryOverModel() {
        if (carryOverModel == null) {
            carryOverModel = new ArrayList<CarryOverModelRequests.CarryOverModel>();
        }
        return this.carryOverModel;
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
     *         &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="rangePlanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="carryOverArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="additionalCodings" type="{http://www.adidas.com/sef/ws/schema/common}additionalCodings" minOccurs="0"/>
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
        "modelRangeId",
        "rangePlanId",
        "productManagerName",
        "carryOverArticles",
        "additionalCodings"
    })
    public static class CarryOverModel {

        @XmlElement(required = true, type = Long.class, nillable = true)
        protected Long modelRangeId;
        @XmlElement(required = true, type = Long.class, nillable = true)
        protected Long rangePlanId;
        protected String productManagerName;
        @XmlElement(required = true, nillable = true)
        protected String carryOverArticles;
        protected AdditionalCodings additionalCodings;

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
         * Gets the value of the rangePlanId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRangePlanId() {
            return rangePlanId;
        }

        /**
         * Sets the value of the rangePlanId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRangePlanId(Long value) {
            this.rangePlanId = value;
        }

        /**
         * Gets the value of the productManagerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductManagerName() {
            return productManagerName;
        }

        /**
         * Sets the value of the productManagerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductManagerName(String value) {
            this.productManagerName = value;
        }

        /**
         * Gets the value of the carryOverArticles property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarryOverArticles() {
            return carryOverArticles;
        }

        /**
         * Sets the value of the carryOverArticles property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarryOverArticles(String value) {
            this.carryOverArticles = value;
        }

        /**
         * Gets the value of the additionalCodings property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalCodings }
         *     
         */
        public AdditionalCodings getAdditionalCodings() {
            return additionalCodings;
        }

        /**
         * Sets the value of the additionalCodings property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalCodings }
         *     
         */
        public void setAdditionalCodings(AdditionalCodings value) {
            this.additionalCodings = value;
        }

    }

}
