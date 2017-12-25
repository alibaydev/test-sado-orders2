
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
 *         &lt;element name="GetTaskResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}DocumentItem" minOccurs="0"/>
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
    "getTaskResult"
})
@XmlRootElement(name = "GetTaskResponse")
public class GetTaskResponse {

    @XmlElement(name = "GetTaskResult")
    protected DocumentItem getTaskResult;

    /**
     * Gets the value of the getTaskResult property.
     *
     * @return
     *     possible object is
     *     {@link DocumentItem }
     *
     */
    public DocumentItem getGetTaskResult() {
        return getTaskResult;
    }

    /**
     * Sets the value of the getTaskResult property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentItem }
     *
     */
    public void setGetTaskResult(DocumentItem value) {
        this.getTaskResult = value;
    }

}
