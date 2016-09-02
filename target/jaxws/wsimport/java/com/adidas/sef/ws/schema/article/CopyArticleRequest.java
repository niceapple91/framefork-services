
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copyArticleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copyArticleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articleRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyArticleRequest", propOrder = {
    "articleRangeId",
    "modelRangeId",
    "productManagerName",
    "mrktDepartment"
})
public class CopyArticleRequest {

    protected long articleRangeId;
    protected long modelRangeId;
    protected String productManagerName;
    protected String mrktDepartment;

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
     * Gets the value of the modelRangeId property.
     * 
     */
    public long getModelRangeId() {
        return modelRangeId;
    }

    /**
     * Sets the value of the modelRangeId property.
     * 
     */
    public void setModelRangeId(long value) {
        this.modelRangeId = value;
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

}
