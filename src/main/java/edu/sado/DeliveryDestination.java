
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryDestination complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="deliveryDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destination" type="{http://www.infpres.com/IEDMS}communicationPartner" minOccurs="0"/>
 *         &lt;element name="files" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "deliveryDestination", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "destination",
    "files",
    "comment"
})
public class DeliveryDestination {

    protected CommunicationPartner destination;
    @XmlElement(required = true, nillable = true)
    protected String files;
    protected String comment;

    /**
     * Gets the value of the destination property.
     *
     * @return
     *     possible object is
     *     {@link CommunicationPartner }
     *
     */
    public CommunicationPartner getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     *
     * @param value
     *     allowed object is
     *     {@link CommunicationPartner }
     *
     */
    public void setDestination(CommunicationPartner value) {
        this.destination = value;
    }

    /**
     * Gets the value of the files property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFiles(String value) {
        this.files = value;
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
