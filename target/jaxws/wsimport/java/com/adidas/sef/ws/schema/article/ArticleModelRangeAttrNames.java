
package com.adidas.sef.ws.schema.article;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.ModelAttrNames;
import com.adidas.sef.ws.schema.common.RangeAttrNames;


/**
 * <p>Java class for articleModelRangeAttrNames complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="articleModelRangeAttrNames">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rangeAttrNames" type="{http://www.adidas.com/sef/ws/schema/common}rangeAttrNames" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modelAttrNames" type="{http://www.adidas.com/sef/ws/schema/common}modelAttrNames" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="articleAttrNames" type="{http://www.adidas.com/sef/ws/schema/article}articleAttrNames" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articleModelRangeAttrNames", propOrder = {
    "rangeAttrNames",
    "modelAttrNames",
    "articleAttrNames"
})
public class ArticleModelRangeAttrNames {

    @XmlElement(nillable = true)
    protected List<RangeAttrNames> rangeAttrNames;
    @XmlElement(nillable = true)
    protected List<ModelAttrNames> modelAttrNames;
    @XmlElement(required = true)
    protected List<ArticleAttrNames> articleAttrNames;

    /**
     * Gets the value of the rangeAttrNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangeAttrNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeAttrNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeAttrNames }
     * 
     * 
     */
    public List<RangeAttrNames> getRangeAttrNames() {
        if (rangeAttrNames == null) {
            rangeAttrNames = new ArrayList<RangeAttrNames>();
        }
        return this.rangeAttrNames;
    }

    /**
     * Gets the value of the modelAttrNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelAttrNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelAttrNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelAttrNames }
     * 
     * 
     */
    public List<ModelAttrNames> getModelAttrNames() {
        if (modelAttrNames == null) {
            modelAttrNames = new ArrayList<ModelAttrNames>();
        }
        return this.modelAttrNames;
    }

    /**
     * Gets the value of the articleAttrNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleAttrNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticleAttrNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleAttrNames }
     * 
     * 
     */
    public List<ArticleAttrNames> getArticleAttrNames() {
        if (articleAttrNames == null) {
            articleAttrNames = new ArrayList<ArticleAttrNames>();
        }
        return this.articleAttrNames;
    }

}
