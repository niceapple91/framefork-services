
package com.adidas.sef.ws.schema.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="userRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyModel" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="rangePlanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="copyArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "userRole",
    "copyModel",
    "businessProcess",
    "consumer"
})
@XmlRootElement(name = "copyModelRequests")
public class CopyModelRequests {

    @XmlElement(required = true, nillable = true)
    protected String userName;
    @XmlElementRef(name = "userRole", type = JAXBElement.class)
    protected JAXBElement<String> userRole;
    @XmlElement(required = true)
    protected List<CopyModelRequests.CopyModel> copyModel;
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
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserRole(JAXBElement<String> value) {
        this.userRole = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copyModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopyModelRequests.CopyModel }
     * 
     * 
     */
    public List<CopyModelRequests.CopyModel> getCopyModel() {
        if (copyModel == null) {
            copyModel = new ArrayList<CopyModelRequests.CopyModel>();
        }
        return this.copyModel;
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
     *         &lt;element name="copyArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "copyArticles"
    })
    public static class CopyModel {

        @XmlElement(required = true, type = Long.class, nillable = true)
        protected Long modelRangeId;
        @XmlElement(required = true, type = Long.class, nillable = true)
        protected Long rangePlanId;
        protected String productManagerName;
        @XmlElement(required = true, nillable = true)
        protected String copyArticles;

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
         * Gets the value of the copyArticles property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCopyArticles() {
            return copyArticles;
        }

        /**
         * Sets the value of the copyArticles property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCopyArticles(String value) {
            this.copyArticles = value;
        }

    }

}
