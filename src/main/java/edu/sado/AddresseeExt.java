
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addresseeExt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="addresseeExt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infpres.com/IEDMS}addressee">
 *       &lt;sequence>
 *         &lt;element name="SecretaryPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addresseeExt", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "secretaryPerson",
    "managerPerson",
    "photo",
    "phone"
})
public class AddresseeExt
    extends Addressee
{

    @XmlElement(name = "SecretaryPerson")
    protected String secretaryPerson;
    @XmlElement(name = "ManagerPerson")
    protected String managerPerson;
    @XmlElement(name = "Photo")
    protected byte[] photo;
    @XmlElement(name = "Phone")
    protected String phone;

    /**
     * Gets the value of the secretaryPerson property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSecretaryPerson() {
        return secretaryPerson;
    }

    /**
     * Sets the value of the secretaryPerson property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSecretaryPerson(String value) {
        this.secretaryPerson = value;
    }

    /**
     * Gets the value of the managerPerson property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManagerPerson() {
        return managerPerson;
    }

    /**
     * Sets the value of the managerPerson property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManagerPerson(String value) {
        this.managerPerson = value;
    }

    /**
     * Gets the value of the photo property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPhoto(byte[] value) {
        this.photo = value;
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

}
