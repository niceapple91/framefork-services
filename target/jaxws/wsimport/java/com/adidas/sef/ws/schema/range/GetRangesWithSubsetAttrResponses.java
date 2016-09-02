
package com.adidas.sef.ws.schema.range;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.adidas.sef.ws.schema.common.Errors;


/**
 * <p>Java class for getRangesWithSubsetAttrResponses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRangesWithSubsetAttrResponses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRangesWithSubsetAttrResponse" type="{http://www.adidas.com/sef/ws/schema/range}getRangesWithSubsetAttrResponse" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getRangesWithSubsetAttrResponses", propOrder = {
    "getRangesWithSubsetAttrResponse",
    "errors"
})
public class GetRangesWithSubsetAttrResponses {

    @XmlElement(nillable = true)
    protected List<GetRangesWithSubsetAttrResponse> getRangesWithSubsetAttrResponse;
    protected Errors errors;

    /**
     * Gets the value of the getRangesWithSubsetAttrResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getRangesWithSubsetAttrResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetRangesWithSubsetAttrResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetRangesWithSubsetAttrResponse }
     * 
     * 
     */
    public List<GetRangesWithSubsetAttrResponse> getGetRangesWithSubsetAttrResponse() {
        if (getRangesWithSubsetAttrResponse == null) {
            getRangesWithSubsetAttrResponse = new ArrayList<GetRangesWithSubsetAttrResponse>();
        }
        return this.getRangesWithSubsetAttrResponse;
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
