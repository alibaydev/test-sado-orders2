
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
 *         &lt;element name="AddFileToDocumentResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "addFileToDocumentResult"
})
@XmlRootElement(name = "AddFileToDocumentResponse")
public class AddFileToDocumentResponse {

    @XmlElement(name = "AddFileToDocumentResult", required = true)
    protected String addFileToDocumentResult;

    /**
     * Gets the value of the addFileToDocumentResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddFileToDocumentResult() {
        return addFileToDocumentResult;
    }

    /**
     * Sets the value of the addFileToDocumentResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddFileToDocumentResult(String value) {
        this.addFileToDocumentResult = value;
    }

}
