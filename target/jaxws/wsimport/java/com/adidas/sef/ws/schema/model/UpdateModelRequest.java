
package com.adidas.sef.ws.schema.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.AdditionalCodings;
import com.adidas.sef.ws.schema.common.HangTags;
import com.adidas.sef.ws.schema.common.Lasts;
import com.adidas.sef.ws.schema.common.LocalUsageCodes;
import com.adidas.sef.ws.schema.common.MarketingModelNames;
import com.adidas.sef.ws.schema.common.Packages;
import com.adidas.sef.ws.schema.common.SellingRegionCodes;
import com.adidas.sef.ws.schema.common.Sizes;
import com.adidas.sef.ws.schema.common.TechConceptCodes;
import com.adidas.sef.ws.schema.common.TechnologyComponents;


/**
 * <p>Java class for updateModelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateModelRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="workingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNameShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNameLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceWorkingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featuresAndBenefit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturingCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetTechnologyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="techConceptCodes" type="{http://www.adidas.com/sef/ws/schema/common}techConceptCodes" minOccurs="0"/>
 *         &lt;element name="consumerBenefitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="betterPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localUsageCodes" type="{http://www.adidas.com/sef/ws/schema/common}localUsageCodes" minOccurs="0"/>
 *         &lt;element name="rrp2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrp2CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportLeadTimeCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="developmentTrackCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetConsumerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktProposedSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="putOnHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeholderFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeHolderStyleCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="targetFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="targetFOBCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corporateMrktLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryMrktLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ageGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sportsCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetSourcingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetMaterialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retailExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sellingRegionCodes" type="{http://www.adidas.com/sef/ws/schema/common}sellingRegionCodes" minOccurs="0"/>
 *         &lt;element name="dropFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replenishmentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicativeGIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="buyReadyStatusDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earliestBuyReadyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="salesUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateModelNullAttrs" type="{http://www.adidas.com/sef/ws/schema/model}updateModelNullAttrs" minOccurs="0"/>
 *         &lt;element name="macroModel" type="{http://www.adidas.com/sef/ws/schema/model}macroModel" minOccurs="0"/>
 *         &lt;element name="sizes" type="{http://www.adidas.com/sef/ws/schema/common}sizes" minOccurs="0"/>
 *         &lt;element name="sizePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetMaterialDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lasts" type="{http://www.adidas.com/sef/ws/schema/common}lasts" minOccurs="0"/>
 *         &lt;element name="additionalCodings" type="{http://www.adidas.com/sef/ws/schema/common}additionalCodings" minOccurs="0"/>
 *         &lt;element name="firstMonthForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hangTags" type="{http://www.adidas.com/sef/ws/schema/common}hangTags" minOccurs="0"/>
 *         &lt;element name="labelGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingModelNames" type="{http://www.adidas.com/sef/ws/schema/common}marketingModelNames" minOccurs="0"/>
 *         &lt;element name="packages" type="{http://www.adidas.com/sef/ws/schema/common}packages" minOccurs="0"/>
 *         &lt;element name="productLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceModelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesSizeScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technologyComponents" type="{http://www.adidas.com/sef/ws/schema/common}technologyComponents" minOccurs="0"/>
 *         &lt;element name="developmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carryOverSourceModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carryOverArticles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateModelRequest", propOrder = {
    "modelRangeId",
    "workingNumber",
    "modelNameShort",
    "modelNameLong",
    "modelDescr",
    "referenceWorkingNumber",
    "businessUnitCode",
    "featuresAndBenefit",
    "priceSegmentCode",
    "subBrand",
    "constructionTypeCode",
    "manufacturingCapability",
    "targetTechnologyCode",
    "techConceptCodes",
    "consumerBenefitCode",
    "betterPlaceCode",
    "localUsageCodes",
    "rrp2",
    "rrp2CurrencyCode",
    "transportLeadTimeCode",
    "developmentTrackCode",
    "targetConsumerCode",
    "mrktProposedSize",
    "putOnHold",
    "placeholderFlag",
    "placeHolderStyleCount",
    "targetFOB",
    "targetFOBCurrencyCode",
    "rrp",
    "rrpCurrencyCode",
    "mrktForecast",
    "productManagerName",
    "corporateMrktLineCode",
    "categoryMrktLineCode",
    "salesLineCode",
    "genderCode",
    "ageGroupCode",
    "sportsCategoryCode",
    "productTypeCode",
    "creationCenterCode",
    "targetSourcingCode",
    "targetMaterialCode",
    "quarter",
    "retailIntroDate",
    "retailExitDate",
    "sellingRegionCodes",
    "dropFlag",
    "replenishmentFlag",
    "indicativeGIM",
    "buyReadyStatusDescr",
    "buyReadyValidationStatus",
    "earliestBuyReadyDate",
    "salesUnitCode",
    "productClassCode",
    "updateModelNullAttrs",
    "macroModel",
    "sizes",
    "sizePage",
    "targetMaterialDescription",
    "lasts",
    "additionalCodings",
    "firstMonthForecast",
    "hangTags",
    "labelGroup",
    "marketingModelNames",
    "packages",
    "productLevel",
    "referenceModelNumber",
    "salesSizeScale",
    "technologyComponents",
    "developmentTypeCode",
    "carryOverSourceModelId",
    "carryOverArticles"
})
public class UpdateModelRequest {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long modelRangeId;
    protected String workingNumber;
    protected String modelNameShort;
    protected String modelNameLong;
    protected String modelDescr;
    protected String referenceWorkingNumber;
    protected String businessUnitCode;
    protected String featuresAndBenefit;
    protected String priceSegmentCode;
    protected String subBrand;
    protected String constructionTypeCode;
    protected String manufacturingCapability;
    protected String targetTechnologyCode;
    protected TechConceptCodes techConceptCodes;
    protected String consumerBenefitCode;
    protected String betterPlaceCode;
    protected LocalUsageCodes localUsageCodes;
    protected BigDecimal rrp2;
    protected String rrp2CurrencyCode;
    protected BigInteger transportLeadTimeCode;
    protected String developmentTrackCode;
    protected String targetConsumerCode;
    protected String mrktProposedSize;
    protected String putOnHold;
    protected String placeholderFlag;
    protected BigInteger placeHolderStyleCount;
    protected BigDecimal targetFOB;
    protected String targetFOBCurrencyCode;
    protected BigDecimal rrp;
    protected String rrpCurrencyCode;
    protected BigDecimal mrktForecast;
    protected String productManagerName;
    protected String corporateMrktLineCode;
    protected String categoryMrktLineCode;
    protected String salesLineCode;
    protected String genderCode;
    protected String ageGroupCode;
    protected String sportsCategoryCode;
    protected String productTypeCode;
    protected String creationCenterCode;
    protected String targetSourcingCode;
    protected String targetMaterialCode;
    protected String quarter;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailIntroDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailExitDate;
    protected SellingRegionCodes sellingRegionCodes;
    protected String dropFlag;
    protected String replenishmentFlag;
    protected BigDecimal indicativeGIM;
    protected String buyReadyStatusDescr;
    protected String buyReadyValidationStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestBuyReadyDate;
    protected String salesUnitCode;
    protected String productClassCode;
    protected UpdateModelNullAttrs updateModelNullAttrs;
    protected MacroModel macroModel;
    protected Sizes sizes;
    protected String sizePage;
    protected String targetMaterialDescription;
    protected Lasts lasts;
    protected AdditionalCodings additionalCodings;
    protected BigDecimal firstMonthForecast;
    protected HangTags hangTags;
    protected String labelGroup;
    protected MarketingModelNames marketingModelNames;
    protected Packages packages;
    protected String productLevel;
    protected String referenceModelNumber;
    protected String salesSizeScale;
    protected TechnologyComponents technologyComponents;
    protected String developmentTypeCode;
    protected String carryOverSourceModelId;
    protected String carryOverArticles;

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
     * Gets the value of the workingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingNumber() {
        return workingNumber;
    }

    /**
     * Sets the value of the workingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingNumber(String value) {
        this.workingNumber = value;
    }

    /**
     * Gets the value of the modelNameShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNameShort() {
        return modelNameShort;
    }

    /**
     * Sets the value of the modelNameShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNameShort(String value) {
        this.modelNameShort = value;
    }

    /**
     * Gets the value of the modelNameLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNameLong() {
        return modelNameLong;
    }

    /**
     * Sets the value of the modelNameLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNameLong(String value) {
        this.modelNameLong = value;
    }

    /**
     * Gets the value of the modelDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDescr() {
        return modelDescr;
    }

    /**
     * Sets the value of the modelDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDescr(String value) {
        this.modelDescr = value;
    }

    /**
     * Gets the value of the referenceWorkingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceWorkingNumber() {
        return referenceWorkingNumber;
    }

    /**
     * Sets the value of the referenceWorkingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceWorkingNumber(String value) {
        this.referenceWorkingNumber = value;
    }

    /**
     * Gets the value of the businessUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnitCode() {
        return businessUnitCode;
    }

    /**
     * Sets the value of the businessUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnitCode(String value) {
        this.businessUnitCode = value;
    }

    /**
     * Gets the value of the featuresAndBenefit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturesAndBenefit() {
        return featuresAndBenefit;
    }

    /**
     * Sets the value of the featuresAndBenefit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturesAndBenefit(String value) {
        this.featuresAndBenefit = value;
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
     * Gets the value of the constructionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionTypeCode() {
        return constructionTypeCode;
    }

    /**
     * Sets the value of the constructionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionTypeCode(String value) {
        this.constructionTypeCode = value;
    }

    /**
     * Gets the value of the manufacturingCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingCapability() {
        return manufacturingCapability;
    }

    /**
     * Sets the value of the manufacturingCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingCapability(String value) {
        this.manufacturingCapability = value;
    }

    /**
     * Gets the value of the targetTechnologyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetTechnologyCode() {
        return targetTechnologyCode;
    }

    /**
     * Sets the value of the targetTechnologyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetTechnologyCode(String value) {
        this.targetTechnologyCode = value;
    }

    /**
     * Gets the value of the techConceptCodes property.
     * 
     * @return
     *     possible object is
     *     {@link TechConceptCodes }
     *     
     */
    public TechConceptCodes getTechConceptCodes() {
        return techConceptCodes;
    }

    /**
     * Sets the value of the techConceptCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechConceptCodes }
     *     
     */
    public void setTechConceptCodes(TechConceptCodes value) {
        this.techConceptCodes = value;
    }

    /**
     * Gets the value of the consumerBenefitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerBenefitCode() {
        return consumerBenefitCode;
    }

    /**
     * Sets the value of the consumerBenefitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerBenefitCode(String value) {
        this.consumerBenefitCode = value;
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
     * Gets the value of the localUsageCodes property.
     * 
     * @return
     *     possible object is
     *     {@link LocalUsageCodes }
     *     
     */
    public LocalUsageCodes getLocalUsageCodes() {
        return localUsageCodes;
    }

    /**
     * Sets the value of the localUsageCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalUsageCodes }
     *     
     */
    public void setLocalUsageCodes(LocalUsageCodes value) {
        this.localUsageCodes = value;
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
     * Gets the value of the transportLeadTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransportLeadTimeCode() {
        return transportLeadTimeCode;
    }

    /**
     * Sets the value of the transportLeadTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransportLeadTimeCode(BigInteger value) {
        this.transportLeadTimeCode = value;
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
     * Gets the value of the mrktProposedSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrktProposedSize() {
        return mrktProposedSize;
    }

    /**
     * Sets the value of the mrktProposedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrktProposedSize(String value) {
        this.mrktProposedSize = value;
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
     * Gets the value of the placeholderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceholderFlag() {
        return placeholderFlag;
    }

    /**
     * Sets the value of the placeholderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceholderFlag(String value) {
        this.placeholderFlag = value;
    }

    /**
     * Gets the value of the placeHolderStyleCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlaceHolderStyleCount() {
        return placeHolderStyleCount;
    }

    /**
     * Sets the value of the placeHolderStyleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlaceHolderStyleCount(BigInteger value) {
        this.placeHolderStyleCount = value;
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
     * Gets the value of the corporateMrktLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateMrktLineCode() {
        return corporateMrktLineCode;
    }

    /**
     * Sets the value of the corporateMrktLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateMrktLineCode(String value) {
        this.corporateMrktLineCode = value;
    }

    /**
     * Gets the value of the categoryMrktLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryMrktLineCode() {
        return categoryMrktLineCode;
    }

    /**
     * Sets the value of the categoryMrktLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryMrktLineCode(String value) {
        this.categoryMrktLineCode = value;
    }

    /**
     * Gets the value of the salesLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesLineCode() {
        return salesLineCode;
    }

    /**
     * Sets the value of the salesLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesLineCode(String value) {
        this.salesLineCode = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
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
     * Gets the value of the sportsCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportsCategoryCode() {
        return sportsCategoryCode;
    }

    /**
     * Sets the value of the sportsCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportsCategoryCode(String value) {
        this.sportsCategoryCode = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the creationCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationCenterCode() {
        return creationCenterCode;
    }

    /**
     * Sets the value of the creationCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationCenterCode(String value) {
        this.creationCenterCode = value;
    }

    /**
     * Gets the value of the targetSourcingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSourcingCode() {
        return targetSourcingCode;
    }

    /**
     * Sets the value of the targetSourcingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSourcingCode(String value) {
        this.targetSourcingCode = value;
    }

    /**
     * Gets the value of the targetMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetMaterialCode() {
        return targetMaterialCode;
    }

    /**
     * Sets the value of the targetMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetMaterialCode(String value) {
        this.targetMaterialCode = value;
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
     * Gets the value of the indicativeGIM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndicativeGIM() {
        return indicativeGIM;
    }

    /**
     * Sets the value of the indicativeGIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndicativeGIM(BigDecimal value) {
        this.indicativeGIM = value;
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
     * Gets the value of the salesUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnitCode() {
        return salesUnitCode;
    }

    /**
     * Sets the value of the salesUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnitCode(String value) {
        this.salesUnitCode = value;
    }

    /**
     * Gets the value of the productClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassCode() {
        return productClassCode;
    }

    /**
     * Sets the value of the productClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassCode(String value) {
        this.productClassCode = value;
    }

    /**
     * Gets the value of the updateModelNullAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateModelNullAttrs }
     *     
     */
    public UpdateModelNullAttrs getUpdateModelNullAttrs() {
        return updateModelNullAttrs;
    }

    /**
     * Sets the value of the updateModelNullAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateModelNullAttrs }
     *     
     */
    public void setUpdateModelNullAttrs(UpdateModelNullAttrs value) {
        this.updateModelNullAttrs = value;
    }

    /**
     * Gets the value of the macroModel property.
     * 
     * @return
     *     possible object is
     *     {@link MacroModel }
     *     
     */
    public MacroModel getMacroModel() {
        return macroModel;
    }

    /**
     * Sets the value of the macroModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacroModel }
     *     
     */
    public void setMacroModel(MacroModel value) {
        this.macroModel = value;
    }

    /**
     * Gets the value of the sizes property.
     * 
     * @return
     *     possible object is
     *     {@link Sizes }
     *     
     */
    public Sizes getSizes() {
        return sizes;
    }

    /**
     * Sets the value of the sizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sizes }
     *     
     */
    public void setSizes(Sizes value) {
        this.sizes = value;
    }

    /**
     * Gets the value of the sizePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizePage() {
        return sizePage;
    }

    /**
     * Sets the value of the sizePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizePage(String value) {
        this.sizePage = value;
    }

    /**
     * Gets the value of the targetMaterialDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetMaterialDescription() {
        return targetMaterialDescription;
    }

    /**
     * Sets the value of the targetMaterialDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetMaterialDescription(String value) {
        this.targetMaterialDescription = value;
    }

    /**
     * Gets the value of the lasts property.
     * 
     * @return
     *     possible object is
     *     {@link Lasts }
     *     
     */
    public Lasts getLasts() {
        return lasts;
    }

    /**
     * Sets the value of the lasts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lasts }
     *     
     */
    public void setLasts(Lasts value) {
        this.lasts = value;
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
     * Gets the value of the hangTags property.
     * 
     * @return
     *     possible object is
     *     {@link HangTags }
     *     
     */
    public HangTags getHangTags() {
        return hangTags;
    }

    /**
     * Sets the value of the hangTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link HangTags }
     *     
     */
    public void setHangTags(HangTags value) {
        this.hangTags = value;
    }

    /**
     * Gets the value of the labelGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelGroup() {
        return labelGroup;
    }

    /**
     * Sets the value of the labelGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelGroup(String value) {
        this.labelGroup = value;
    }

    /**
     * Gets the value of the marketingModelNames property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingModelNames }
     *     
     */
    public MarketingModelNames getMarketingModelNames() {
        return marketingModelNames;
    }

    /**
     * Sets the value of the marketingModelNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingModelNames }
     *     
     */
    public void setMarketingModelNames(MarketingModelNames value) {
        this.marketingModelNames = value;
    }

    /**
     * Gets the value of the packages property.
     * 
     * @return
     *     possible object is
     *     {@link Packages }
     *     
     */
    public Packages getPackages() {
        return packages;
    }

    /**
     * Sets the value of the packages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packages }
     *     
     */
    public void setPackages(Packages value) {
        this.packages = value;
    }

    /**
     * Gets the value of the productLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLevel() {
        return productLevel;
    }

    /**
     * Sets the value of the productLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLevel(String value) {
        this.productLevel = value;
    }

    /**
     * Gets the value of the referenceModelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceModelNumber() {
        return referenceModelNumber;
    }

    /**
     * Sets the value of the referenceModelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceModelNumber(String value) {
        this.referenceModelNumber = value;
    }

    /**
     * Gets the value of the salesSizeScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesSizeScale() {
        return salesSizeScale;
    }

    /**
     * Sets the value of the salesSizeScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesSizeScale(String value) {
        this.salesSizeScale = value;
    }

    /**
     * Gets the value of the technologyComponents property.
     * 
     * @return
     *     possible object is
     *     {@link TechnologyComponents }
     *     
     */
    public TechnologyComponents getTechnologyComponents() {
        return technologyComponents;
    }

    /**
     * Sets the value of the technologyComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnologyComponents }
     *     
     */
    public void setTechnologyComponents(TechnologyComponents value) {
        this.technologyComponents = value;
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
     * Gets the value of the carryOverSourceModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarryOverSourceModelId() {
        return carryOverSourceModelId;
    }

    /**
     * Sets the value of the carryOverSourceModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarryOverSourceModelId(String value) {
        this.carryOverSourceModelId = value;
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

}
