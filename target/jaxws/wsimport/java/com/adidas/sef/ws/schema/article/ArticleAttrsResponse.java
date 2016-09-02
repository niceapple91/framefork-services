
package com.adidas.sef.ws.schema.article;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.ArticleFullAttributeResponseBase;


/**
 * <p>Java class for articleAttrsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="articleAttrsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.adidas.com/sef/ws/schema/common}articleFullAttributeResponseBase">
 *       &lt;sequence>
 *         &lt;element name="actualFOBStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyStatusDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="earliestBuyReadyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="glblForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="successfullyRelDwnStreamFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replenishmentflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleReadyForRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidentialFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refModelActivationSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articleAttrsResponse", propOrder = {
    "actualFOBStatus",
    "businessUnitCode",
    "buyReadyStatusDescr",
    "buyReadyValidationStatus",
    "dropDate",
    "earliestBuyReadyDate",
    "glblForecast",
    "successfullyRelDwnStreamFlag",
    "replenishmentflag",
    "seasonCode",
    "articleReadyForRelease",
    "confidentialFlag",
    "refModelActivationSignature"
})
public class ArticleAttrsResponse
    extends ArticleFullAttributeResponseBase
{

    protected String actualFOBStatus;
    protected String businessUnitCode;
    protected String buyReadyStatusDescr;
    protected String buyReadyValidationStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dropDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestBuyReadyDate;
    protected BigDecimal glblForecast;
    protected String successfullyRelDwnStreamFlag;
    protected String replenishmentflag;
    protected String seasonCode;
    protected String articleReadyForRelease;
    protected String confidentialFlag;
    protected String refModelActivationSignature;

    /**
     * Gets the value of the actualFOBStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFOBStatus() {
        return actualFOBStatus;
    }

    /**
     * Sets the value of the actualFOBStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFOBStatus(String value) {
        this.actualFOBStatus = value;
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
     * Gets the value of the glblForecast property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlblForecast() {
        return glblForecast;
    }

    /**
     * Sets the value of the glblForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGlblForecast(BigDecimal value) {
        this.glblForecast = value;
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
     * Gets the value of the articleReadyForRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleReadyForRelease() {
        return articleReadyForRelease;
    }

    /**
     * Sets the value of the articleReadyForRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleReadyForRelease(String value) {
        this.articleReadyForRelease = value;
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
     * Gets the value of the refModelActivationSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefModelActivationSignature() {
        return refModelActivationSignature;
    }

    /**
     * Sets the value of the refModelActivationSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefModelActivationSignature(String value) {
        this.refModelActivationSignature = value;
    }

}
