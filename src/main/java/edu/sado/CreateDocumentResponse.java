
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
 *         &lt;element name="CreateDocumentResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "createDocumentResult"
})
@XmlRootElement(name = "CreateDocumentResponse")
public class CreateDocumentResponse {

    @XmlElement(name = "CreateDocumentResult", required = true)
    protected String createDocumentResult;

    /**
     * Gets the value of the createDocumentResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateDocumentResult() {
        return createDocumentResult;
    }

    /**
     * Sets the value of the createDocumentResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateDocumentResult(String value) {
        this.createDocumentResult = value;
    }

}
