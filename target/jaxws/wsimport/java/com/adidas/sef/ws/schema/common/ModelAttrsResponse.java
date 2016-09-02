
package com.adidas.sef.ws.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for modelAttrsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelAttrsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.adidas.com/sef/ws/schema/common}modelAttrsResponseBase">
 *       &lt;sequence>
 *         &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dropDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidentialFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successfullyRelDwnStreamFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelReadyForRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualArticleCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalArticleCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="refLifeCycleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelAttrsResponse", propOrder = {
    "modelRangeId",
    "brandCode",
    "creationDate",
    "dropDate",
    "seasonCode",
    "subBrand",
    "confidentialFlag",
    "successfullyRelDwnStreamFlag",
    "businessSegmentCode",
    "modelReadyForRelease",
    "actualArticleCnt",
    "totalArticleCnt",
    "refLifeCycleStatusCode"
})
public class ModelAttrsResponse
    extends ModelAttrsResponseBase
{

    protected Long modelRangeId;
    protected String brandCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dropDate;
    protected String seasonCode;
    protected String subBrand;
    protected String confidentialFlag;
    protected String successfullyRelDwnStreamFlag;
    protected String businessSegmentCode;
    protected String modelReadyForRelease;
    protected Long actualArticleCnt;
    protected Long totalArticleCnt;
    protected String refLifeCycleStatusCode;

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
     * Gets the value of the dropDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropDate() {
        return dropDate;
    }

    /**
     * Sets the value of the dropDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropDate(XMLGregorianCalendar value) {
        this.dropDate = value;
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
     * Gets the value of the successfullyRelDwnStreamFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessfullyRelDwnStreamFlag() {
        return successfullyRelDwnStreamFlag;
    }

    /**
     * Sets the value of the successfullyRelDwnStreamFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessfullyRelDwnStreamFlag(String value) {
        this.successfullyRelDwnStreamFlag = value;
    }

    /**
     * Gets the value of the businessSegmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSegmentCode() {
        return businessSegmentCode;
    }

    /**
     * Sets the value of the businessSegmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSegmentCode(String value) {
        this.businessSegmentCode = value;
    }

    /**
     * Gets the value of the modelReadyForRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelReadyForRelease() {
        return modelReadyForRelease;
    }

    /**
     * Sets the value of the modelReadyForRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelReadyForRelease(String value) {
        this.modelReadyForRelease = value;
    }

    /**
     * Gets the value of the actualArticleCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualArticleCnt() {
        return actualArticleCnt;
    }

    /**
     * Sets the value of the actualArticleCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualArticleCnt(Long value) {
        this.actualArticleCnt = value;
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
     * Gets the value of the refLifeCycleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefLifeCycleStatusCode() {
        return refLifeCycleStatusCode;
    }

    /**
     * Sets the value of the refLifeCycleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefLifeCycleStatusCode(String value) {
        this.refLifeCycleStatusCode = value;
    }

}
