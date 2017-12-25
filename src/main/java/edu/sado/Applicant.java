
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Applicant complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Applicant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.infpres.com/IEDMS}Gender"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MunicipalEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Settlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="House" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Apartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.infpres.com/IEDMS}anyone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Applicant", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "id",
    "firstName",
    "middleName",
    "lastName",
    "phone",
    "email",
    "comments",
    "gender",
    "zipCode",
    "municipalEntity",
    "country",
    "region",
    "city",
    "district",
    "settlement",
    "street",
    "house",
    "building",
    "apartment",
    "operator"
})
public class Applicant {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "Gender", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "MunicipalEntity")
    protected String municipalEntity;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "Settlement")
    protected String settlement;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "House")
    protected String house;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Apartment")
    protected String apartment;
    @XmlElement(name = "Operator")
    protected Anyone operator;

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
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the gender property.
     *
     * @return
     *     possible object is
     *     {@link Gender }
     *
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value
     *     allowed object is
     *     {@link Gender }
     *
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the zipCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the municipalEntity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMunicipalEntity() {
        return municipalEntity;
    }

    /**
     * Sets the value of the municipalEntity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMunicipalEntity(String value) {
        this.municipalEntity = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the district property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the settlement property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSettlement() {
        return settlement;
    }

    /**
     * Sets the value of the settlement property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSettlement(String value) {
        this.settlement = value;
    }

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the house property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the building property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the apartment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the operator property.
     *
     * @return
     *     possible object is
     *     {@link Anyone }
     *
     */
    public Anyone getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value
     *     allowed object is
     *     {@link Anyone }
     *
     */
    public void setOperator(Anyone value) {
        this.operator = value;
    }

}
