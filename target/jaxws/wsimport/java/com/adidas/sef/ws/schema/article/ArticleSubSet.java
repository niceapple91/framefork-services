
package com.adidas.sef.ws.schema.article;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for articleSubSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="articleSubSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articleRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="articleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktProposedColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualFOB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rrpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="gim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articleSubSet", propOrder = {
    "articleRangeId",
    "articleNumber",
    "mrktProposedColor",
    "developmentTypeCode",
    "specialUsageCode",
    "actualFOB",
    "retailIntroDate",
    "rrp",
    "rrpCurrencyCode",
    "articleStatusCode",
    "mrktForecast",
    "gim"
})
public class ArticleSubSet {

    protected long articleRangeId;
    protected String articleNumber;
    protected String mrktProposedColor;
    protected String developmentTypeCode;
    protected String specialUsageCode;
    protected Double actualFOB;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retailIntroDate;
    protected Double rrp;
    protected String rrpCurrencyCode;
    protected String articleStatusCode;
    protected BigDecimal mrktForecast;
    protected String gim;

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
     * Gets the value of the gim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGim() {
        return gim;
    }

    /**
     * Sets the value of the gim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGim(String value) {
        this.gim = value;
    }

}
