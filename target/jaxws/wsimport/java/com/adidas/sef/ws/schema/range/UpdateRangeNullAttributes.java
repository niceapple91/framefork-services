
package com.adidas.sef.ws.schema.range;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRangeNullAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRangeNullAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateRangeNullAttribute" type="{http://www.adidas.com/sef/ws/schema/range}updateRangeNullAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRangeNullAttributes", propOrder = {
    "updateRangeNullAttribute"
})
public class UpdateRangeNullAttributes {

    @XmlElement(nillable = true)
    protected List<UpdateRangeNullAttribute> updateRangeNullAttribute;

    /**
     * Gets the value of the updateRangeNullAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateRangeNullAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateRangeNullAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateRangeNullAttribute }
     * 
     * 
     */
    public List<UpdateRangeNullAttribute> getUpdateRangeNullAttribute() {
        if (updateRangeNullAttribute == null) {
            updateRangeNullAttribute = new ArrayList<UpdateRangeNullAttribute>();
        }
        return this.updateRangeNullAttribute;
    }

}
