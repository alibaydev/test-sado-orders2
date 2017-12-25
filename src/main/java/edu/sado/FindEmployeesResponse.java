
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
 *         &lt;element name="FindEmployeesResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfAddresseeExt" minOccurs="0"/>
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
    "findEmployeesResult"
})
@XmlRootElement(name = "FindEmployeesResponse")
public class FindEmployeesResponse {

    @XmlElement(name = "FindEmployeesResult")
    protected ArrayOfAddresseeExt findEmployeesResult;

    /**
     * Gets the value of the findEmployeesResult property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAddresseeExt }
     *
     */
    public ArrayOfAddresseeExt getFindEmployeesResult() {
        return findEmployeesResult;
    }

    /**
     * Sets the value of the findEmployeesResult property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddresseeExt }
     *
     */
    public void setFindEmployeesResult(ArrayOfAddresseeExt value) {
        this.findEmployeesResult = value;
    }

}
