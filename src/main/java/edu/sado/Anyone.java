
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anyone complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="anyone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="region" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="person" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="post" type="{http://www.infpres.com/IEDMS}qualifiedValue" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anyone", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "region",
    "organization",
    "person",
    "department",
    "post",
    "contactInfo",
    "id"
})
@XmlSeeAlso({
    Addressee.class,
    Signatory.class,
    Correspondent.class
})
public class Anyone {

    protected QualifiedValue region;
    protected QualifiedValue organization;
    protected QualifiedValue person;
    protected QualifiedValue department;
    protected QualifiedValue post;
    protected String contactInfo;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link QualifiedValue }
     *
     */
    public QualifiedValue getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link QualifiedValue }
     *
     */
    public void setRegion(QualifiedValue value) {
        this.region = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link QualifiedValue }
     *
     */
    public QualifiedValue getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link QualifiedValue }
     *
     */
    public void setOrganization(QualifiedValue value) {
        this.organization = value;
    }

    /**
     * Gets the value of the person property.
     *
     * @return
     *     possible object is
     *     {@link QualifiedValue }
     *
     */
    public QualifiedValue getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     *
     * @param value
     *     allowed object is
     *     {@link QualifiedValue }
     *
     */
    public void setPerson(QualifiedValue value) {
        this.person = value;
    }

    /**
     * Gets the value of the department property.
     *
     * @return
     *     possible object is
     *     {@link QualifiedValue }
     *
     */
    public QualifiedValue getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     *
     * @param value
     *     allowed object is
     *     {@link QualifiedValue }
     *
     */
    public void setDepartment(QualifiedValue value) {
        this.department = value;
    }

    /**
     * Gets the value of the post property.
     *
     * @return
     *     possible object is
     *     {@link QualifiedValue }
     *
     */
    public QualifiedValue getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     *
     * @param value
     *     allowed object is
     *     {@link QualifiedValue }
     *
     */
    public void setPost(QualifiedValue value) {
        this.post = value;
    }

    /**
     * Gets the value of the contactInfo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactInfo(String value) {
        this.contactInfo = value;
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

}
