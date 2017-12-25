
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;


/**
 * <p>Java class for linkedDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="linkedDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkType" type="{http://www.infpres.com/IEDMS}linkType"/>
 *         &lt;choice>
 *           &lt;element name="reference" type="{http://www.infpres.com/IEDMS}documentReference" minOccurs="0"/>
 *           &lt;element name="document" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="kind" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *                     &lt;element name="num" type="{http://www.infpres.com/IEDMS}documentNumber" minOccurs="0"/>
 *                     &lt;element name="classification" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *                     &lt;element name="signatories" type="{http://www.infpres.com/IEDMS}ArrayOfSignatory" minOccurs="0"/>
 *                     &lt;element name="addressees" type="{http://www.infpres.com/IEDMS}ArrayOfAddressee" minOccurs="0"/>
 *                     &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                     &lt;element name="enclosuresPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                     &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="enclosures" type="{http://www.infpres.com/IEDMS}ArrayOfEnclosure" minOccurs="0"/>
 *                     &lt;element name="correspondents" type="{http://www.infpres.com/IEDMS}ArrayOfCorrespondent" minOccurs="0"/>
 *                     &lt;element name="links" type="{http://www.infpres.com/IEDMS}ArrayOfLinkedDocument" minOccurs="0"/>
 *                     &lt;element name="clauses" type="{http://www.infpres.com/IEDMS}ArrayOfDocumentClause" minOccurs="0"/>
 *                     &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkedDocument", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "linkType",
    "reference",
    "document"
})
public class LinkedDocument {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LinkType2 linkType;
    protected DocumentReference reference;
    protected LinkedDocument.Document document;
    @XmlAttribute(name = "uid", namespace = "http://www.infpres.com/IEDMS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uid;
    @XmlAttribute(name = "id", namespace = "http://www.infpres.com/IEDMS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;

    /**
     * Gets the value of the linkType property.
     *
     * @return
     *     possible object is
     *     {@link LinkType2 }
     *
     */
    public LinkType2 getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     *
     * @param value
     *     allowed object is
     *     {@link LinkType2 }
     *
     */
    public void setLinkType(LinkType2 value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the reference property.
     *
     * @return
     *     possible object is
     *     {@link DocumentReference }
     *
     */
    public DocumentReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentReference }
     *
     */
    public void setReference(DocumentReference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link LinkedDocument.Document }
     *
     */
    public LinkedDocument.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link LinkedDocument.Document }
     *
     */
    public void setDocument(LinkedDocument.Document value) {
        this.document = value;
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
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="kind" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
     *         &lt;element name="num" type="{http://www.infpres.com/IEDMS}documentNumber" minOccurs="0"/>
     *         &lt;element name="classification" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
     *         &lt;element name="signatories" type="{http://www.infpres.com/IEDMS}ArrayOfSignatory" minOccurs="0"/>
     *         &lt;element name="addressees" type="{http://www.infpres.com/IEDMS}ArrayOfAddressee" minOccurs="0"/>
     *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="enclosuresPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="enclosures" type="{http://www.infpres.com/IEDMS}ArrayOfEnclosure" minOccurs="0"/>
     *         &lt;element name="correspondents" type="{http://www.infpres.com/IEDMS}ArrayOfCorrespondent" minOccurs="0"/>
     *         &lt;element name="links" type="{http://www.infpres.com/IEDMS}ArrayOfLinkedDocument" minOccurs="0"/>
     *         &lt;element name="clauses" type="{http://www.infpres.com/IEDMS}ArrayOfDocumentClause" minOccurs="0"/>
     *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "kind",
        "num",
        "classification",
        "signatories",
        "addressees",
        "pages",
        "enclosuresPages",
        "annotation",
        "enclosures",
        "correspondents",
        "links",
        "clauses",
        "comment"
    })
    public static class Document {

        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected QualifiedValue kind;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected DocumentNumber num;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected QualifiedValue classification;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected ArrayOfSignatory signatories;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected ArrayOfAddressee addressees;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger pages;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger enclosuresPages;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS", required = true, nillable = true)
        protected String annotation;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected ArrayOfEnclosure enclosures;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected ArrayOfCorrespondent correspondents;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected ArrayOfLinkedDocument links;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected ArrayOfDocumentClause clauses;
        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected String comment;

        /**
         * Gets the value of the kind property.
         *
         * @return
         *     possible object is
         *     {@link QualifiedValue }
         *
         */
        public QualifiedValue getKind() {
            return kind;
        }

        /**
         * Sets the value of the kind property.
         *
         * @param value
         *     allowed object is
         *     {@link QualifiedValue }
         *
         */
        public void setKind(QualifiedValue value) {
            this.kind = value;
        }

        /**
         * Gets the value of the num property.
         *
         * @return
         *     possible object is
         *     {@link DocumentNumber }
         *
         */
        public DocumentNumber getNum() {
            return num;
        }

        /**
         * Sets the value of the num property.
         *
         * @param value
         *     allowed object is
         *     {@link DocumentNumber }
         *
         */
        public void setNum(DocumentNumber value) {
            this.num = value;
        }

        /**
         * Gets the value of the classification property.
         *
         * @return
         *     possible object is
         *     {@link QualifiedValue }
         *
         */
        public QualifiedValue getClassification() {
            return classification;
        }

        /**
         * Sets the value of the classification property.
         *
         * @param value
         *     allowed object is
         *     {@link QualifiedValue }
         *
         */
        public void setClassification(QualifiedValue value) {
            this.classification = value;
        }

        /**
         * Gets the value of the signatories property.
         *
         * @return
         *     possible object is
         *     {@link ArrayOfSignatory }
         *
         */
        public ArrayOfSignatory getSignatories() {
            return signatories;
        }

        /**
         * Sets the value of the signatories property.
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfSignatory }
         *
         */
        public void setSignatories(ArrayOfSignatory value) {
            this.signatories = value;
        }

        /**
         * Gets the value of the addressees property.
         *
         * @return
         *     possible object is
         *     {@link ArrayOfAddressee }
         *
         */
        public ArrayOfAddressee getAddressees() {
            return addressees;
        }

        /**
         * Sets the value of the addressees property.
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfAddressee }
         *
         */
        public void setAddressees(ArrayOfAddressee value) {
            this.addressees = value;
        }

        /**
         * Gets the value of the pages property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getPages() {
            return pages;
        }

        /**
         * Sets the value of the pages property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setPages(BigInteger value) {
            this.pages = value;
        }

        /**
         * Gets the value of the enclosuresPages property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getEnclosuresPages() {
            return enclosuresPages;
        }

        /**
         * Sets the value of the enclosuresPages property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setEnclosuresPages(BigInteger value) {
            this.enclosuresPages = value;
        }

        /**
         * Gets the value of the annotation property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAnnotation() {
            return annotation;
        }

        /**
         * Sets the value of the annotation property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAnnotation(String value) {
            this.annotation = value;
        }

        /**
         * Gets the value of the enclosures property.
         *
         * @return
         *     possible object is
         *     {@link ArrayOfEnclosure }
         *
         */
        public ArrayOfEnclosure getEnclosures() {
            return enclosures;
        }

        /**
         * Sets the value of the enclosures property.
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfEnclosure }
         *
         */
        public void setEnclosures(ArrayOfEnclosure value) {
            this.enclosures = value;
        }

        /**
         * Gets the value of the correspondents property.
         *
         * @return
         *     possible object is
         *     {@link ArrayOfCorrespondent }
         *
         */
        public ArrayOfCorrespondent getCorrespondents() {
            return correspondents;
        }

        /**
         * Sets the value of the correspondents property.
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfCorrespondent }
         *
         */
        public void setCorrespondents(ArrayOfCorrespondent value) {
            this.correspondents = value;
        }

        /**
         * Gets the value of the links property.
         *
         * @return
         *     possible object is
         *     {@link ArrayOfLinkedDocument }
         *
         */
        public ArrayOfLinkedDocument getLinks() {
            return links;
        }

        /**
         * Sets the value of the links property.
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfLinkedDocument }
         *
         */
        public void setLinks(ArrayOfLinkedDocument value) {
            this.links = value;
        }

        /**
         * Gets the value of the clauses property.
         *
         * @return
         *     possible object is
         *     {@link ArrayOfDocumentClause }
         *
         */
        public ArrayOfDocumentClause getClauses() {
            return clauses;
        }

        /**
         * Sets the value of the clauses property.
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfDocumentClause }
         *
         */
        public void setClauses(ArrayOfDocumentClause value) {
            this.clauses = value;
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

    }

}
