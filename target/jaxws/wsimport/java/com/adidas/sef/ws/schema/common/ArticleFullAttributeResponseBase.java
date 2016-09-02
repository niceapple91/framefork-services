
package com.adidas.sef.ws.schema.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.article.ArticleAttrsResponse;
import com.adidas.sef.ws.schema.article.ArticleFullAttributeResponse;


/**
 * <p>Java class for articleFullAttributeResponseBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="articleFullAttributeResponseBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articleRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="articleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carriedOverFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retailExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="transportLeadTimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatoryRangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="speedPropositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktProposedColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="betterPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="betterPlaceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadColorway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalColorway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributionChannels" type="{http://www.adidas.com/sef/ws/schema/common}artDistributionChannels" minOccurs="0"/>
 *         &lt;element name="ffmModelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productionFeasibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="targetFOBCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualFOB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bufferFOB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rrpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="mrktForecastLong" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="developmentTrackCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetConsumerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingRegionCodes" type="{http://www.adidas.com/sef/ws/schema/common}sellingRegionCodes" minOccurs="0"/>
 *         &lt;element name="lifeCycleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifeCycleStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="glblGoInMarginTgtFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="glblGoInMarginBufferFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="glblGoInMarginActFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="glblGoInMarginBVFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stdGoInMarginTgtFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stdGoInMarginBufferFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stdGoInMarginActFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stdGoInMarginBVFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="glblNetSales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bvNetSales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="buyingVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="additionalCodings" type="{http://www.adidas.com/sef/ws/schema/common}additionalCodings" minOccurs="0"/>
 *         &lt;element name="additionalCodingDescriptions" type="{http://www.adidas.com/sef/ws/schema/common}additionalCodingDescriptions" minOccurs="0"/>
 *         &lt;element name="baseArticleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstMonthForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="firstMonthForecastLong" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productFit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seniorDesigner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seniorDeveloper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleCreationSeason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorDesigner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loDeveloper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingActivationSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingActivationDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="orderLockedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factoryDeveloper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rrp2CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandAssets" type="{http://www.adidas.com/sef/ws/schema/common}brandAssets" minOccurs="0"/>
 *         &lt;element name="changeRequestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activeChangeRequestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articleFullAttributeResponseBase", propOrder = {
    "articleRangeId",
    "articleNumber",
    "developmentTypeCode",
    "carriedOverFrom",
    "productManagerName",
    "quarter",
    "retailIntroDate",
    "retailExitDate",
    "transportLeadTimeCode",
    "mandatoryRangeCode",
    "speedPropositionCode",
    "mrktProposedColor",
    "colorName",
    "colorCodes",
    "mrktDepartment",
    "betterPlaceCode",
    "betterPlaceDescription",
    "leadColorway",
    "physicalColorway",
    "specialUsageCode",
    "priceSegmentCode",
    "distributionChannels",
    "ffmModelCode",
    "articleTypeCode",
    "productionFeasibility",
    "splUsage",
    "articleStatusCode",
    "targetFOB",
    "targetFOBCurrencyCode",
    "actualFOB",
    "bufferFOB",
    "rrp",
    "rrpCurrencyCode",
    "mrktForecast",
    "mrktForecastLong",
    "developmentTrackCode",
    "targetConsumerCode",
    "sellingRegionCodes",
    "lifeCycleStatusCode",
    "lifeCycleStatusDate",
    "glblGoInMarginTgtFOB",
    "glblGoInMarginBufferFOB",
    "glblGoInMarginActFOB",
    "glblGoInMarginBVFOB",
    "stdGoInMarginTgtFOB",
    "stdGoInMarginBufferFOB",
    "stdGoInMarginActFOB",
    "stdGoInMarginBVFOB",
    "glblNetSales",
    "bvNetSales",
    "buyingVolume",
    "creationDate",
    "additionalCodings",
    "additionalCodingDescriptions",
    "baseArticleNumber",
    "creationCenter",
    "firstMonthForecast",
    "firstMonthForecastLong",
    "productFit",
    "seniorDesigner",
    "seniorDeveloper",
    "articleCreationSeason",
    "colorDesigner",
    "designer",
    "developer",
    "loDeveloper",
    "marketingActivationSignature",
    "marketingActivationDueDate",
    "orderLockedIndicator",
    "sourceSystem",
    "factoryDeveloper",
    "rrp2",
    "rrp2CurrencyCode",
    "brandAssets",
    "changeRequestFlag",
    "activeChangeRequestFlag",
    "errorFlag",
    "errorSource"
})
@XmlSeeAlso({
    ArticleFullAttributeResponse.class,
    ArticleAttrsResponse.class
})
public class ArticleFullAttributeResponseBase {

    protected long articleRangeId;
    protected String articleNumber;
    protected String developmentTypeCode;
    protected String carriedOverFrom;
    protected String productManagerName;
    protected String quarter;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailIntroDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailExitDate;
    protected String transportLeadTimeCode;
    protected String mandatoryRangeCode;
    protected String speedPropositionCode;
    protected String mrktProposedColor;
    protected String colorName;
    protected String colorCodes;
    protected String mrktDepartment;
    protected String betterPlaceCode;
    protected String betterPlaceDescription;
    protected String leadColorway;
    protected String physicalColorway;
    protected String specialUsageCode;
    protected String priceSegmentCode;
    protected ArtDistributionChannels distributionChannels;
    protected String ffmModelCode;
    protected String articleTypeCode;
    protected String productionFeasibility;
    protected String splUsage;
    protected String articleStatusCode;
    protected BigDecimal targetFOB;
    protected String targetFOBCurrencyCode;
    protected Double actualFOB;
    protected Double bufferFOB;
    protected Double rrp;
    protected String rrpCurrencyCode;
    protected BigDecimal mrktForecast;
    protected Long mrktForecastLong;
    protected String developmentTrackCode;
    protected String targetConsumerCode;
    protected SellingRegionCodes sellingRegionCodes;
    protected String lifeCycleStatusCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lifeCycleStatusDate;
    protected BigDecimal glblGoInMarginTgtFOB;
    protected BigDecimal glblGoInMarginBufferFOB;
    protected BigDecimal glblGoInMarginActFOB;
    protected BigDecimal glblGoInMarginBVFOB;
    protected BigDecimal stdGoInMarginTgtFOB;
    protected BigDecimal stdGoInMarginBufferFOB;
    protected BigDecimal stdGoInMarginActFOB;
    protected BigDecimal stdGoInMarginBVFOB;
    protected BigDecimal glblNetSales;
    protected BigDecimal bvNetSales;
    protected BigDecimal buyingVolume;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected AdditionalCodings additionalCodings;
    protected AdditionalCodingDescriptions additionalCodingDescriptions;
    protected String baseArticleNumber;
    protected String creationCenter;
    protected BigDecimal firstMonthForecast;
    protected Long firstMonthForecastLong;
    protected String productFit;
    protected String seniorDesigner;
    protected String seniorDeveloper;
    protected String articleCreationSeason;
    protected String colorDesigner;
    protected String designer;
    protected String developer;
    protected String loDeveloper;
    protected String marketingActivationSignature;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar marketingActivationDueDate;
    protected String orderLockedIndicator;
    protected String sourceSystem;
    protected String factoryDeveloper;
    protected Double rrp2;
    protected String rrp2CurrencyCode;
    protected BrandAssets brandAssets;
    protected String changeRequestFlag;
    protected String activeChangeRequestFlag;
    protected String errorFlag;
    protected String errorSource;

    /**
     * Gets the value of the articleRangeId property.
     * 
     */
    public long getArticleRangeId() {
        return articleRangeId;
    }

    /**
     * Sets the value of the articleRangeId property.
     * 
     */
    public void setArticleRangeId(long value) {
        this.articleRangeId = value;
    }

    /**
     * Gets the value of the articleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /**
     * Sets the value of the articleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleNumber(String value) {
        this.articleNumber = value;
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
     * Gets the value of the carriedOverFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarriedOverFrom() {
        return carriedOverFrom;
    }

    /**
     * Sets the value of the carriedOverFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarriedOverFrom(String value) {
        this.carriedOverFrom = value;
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
     * Gets the value of the transportLeadTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportLeadTimeCode() {
        return transportLeadTimeCode;
    }

    /**
     * Sets the value of the transportLeadTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportLeadTimeCode(String value) {
        this.transportLeadTimeCode = value;
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
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
    }

    /**
     * Gets the value of the colorCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCodes() {
        return colorCodes;
    }

    /**
     * Sets the value of the colorCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCodes(String value) {
        this.colorCodes = value;
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
     * Gets the value of the betterPlaceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetterPlaceDescription() {
        return betterPlaceDescription;
    }

    /**
     * Sets the value of the betterPlaceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetterPlaceDescription(String value) {
        this.betterPlaceDescription = value;
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
     * Gets the value of the distributionChannels property.
     * 
     * @return
     *     possible object is
     *     {@link ArtDistributionChannels }
     *     
     */
    public ArtDistributionChannels getDistributionChannels() {
        return distributionChannels;
    }

    /**
     * Sets the value of the distributionChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtDistributionChannels }
     *     
     */
    public void setDistributionChannels(ArtDistributionChannels value) {
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
     * Gets the value of the productionFeasibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionFeasibility() {
        return productionFeasibility;
    }

    /**
     * Sets the value of the productionFeasibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionFeasibility(String value) {
        this.productionFeasibility = value;
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
     * Gets the value of the articleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleStatusCode() {
        return articleStatusCode;
    }

    /**
     * Sets the value of the articleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleStatusCode(String value) {
        this.articleStatusCode = value;
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
     * Gets the value of the actualFOB property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualFOB() {
        return actualFOB;
    }

    /**
     * Sets the value of the actualFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualFOB(Double value) {
        this.actualFOB = value;
    }

    /**
     * Gets the value of the bufferFOB property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBufferFOB() {
        return bufferFOB;
    }

    /**
     * Sets the value of the bufferFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBufferFOB(Double value) {
        this.bufferFOB = value;
    }

    /**
     * Gets the value of the rrp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRrp() {
        return rrp;
    }

    /**
     * Sets the value of the rrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRrp(Double value) {
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
     * Gets the value of the mrktForecastLong property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMrktForecastLong() {
        return mrktForecastLong;
    }

    /**
     * Sets the value of the mrktForecastLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMrktForecastLong(Long value) {
        this.mrktForecastLong = value;
    }

    /**
     * Gets the value of the developmentTrackCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentTrackCode() {
        return developmentTrackCode;
    }

    /**
     * Sets the value of the developmentTrackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentTrackCode(String value) {
        this.developmentTrackCode = value;
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
     * Gets the value of the lifeCycleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * Sets the value of the lifeCycleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Gets the value of the lifeCycleStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLifeCycleStatusDate() {
        return lifeCycleStatusDate;
    }

    /**
     * Sets the value of the lifeCycleStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLifeCycleStatusDate(XMLGregorianCalendar value) {
        this.lifeCycleStatusDate = value;
    }

    /**
     * Gets the value of the glblGoInMarginTgtFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlblGoInMarginTgtFOB() {
        return glblGoInMarginTgtFOB;
    }

    /**
     * Sets the value of the glblGoInMarginTgtFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGlblGoInMarginTgtFOB(BigDecimal value) {
        this.glblGoInMarginTgtFOB = value;
    }

    /**
     * Gets the value of the glblGoInMarginBufferFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlblGoInMarginBufferFOB() {
        return glblGoInMarginBufferFOB;
    }

    /**
     * Sets the value of the glblGoInMarginBufferFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGlblGoInMarginBufferFOB(BigDecimal value) {
        this.glblGoInMarginBufferFOB = value;
    }

    /**
     * Gets the value of the glblGoInMarginActFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlblGoInMarginActFOB() {
        return glblGoInMarginActFOB;
    }

    /**
     * Sets the value of the glblGoInMarginActFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGlblGoInMarginActFOB(BigDecimal value) {
        this.glblGoInMarginActFOB = value;
    }

    /**
     * Gets the value of the glblGoInMarginBVFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlblGoInMarginBVFOB() {
        return glblGoInMarginBVFOB;
    }

    /**
     * Sets the value of the glblGoInMarginBVFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGlblGoInMarginBVFOB(BigDecimal value) {
        this.glblGoInMarginBVFOB = value;
    }

    /**
     * Gets the value of the stdGoInMarginTgtFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdGoInMarginTgtFOB() {
        return stdGoInMarginTgtFOB;
    }

    /**
     * Sets the value of the stdGoInMarginTgtFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStdGoInMarginTgtFOB(BigDecimal value) {
        this.stdGoInMarginTgtFOB = value;
    }

    /**
     * Gets the value of the stdGoInMarginBufferFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdGoInMarginBufferFOB() {
        return stdGoInMarginBufferFOB;
    }

    /**
     * Sets the value of the stdGoInMarginBufferFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStdGoInMarginBufferFOB(BigDecimal value) {
        this.stdGoInMarginBufferFOB = value;
    }

    /**
     * Gets the value of the stdGoInMarginActFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdGoInMarginActFOB() {
        return stdGoInMarginActFOB;
    }

    /**
     * Sets the value of the stdGoInMarginActFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStdGoInMarginActFOB(BigDecimal value) {
        this.stdGoInMarginActFOB = value;
    }

    /**
     * Gets the value of the stdGoInMarginBVFOB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdGoInMarginBVFOB() {
        return stdGoInMarginBVFOB;
    }

    /**
     * Sets the value of the stdGoInMarginBVFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStdGoInMarginBVFOB(BigDecimal value) {
        this.stdGoInMarginBVFOB = value;
    }

    /**
     * Gets the value of the glblNetSales property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlblNetSales() {
        return glblNetSales;
    }

    /**
     * Sets the value of the glblNetSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGlblNetSales(BigDecimal value) {
        this.glblNetSales = value;
    }

    /**
     * Gets the value of the bvNetSales property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBvNetSales() {
        return bvNetSales;
    }

    /**
     * Sets the value of the bvNetSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBvNetSales(BigDecimal value) {
        this.bvNetSales = value;
    }

    /**
     * Gets the value of the buyingVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyingVolume() {
        return buyingVolume;
    }

    /**
     * Sets the value of the buyingVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyingVolume(BigDecimal value) {
        this.buyingVolume = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
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
     * Gets the value of the additionalCodingDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCodingDescriptions }
     *     
     */
    public AdditionalCodingDescriptions getAdditionalCodingDescriptions() {
        return additionalCodingDescriptions;
    }

    /**
     * Sets the value of the additionalCodingDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCodingDescriptions }
     *     
     */
    public void setAdditionalCodingDescriptions(AdditionalCodingDescriptions value) {
        this.additionalCodingDescriptions = value;
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
     * Gets the value of the firstMonthForecastLong property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstMonthForecastLong() {
        return firstMonthForecastLong;
    }

    /**
     * Sets the value of the firstMonthForecastLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstMonthForecastLong(Long value) {
        this.firstMonthForecastLong = value;
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
     * Gets the value of the articleCreationSeason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleCreationSeason() {
        return articleCreationSeason;
    }

    /**
     * Sets the value of the articleCreationSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleCreationSeason(String value) {
        this.articleCreationSeason = value;
    }

    /**
     * Gets the value of the colorDesigner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDesigner() {
        return colorDesigner;
    }

    /**
     * Sets the value of the colorDesigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDesigner(String value) {
        this.colorDesigner = value;
    }

    /**
     * Gets the value of the designer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesigner() {
        return designer;
    }

    /**
     * Sets the value of the designer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesigner(String value) {
        this.designer = value;
    }

    /**
     * Gets the value of the developer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * Sets the value of the developer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloper(String value) {
        this.developer = value;
    }

    /**
     * Gets the value of the loDeveloper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoDeveloper() {
        return loDeveloper;
    }

    /**
     * Sets the value of the loDeveloper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoDeveloper(String value) {
        this.loDeveloper = value;
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

    /**
     * Gets the value of the marketingActivationDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarketingActivationDueDate() {
        return marketingActivationDueDate;
    }

    /**
     * Sets the value of the marketingActivationDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarketingActivationDueDate(XMLGregorianCalendar value) {
        this.marketingActivationDueDate = value;
    }

    /**
     * Gets the value of the orderLockedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLockedIndicator() {
        return orderLockedIndicator;
    }

    /**
     * Sets the value of the orderLockedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLockedIndicator(String value) {
        this.orderLockedIndicator = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the factoryDeveloper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryDeveloper() {
        return factoryDeveloper;
    }

    /**
     * Sets the value of the factoryDeveloper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryDeveloper(String value) {
        this.factoryDeveloper = value;
    }

    /**
     * Gets the value of the rrp2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRrp2() {
        return rrp2;
    }

    /**
     * Sets the value of the rrp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRrp2(Double value) {
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
     * Gets the value of the changeRequestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeRequestFlag() {
        return changeRequestFlag;
    }

    /**
     * Sets the value of the changeRequestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeRequestFlag(String value) {
        this.changeRequestFlag = value;
    }

    /**
     * Gets the value of the activeChangeRequestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveChangeRequestFlag() {
        return activeChangeRequestFlag;
    }

    /**
     * Sets the value of the activeChangeRequestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveChangeRequestFlag(String value) {
        this.activeChangeRequestFlag = value;
    }

    /**
     * Gets the value of the errorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorFlag() {
        return errorFlag;
    }

    /**
     * Sets the value of the errorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorFlag(String value) {
        this.errorFlag = value;
    }

    /**
     * Gets the value of the errorSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSource() {
        return errorSource;
    }

    /**
     * Sets the value of the errorSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSource(String value) {
        this.errorSource = value;
    }

}
