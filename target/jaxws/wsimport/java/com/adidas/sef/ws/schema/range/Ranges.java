
package com.adidas.sef.ws.schema.range;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ranges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ranges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="range" type="{http://www.adidas.com/sef/ws/schema/range}Range" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ranges", propOrder = {
    "range"
})
public class Ranges {

    @XmlElement(required = true)
    protected List<Range> range;

    /**
     * Gets the value of the range property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the range property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Range }
     * 
     * 
     */
    public List<Range> getRange() {
        if (range == null) {
            range = new ArrayList<Range>();
        }
        return this.range;
    }

}
