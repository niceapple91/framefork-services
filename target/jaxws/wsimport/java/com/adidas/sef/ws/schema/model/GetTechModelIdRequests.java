
package com.adidas.sef.ws.schema.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="getTechModelIdRequest" type="{http://www.adidas.com/sef/ws/schema/model}getTechModelIdRequest" maxOccurs="unbounded"/>
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
    "getTechModelIdRequest"
})
@XmlRootElement(name = "getTechModelIdRequests")
public class GetTechModelIdRequests {

    @XmlElement(required = true)
    protected List<GetTechModelIdRequest> getTechModelIdRequest;

    /**
     * Gets the value of the getTechModelIdRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getTechModelIdRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetTechModelIdRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetTechModelIdRequest }
     * 
     * 
     */
    public List<GetTechModelIdRequest> getGetTechModelIdRequest() {
        if (getTechModelIdRequest == null) {
            getTechModelIdRequest = new ArrayList<GetTechModelIdRequest>();
        }
        return this.getTechModelIdRequest;
    }

}
