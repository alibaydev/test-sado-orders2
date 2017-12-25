
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
 *         &lt;element name="GetFileSignaturesResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfFileSignature" minOccurs="0"/>
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
    "getFileSignaturesResult"
})
@XmlRootElement(name = "GetFileSignaturesResponse")
public class GetFileSignaturesResponse {

    @XmlElement(name = "GetFileSignaturesResult")
    protected ArrayOfFileSignature getFileSignaturesResult;

    /**
     * Gets the value of the getFileSignaturesResult property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfFileSignature }
     *
     */
    public ArrayOfFileSignature getGetFileSignaturesResult() {
        return getFileSignaturesResult;
    }

    /**
     * Sets the value of the getFileSignaturesResult property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileSignature }
     *
     */
    public void setGetFileSignaturesResult(ArrayOfFileSignature value) {
        this.getFileSignaturesResult = value;
    }

}
