
package com.adidas.sef.ws.schema.article;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for articleSort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="articleSort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.adidas.com/sef/ws/schema/article}articleSortCriteria" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articleSort", propOrder = {
    "columnName"
})
public class ArticleSort {

    @XmlElement(required = true)
    protected List<ArticleSortCriteria> columnName;

    /**
     * Gets the value of the columnName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleSortCriteria }
     * 
     * 
     */
    public List<ArticleSortCriteria> getColumnName() {
        if (columnName == null) {
            columnName = new ArrayList<ArticleSortCriteria>();
        }
        return this.columnName;
    }

}
