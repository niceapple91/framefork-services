
package com.adidas.sef.ws.schema.range;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createRangeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createRangeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rangeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productManagers" type="{http://www.adidas.com/sef/ws/schema/range}productManagers" minOccurs="0"/>
 *         &lt;element name="targetGoInMarginPct" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="targetNetSalesAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="targetVolumeUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetModelCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetArticleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetSilhouetteCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetToolingCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createRangeRequest", propOrder = {
    "brandCode",
    "seasonCode",
    "mrktDepartment",
    "rangeName",
    "productDivision",
    "productManagers",
    "targetGoInMarginPct",
    "targetNetSalesAmount",
    "targetVolumeUnits",
    "targetModelCount",
    "targetArticleCount",
    "targetSilhouetteCount",
    "targetToolingCount"
})
public class CreateRangeRequest {

    @XmlElement(required = true)
    protected String brandCode;
    @XmlElement(required = true)
    protected String seasonCode;
    @XmlElement(required = true)
    protected String mrktDepartment;
    @XmlElement(required = true)
    protected String rangeName;
    @XmlElement(required = true)
    protected String productDivision;
    protected ProductManagers productManagers;
    protected Float targetGoInMarginPct;
    protected BigDecimal targetNetSalesAmount;
    protected Long targetVolumeUnits;
    protected Long targetModelCount;
    protected Long targetArticleCount;
    protected Long targetSilhouetteCount;
    protected Long targetToolingCount;

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
     * Gets the value of the productManagers property.
     * 
     * @return
     *     possible object is
     *     {@link ProductManagers }
     *     
     */
    public ProductManagers getProductManagers() {
        return productManagers;
    }

    /**
     * Sets the value of the productManagers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductManagers }
     *     
     */
    public void setProductManagers(ProductManagers value) {
        this.productManagers = value;
    }

    /**
     * Gets the value of the targetGoInMarginPct property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTargetGoInMarginPct() {
        return targetGoInMarginPct;
    }

    /**
     * Sets the value of the targetGoInMarginPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTargetGoInMarginPct(Float value) {
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

}
