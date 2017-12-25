
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for communication complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="communication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="source" type="{http://www.infpres.com/IEDMS}communicationPartner" minOccurs="0"/>
 *                   &lt;element name="operator" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" use="required" type="{http://www.infpres.com/IEDMS}messageType" />
 *                 &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="citizenRequest" type="{http://www.infpres.com/IEDMS}CitizenRequestDocument" minOccurs="0"/>
 *           &lt;element name="files" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="file" type="{http://www.infpres.com/IEDMS}associatedFile" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="acknowledgment" type="{http://www.infpres.com/IEDMS}messageAcknowledgment" minOccurs="0"/>
 *           &lt;element name="document" type="{http://www.infpres.com/IEDMS}document" minOccurs="0"/>
 *           &lt;element name="task" type="{http://www.infpres.com/IEDMS}Task" minOccurs="0"/>
 *           &lt;element name="resolution" type="{http://www.infpres.com/IEDMS}Resolution" minOccurs="0"/>
 *           &lt;element name="subjectDocument" type="{http://www.infpres.com/IEDMS}SubjectDocument" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="deliveryIndex" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="destination" type="{http://www.infpres.com/IEDMS}deliveryDestination" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "communication", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "header",
    "citizenRequestOrFilesOrAcknowledgment",
    "deliveryIndex"
})
public class Communication {

    protected Communication.Header header;
    @XmlElements({
        @XmlElement(name = "citizenRequest", type = CitizenRequestDocument.class),
        @XmlElement(name = "files", type = Communication.Files.class),
        @XmlElement(name = "acknowledgment", type = MessageAcknowledgment.class),
        @XmlElement(name = "document", type = Document.class),
        @XmlElement(name = "task", type = Task.class),
        @XmlElement(name = "resolution", type = Resolution.class),
        @XmlElement(name = "subjectDocument", type = SubjectDocument.class)
    })
    protected List<Object> citizenRequestOrFilesOrAcknowledgment;
    protected Communication.DeliveryIndex deliveryIndex;
    @XmlAttribute(name = "version", namespace = "http://www.infpres.com/IEDMS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

    /**
     * Gets the value of the header property.
     *
     * @return
     *     possible object is
     *     {@link Communication.Header }
     *
     */
    public Communication.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     *
     * @param value
     *     allowed object is
     *     {@link Communication.Header }
     *
     */
    public void setHeader(Communication.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the citizenRequestOrFilesOrAcknowledgment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenRequestOrFilesOrAcknowledgment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenRequestOrFilesOrAcknowledgment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenRequestDocument }
     * {@link Communication.Files }
     * {@link MessageAcknowledgment }
     * {@link Document }
     * {@link Task }
     * {@link Resolution }
     * {@link SubjectDocument }
     *
     *
     */
    public List<Object> getCitizenRequestOrFilesOrAcknowledgment() {
        if (citizenRequestOrFilesOrAcknowledgment == null) {
            citizenRequestOrFilesOrAcknowledgment = new ArrayList<Object>();
        }
        return this.citizenRequestOrFilesOrAcknowledgment;
    }

    /**
     * Gets the value of the deliveryIndex property.
     *
     * @return
     *     possible object is
     *     {@link Communication.DeliveryIndex }
     *
     */
    public Communication.DeliveryIndex getDeliveryIndex() {
        return deliveryIndex;
    }

    /**
     * Sets the value of the deliveryIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link Communication.DeliveryIndex }
     *
     */
    public void setDeliveryIndex(Communication.DeliveryIndex value) {
        this.deliveryIndex = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }


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
     *         &lt;element name="destination" type="{http://www.infpres.com/IEDMS}deliveryDestination" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destination"
    })
    public static class DeliveryIndex {

        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected List<DeliveryDestination> destination;
        @XmlAttribute(name = "cookie", namespace = "http://www.infpres.com/IEDMS")
        protected String cookie;

        /**
         * Gets the value of the destination property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destination property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestination().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeliveryDestination }
         *
         *
         */
        public List<DeliveryDestination> getDestination() {
            if (destination == null) {
                destination = new ArrayList<DeliveryDestination>();
            }
            return this.destination;
        }

        /**
         * Gets the value of the cookie property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCookie() {
            return cookie;
        }

        /**
         * Sets the value of the cookie property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCookie(String value) {
            this.cookie = value;
        }

    }


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
     *         &lt;element name="file" type="{http://www.infpres.com/IEDMS}associatedFile" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "file"
    })
    public static class Files {

        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected List<AssociatedFile> file;
        @XmlAttribute(name = "cookie", namespace = "http://www.infpres.com/IEDMS")
        protected String cookie;

        /**
         * Gets the value of the file property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssociatedFile }
         *
         *
         */
        public List<AssociatedFile> getFile() {
            if (file == null) {
                file = new ArrayList<AssociatedFile>();
            }
            return this.file;
        }

        /**
         * Gets the value of the cookie property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCookie() {
            return cookie;
        }

        /**
         * Sets the value of the cookie property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCookie(String value) {
            this.cookie = value;
        }

    }


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
     *         &lt;element name="source" type="{http://www.infpres.com/IEDMS}communicationPartner" minOccurs="0"/>
     *         &lt;element name="operator" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
     *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="type" use="required" type="{http://www.infpres.com/IEDMS}messageType" />
     *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "source",
        "operator",
        "comment"
    })
    public static class Header {

        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected CommunicationPartner source;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected QualifiedValue operator;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected String comment;
        @XmlAttribute(name = "type", namespace = "http://www.infpres.com/IEDMS", required = true)
        protected MessageType type;
        @XmlAttribute(name = "uid", namespace = "http://www.infpres.com/IEDMS")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String uid;
        @XmlAttribute(name = "created", namespace = "http://www.infpres.com/IEDMS")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar created;
        @XmlAttribute(name = "cookie", namespace = "http://www.infpres.com/IEDMS")
        protected String cookie;

        /**
         * Gets the value of the source property.
         *
         * @return
         *     possible object is
         *     {@link CommunicationPartner }
         *
         */
        public CommunicationPartner getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         *
         * @param value
         *     allowed object is
         *     {@link CommunicationPartner }
         *
         */
        public void setSource(CommunicationPartner value) {
            this.source = value;
        }

        /**
         * Gets the value of the operator property.
         *
         * @return
         *     possible object is
         *     {@link QualifiedValue }
         *
         */
        public QualifiedValue getOperator() {
            return operator;
        }

        /**
         * Sets the value of the operator property.
         *
         * @param value
         *     allowed object is
         *     {@link QualifiedValue }
         *
         */
        public void setOperator(QualifiedValue value) {
            this.operator = value;
        }

        /**
         * Gets the value of the comment property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Gets the value of the type property.
         *
         * @return
         *     possible object is
         *     {@link MessageType }
         *
         */
        public MessageType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         *
         * @param value
         *     allowed object is
         *     {@link MessageType }
         *
         */
        public void setType(MessageType value) {
            this.type = value;
        }

        /**
         * Gets the value of the uid property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUid() {
            return uid;
        }

        /**
         * Sets the value of the uid property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUid(String value) {
            this.uid = value;
        }

        /**
         * Gets the value of the created property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getCreated() {
            return created;
        }

        /**
         * Sets the value of the created property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setCreated(XMLGregorianCalendar value) {
            this.created = value;
        }

        /**
         * Gets the value of the cookie property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCookie() {
            return cookie;
        }

        /**
         * Sets the value of the cookie property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCookie(String value) {
            this.cookie = value;
        }

    }

}
