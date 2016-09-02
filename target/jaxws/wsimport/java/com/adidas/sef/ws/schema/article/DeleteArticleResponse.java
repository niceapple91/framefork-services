
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.Errors;
import com.adidas.sef.ws.schema.common.RespSummary;
import com.adidas.sef.ws.schema.common.Summary;


/**
 * <p>Java class for deleteArticleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteArticleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summary" type="{http://www.adidas.com/sef/ws/schema/common}summary"/>
 *         &lt;element name="deleteArticleRespSummary" type="{http://www.adidas.com/sef/ws/schema/common}respSummary" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://www.adidas.com/sef/ws/schema/common}errors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteArticleResponse", propOrder = {
    "summary",
    "deleteArticleRespSummary",
    "errors"
})
public class DeleteArticleResponse {

    @XmlElement(required = true)
    protected Summary summary;
    protected RespSummary deleteArticleRespSummary;
    protected Errors errors;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Summary }
     *     
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary }
     *     
     */
    public void setSummary(Summary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the deleteArticleRespSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RespSummary }
     *     
     */
    public RespSummary getDeleteArticleRespSummary() {
        return deleteArticleRespSummary;
    }

    /**
     * Sets the value of the deleteArticleRespSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSummary }
     *     
     */
    public void setDeleteArticleRespSummary(RespSummary value) {
        this.deleteArticleRespSummary = value;
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
