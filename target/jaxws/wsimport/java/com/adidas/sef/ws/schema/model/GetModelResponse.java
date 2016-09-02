
package com.adidas.sef.ws.schema.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.ModelAttrsResponseBase;


/**
 * <p>Java class for getModelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getModelResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.adidas.com/sef/ws/schema/common}modelAttrsResponseBase">
 *       &lt;sequence>
 *         &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="articleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plannedArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="onHoldArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="releasedArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dropArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getModelResponse", propOrder = {
    "modelRangeId",
    "brandCode",
    "subBrand",
    "modelCount",
    "articleCount",
    "plannedArticleCount",
    "onHoldArticleCount",
    "releasedArticleCount",
    "dropArticleCount"
})
public class GetModelResponse
    extends ModelAttrsResponseBase
{

    protected long modelRangeId;
    protected String brandCode;
    protected String subBrand;
    protected Long modelCount;
    protected Long articleCount;
    protected Long plannedArticleCount;
    protected Long onHoldArticleCount;
    protected Long releasedArticleCount;
    protected Long dropArticleCount;

    /**
     * Gets the value of the modelRangeId property.
     * 
     */
    public long getModelRangeId() {
        return modelRangeId;
    }

    /**
     * Sets the value of the modelRangeId property.
     * 
     */
    public void setModelRangeId(long value) {
        this.modelRangeId = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the subBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBrand() {
        return subBrand;
    }

    /**
     * Sets the value of the subBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBrand(String value) {
        this.subBrand = value;
    }

    /**
     * Gets the value of the modelCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModelCount() {
        return modelCount;
    }

    /**
     * Sets the value of the modelCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModelCount(Long value) {
        this.modelCount = value;
    }

    /**
     * Gets the value of the articleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArticleCount() {
        return articleCount;
    }

    /**
     * Sets the value of the articleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArticleCount(Long value) {
        this.articleCount = value;
    }

    /**
     * Gets the value of the plannedArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlannedArticleCount() {
        return plannedArticleCount;
    }

    /**
     * Sets the value of the plannedArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlannedArticleCount(Long value) {
        this.plannedArticleCount = value;
    }

    /**
     * Gets the value of the onHoldArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnHoldArticleCount() {
        return onHoldArticleCount;
    }

    /**
     * Sets the value of the onHoldArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnHoldArticleCount(Long value) {
        this.onHoldArticleCount = value;
    }

    /**
     * Gets the value of the releasedArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReleasedArticleCount() {
        return releasedArticleCount;
    }

    /**
     * Sets the value of the releasedArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReleasedArticleCount(Long value) {
        this.releasedArticleCount = value;
    }

    /**
     * Gets the value of the dropArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDropArticleCount() {
        return dropArticleCount;
    }

    /**
     * Sets the value of the dropArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDropArticleCount(Long value) {
        this.dropArticleCount = value;
    }

}
