
package com.adidas.sef.ws.schema.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.range.GetRangesByIdResponse;


/**
 * <p>Java class for rangeAttrsResponseBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rangeAttrsResponseBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetGoInMarginPct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="targetNetSalesAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="targetVolumeUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetModelCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actGoInMarginPct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="actNetSalesAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="actMrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="actBuyingVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="actModelCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actArticleCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="newModelCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="carryOverModelCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="newArticleCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="carryOverArticleCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="confidentialList" type="{http://www.adidas.com/sef/ws/schema/common}confidentialList" minOccurs="0"/>
 *         &lt;element name="confidentialFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newClrArticleCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rangeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetSilhouetteCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetToolingCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualSilhouetteCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualToolingCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rangeAttrsResponseBase", propOrder = {
    "productDivision",
    "quarter",
    "targetGoInMarginPct",
    "targetNetSalesAmount",
    "targetVolumeUnits",
    "targetModelCount",
    "targetArticleCount",
    "actGoInMarginPct",
    "actNetSalesAmnt",
    "actMrktForecast",
    "actBuyingVolume",
    "actModelCnt",
    "actArticleCnt",
    "newModelCnt",
    "carryOverModelCnt",
    "newArticleCnt",
    "carryOverArticleCnt",
    "confidentialList",
    "confidentialFlag",
    "newClrArticleCnt",
    "seasonCode",
    "mrktDepartment",
    "rangeName",
    "brandCode",
    "creationDate",
    "rangeStatus",
    "subBrand",
    "targetSilhouetteCount",
    "targetToolingCount",
    "actualSilhouetteCount",
    "actualToolingCount",
    "startDate"
})
@XmlSeeAlso({
    RangeAttrsResponse.class,
    GetRangesByIdResponse.class
})
public class RangeAttrsResponseBase {

    protected String productDivision;
    protected String quarter;
    protected Double targetGoInMarginPct;
    protected BigDecimal targetNetSalesAmount;
    protected Long targetVolumeUnits;
    protected Long targetModelCount;
    protected Long targetArticleCount;
    protected Double actGoInMarginPct;
    protected BigDecimal actNetSalesAmnt;
    protected BigDecimal actMrktForecast;
    protected Double actBuyingVolume;
    protected Long actModelCnt;
    protected Long actArticleCnt;
    protected Long newModelCnt;
    protected Long carryOverModelCnt;
    protected Long newArticleCnt;
    protected Long carryOverArticleCnt;
    protected ConfidentialList confidentialList;
    protected String confidentialFlag;
    protected Long newClrArticleCnt;
    protected String seasonCode;
    protected String mrktDepartment;
    protected String rangeName;
    protected String brandCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String rangeStatus;
    protected String subBrand;
    protected Long targetSilhouetteCount;
    protected Long targetToolingCount;
    protected Long actualSilhouetteCount;
    protected Long actualToolingCount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;

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
     * Gets the value of the targetGoInMarginPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetGoInMarginPct() {
        return targetGoInMarginPct;
    }

    /**
     * Sets the value of the targetGoInMarginPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetGoInMarginPct(Double value) {
        this.targetGoInMarginPct = value;
    }

    /**
     * Gets the value of the targetNetSalesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetNetSalesAmount() {
        return targetNetSalesAmount;
    }

    /**
     * Sets the value of the targetNetSalesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetNetSalesAmount(BigDecimal value) {
        this.targetNetSalesAmount = value;
    }

    /**
     * Gets the value of the targetVolumeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetVolumeUnits() {
        return targetVolumeUnits;
    }

    /**
     * Sets the value of the targetVolumeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetVolumeUnits(Long value) {
        this.targetVolumeUnits = value;
    }

    /**
     * Gets the value of the targetModelCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetModelCount() {
        return targetModelCount;
    }

    /**
     * Sets the value of the targetModelCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetModelCount(Long value) {
        this.targetModelCount = value;
    }

    /**
     * Gets the value of the targetArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetArticleCount() {
        return targetArticleCount;
    }

    /**
     * Sets the value of the targetArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetArticleCount(Long value) {
        this.targetArticleCount = value;
    }

    /**
     * Gets the value of the actGoInMarginPct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActGoInMarginPct() {
        return actGoInMarginPct;
    }

    /**
     * Sets the value of the actGoInMarginPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActGoInMarginPct(Double value) {
        this.actGoInMarginPct = value;
    }

    /**
     * Gets the value of the actNetSalesAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActNetSalesAmnt() {
        return actNetSalesAmnt;
    }

    /**
     * Sets the value of the actNetSalesAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActNetSalesAmnt(BigDecimal value) {
        this.actNetSalesAmnt = value;
    }

    /**
     * Gets the value of the actMrktForecast property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActMrktForecast() {
        return actMrktForecast;
    }

    /**
     * Sets the value of the actMrktForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActMrktForecast(BigDecimal value) {
        this.actMrktForecast = value;
    }

    /**
     * Gets the value of the actBuyingVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActBuyingVolume() {
        return actBuyingVolume;
    }

    /**
     * Sets the value of the actBuyingVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActBuyingVolume(Double value) {
        this.actBuyingVolume = value;
    }

    /**
     * Gets the value of the actModelCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActModelCnt() {
        return actModelCnt;
    }

    /**
     * Sets the value of the actModelCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActModelCnt(Long value) {
        this.actModelCnt = value;
    }

    /**
     * Gets the value of the actArticleCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActArticleCnt() {
        return actArticleCnt;
    }

    /**
     * Sets the value of the actArticleCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActArticleCnt(Long value) {
        this.actArticleCnt = value;
    }

    /**
     * Gets the value of the newModelCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewModelCnt() {
        return newModelCnt;
    }

    /**
     * Sets the value of the newModelCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewModelCnt(Long value) {
        this.newModelCnt = value;
    }

    /**
     * Gets the value of the carryOverModelCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCarryOverModelCnt() {
        return carryOverModelCnt;
    }

    /**
     * Sets the value of the carryOverModelCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCarryOverModelCnt(Long value) {
        this.carryOverModelCnt = value;
    }

    /**
     * Gets the value of the newArticleCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewArticleCnt() {
        return newArticleCnt;
    }

    /**
     * Sets the value of the newArticleCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewArticleCnt(Long value) {
        this.newArticleCnt = value;
    }

    /**
     * Gets the value of the carryOverArticleCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCarryOverArticleCnt() {
        return carryOverArticleCnt;
    }

    /**
     * Sets the value of the carryOverArticleCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCarryOverArticleCnt(Long value) {
        this.carryOverArticleCnt = value;
    }

    /**
     * Gets the value of the confidentialList property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialList }
     *     
     */
    public ConfidentialList getConfidentialList() {
        return confidentialList;
    }

    /**
     * Sets the value of the confidentialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialList }
     *     
     */
    public void setConfidentialList(ConfidentialList value) {
        this.confidentialList = value;
    }

    /**
     * Gets the value of the confidentialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentialFlag() {
        return confidentialFlag;
    }

    /**
     * Sets the value of the confidentialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentialFlag(String value) {
        this.confidentialFlag = value;
    }

    /**
     * Gets the value of the newClrArticleCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewClrArticleCnt() {
        return newClrArticleCnt;
    }

    /**
     * Sets the value of the newClrArticleCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewClrArticleCnt(Long value) {
        this.newClrArticleCnt = value;
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
     * Gets the value of the rangeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeName() {
        return rangeName;
    }

    /**
     * Sets the value of the rangeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeName(String value) {
        this.rangeName = value;
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
     * Gets the value of the rangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeStatus() {
        return rangeStatus;
    }

    /**
     * Sets the value of the rangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeStatus(String value) {
        this.rangeStatus = value;
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
     * Gets the value of the targetSilhouetteCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetSilhouetteCount() {
        return targetSilhouetteCount;
    }

    /**
     * Sets the value of the targetSilhouetteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetSilhouetteCount(Long value) {
        this.targetSilhouetteCount = value;
    }

    /**
     * Gets the value of the targetToolingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetToolingCount() {
        return targetToolingCount;
    }

    /**
     * Sets the value of the targetToolingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetToolingCount(Long value) {
        this.targetToolingCount = value;
    }

    /**
     * Gets the value of the actualSilhouetteCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualSilhouetteCount() {
        return actualSilhouetteCount;
    }

    /**
     * Sets the value of the actualSilhouetteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualSilhouetteCount(Long value) {
        this.actualSilhouetteCount = value;
    }

    /**
     * Gets the value of the actualToolingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualToolingCount() {
        return actualToolingCount;
    }

    /**
     * Sets the value of the actualToolingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualToolingCount(Long value) {
        this.actualToolingCount = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
