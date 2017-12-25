
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
 *         &lt;element name="GetOrganizationIdResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "getOrganizationIdResult"
})
@XmlRootElement(name = "GetOrganizationIdResponse")
public class GetOrganizationIdResponse {

    @XmlElement(name = "GetOrganizationIdResult", required = true)
    protected String getOrganizationIdResult;

    /**
     * Gets the value of the getOrganizationIdResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGetOrganizationIdResult() {
        return getOrganizationIdResult;
    }

    /**
     * Sets the value of the getOrganizationIdResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGetOrganizationIdResult(String value) {
        this.getOrganizationIdResult = value;
    }

}
