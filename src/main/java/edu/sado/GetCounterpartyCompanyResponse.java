
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
 *         &lt;element name="GetCounterpartyCompanyResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}Company" minOccurs="0"/>
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
    "getCounterpartyCompanyResult"
})
@XmlRootElement(name = "GetCounterpartyCompanyResponse")
public class GetCounterpartyCompanyResponse {

    @XmlElement(name = "GetCounterpartyCompanyResult")
    protected Company getCounterpartyCompanyResult;

    /**
     * Gets the value of the getCounterpartyCompanyResult property.
     *
     * @return
     *     possible object is
     *     {@link Company }
     *
     */
    public Company getGetCounterpartyCompanyResult() {
        return getCounterpartyCompanyResult;
    }

    /**
     * Sets the value of the getCounterpartyCompanyResult property.
     *
     * @param value
     *     allowed object is
     *     {@link Company }
     *
     */
    public void setGetCounterpartyCompanyResult(Company value) {
        this.getCounterpartyCompanyResult = value;
    }

}
