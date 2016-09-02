
package com.adidas.sef.ws.schema.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.model.GetModelResponse;


/**
 * <p>Java class for modelAttrsResponseBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelAttrsResponseBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gfr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carriedOverFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="targetFOBCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNameLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rrp2CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="mrktForecastLong" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="betterPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="betterPlaceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceWorkingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featuresAndBenefit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corporateMrktLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryMrktLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sportsCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetSourcingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetMaterialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetTechnologyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="techConceptCodes" type="{http://www.adidas.com/sef/ws/schema/common}techConceptCodes" minOccurs="0"/>
 *         &lt;element name="developmentOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeHolderFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeHolderStyleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="salesUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturingCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ageGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retailExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="localUsageCodes" type="{http://www.adidas.com/sef/ws/schema/common}localUsageCodes" minOccurs="0"/>
 *         &lt;element name="transportLeadTimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentTrackCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumerBenefitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetConsumerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktProposedSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingRegionCodes" type="{http://www.adidas.com/sef/ws/schema/common}sellingRegionCodes" minOccurs="0"/>
 *         &lt;element name="modelStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replenishmentflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glblGoInMarginTgtFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="glblGoInMarginActFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="glblGoInMarginBufferFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="glblGoInMarginBVFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="buyingVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lifeCycleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifeCycleStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="indicativeGIM" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="earliestBuyReadyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="buyReadyValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyStatusDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="midSoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="midSoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outSoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outSoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="silhouetteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="silhouetteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sampleSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizes" type="{http://www.adidas.com/sef/ws/schema/common}sizes" minOccurs="0"/>
 *         &lt;element name="sizesCode" type="{http://www.adidas.com/sef/ws/schema/common}sizes" minOccurs="0"/>
 *         &lt;element name="sizesIndex" type="{http://www.adidas.com/sef/ws/schema/common}sizes" minOccurs="0"/>
 *         &lt;element name="targetMaterialDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lasts" type="{http://www.adidas.com/sef/ws/schema/common}lasts" minOccurs="0"/>
 *         &lt;element name="additionalCodings" type="{http://www.adidas.com/sef/ws/schema/common}additionalCodings" minOccurs="0"/>
 *         &lt;element name="additionalCodingDescriptions" type="{http://www.adidas.com/sef/ws/schema/common}additionalCodingDescriptions" minOccurs="0"/>
 *         &lt;element name="firstMonthForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="firstMonthForecastLong" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hangTags" type="{http://www.adidas.com/sef/ws/schema/common}hangTags" minOccurs="0"/>
 *         &lt;element name="labelGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labels" type="{http://www.adidas.com/sef/ws/schema/common}labels" minOccurs="0"/>
 *         &lt;element name="marketingModelNames" type="{http://www.adidas.com/sef/ws/schema/common}marketingModelNames" minOccurs="0"/>
 *         &lt;element name="packages" type="{http://www.adidas.com/sef/ws/schema/common}packages" minOccurs="0"/>
 *         &lt;element name="packageNames" type="{http://www.adidas.com/sef/ws/schema/common}packageNames" minOccurs="0"/>
 *         &lt;element name="productLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceModelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesSizeScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesSizeScaleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technologyComponents" type="{http://www.adidas.com/sef/ws/schema/common}technologyComponents" minOccurs="0"/>
 *         &lt;element name="developer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelCreationSeason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceModelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="widthProject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seniorDesigner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seniorDeveloper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorDesigner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeRequestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activeChangeRequestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="macroModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "modelAttrsResponseBase", propOrder = {
    "modelName",
    "modelNumber",
    "workingNumber",
    "gfr",
    "developmentTypeCode",
    "carriedOverFrom",
    "targetFOB",
    "targetFOBCurrencyCode",
    "rrp",
    "rrpCurrencyCode",
    "modelNameLong",
    "modelDescr",
    "rrp2",
    "rrp2CurrencyCode",
    "mrktForecast",
    "mrktForecastLong",
    "mrktDepartment",
    "betterPlaceCode",
    "betterPlaceDescription",
    "productManagerName",
    "referenceWorkingNumber",
    "featuresAndBenefit",
    "priceSegmentCode",
    "corporateMrktLineCode",
    "categoryMrktLineCode",
    "salesLineCode",
    "sportsCategoryCode",
    "productDivision",
    "productGroupCode",
    "productTypeCode",
    "creationCenterCode",
    "targetSourcingCode",
    "targetMaterialCode",
    "targetTechnologyCode",
    "techConceptCodes",
    "developmentOrganization",
    "placeHolderFlag",
    "placeHolderStyleCount",
    "salesUnitCode",
    "constructionTypeCode",
    "manufacturingCapability",
    "ageGroupCode",
    "genderCode",
    "productClassCode",
    "quarter",
    "retailIntroDate",
    "retailExitDate",
    "localUsageCodes",
    "transportLeadTimeCode",
    "developmentTrackCode",
    "consumerBenefitCode",
    "targetConsumerCode",
    "mrktProposedSize",
    "sellingRegionCodes",
    "modelStatus",
    "replenishmentflag",
    "factoryName",
    "projectManagerName",
    "glblGoInMarginTgtFOB",
    "glblGoInMarginActFOB",
    "glblGoInMarginBufferFOB",
    "glblGoInMarginBVFOB",
    "buyingVolumeUnit",
    "lifeCycleStatusCode",
    "lifeCycleStatusDate",
    "indicativeGIM",
    "earliestBuyReadyDate",
    "buyReadyValidationStatus",
    "buyReadyStatusDescr",
    "midSoleId",
    "midSoleDescription",
    "outSoleId",
    "outSoleDescription",
    "silhouetteId",
    "silhouetteDescription",
    "sampleSize",
    "sizePage",
    "sizes",
    "sizesCode",
    "sizesIndex",
    "targetMaterialDescription",
    "lasts",
    "additionalCodings",
    "additionalCodingDescriptions",
    "firstMonthForecast",
    "firstMonthForecastLong",
    "hangTags",
    "labelGroup",
    "labels",
    "marketingModelNames",
    "packages",
    "packageNames",
    "productLevel",
    "referenceModelNumber",
    "salesSizeScale",
    "salesSizeScaleCode",
    "technologyComponents",
    "developer",
    "modelCreationSeason",
    "referenceModelName",
    "sourceSystem",
    "widthProject",
    "modelId",
    "seniorDesigner",
    "seniorDeveloper",
    "designer",
    "colorDesigner",
    "changeRequestFlag",
    "activeChangeRequestFlag",
    "macroModelId",
    "errorFlag",
    "errorSource"
})
@XmlSeeAlso({
    ModelAttrsResponse.class,
    GetModelResponse.class
})
public class ModelAttrsResponseBase {

    protected String modelName;
    protected String modelNumber;
    protected String workingNumber;
    protected String gfr;
    protected String developmentTypeCode;
    protected String carriedOverFrom;
    protected BigDecimal targetFOB;
    protected String targetFOBCurrencyCode;
    protected BigDecimal rrp;
    protected String rrpCurrencyCode;
    protected String modelNameLong;
    protected String modelDescr;
    protected Double rrp2;
    protected String rrp2CurrencyCode;
    protected BigDecimal mrktForecast;
    protected Long mrktForecastLong;
    protected String mrktDepartment;
    protected String betterPlaceCode;
    protected String betterPlaceDescription;
    protected String productManagerName;
    protected String referenceWorkingNumber;
    protected String featuresAndBenefit;
    protected String priceSegmentCode;
    protected String corporateMrktLineCode;
    protected String categoryMrktLineCode;
    protected String salesLineCode;
    protected String sportsCategoryCode;
    protected String productDivision;
    protected String productGroupCode;
    protected String productTypeCode;
    protected String creationCenterCode;
    protected String targetSourcingCode;
    protected String targetMaterialCode;
    protected String targetTechnologyCode;
    protected TechConceptCodes techConceptCodes;
    protected String developmentOrganization;
    protected String placeHolderFlag;
    protected Long placeHolderStyleCount;
    protected String salesUnitCode;
    protected String constructionTypeCode;
    protected String manufacturingCapability;
    protected String ageGroupCode;
    protected String genderCode;
    protected String productClassCode;
    protected String quarter;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailIntroDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailExitDate;
    protected LocalUsageCodes localUsageCodes;
    protected String transportLeadTimeCode;
    protected String developmentTrackCode;
    protected String consumerBenefitCode;
    protected String targetConsumerCode;
    protected String mrktProposedSize;
    protected SellingRegionCodes sellingRegionCodes;
    protected String modelStatus;
    protected String replenishmentflag;
    protected String factoryName;
    protected String projectManagerName;
    protected BigDecimal glblGoInMarginTgtFOB;
    protected BigDecimal glblGoInMarginActFOB;
    protected BigDecimal glblGoInMarginBufferFOB;
    protected BigDecimal glblGoInMarginBVFOB;
    protected BigDecimal buyingVolumeUnit;
    protected String lifeCycleStatusCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lifeCycleStatusDate;
    protected Double indicativeGIM;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestBuyReadyDate;
    protected String buyReadyValidationStatus;
    protected String buyReadyStatusDescr;
    protected String midSoleId;
    protected String midSoleDescription;
    protected String outSoleId;
    protected String outSoleDescription;
    protected String silhouetteId;
    protected String silhouetteDescription;
    protected String sampleSize;
    protected String sizePage;
    protected Sizes sizes;
    protected Sizes sizesCode;
    protected Sizes sizesIndex;
    protected String targetMaterialDescription;
    protected Lasts lasts;
    protected AdditionalCodings additionalCodings;
    protected AdditionalCodingDescriptions additionalCodingDescriptions;
    protected BigDecimal firstMonthForecast;
    protected Long firstMonthForecastLong;
    protected HangTags hangTags;
    protected String labelGroup;
    protected Labels labels;
    protected MarketingModelNames marketingModelNames;
    protected Packages packages;
    protected PackageNames packageNames;
    protected String productLevel;
    protected String referenceModelNumber;
    protected String salesSizeScale;
    protected String salesSizeScaleCode;
    protected TechnologyComponents technologyComponents;
    protected String developer;
    protected String modelCreationSeason;
    protected String referenceModelName;
    protected String sourceSystem;
    protected String widthProject;
    protected Long modelId;
    protected String seniorDesigner;
    protected String seniorDeveloper;
    protected String designer;
    protected String colorDesigner;
    protected String changeRequestFlag;
    protected String activeChangeRequestFlag;
    protected String macroModelId;
    protected String errorFlag;
    protected String errorSource;

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
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
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
     * Gets the value of the productDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDivision() {
        return productDivision;
    }

    /**
     * Sets the value of the productDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDivision(String value) {
        this.productDivision = value;
    }

    /**
     * Gets the value of the productGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupCode() {
        return productGroupCode;
    }

    /**
     * Sets the value of the productGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupCode(String value) {
        this.productGroupCode = value;
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
     * Gets the value of the developmentOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentOrganization() {
        return developmentOrganization;
    }

    /**
     * Sets the value of the developmentOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentOrganization(String value) {
        this.developmentOrganization = value;
    }

    /**
     * Gets the value of the placeHolderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceHolderFlag() {
        return placeHolderFlag;
    }

    /**
     * Sets the value of the placeHolderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceHolderFlag(String value) {
        this.placeHolderFlag = value;
    }

    /**
     * Gets the value of the placeHolderStyleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlaceHolderStyleCount() {
        return placeHolderStyleCount;
    }

    /**
     * Sets the value of the placeHolderStyleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlaceHolderStyleCount(Long value) {
        this.placeHolderStyleCount = value;
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
     * Gets the value of the replenishmentflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplenishmentflag() {
        return replenishmentflag;
    }

    /**
     * Sets the value of the replenishmentflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplenishmentflag(String value) {
        this.replenishmentflag = value;
    }

    /**
     * Gets the value of the factoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * Sets the value of the factoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryName(String value) {
        this.factoryName = value;
    }

    /**
     * Gets the value of the projectManagerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectManagerName() {
        return projectManagerName;
    }

    /**
     * Sets the value of the projectManagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectManagerName(String value) {
        this.projectManagerName = value;
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
     * Gets the value of the midSoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidSoleId() {
        return midSoleId;
    }

    /**
     * Sets the value of the midSoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidSoleId(String value) {
        this.midSoleId = value;
    }

    /**
     * Gets the value of the midSoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidSoleDescription() {
        return midSoleDescription;
    }

    /**
     * Sets the value of the midSoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidSoleDescription(String value) {
        this.midSoleDescription = value;
    }

    /**
     * Gets the value of the outSoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoleId() {
        return outSoleId;
    }

    /**
     * Sets the value of the outSoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoleId(String value) {
        this.outSoleId = value;
    }

    /**
     * Gets the value of the outSoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoleDescription() {
        return outSoleDescription;
    }

    /**
     * Sets the value of the outSoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoleDescription(String value) {
        this.outSoleDescription = value;
    }

    /**
     * Gets the value of the silhouetteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilhouetteId() {
        return silhouetteId;
    }

    /**
     * Sets the value of the silhouetteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilhouetteId(String value) {
        this.silhouetteId = value;
    }

    /**
     * Gets the value of the silhouetteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilhouetteDescription() {
        return silhouetteDescription;
    }

    /**
     * Sets the value of the silhouetteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilhouetteDescription(String value) {
        this.silhouetteDescription = value;
    }

    /**
     * Gets the value of the sampleSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleSize(String value) {
        this.sampleSize = value;
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
     * Gets the value of the sizesCode property.
     * 
     * @return
     *     possible object is
     *     {@link Sizes }
     *     
     */
    public Sizes getSizesCode() {
        return sizesCode;
    }

    /**
     * Sets the value of the sizesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sizes }
     *     
     */
    public void setSizesCode(Sizes value) {
        this.sizesCode = value;
    }

    /**
     * Gets the value of the sizesIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Sizes }
     *     
     */
    public Sizes getSizesIndex() {
        return sizesIndex;
    }

    /**
     * Sets the value of the sizesIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sizes }
     *     
     */
    public void setSizesIndex(Sizes value) {
        this.sizesIndex = value;
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
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link Labels }
     *     
     */
    public Labels getLabels() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Labels }
     *     
     */
    public void setLabels(Labels value) {
        this.labels = value;
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
     * Gets the value of the packageNames property.
     * 
     * @return
     *     possible object is
     *     {@link PackageNames }
     *     
     */
    public PackageNames getPackageNames() {
        return packageNames;
    }

    /**
     * Sets the value of the packageNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageNames }
     *     
     */
    public void setPackageNames(PackageNames value) {
        this.packageNames = value;
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
     * Gets the value of the salesSizeScaleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesSizeScaleCode() {
        return salesSizeScaleCode;
    }

    /**
     * Sets the value of the salesSizeScaleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesSizeScaleCode(String value) {
        this.salesSizeScaleCode = value;
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
     * Gets the value of the modelCreationSeason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelCreationSeason() {
        return modelCreationSeason;
    }

    /**
     * Sets the value of the modelCreationSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelCreationSeason(String value) {
        this.modelCreationSeason = value;
    }

    /**
     * Gets the value of the referenceModelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceModelName() {
        return referenceModelName;
    }

    /**
     * Sets the value of the referenceModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceModelName(String value) {
        this.referenceModelName = value;
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
     * Gets the value of the widthProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidthProject() {
        return widthProject;
    }

    /**
     * Sets the value of the widthProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidthProject(String value) {
        this.widthProject = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModelId(Long value) {
        this.modelId = value;
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
     * Gets the value of the macroModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacroModelId() {
        return macroModelId;
    }

    /**
     * Sets the value of the macroModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacroModelId(String value) {
        this.macroModelId = value;
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
