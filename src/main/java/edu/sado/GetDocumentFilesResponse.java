
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
 *         &lt;element name="GetDocumentFilesResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}FilesItem" minOccurs="0"/>
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
    "getDocumentFilesResult"
})
@XmlRootElement(name = "GetDocumentFilesResponse")
public class GetDocumentFilesResponse {

    @XmlElement(name = "GetDocumentFilesResult")
    protected FilesItem getDocumentFilesResult;

    /**
     * Gets the value of the getDocumentFilesResult property.
     *
     * @return
     *     possible object is
     *     {@link FilesItem }
     *
     */
    public FilesItem getGetDocumentFilesResult() {
        return getDocumentFilesResult;
    }

    /**
     * Sets the value of the getDocumentFilesResult property.
     *
     * @param value
     *     allowed object is
     *     {@link FilesItem }
     *
     */
    public void setGetDocumentFilesResult(FilesItem value) {
        this.getDocumentFilesResult = value;
    }

}
