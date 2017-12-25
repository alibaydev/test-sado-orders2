
package edu.sado;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="cardFileId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="signature" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}FileSignature" minOccurs="0"/>
 *         &lt;element name="profileId" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "cardFileId",
    "signature",
    "profileId"
})
@XmlRootElement(name = "AddSignatureToCardFile")
public class AddSignatureToCardFile {

    @XmlElement(required = true)
    protected String cardFileId;
    protected FileSignature signature;
    @XmlElement(required = true)
    protected String profileId;

    /**
     * Gets the value of the cardFileId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardFileId() {
        return cardFileId;
    }

    /**
     * Sets the value of the cardFileId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardFileId(String value) {
        this.cardFileId = value;
    }

    /**
     * Gets the value of the signature property.
     *
     * @return
     *     possible object is
     *     {@link FileSignature }
     *
     */
    public FileSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     *
     * @param value
     *     allowed object is
     *     {@link FileSignature }
     *
     */
    public void setSignature(FileSignature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the profileId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

}
