
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Company complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RootOrganization" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}CompanyRef" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}CompanyType"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}EmployeeRef" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}EmployeeRef" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Okpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Okonh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrespondentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactAddress" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}AddressRef" minOccurs="0"/>
 *         &lt;element name="PostAddress" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}AddressRef" minOccurs="0"/>
 *         &lt;element name="LegalAddress" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}AddressRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company", propOrder = {
    "rootOrganization",
    "type",
    "name",
    "fullName",
    "manager",
    "contactPerson",
    "phone",
    "fax",
    "url",
    "email",
    "bik",
    "okpo",
    "inn",
    "kpp",
    "okonh",
    "account",
    "correspondentAccount",
    "bankName",
    "contactAddress",
    "postAddress",
    "legalAddress"
})
public class Company {

    @XmlElement(name = "RootOrganization")
    protected CompanyRef rootOrganization;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected CompanyType type;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "Manager")
    protected EmployeeRef manager;
    @XmlElement(name = "ContactPerson")
    protected EmployeeRef contactPerson;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Bik")
    protected String bik;
    @XmlElement(name = "Okpo")
    protected String okpo;
    @XmlElement(name = "Inn")
    protected String inn;
    @XmlElement(name = "Kpp")
    protected String kpp;
    @XmlElement(name = "Okonh")
    protected String okonh;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "CorrespondentAccount")
    protected String correspondentAccount;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "ContactAddress")
    protected AddressRef contactAddress;
    @XmlElement(name = "PostAddress")
    protected AddressRef postAddress;
    @XmlElement(name = "LegalAddress")
    protected AddressRef legalAddress;

    /**
     * Gets the value of the rootOrganization property.
     *
     * @return
     *     possible object is
     *     {@link CompanyRef }
     *
     */
    public CompanyRef getRootOrganization() {
        return rootOrganization;
    }

    /**
     * Sets the value of the rootOrganization property.
     *
     * @param value
     *     allowed object is
     *     {@link CompanyRef }
     *
     */
    public void setRootOrganization(CompanyRef value) {
        this.rootOrganization = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link CompanyType }
     *
     */
    public CompanyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *
     */
    public void setType(CompanyType value) {
        this.type = value;
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
     * Gets the value of the fullName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the manager property.
     *
     * @return
     *     possible object is
     *     {@link EmployeeRef }
     *
     */
    public EmployeeRef getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     *
     * @param value
     *     allowed object is
     *     {@link EmployeeRef }
     *
     */
    public void setManager(EmployeeRef value) {
        this.manager = value;
    }

    /**
     * Gets the value of the contactPerson property.
     *
     * @return
     *     possible object is
     *     {@link EmployeeRef }
     *
     */
    public EmployeeRef getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     *
     * @param value
     *     allowed object is
     *     {@link EmployeeRef }
     *
     */
    public void setContactPerson(EmployeeRef value) {
        this.contactPerson = value;
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
     * Gets the value of the fax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUrl(String value) {
        this.url = value;
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
     * Gets the value of the bik property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBik() {
        return bik;
    }

    /**
     * Sets the value of the bik property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBik(String value) {
        this.bik = value;
    }

    /**
     * Gets the value of the okpo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOkpo() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOkpo(String value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the inn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKpp(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the okonh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOkonh() {
        return okonh;
    }

    /**
     * Sets the value of the okonh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOkonh(String value) {
        this.okonh = value;
    }

    /**
     * Gets the value of the account property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the correspondentAccount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCorrespondentAccount() {
        return correspondentAccount;
    }

    /**
     * Sets the value of the correspondentAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCorrespondentAccount(String value) {
        this.correspondentAccount = value;
    }

    /**
     * Gets the value of the bankName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the contactAddress property.
     *
     * @return
     *     possible object is
     *     {@link AddressRef }
     *
     */
    public AddressRef getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressRef }
     *
     */
    public void setContactAddress(AddressRef value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the postAddress property.
     *
     * @return
     *     possible object is
     *     {@link AddressRef }
     *
     */
    public AddressRef getPostAddress() {
        return postAddress;
    }

    /**
     * Sets the value of the postAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressRef }
     *
     */
    public void setPostAddress(AddressRef value) {
        this.postAddress = value;
    }

    /**
     * Gets the value of the legalAddress property.
     *
     * @return
     *     possible object is
     *     {@link AddressRef }
     *
     */
    public AddressRef getLegalAddress() {
        return legalAddress;
    }

    /**
     * Sets the value of the legalAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressRef }
     *
     */
    public void setLegalAddress(AddressRef value) {
        this.legalAddress = value;
    }

}
