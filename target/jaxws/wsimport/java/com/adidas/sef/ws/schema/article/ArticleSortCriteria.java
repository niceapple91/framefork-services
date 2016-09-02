
package com.adidas.sef.ws.schema.article;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.SortOrder;


/**
 * <p>Java class for articleSortCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="articleSortCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.adidas.com/sef/ws/schema/article}articleSortColumns"/>
 *         &lt;element name="sortOrder" type="{http://www.adidas.com/sef/ws/schema/common}sortOrder"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articleSortCriteria", propOrder = {
    "columnName",
    "sortOrder"
})
public class ArticleSortCriteria {

    @XmlElement(required = true)
    protected ArticleSortColumns columnName;
    @XmlElement(required = true, defaultValue = "ASC")
    protected SortOrder sortOrder;

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleSortColumns }
     *     
     */
    public ArticleSortColumns getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleSortColumns }
     *     
     */
    public void setColumnName(ArticleSortColumns value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

}
