
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for document complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentType" type="{http://www.infpres.com/IEDMS}DocumentType"/>
 *         &lt;element name="type" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.infpres.com/IEDMS}State"/>
 *         &lt;element name="kind" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="Executors" type="{http://www.infpres.com/IEDMS}ArrayOfAnyone" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.infpres.com/IEDMS}documentNumber" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="urgency" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="insteadOfDistributed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://www.infpres.com/IEDMS}ArrayOfProperty" minOccurs="0"/>
 *         &lt;element name="Case" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialMark" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Categories" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notifications" type="{http://www.infpres.com/IEDMS}ArrayOfNotificationRow" minOccurs="0"/>
 *         &lt;element name="signatories" type="{http://www.infpres.com/IEDMS}ArrayOfSignatory" minOccurs="0"/>
 *         &lt;element name="addressees" type="{http://www.infpres.com/IEDMS}ArrayOfAddressee" minOccurs="0"/>
 *         &lt;element name="RealAdresses" type="{http://www.infpres.com/IEDMS}ArrayOfAddressee1" minOccurs="0"/>
 *         &lt;element name="pagesCopies" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="enclosuresPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enclosures" type="{http://www.infpres.com/IEDMS}ArrayOfEnclosure" minOccurs="0"/>
 *         &lt;element name="correspondents" type="{http://www.infpres.com/IEDMS}ArrayOfCorrespondent" minOccurs="0"/>
 *         &lt;element name="links" type="{http://www.infpres.com/IEDMS}ArrayOfLinkedDocument" minOccurs="0"/>
 *         &lt;element name="clauses" type="{http://www.infpres.com/IEDMS}ArrayOfDocumentClause" minOccurs="0"/>
 *         &lt;element name="executor" type="{http://www.infpres.com/IEDMS}addresseeExt" minOccurs="0"/>
 *         &lt;element name="InternalNumber" type="{http://www.infpres.com/IEDMS}documentNumber" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.infpres.com/IEDMS}ArrayOfComment" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Approvers" type="{http://www.infpres.com/IEDMS}ArrayOfApprover" minOccurs="0"/>
 *         &lt;element name="SubjectDocument" type="{http://www.infpres.com/IEDMS}SubjectDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "document", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "documentType",
    "type",
    "state",
    "kind",
    "executors",
    "description",
    "num",
    "classification",
    "urgency",
    "insteadOfDistributed",
    "properties",
    "_case",
    "specialMark",
    "categories",
    "notifications",
    "signatories",
    "addressees",
    "realAdresses",
    "pagesCopies",
    "pages",
    "enclosuresPages",
    "annotation",
    "enclosures",
    "correspondents",
    "links",
    "clauses",
    "executor",
    "internalNumber",
    "comment",
    "comments",
    "createDate",
    "changeDate",
    "approvers",
    "subjectDocument"
})
public class Document {

