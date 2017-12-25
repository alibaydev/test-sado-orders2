
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotificationRow complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NotificationRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.infpres.com/IEDMS}NotificationStatus"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DocumentId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="LinkedDocument" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExtId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="References" type="{http://www.infpres.com/IEDMS}ArrayOfNotificationReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationRow", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "notificationId",
    "status",
    "text",
    "typeId",
    "documentId",
    "linkedDocument",
    "date",
    "extId",
    "references"
})
public class NotificationRow {

    @XmlElement(name = "NotificationId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String notificationId;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationStatus status;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "TypeId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String typeId;
    @XmlElement(name = "DocumentId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String documentId;
    @XmlElement(name = "LinkedDocument", required = true, nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String linkedDocument;
    @XmlElement(name = "Date", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "ExtId", required = true, nillable = true)
    protected String extId;
    @XmlElement(name = "References")
    protected ArrayOfNotificationReference references;

    /**
     * Gets the value of the notificationId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the value of the notificationId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNotificationId(String value) {
        this.notificationId = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link NotificationStatus }
     *
     */
    public NotificationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link NotificationStatus }
     *
     */
    public void setStatus(NotificationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the text property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the typeId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeId(String value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the documentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the linkedDocument property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkedDocument() {
        return linkedDocument;
    }

    /**
     * Sets the value of the linkedDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkedDocument(String value) {
        this.linkedDocument = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the extId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExtId() {
        return extId;
    }

    /**
     * Sets the value of the extId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExtId(String value) {
        this.extId = value;
    }

    /**
     * Gets the value of the references property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationReference }
     *
     */
    public ArrayOfNotificationReference getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationReference }
     *
     */
    public void setReferences(ArrayOfNotificationReference value) {
        this.references = value;
    }

}
