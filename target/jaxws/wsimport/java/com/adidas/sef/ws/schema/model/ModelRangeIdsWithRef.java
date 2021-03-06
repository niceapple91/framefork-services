
package com.adidas.sef.ws.schema.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for modelRangeIdsWithRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelRangeIdsWithRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelRangeId" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
 *                 &lt;attribute name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="identifierType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="identifierValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelRangeIdsWithRef", propOrder = {
    "modelRangeId"
})
public class ModelRangeIdsWithRef {

    @XmlElement(nillable = true)
    protected List<ModelRangeIdsWithRef.ModelRangeId> modelRangeId;

    /**
     * Gets the value of the modelRangeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelRangeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelRangeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelRangeIdsWithRef.ModelRangeId }
     * 
     * 
     */
    public List<ModelRangeIdsWithRef.ModelRangeId> getModelRangeId() {
        if (modelRangeId == null) {
            modelRangeId = new ArrayList<ModelRangeIdsWithRef.ModelRangeId>();
        }
        return this.modelRangeId;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
     *       &lt;attribute name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="identifierType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="identifierValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ModelRangeId {

        @XmlValue
        protected long value;
        @XmlAttribute
        protected String seasonCode;
        @XmlAttribute
        protected String identifierType;
        @XmlAttribute
        protected String identifierValue;

        /**
         * Gets the value of the value property.
         * 
         */
        public long getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(long value) {
            this.value = value;
        }

        /**
         * Gets the value of the seasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeasonCode() {
            return seasonCode;
        }

        /**
         * Sets the value of the seasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeasonCode(String value) {
            this.seasonCode = value;
        }

        /**
         * Gets the value of the identifierType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifierType() {
            return identifierType;
        }

        /**
         * Sets the value of the identifierType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifierType(String value) {
            this.identifierType = value;
        }

        /**
         * Gets the value of the identifierValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifierValue() {
            return identifierValue;
        }

        /**
         * Sets the value of the identifierValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifierValue(String value) {
            this.identifierValue = value;
        }

    }

}
