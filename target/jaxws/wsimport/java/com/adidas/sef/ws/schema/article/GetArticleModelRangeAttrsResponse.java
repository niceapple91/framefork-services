
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.ModelAttrsResponse;
import com.adidas.sef.ws.schema.common.RangeAttrsResponse;


/**
 * <p>Java class for getArticleModelRangeAttrsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getArticleModelRangeAttrsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rangeAttrsResponse" type="{http://www.adidas.com/sef/ws/schema/common}rangeAttrsResponse" minOccurs="0"/>
 *         &lt;element name="modelAttrsResponse" type="{http://www.adidas.com/sef/ws/schema/common}modelAttrsResponse" minOccurs="0"/>
 *         &lt;element name="articleAttrsResponse" type="{http://www.adidas.com/sef/ws/schema/article}articleAttrsResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArticleModelRangeAttrsResponse", propOrder = {
    "rangeAttrsResponse",
    "modelAttrsResponse",
    "articleAttrsResponse"
})
public class GetArticleModelRangeAttrsResponse {

    protected RangeAttrsResponse rangeAttrsResponse;
    protected ModelAttrsResponse modelAttrsResponse;
    @XmlElement(required = true)
    protected ArticleAttrsResponse articleAttrsResponse;

    /**
     * Gets the value of the rangeAttrsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RangeAttrsResponse }
     *     
     */
    public RangeAttrsResponse getRangeAttrsResponse() {
        return rangeAttrsResponse;
    }

    /**
     * Sets the value of the rangeAttrsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeAttrsResponse }
     *     
     */
    public void setRangeAttrsResponse(RangeAttrsResponse value) {
        this.rangeAttrsResponse = value;
    }

    /**
     * Gets the value of the modelAttrsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ModelAttrsResponse }
     *     
     */
    public ModelAttrsResponse getModelAttrsResponse() {
        return modelAttrsResponse;
    }

    /**
     * Sets the value of the modelAttrsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelAttrsResponse }
     *     
     */
    public void setModelAttrsResponse(ModelAttrsResponse value) {
        this.modelAttrsResponse = value;
    }

    /**
     * Gets the value of the articleAttrsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleAttrsResponse }
     *     
     */
    public ArticleAttrsResponse getArticleAttrsResponse() {
        return articleAttrsResponse;
    }

    /**
     * Sets the value of the articleAttrsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleAttrsResponse }
     *     
     */
    public void setArticleAttrsResponse(ArticleAttrsResponse value) {
        this.articleAttrsResponse = value;
    }

}
