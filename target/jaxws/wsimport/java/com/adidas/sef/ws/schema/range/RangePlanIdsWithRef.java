
package com.adidas.sef.ws.schema.range;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for rangePlanIdsWithRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rangePlanIdsWithRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rangePlanId" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
 *                 &lt;attribute name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="rangeNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "rangePlanIdsWithRef", propOrder = {
    "rangePlanId"
})
public class RangePlanIdsWithRef {

    @XmlElement(required = true)
    protected List<RangePlanIdsWithRef.RangePlanId> rangePlanId;

    /**
     * Gets the value of the rangePlanId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangePlanId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangePlanId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangePlanIdsWithRef.RangePlanId }
     * 
     * 
     */
    public List<RangePlanIdsWithRef.RangePlanId> getRangePlanId() {
        if (rangePlanId == null) {
            rangePlanId = new ArrayList<RangePlanIdsWithRef.RangePlanId>();
        }
        return this.rangePlanId;
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
     *       &lt;attribute name="rangeNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class RangePlanId {

        @XmlValue
        protected long value;
        @XmlAttribute
        protected String seasonCode;
        @XmlAttribute
        protected String rangeNumber;

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
         * Gets the value of the rangeNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangeNumber() {
            return rangeNumber;
        }

        /**
         * Sets the value of the rangeNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangeNumber(String value) {
            this.rangeNumber = value;
        }

    }

}
