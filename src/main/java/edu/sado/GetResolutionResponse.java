
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
 *         &lt;element name="GetResolutionResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}DocumentItem" minOccurs="0"/>
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
    "getResolutionResult"
})
@XmlRootElement(name = "GetResolutionResponse")
public class GetResolutionResponse {

    @XmlElement(name = "GetResolutionResult")
    protected DocumentItem getResolutionResult;

    /**
     * Gets the value of the getResolutionResult property.
     *
     * @return
     *     possible object is
     *     {@link DocumentItem }
     *
     */
    public DocumentItem getGetResolutionResult() {
        return getResolutionResult;
    }

    /**
     * Sets the value of the getResolutionResult property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentItem }
     *
     */
    public void setGetResolutionResult(DocumentItem value) {
        this.getResolutionResult = value;
    }

}
