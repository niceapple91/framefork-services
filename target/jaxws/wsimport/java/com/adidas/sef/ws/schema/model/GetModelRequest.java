
package com.adidas.sef.ws.schema.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.Pagination;
import com.adidas.sef.ws.schema.common.TechConceptCodes;


/**
 * <p>Java class for getModelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getModelRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rangePlanId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devLocationCodes" type="{http://www.adidas.com/sef/ws/schema/model}devLocationCodes" minOccurs="0"/>
 *         &lt;element name="sportsCategoryCodes" type="{http://www.adidas.com/sef/ws/schema/model}sportsCategoryCodes" minOccurs="0"/>
 *         &lt;element name="ageGroupCodes" type="{http://www.adidas.com/sef/ws/schema/model}ageGroupCodes" minOccurs="0"/>
 *         &lt;element name="genderCodes" type="{http://www.adidas.com/sef/ws/schema/model}genderCodes" minOccurs="0"/>
 *         &lt;element name="workingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retailExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="corporateMrktLineCodes" type="{http://www.adidas.com/sef/ws/schema/model}corporateMrktLineCodes" minOccurs="0"/>
 *         &lt;element name="categoryMrktLineCodes" type="{http://www.adidas.com/sef/ws/schema/model}categoryMrktLineCodes" minOccurs="0"/>
 *         &lt;element name="salesLineCodes" type="{http://www.adidas.com/sef/ws/schema/model}salesLineCodes" minOccurs="0"/>
 *         &lt;element name="productGroupCodes" type="{http://www.adidas.com/sef/ws/schema/model}productGroupCodes" minOccurs="0"/>
 *         &lt;element name="productTypeCodes" type="{http://www.adidas.com/sef/ws/schema/model}productTypeCodes" minOccurs="0"/>
 *         &lt;element name="developmentTypeCodes" type="{http://www.adidas.com/sef/ws/schema/model}developmentTypeCodes" minOccurs="0"/>
 *         &lt;element name="techConceptCodes" type="{http://www.adidas.com/sef/ws/schema/common}techConceptCodes" minOccurs="0"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="targetFOB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="buyingVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sorting" type="{http://www.adidas.com/sef/ws/schema/model}modelSort" minOccurs="0"/>
 *         &lt;element name="paginationDetails" type="{http://www.adidas.com/sef/ws/schema/common}pagination"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getModelRequest", propOrder = {
    "userName",
    "seasonCode",
    "brandCode",
    "rangePlanId",
    "modelNumber",
    "productManagerName",
    "subBrand",
    "mrktDepartment",
    "productDivision",
    "devLocationCodes",
    "sportsCategoryCodes",
    "ageGroupCodes",
    "genderCodes",
    "workingNumber",
    "modelName",
    "modelStatus",
    "modelDescr",
    "retailIntroDate",
    "retailExitDate",
    "corporateMrktLineCodes",
    "categoryMrktLineCodes",
    "salesLineCodes",
    "productGroupCodes",
    "productTypeCodes",
    "developmentTypeCodes",
    "techConceptCodes",
    "mrktForecast",
    "targetFOB",
    "rrp",
    "buyingVolumeUnit",
    "sorting",
    "paginationDetails"
})
public class GetModelRequest {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String seasonCode;
    @XmlElement(required = true)
    protected String brandCode;
    protected Long rangePlanId;
    protected String modelNumber;
    protected String productManagerName;
    protected String subBrand;
    protected String mrktDepartment;
    protected String productDivision;
    protected DevLocationCodes devLocationCodes;
    protected SportsCategoryCodes sportsCategoryCodes;
    protected AgeGroupCodes ageGroupCodes;
    protected GenderCodes genderCodes;
    protected String workingNumber;
    protected String modelName;
    protected String modelStatus;
    protected String modelDescr;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailIntroDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailExitDate;
    protected CorporateMrktLineCodes corporateMrktLineCodes;
    protected CategoryMrktLineCodes categoryMrktLineCodes;
    protected SalesLineCodes salesLineCodes;
    protected ProductGroupCodes productGroupCodes;
    protected ProductTypeCodes productTypeCodes;
    protected DevelopmentTypeCodes developmentTypeCodes;
    protected TechConceptCodes techConceptCodes;
    protected BigDecimal mrktForecast;
    protected BigDecimal targetFOB;
    protected BigDecimal rrp;
    protected BigDecimal buyingVolumeUnit;
    protected ModelSort sorting;
    @XmlElement(required = true)
    protected Pagination paginationDetails;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Gets the value of the devLocationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link DevLocationCodes }
     *     
     */
    public DevLocationCodes getDevLocationCodes() {
        return devLocationCodes;
    }

    /**
     * Sets the value of the devLocationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevLocationCodes }
     *     
     */
    public void setDevLocationCodes(DevLocationCodes value) {
        this.devLocationCodes = value;
    }

    /**
     * Gets the value of the sportsCategoryCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SportsCategoryCodes }
     *     
     */
    public SportsCategoryCodes getSportsCategoryCodes() {
        return sportsCategoryCodes;
    }

    /**
     * Sets the value of the sportsCategoryCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SportsCategoryCodes }
     *     
     */
    public void setSportsCategoryCodes(SportsCategoryCodes value) {
        this.sportsCategoryCodes = value;
    }

    /**
     * Gets the value of the ageGroupCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AgeGroupCodes }
     *     
     */
    public AgeGroupCodes getAgeGroupCodes() {
        return ageGroupCodes;
    }

    /**
     * Sets the value of the ageGroupCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeGroupCodes }
     *     
     */
    public void setAgeGroupCodes(AgeGroupCodes value) {
        this.ageGroupCodes = value;
    }

    /**
     * Gets the value of the genderCodes property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCodes }
     *     
     */
    public GenderCodes getGenderCodes() {
        return genderCodes;
    }

    /**
     * Sets the value of the genderCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodes }
     *     
     */
    public void setGenderCodes(GenderCodes value) {
        this.genderCodes = value;
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
     * Gets the value of the corporateMrktLineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateMrktLineCodes }
     *     
     */
    public CorporateMrktLineCodes getCorporateMrktLineCodes() {
        return corporateMrktLineCodes;
    }

    /**
     * Sets the value of the corporateMrktLineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateMrktLineCodes }
     *     
     */
    public void setCorporateMrktLineCodes(CorporateMrktLineCodes value) {
        this.corporateMrktLineCodes = value;
    }

    /**
     * Gets the value of the categoryMrktLineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryMrktLineCodes }
     *     
     */
    public CategoryMrktLineCodes getCategoryMrktLineCodes() {
        return categoryMrktLineCodes;
    }

    /**
     * Sets the value of the categoryMrktLineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryMrktLineCodes }
     *     
     */
    public void setCategoryMrktLineCodes(CategoryMrktLineCodes value) {
        this.categoryMrktLineCodes = value;
    }

    /**
     * Gets the value of the salesLineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SalesLineCodes }
     *     
     */
    public SalesLineCodes getSalesLineCodes() {
        return salesLineCodes;
    }

    /**
     * Sets the value of the salesLineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesLineCodes }
     *     
     */
    public void setSalesLineCodes(SalesLineCodes value) {
        this.salesLineCodes = value;
    }

    /**
     * Gets the value of the productGroupCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupCodes }
     *     
     */
    public ProductGroupCodes getProductGroupCodes() {
        return productGroupCodes;
    }

    /**
     * Sets the value of the productGroupCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupCodes }
     *     
     */
    public void setProductGroupCodes(ProductGroupCodes value) {
        this.productGroupCodes = value;
    }

    /**
     * Gets the value of the productTypeCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeCodes }
     *     
     */
    public ProductTypeCodes getProductTypeCodes() {
        return productTypeCodes;
    }

    /**
     * Sets the value of the productTypeCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeCodes }
     *     
     */
    public void setProductTypeCodes(ProductTypeCodes value) {
        this.productTypeCodes = value;
    }

    /**
     * Gets the value of the developmentTypeCodes property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentTypeCodes }
     *     
     */
    public DevelopmentTypeCodes getDevelopmentTypeCodes() {
        return developmentTypeCodes;
    }

    /**
     * Sets the value of the developmentTypeCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentTypeCodes }
     *     
     */
    public void setDevelopmentTypeCodes(DevelopmentTypeCodes value) {
        this.developmentTypeCodes = value;
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
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link ModelSort }
     *     
     */
    public ModelSort getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelSort }
     *     
     */
    public void setSorting(ModelSort value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the paginationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPaginationDetails() {
        return paginationDetails;
    }

    /**
     * Sets the value of the paginationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setPaginationDetails(Pagination value) {
        this.paginationDetails = value;
    }

}
