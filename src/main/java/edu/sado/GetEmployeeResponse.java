
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
 *         &lt;element name="GetEmployeeResult" type="{http://www.infpres.com/IEDMS}addresseeExt" minOccurs="0"/>
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
    "getEmployeeResult"
})
@XmlRootElement(name = "GetEmployeeResponse")
public class GetEmployeeResponse {

    @XmlElement(name = "GetEmployeeResult")
    protected AddresseeExt getEmployeeResult;

    /**
     * Gets the value of the getEmployeeResult property.
     *
     * @return
     *     possible object is
     *     {@link AddresseeExt }
     *
     */
    public AddresseeExt getGetEmployeeResult() {
        return getEmployeeResult;
    }

    /**
     * Sets the value of the getEmployeeResult property.
     *
     * @param value
     *     allowed object is
     *     {@link AddresseeExt }
     *
     */
    public void setGetEmployeeResult(AddresseeExt value) {
        this.getEmployeeResult = value;
    }

}
