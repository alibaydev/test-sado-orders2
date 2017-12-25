
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
 *         &lt;element name="GetDocumentFileResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}FileItem" minOccurs="0"/>
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
    "getDocumentFileResult"
})
@XmlRootElement(name = "GetDocumentFileResponse")
public class GetDocumentFileResponse {

    @XmlElement(name = "GetDocumentFileResult")
    protected FileItem getDocumentFileResult;

    /**
     * Gets the value of the getDocumentFileResult property.
     *
     * @return
     *     possible object is
     *     {@link FileItem }
     *
     */
    public FileItem getGetDocumentFileResult() {
        return getDocumentFileResult;
    }

    /**
     * Sets the value of the getDocumentFileResult property.
     *
     * @param value
     *     allowed object is
     *     {@link FileItem }
     *
     */
    public void setGetDocumentFileResult(FileItem value) {
        this.getDocumentFileResult = value;
    }

}
