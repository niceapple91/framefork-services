
package com.adidas.sef.ws.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChangeRequestInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRequestInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Season" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Devtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="changes" type="{http://www.adidas.com/sef/ws/schema/common}Changes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRequestInformation", propOrder = {
    "dbTimeStamp",
    "id",
    "owner",
    "season",
    "modelNumber",
    "modelName",
    "devtype",
    "status",
    "changes"
})
public class ChangeRequestInformation {

    @XmlElement(name = "DBTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dbTimeStamp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Owner", required = true)
    protected String owner;
    @XmlElement(name = "Season", required = true)
    protected String season;
    @XmlElement(name = "ModelNumber", required = true)
    protected String modelNumber;
    @XmlElement(name = "ModelName", required = true)
    protected String modelName;
    @XmlElement(name = "Devtype", required = true)
    protected String devtype;
    @XmlElement(name = "Status")
    protected byte status;
    @XmlElement(required = true)
    protected Changes changes;

    /**
     * Gets the value of the dbTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDBTimeStamp() {
        return dbTimeStamp;
    }

    /**
     * Sets the value of the dbTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDBTimeStamp(XMLGregorianCalendar value) {
        this.dbTimeStamp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeason(String value) {
        this.season = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the devtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevtype() {
        return devtype;
    }

    /**
     * Sets the value of the devtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevtype(String value) {
        this.devtype = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(byte value) {
        this.status = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link Changes }
     *     
     */
    public Changes getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Changes }
     *     
     */
    public void setChanges(Changes value) {
        this.changes = value;
    }

}
