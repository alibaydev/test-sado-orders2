
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressRef complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressRef", propOrder = {
    "zipCode",
    "address",
    "city",
    "country"
})
public class AddressRef {

    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;

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
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress(String value) {
        this.address = value;
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

}
