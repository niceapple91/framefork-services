
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.adidas.sef.ws.schema.common.ArticleFullAttributeResponseBase;
import com.adidas.sef.ws.schema.common.Errors;


/**
 * <p>Java class for articleFullAttributeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="articleFullAttributeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.adidas.com/sef/ws/schema/common}articleFullAttributeResponseBase">
 *       &lt;sequence>
 *         &lt;element name="sellingRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="earliestBuyReadyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="buyReadyValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replenishmentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://www.adidas.com/sef/ws/schema/common}errors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articleFullAttributeResponse", propOrder = {
    "sellingRegionCode",
    "workingNumber",
    "modelNumber",
    "modelDescr",
    "articleCount",
    "earliestBuyReadyDate",
    "buyReadyValidationStatus",
    "buyReadyStatusDesc",
    "replenishmentFlag",
    "seasonCode",
    "errors"
})
public class ArticleFullAttributeResponse
    extends ArticleFullAttributeResponseBase
{

    protected String sellingRegionCode;
    protected String workingNumber;
    protected String modelNumber;
    protected String modelDescr;
    protected Long articleCount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestBuyReadyDate;
    protected String buyReadyValidationStatus;
    protected String buyReadyStatusDesc;
    protected String replenishmentFlag;
    protected String seasonCode;
    protected Errors errors;

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
     * Gets the value of the articleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArticleCount() {
        return articleCount;
    }

    /**
     * Sets the value of the articleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArticleCount(Long value) {
        this.articleCount = value;
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
     * Gets the value of the buyReadyStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyReadyStatusDesc() {
        return buyReadyStatusDesc;
    }

    /**
     * Sets the value of the buyReadyStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyReadyStatusDesc(String value) {
        this.buyReadyStatusDesc = value;
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
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

}
