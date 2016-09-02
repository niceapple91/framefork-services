
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="articleRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numberOfArticles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "articleRangeId",
    "numberOfArticles",
    "consumer"
})
@XmlRootElement(name = "duplicateArticleRequest")
public class DuplicateArticleRequest {

    @XmlElement(required = true)
    protected String userName;
    protected long articleRangeId;
    protected int numberOfArticles;
    @XmlElement(required = true)
    protected String consumer;

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
     * Gets the value of the numberOfArticles property.
     * 
     */
    public int getNumberOfArticles() {
        return numberOfArticles;
    }

    /**
     * Sets the value of the numberOfArticles property.
     * 
     */
    public void setNumberOfArticles(int value) {
        this.numberOfArticles = value;
    }

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumer(String value) {
        this.consumer = value;
    }

}
