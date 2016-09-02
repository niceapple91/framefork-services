
package com.adidas.sef.ws.schema.article;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.Pagination;


/**
 * <p>Java class for getArticleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getArticleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retailExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="developmentTypeCodes" type="{http://www.adidas.com/sef/ws/schema/article}developmentTypeCodes" minOccurs="0"/>
 *         &lt;element name="sellingRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatoryRangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="speedPropositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleLifecycleStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialUsages" type="{http://www.adidas.com/sef/ws/schema/article}specialUsages" minOccurs="0"/>
 *         &lt;element name="specialUsageCustomers" type="{http://www.adidas.com/sef/ws/schema/article}specialUsageCustomers" minOccurs="0"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sorting" type="{http://www.adidas.com/sef/ws/schema/article}articleSort" minOccurs="0"/>
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
@XmlType(name = "getArticleRequest", propOrder = {
    "userName",
    "seasonCode",
    "brandCode",
    "modelNumber",
    "articleNumber",
    "productManagerName",
    "mrktDepartment",
    "businessUnitCode",
    "workingNumber",
    "retailIntroDate",
    "retailExitDate",
    "developmentTypeCodes",
    "sellingRegionCode",
    "mandatoryRangeCode",
    "speedPropositionCode",
    "articleTypeCode",
    "articleStatusCode",
    "articleLifecycleStatus",
    "specialUsages",
    "specialUsageCustomers",
    "mrktForecast",
    "sorting",
    "paginationDetails"
})
public class GetArticleRequest {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String seasonCode;
    @XmlElement(required = true)
    protected String brandCode;
    protected String modelNumber;
    protected String articleNumber;
    protected String productManagerName;
    protected String mrktDepartment;
    protected String businessUnitCode;
    protected String workingNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailIntroDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailExitDate;
    protected DevelopmentTypeCodes developmentTypeCodes;
    protected String sellingRegionCode;
    protected String mandatoryRangeCode;
    protected String speedPropositionCode;
    protected String articleTypeCode;
    protected String articleStatusCode;
    protected String articleLifecycleStatus;
    protected SpecialUsages specialUsages;
    protected SpecialUsageCustomers specialUsageCustomers;
    protected BigDecimal mrktForecast;
    protected ArticleSort sorting;
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
     * Gets the value of the sellingRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingRegionCode() {
        return sellingRegionCode;
    }

    /**
     * Sets the value of the sellingRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingRegionCode(String value) {
        this.sellingRegionCode = value;
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
     * Gets the value of the articleLifecycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleLifecycleStatus() {
        return articleLifecycleStatus;
    }

    /**
     * Sets the value of the articleLifecycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleLifecycleStatus(String value) {
        this.articleLifecycleStatus = value;
    }

    /**
     * Gets the value of the specialUsages property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialUsages }
     *     
     */
    public SpecialUsages getSpecialUsages() {
        return specialUsages;
    }

    /**
     * Sets the value of the specialUsages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialUsages }
     *     
     */
    public void setSpecialUsages(SpecialUsages value) {
        this.specialUsages = value;
    }

    /**
     * Gets the value of the specialUsageCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialUsageCustomers }
     *     
     */
    public SpecialUsageCustomers getSpecialUsageCustomers() {
        return specialUsageCustomers;
    }

    /**
     * Sets the value of the specialUsageCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialUsageCustomers }
     *     
     */
    public void setSpecialUsageCustomers(SpecialUsageCustomers value) {
        this.specialUsageCustomers = value;
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
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleSort }
     *     
     */
    public ArticleSort getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleSort }
     *     
     */
    public void setSorting(ArticleSort value) {
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
