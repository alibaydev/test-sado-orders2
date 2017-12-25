
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
 *         &lt;element name="GetAccessOperationsResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfOperation" minOccurs="0"/>
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
    "getAccessOperationsResult"
})
@XmlRootElement(name = "GetAccessOperationsResponse")
public class GetAccessOperationsResponse {

    @XmlElement(name = "GetAccessOperationsResult")
    protected ArrayOfOperation getAccessOperationsResult;

    /**
     * Gets the value of the getAccessOperationsResult property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfOperation }
     *
     */
    public ArrayOfOperation getGetAccessOperationsResult() {
        return getAccessOperationsResult;
    }

    /**
     * Sets the value of the getAccessOperationsResult property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperation }
     *
     */
    public void setGetAccessOperationsResult(ArrayOfOperation value) {
        this.getAccessOperationsResult = value;
    }

}
