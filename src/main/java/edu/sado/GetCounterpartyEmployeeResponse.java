
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
 *         &lt;element name="GetCounterpartyEmployeeResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}Employee" minOccurs="0"/>
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
    "getCounterpartyEmployeeResult"
})
@XmlRootElement(name = "GetCounterpartyEmployeeResponse")
public class GetCounterpartyEmployeeResponse {

    @XmlElement(name = "GetCounterpartyEmployeeResult")
    protected Employee getCounterpartyEmployeeResult;

    /**
     * Gets the value of the getCounterpartyEmployeeResult property.
     *
     * @return
     *     possible object is
     *     {@link Employee }
     *
     */
    public Employee getGetCounterpartyEmployeeResult() {
        return getCounterpartyEmployeeResult;
    }

    /**
     * Sets the value of the getCounterpartyEmployeeResult property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee }
     *
     */
    public void setGetCounterpartyEmployeeResult(Employee value) {
        this.getCounterpartyEmployeeResult = value;
    }

}
