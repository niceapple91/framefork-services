
package com.adidas.sef.ws.schema.range;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.RangeAttrsResponseBase;


/**
 * <p>Java class for getRangesByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRangesByIdResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.adidas.com/sef/ws/schema/common}rangeAttrsResponseBase">
 *       &lt;sequence>
 *         &lt;element name="rangePlanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalModelCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalArticleCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rangeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRangesByIdResponse", propOrder = {
    "rangePlanId",
    "totalModelCnt",
    "totalArticleCnt",
    "rangeNumber"
})
public class GetRangesByIdResponse
    extends RangeAttrsResponseBase
{

    protected long rangePlanId;
    protected Long totalModelCnt;
    protected Long totalArticleCnt;
    @XmlElement(required = true)
    protected String rangeNumber;

    /**
     * Gets the value of the rangePlanId property.
     * 
     */
    public long getRangePlanId() {
        return rangePlanId;
    }

    /**
     * Sets the value of the rangePlanId property.
     * 
     */
    public void setRangePlanId(long value) {
        this.rangePlanId = value;
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
