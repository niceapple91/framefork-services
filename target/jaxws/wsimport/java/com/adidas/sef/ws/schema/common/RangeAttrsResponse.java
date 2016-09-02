
package com.adidas.sef.ws.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rangeAttrsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rangeAttrsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.adidas.com/sef/ws/schema/common}rangeAttrsResponseBase">
 *       &lt;sequence>
 *         &lt;element name="rangePlanId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rangeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalModelCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalArticleCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rangeAttrsResponse", propOrder = {
    "rangePlanId",
    "rangeNumber",
    "totalModelCnt",
    "totalArticleCnt"
})
public class RangeAttrsResponse
    extends RangeAttrsResponseBase
{

    protected Long rangePlanId;
    protected String rangeNumber;
    protected Long totalModelCnt;
    protected Long totalArticleCnt;

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

    /**
     * Gets the value of the totalModelCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalModelCnt() {
        return totalModelCnt;
    }

    /**
     * Sets the value of the totalModelCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalModelCnt(Long value) {
        this.totalModelCnt = value;
    }

    /**
     * Gets the value of the totalArticleCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalArticleCnt() {
        return totalArticleCnt;
    }

    /**
     * Sets the value of the totalArticleCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalArticleCnt(Long value) {
        this.totalArticleCnt = value;
    }

}
