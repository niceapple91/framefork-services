
package com.adidas.sef.ws.schema.article;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.AdditionalCodings;
import com.adidas.sef.ws.schema.common.BrandAssets;


/**
 * <p>Java class for updateArticleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateArticleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articleRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="mrktProposedColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadColorway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalColorway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="betterPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetFOBCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentTrackCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transportLeadTimeCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="distributionChannels" type="{http://www.adidas.com/sef/ws/schema/article}distributionChannels" minOccurs="0"/>
 *         &lt;element name="ffmModelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatoryRangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="speedPropositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetConsumerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="putOnHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retailExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sellingRegionCodes" type="{http://www.adidas.com/sef/ws/schema/article}sellingRegionCodes" minOccurs="0"/>
 *         &lt;element name="specialUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replenishmentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyStatusDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earliestBuyReadyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="updateArticleNullAttrs" type="{http://www.adidas.com/sef/ws/schema/article}updateArticleNullAttrs" minOccurs="0"/>
 *         &lt;element name="additionalCodings" type="{http://www.adidas.com/sef/ws/schema/common}additionalCodings" minOccurs="0"/>
 *         &lt;element name="baseArticleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstMonthForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productFit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seniorDesigner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seniorDeveloper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrp2CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandAssets" type="{http://www.adidas.com/sef/ws/schema/common}brandAssets" minOccurs="0"/>
 *         &lt;element name="marketingActivationSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateArticleRequest", propOrder = {
    "articleRangeId",
    "mrktForecast",
    "mrktProposedColor",
    "rrp",
    "rrpCurrencyCode",
    "mrktDepartment",
    "productManagerName",
    "splUsage",
    "leadColorway",
    "physicalColorway",
    "targetFOB",
    "betterPlaceCode",
    "targetFOBCurrencyCode",
    "developmentTrackCode",
    "transportLeadTimeCode",
    "distributionChannels",
    "ffmModelCode",
    "mandatoryRangeCode",
    "speedPropositionCode",
    "articleTypeCode",
    "priceSegmentCode",
    "targetConsumerCode",
    "putOnHold",
    "retailIntroDate",
    "retailExitDate",
    "sellingRegionCodes",
    "specialUsageCode",
    "dropFlag",
    "replenishmentFlag",
    "quarter",
    "buyReadyStatusDescr",
    "buyReadyValidationStatus",
    "earliestBuyReadyDate",
    "updateArticleNullAttrs",
    "additionalCodings",
    "baseArticleNumber",
    "creationCenter",
    "firstMonthForecast",
    "productFit",
    "seniorDesigner",
    "seniorDeveloper",
    "rrp2",
    "rrp2CurrencyCode",
    "brandAssets",
    "marketingActivationSignature"
})
public class UpdateArticleRequest {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long articleRangeId;
    protected BigDecimal mrktForecast;
    protected String mrktProposedColor;
    protected BigDecimal rrp;
    protected String rrpCurrencyCode;
    protected String mrktDepartment;
    protected String productManagerName;
    protected String splUsage;
    protected String leadColorway;
    protected String physicalColorway;
    protected BigDecimal targetFOB;
    protected String betterPlaceCode;
    protected String targetFOBCurrencyCode;
    protected Long developmentTrackCode;
    protected Long transportLeadTimeCode;
    protected DistributionChannels distributionChannels;
    protected String ffmModelCode;
    protected String mandatoryRangeCode;
    protected String speedPropositionCode;
    protected String articleTypeCode;
    protected String priceSegmentCode;
    protected String targetConsumerCode;
    protected String putOnHold;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailIntroDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailExitDate;
    protected SellingRegionCodes sellingRegionCodes;
    protected String specialUsageCode;
    protected String dropFlag;
    protected String replenishmentFlag;
    protected String quarter;
    protected String buyReadyStatusDescr;
    protected String buyReadyValidationStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestBuyReadyDate;
    protected UpdateArticleNullAttrs updateArticleNullAttrs;
    protected AdditionalCodings additionalCodings;
    protected String baseArticleNumber;
    protected String creationCenter;
    protected BigDecimal firstMonthForecast;
    protected String productFit;
    protected String seniorDesigner;
    protected String seniorDeveloper;
    protected BigDecimal rrp2;
    protected String rrp2CurrencyCode;
    protected BrandAssets brandAssets;
    protected String marketingActivationSignature;

    /**
     * Gets the value of the articleRangeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArticleRangeId() {
        return articleRangeId;
    }

    /**
     * Sets the value of the articleRangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArticleRangeId(Long value) {
        this.articleRangeId = value;
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
     * Gets the value of the mrktProposedColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrktProposedColor() {
        return mrktProposedColor;
    }

    /**
     * Sets the value of the mrktProposedColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrktProposedColor(String value) {
        this.mrktProposedColor = value;
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
     * Gets the value of the mrktDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrktDepartment() {
        return mrktDepartment;
    }

    /**
     * Sets the value of the mrktDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrktDepartment(String value) {
        this.mrktDepartment = value;
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
     * Gets the value of the splUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplUsage() {
        return splUsage;
    }

    /**
     * Sets the value of the splUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplUsage(String value) {
        this.splUsage = value;
    }

    /**
     * Gets the value of the leadColorway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadColorway() {
        return leadColorway;
    }

    /**
     * Sets the value of the leadColorway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadColorway(String value) {
        this.leadColorway = value;
    }

    /**
     * Gets the value of the physicalColorway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalColorway() {
        return physicalColorway;
    }

    /**
     * Sets the value of the physicalColorway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalColorway(String value) {
        this.physicalColorway = value;
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
     * Gets the value of the betterPlaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetterPlaceCode() {
        return betterPlaceCode;
    }

    /**
     * Sets the value of the betterPlaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetterPlaceCode(String value) {
        this.betterPlaceCode = value;
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
     * Gets the value of the developmentTrackCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevelopmentTrackCode() {
        return developmentTrackCode;
    }

    /**
     * Sets the value of the developmentTrackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevelopmentTrackCode(Long value) {
        this.developmentTrackCode = value;
    }

    /**
     * Gets the value of the transportLeadTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransportLeadTimeCode() {
        return transportLeadTimeCode;
    }

    /**
     * Sets the value of the transportLeadTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransportLeadTimeCode(Long value) {
        this.transportLeadTimeCode = value;
    }

    /**
     * Gets the value of the distributionChannels property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannels }
     *     
     */
    public DistributionChannels getDistributionChannels() {
        return distributionChannels;
    }

    /**
     * Sets the value of the distributionChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannels }
     *     
     */
    public void setDistributionChannels(DistributionChannels value) {
        this.distributionChannels = value;
    }

    /**
     * Gets the value of the ffmModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfmModelCode() {
        return ffmModelCode;
    }

    /**
     * Sets the value of the ffmModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfmModelCode(String value) {
        this.ffmModelCode = value;
    }

    /**
     * Gets the value of the mandatoryRangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatoryRangeCode() {
        return mandatoryRangeCode;
    }

    /**
     * Sets the value of the mandatoryRangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatoryRangeCode(String value) {
        this.mandatoryRangeCode = value;
    }

    /**
     * Gets the value of the speedPropositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedPropositionCode() {
        return speedPropositionCode;
    }

    /**
     * Sets the value of the speedPropositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedPropositionCode(String value) {
        this.speedPropositionCode = value;
    }

    /**
     * Gets the value of the articleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleTypeCode() {
        return articleTypeCode;
    }

    /**
     * Sets the value of the articleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleTypeCode(String value) {
        this.articleTypeCode = value;
    }

    /**
     * Gets the value of the priceSegmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceSegmentCode() {
        return priceSegmentCode;
    }

    /**
     * Sets the value of the priceSegmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceSegmentCode(String value) {
        this.priceSegmentCode = value;
    }

    /**
     * Gets the value of the targetConsumerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetConsumerCode() {
        return targetConsumerCode;
    }

    /**
     * Sets the value of the targetConsumerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetConsumerCode(String value) {
        this.targetConsumerCode = value;
    }

    /**
     * Gets the value of the putOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutOnHold() {
        return putOnHold;
    }

    /**
     * Sets the value of the putOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutOnHold(String value) {
        this.putOnHold = value;
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
     * Gets the value of the retailExitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetailExitDate() {
        return retailExitDate;
    }

    /**
     * Sets the value of the retailExitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetailExitDate(XMLGregorianCalendar value) {
        this.retailExitDate = value;
    }

    /**
     * Gets the value of the sellingRegionCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SellingRegionCodes }
     *     
     */
    public SellingRegionCodes getSellingRegionCodes() {
        return sellingRegionCodes;
    }

    /**
     * Sets the value of the sellingRegionCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingRegionCodes }
     *     
     */
    public void setSellingRegionCodes(SellingRegionCodes value) {
        this.sellingRegionCodes = value;
    }

    /**
     * Gets the value of the specialUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialUsageCode() {
        return specialUsageCode;
    }

    /**
     * Sets the value of the specialUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialUsageCode(String value) {
        this.specialUsageCode = value;
    }

    /**
     * Gets the value of the dropFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropFlag() {
        return dropFlag;
    }

    /**
     * Sets the value of the dropFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropFlag(String value) {
        this.dropFlag = value;
    }

    /**
     * Gets the value of the replenishmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplenishmentFlag() {
        return replenishmentFlag;
    }

    /**
     * Sets the value of the replenishmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplenishmentFlag(String value) {
        this.replenishmentFlag = value;
    }

    /**
     * Gets the value of the quarter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarter() {
        return quarter;
    }

    /**
     * Sets the value of the quarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarter(String value) {
        this.quarter = value;
    }

    /**
     * Gets the value of the buyReadyStatusDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyReadyStatusDescr() {
        return buyReadyStatusDescr;
    }

    /**
     * Sets the value of the buyReadyStatusDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyReadyStatusDescr(String value) {
        this.buyReadyStatusDescr = value;
    }

    /**
     * Gets the value of the buyReadyValidationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyReadyValidationStatus() {
        return buyReadyValidationStatus;
    }

    /**
     * Sets the value of the buyReadyValidationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyReadyValidationStatus(String value) {
        this.buyReadyValidationStatus = value;
    }

    /**
     * Gets the value of the earliestBuyReadyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestBuyReadyDate() {
        return earliestBuyReadyDate;
    }

    /**
     * Sets the value of the earliestBuyReadyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestBuyReadyDate(XMLGregorianCalendar value) {
        this.earliestBuyReadyDate = value;
    }

    /**
     * Gets the value of the updateArticleNullAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateArticleNullAttrs }
     *     
     */
    public UpdateArticleNullAttrs getUpdateArticleNullAttrs() {
        return updateArticleNullAttrs;
    }

    /**
     * Sets the value of the updateArticleNullAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateArticleNullAttrs }
     *     
     */
    public void setUpdateArticleNullAttrs(UpdateArticleNullAttrs value) {
        this.updateArticleNullAttrs = value;
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

    /**
     * Gets the value of the baseArticleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseArticleNumber() {
        return baseArticleNumber;
    }

    /**
     * Sets the value of the baseArticleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseArticleNumber(String value) {
        this.baseArticleNumber = value;
    }

    /**
     * Gets the value of the creationCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationCenter() {
        return creationCenter;
    }

    /**
     * Sets the value of the creationCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationCenter(String value) {
        this.creationCenter = value;
    }

    /**
     * Gets the value of the firstMonthForecast property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstMonthForecast() {
        return firstMonthForecast;
    }

    /**
     * Sets the value of the firstMonthForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstMonthForecast(BigDecimal value) {
        this.firstMonthForecast = value;
    }

    /**
     * Gets the value of the productFit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductFit() {
        return productFit;
    }

    /**
     * Sets the value of the productFit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductFit(String value) {
        this.productFit = value;
    }

    /**
     * Gets the value of the seniorDesigner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeniorDesigner() {
        return seniorDesigner;
    }

    /**
     * Sets the value of the seniorDesigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeniorDesigner(String value) {
        this.seniorDesigner = value;
    }

    /**
     * Gets the value of the seniorDeveloper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeniorDeveloper() {
        return seniorDeveloper;
    }

    /**
     * Sets the value of the seniorDeveloper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeniorDeveloper(String value) {
        this.seniorDeveloper = value;
    }

    /**
     * Gets the value of the rrp2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrp2() {
        return rrp2;
    }

    /**
     * Sets the value of the rrp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrp2(BigDecimal value) {
        this.rrp2 = value;
    }

    /**
     * Gets the value of the rrp2CurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrp2CurrencyCode() {
        return rrp2CurrencyCode;
    }

    /**
     * Sets the value of the rrp2CurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrp2CurrencyCode(String value) {
        this.rrp2CurrencyCode = value;
    }

    /**
     * Gets the value of the brandAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BrandAssets }
     *     
     */
    public BrandAssets getBrandAssets() {
        return brandAssets;
    }

    /**
     * Sets the value of the brandAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandAssets }
     *     
     */
    public void setBrandAssets(BrandAssets value) {
        this.brandAssets = value;
    }

    /**
     * Gets the value of the marketingActivationSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingActivationSignature() {
        return marketingActivationSignature;
    }

    /**
     * Sets the value of the marketingActivationSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingActivationSignature(String value) {
        this.marketingActivationSignature = value;
    }

}
