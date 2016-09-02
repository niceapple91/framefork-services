
package com.adidas.sef.ws.schema.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getModelsWithSubsetAttrResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getModelsWithSubsetAttrResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="workingModelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gfr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ageGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="targetFOBCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="modelStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plannedArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="onHoldArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="releasedArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dropArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="buyingVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="indicativeGIM" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getModelsWithSubsetAttrResponse", propOrder = {
    "modelRangeId",
    "workingModelNo",
    "modelName",
    "developmentTypeCode",
    "gfr",
    "ageGroupCode",
    "targetFOB",
    "targetFOBCurrencyCode",
    "rrp",
    "rrpCurrencyCode",
    "retailIntroDate",
    "mrktForecast",
    "modelStatus",
    "totalArticleCount",
    "plannedArticleCount",
    "onHoldArticleCount",
    "releasedArticleCount",
    "dropArticleCount",
    "buyingVolumeUnit",
    "indicativeGIM"
})
public class GetModelsWithSubsetAttrResponse {

    protected long modelRangeId;
    protected String workingModelNo;
    protected String modelName;
    protected String developmentTypeCode;
    protected String gfr;
    protected String ageGroupCode;
    protected BigDecimal targetFOB;
    protected String targetFOBCurrencyCode;
    protected BigDecimal rrp;
    protected String rrpCurrencyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailIntroDate;
    protected BigDecimal mrktForecast;
    protected String modelStatus;
    protected Long totalArticleCount;
    protected Long plannedArticleCount;
    protected Long onHoldArticleCount;
    protected Long releasedArticleCount;
    protected Long dropArticleCount;
    protected BigDecimal buyingVolumeUnit;
    protected Double indicativeGIM;

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
     * Gets the value of the workingModelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingModelNo() {
        return workingModelNo;
    }

    /**
     * Sets the value of the workingModelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingModelNo(String value) {
        this.workingModelNo = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the developmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentTypeCode() {
        return developmentTypeCode;
    }

    /**
     * Sets the value of the developmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentTypeCode(String value) {
        this.developmentTypeCode = value;
    }

    /**
     * Gets the value of the gfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGfr() {
        return gfr;
    }

    /**
     * Sets the value of the gfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGfr(String value) {
        this.gfr = value;
    }

    /**
     * Gets the value of the ageGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeGroupCode() {
        return ageGroupCode;
    }

    /**
     * Sets the value of the ageGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeGroupCode(String value) {
        this.ageGroupCode = value;
    }

    /**
     * Gets the value of the targetFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetFOB() {
        return targetFOB;
    }

    /**
     * Sets the value of the targetFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetFOB(BigDecimal value) {
        this.targetFOB = value;
    }

    /**
     * Gets the value of the targetFOBCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFOBCurrencyCode() {
        return targetFOBCurrencyCode;
    }

    /**
     * Sets the value of the targetFOBCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFOBCurrencyCode(String value) {
        this.targetFOBCurrencyCode = value;
    }

    /**
     * Gets the value of the rrp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrp() {
        return rrp;
    }

    /**
     * Sets the value of the rrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrp(BigDecimal value) {
        this.rrp = value;
    }

    /**
     * Gets the value of the rrpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrpCurrencyCode() {
        return rrpCurrencyCode;
    }

    /**
     * Sets the value of the rrpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrpCurrencyCode(String value) {
        this.rrpCurrencyCode = value;
    }

    /**
     * Gets the value of the retailIntroDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetailIntroDate() {
        return retailIntroDate;
    }

    /**
     * Sets the value of the retailIntroDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetailIntroDate(XMLGregorianCalendar value) {
        this.retailIntroDate = value;
    }

    /**
     * Gets the value of the mrktForecast property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrktForecast() {
        return mrktForecast;
    }

    /**
     * Sets the value of the mrktForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMrktForecast(BigDecimal value) {
        this.mrktForecast = value;
    }

    /**
     * Gets the value of the modelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelStatus() {
        return modelStatus;
    }

    /**
     * Sets the value of the modelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelStatus(String value) {
        this.modelStatus = value;
    }

    /**
     * Gets the value of the totalArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalArticleCount() {
        return totalArticleCount;
    }

    /**
     * Sets the value of the totalArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalArticleCount(Long value) {
        this.totalArticleCount = value;
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

    /**
     * Gets the value of the buyingVolumeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyingVolumeUnit() {
        return buyingVolumeUnit;
    }

    /**
     * Sets the value of the buyingVolumeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyingVolumeUnit(BigDecimal value) {
        this.buyingVolumeUnit = value;
    }

    /**
     * Gets the value of the indicativeGIM property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIndicativeGIM() {
        return indicativeGIM;
    }

    /**
     * Sets the value of the indicativeGIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIndicativeGIM(Double value) {
        this.indicativeGIM = value;
    }

}