    @XmlElement(name = "DocumentType", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentType documentType;
    protected QualifiedValue type;
    @XmlElement(name = "State", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected State2 state;
    protected QualifiedValue kind;
    @XmlElement(name = "Executors")
    protected ArrayOfAnyone executors;
    @XmlElement(name = "Description")
    protected String description;
    protected DocumentNumber num;
    protected QualifiedValue classification;
    protected QualifiedValue urgency;
    protected Boolean insteadOfDistributed;
    @XmlElement(name = "Properties")
    protected ArrayOfProperty properties;
    @XmlElement(name = "Case")
    protected String _case;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String specialMark;
    @XmlElement(name = "Categories")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> categories;
    @XmlElement(name = "Notifications")
    protected ArrayOfNotificationRow notifications;
    protected ArrayOfSignatory signatories;
    protected ArrayOfAddressee addressees;
    @XmlElement(name = "RealAdresses")
    protected ArrayOfAddressee1 realAdresses;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pagesCopies;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pages;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger enclosuresPages;
    @XmlElement(required = true, nillable = true)
    protected String annotation;
    protected ArrayOfEnclosure enclosures;
    protected ArrayOfCorrespondent correspondents;
    protected ArrayOfLinkedDocument links;
    protected ArrayOfDocumentClause clauses;
    protected AddresseeExt executor;
    @XmlElement(name = "InternalNumber")
    protected DocumentNumber internalNumber;
    protected String comment;
    @XmlElement(name = "Comments")
    protected ArrayOfComment comments;
    @XmlElement(name = "CreateDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "ChangeDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlElement(name = "Approvers")
    protected ArrayOfApprover approvers;
    @XmlElement(name = "SubjectDocument")
    protected SubjectDocument subjectDocument;
    @XmlAttribute(name = "uid", namespace = "http://www.infpres.com/IEDMS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uid;
    @XmlAttribute(name = "id", namespace = "http://www.infpres.com/IEDMS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlAttribute(name = "cookie", namespace = "http://www.infpres.com/IEDMS")
    protected String cookie;

    /**
     * Gets the value of the documentType property.
     *
     * @return
     *     possible object is
     *     {@link DocumentType }
     *
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link QualifiedValue }
     *
     */
    public QualifiedValue getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link QualifiedValue }
     *
     */
    public void setType(QualifiedValue value) {
        this.type = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link State2 }
     *
     */
    public State2 getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link State2 }
     *
     */
    public void setState(State2 value) {
        this.state = value;
    }

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
     * Gets the value of the executors property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAnyone }
     *
     */
    public ArrayOfAnyone getExecutors() {
        return executors;
    }

    /**
     * Sets the value of the executors property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyone }
     *
     */
    public void setExecutors(ArrayOfAnyone value) {
        this.executors = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the urgency property.
     *
     * @return
     *     possible object is
     *     {@link QualifiedValue }
     *
     */
    public QualifiedValue getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     *
     * @param value
     *     allowed object is
     *     {@link QualifiedValue }
     *
     */
    public void setUrgency(QualifiedValue value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the insteadOfDistributed property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isInsteadOfDistributed() {
        return insteadOfDistributed;
    }

    /**
     * Sets the value of the insteadOfDistributed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setInsteadOfDistributed(Boolean value) {
        this.insteadOfDistributed = value;
    }

    /**
     * Gets the value of the properties property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfProperty }
     *
     */
    public ArrayOfProperty getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfProperty }
     *
     */
    public void setProperties(ArrayOfProperty value) {
        this.properties = value;
    }

    /**
     * Gets the value of the case property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCase(String value) {
        this._case = value;
    }

    /**
     * Gets the value of the specialMark property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /**
     * Sets the value of the specialMark property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecialMark(String value) {
        this.specialMark = value;
    }

    /**
     * Gets the value of the categories property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getCategories() {
        if (categories == null) {
            categories = new ArrayList<String>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the notifications property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationRow }
     *
     */
    public ArrayOfNotificationRow getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationRow }
     *
     */
    public void setNotifications(ArrayOfNotificationRow value) {
        this.notifications = value;
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
     * Gets the value of the realAdresses property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAddressee1 }
     *
     */
    public ArrayOfAddressee1 getRealAdresses() {
        return realAdresses;
    }

    /**
     * Sets the value of the realAdresses property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressee1 }
     *
     */
    public void setRealAdresses(ArrayOfAddressee1 value) {
        this.realAdresses = value;
    }

    /**
     * Gets the value of the pagesCopies property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPagesCopies() {
        return pagesCopies;
    }

    /**
     * Sets the value of the pagesCopies property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPagesCopies(BigInteger value) {
        this.pagesCopies = value;
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
     * Gets the value of the executor property.
     *
     * @return
     *     possible object is
     *     {@link AddresseeExt }
     *
     */
    public AddresseeExt getExecutor() {
        return executor;
    }

    /**
     * Sets the value of the executor property.
     *
     * @param value
     *     allowed object is
     *     {@link AddresseeExt }
     *
     */
    public void setExecutor(AddresseeExt value) {
        this.executor = value;
    }

    /**
     * Gets the value of the internalNumber property.
     *
     * @return
     *     possible object is
     *     {@link DocumentNumber }
     *
     */
    public DocumentNumber getInternalNumber() {
        return internalNumber;
    }

    /**
     * Sets the value of the internalNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentNumber }
     *
     */
    public void setInternalNumber(DocumentNumber value) {
        this.internalNumber = value;
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
     * Gets the value of the comments property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfComment }
     *
     */
    public ArrayOfComment getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfComment }
     *
     */
    public void setComments(ArrayOfComment value) {
        this.comments = value;
    }

    /**
     * Gets the value of the createDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the changeDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the approvers property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfApprover }
     *
     */
    public ArrayOfApprover getApprovers() {
        return approvers;
    }

    /**
     * Sets the value of the approvers property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfApprover }
     *
     */
    public void setApprovers(ArrayOfApprover value) {
        this.approvers = value;
    }

    /**
     * Gets the value of the subjectDocument property.
     *
     * @return
     *     possible object is
     *     {@link SubjectDocument }
     *
     */
    public SubjectDocument getSubjectDocument() {
        return subjectDocument;
    }

    /**
     * Sets the value of the subjectDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link SubjectDocument }
     *
     */
    public void setSubjectDocument(SubjectDocument value) {
        this.subjectDocument = value;
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
