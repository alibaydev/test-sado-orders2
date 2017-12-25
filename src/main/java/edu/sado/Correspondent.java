
package edu.sado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for correspondent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="correspondent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infpres.com/IEDMS}anyone">
 *       &lt;sequence>
 *         &lt;element name="CorrespondentType" type="{http://www.infpres.com/IEDMS}CorrespondentType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.infpres.com/IEDMS}Address" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.infpres.com/IEDMS}documentNumber" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "correspondent", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "correspondentType",
    "address",
    "num",
    "comment"
})
public class Correspondent
    extends Anyone
{

    @XmlElementRef(name = "CorrespondentType", namespace = "http://www.infpres.com/IEDMS", type = JAXBElement.class, required = false)
    protected JAXBElement<CorrespondentType> correspondentType;
    @XmlElement(name = "Address")
    protected Address address;
    protected DocumentNumber num;
    protected String comment;

    /**
     * Gets the value of the correspondentType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorrespondentType }{@code >}
     *
     */
    public JAXBElement<CorrespondentType> getCorrespondentType() {
        return correspondentType;
    }

    /**
     * Sets the value of the correspondentType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorrespondentType }{@code >}
     *
     */
    public void setCorrespondentType(JAXBElement<CorrespondentType> value) {
        this.correspondentType = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setAddress(Address value) {
        this.address = value;
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
