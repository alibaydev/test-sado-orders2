
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
 * <p>Java class for documentClause complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="documentClause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="principal" type="{http://www.infpres.com/IEDMS}addressee" minOccurs="0"/>
 *           &lt;element name="principals" type="{http://www.infpres.com/IEDMS}addresseeList" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="parcipants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="parcipant" type="{http://www.infpres.com/IEDMS}addressee" minOccurs="0"/>
 *                     &lt;element name="parcipants" type="{http://www.infpres.com/IEDMS}addresseeList" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="localId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentClause", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "designation",
    "text",
    "deadline",
    "principal",
    "principals",
    "parcipants",
    "comment"
})
public class DocumentClause {

    @XmlElement(required = true, nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String designation;
    protected String text;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deadline;
    protected Addressee principal;
    protected AddresseeList principals;
    protected DocumentClause.Parcipants parcipants;
    protected String comment;
    @XmlAttribute(name = "localId", namespace = "http://www.infpres.com/IEDMS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger localId;
    @XmlAttribute(name = "id", namespace = "http://www.infpres.com/IEDMS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;

    /**
     * Gets the value of the designation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDesignation(String value) {
        this.designation = value;
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
     * Gets the value of the deadline property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDeadline(XMLGregorianCalendar value) {
        this.deadline = value;
    }

    /**
     * Gets the value of the principal property.
     *
     * @return
     *     possible object is
     *     {@link Addressee }
     *
     */
    public Addressee getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     *
     * @param value
     *     allowed object is
     *     {@link Addressee }
     *
     */
    public void setPrincipal(Addressee value) {
        this.principal = value;
    }

    /**
     * Gets the value of the principals property.
     *
     * @return
     *     possible object is
     *     {@link AddresseeList }
     *
     */
    public AddresseeList getPrincipals() {
        return principals;
    }

    /**
     * Sets the value of the principals property.
     *
     * @param value
     *     allowed object is
     *     {@link AddresseeList }
     *
     */
    public void setPrincipals(AddresseeList value) {
        this.principals = value;
    }

    /**
     * Gets the value of the parcipants property.
     *
     * @return
     *     possible object is
     *     {@link DocumentClause.Parcipants }
     *
     */
    public DocumentClause.Parcipants getParcipants() {
        return parcipants;
    }

    /**
     * Sets the value of the parcipants property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentClause.Parcipants }
     *
     */
    public void setParcipants(DocumentClause.Parcipants value) {
        this.parcipants = value;
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
     * Gets the value of the localId property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setLocalId(BigInteger value) {
        this.localId = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="parcipant" type="{http://www.infpres.com/IEDMS}addressee" minOccurs="0"/>
     *           &lt;element name="parcipants" type="{http://www.infpres.com/IEDMS}addresseeList" minOccurs="0"/>
     *         &lt;/choice>
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
        "parcipantOrParcipants"
    })
    public static class Parcipants {

        @XmlElements({
            @XmlElement(name = "parcipant", namespace = "http://www.infpres.com/IEDMS", type = Addressee.class),
            @XmlElement(name = "parcipants", namespace = "http://www.infpres.com/IEDMS", type = AddresseeList.class)
        })
        protected List<Object> parcipantOrParcipants;

        /**
         * Gets the value of the parcipantOrParcipants property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parcipantOrParcipants property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParcipantOrParcipants().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Addressee }
         * {@link AddresseeList }
         *
         *
         */
        public List<Object> getParcipantOrParcipants() {
            if (parcipantOrParcipants == null) {
                parcipantOrParcipants = new ArrayList<Object>();
            }
            return this.parcipantOrParcipants;
        }

    }

}
