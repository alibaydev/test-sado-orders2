
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
 *         &lt;element name="AddFileToDocumentExResult" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="cardFileId" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "addFileToDocumentExResult",
    "cardFileId"
})
@XmlRootElement(name = "AddFileToDocumentExResponse")
public class AddFileToDocumentExResponse {

    @XmlElement(name = "AddFileToDocumentExResult", required = true)
    protected String addFileToDocumentExResult;
    @XmlElement(required = true)
    protected String cardFileId;

    /**
     * Gets the value of the addFileToDocumentExResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddFileToDocumentExResult() {
        return addFileToDocumentExResult;
    }

    /**
     * Sets the value of the addFileToDocumentExResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddFileToDocumentExResult(String value) {
        this.addFileToDocumentExResult = value;
    }

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

}
