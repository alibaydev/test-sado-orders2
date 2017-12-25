
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationReference complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NotificationReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectionId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ObjectId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="CardId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationReference", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "id",
    "name",
    "sectionId",
    "objectId",
    "cardId"
})
public class NotificationReference {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SectionId", required = true, nillable = true)
    protected String sectionId;
    @XmlElement(name = "ObjectId", required = true, nillable = true)
    protected String objectId;
    @XmlElement(name = "CardId", required = true, nillable = true)
    protected String cardId;

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
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sectionId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSectionId(String value) {
        this.sectionId = value;
    }

    /**
     * Gets the value of the objectId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the cardId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

}
