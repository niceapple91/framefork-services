
package com.adidas.sef.ws.schema.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.ModelAttrNames;
import com.adidas.sef.ws.schema.common.RangeAttrNames;


/**
 * <p>Java class for modelRangeAttrNames complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelRangeAttrNames">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelAttrNames" type="{http://www.adidas.com/sef/ws/schema/common}modelAttrNames" maxOccurs="unbounded"/>
 *         &lt;element name="rangeAttrNames" type="{http://www.adidas.com/sef/ws/schema/common}rangeAttrNames" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelRangeAttrNames", propOrder = {
    "modelAttrNames",
    "rangeAttrNames"
})
public class ModelRangeAttrNames {

    @XmlElement(required = true)
    protected List<ModelAttrNames> modelAttrNames;
    @XmlElement(nillable = true)
    protected List<RangeAttrNames> rangeAttrNames;

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

}
