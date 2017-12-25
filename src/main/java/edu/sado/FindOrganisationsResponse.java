
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
 *         &lt;element name="FindOrganisationsResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfQualifiedValue" minOccurs="0"/>
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
    "findOrganisationsResult"
})
@XmlRootElement(name = "FindOrganisationsResponse")
public class FindOrganisationsResponse {

    @XmlElement(name = "FindOrganisationsResult")
    protected ArrayOfQualifiedValue findOrganisationsResult;

    /**
     * Gets the value of the findOrganisationsResult property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfQualifiedValue }
     *
     */
    public ArrayOfQualifiedValue getFindOrganisationsResult() {
        return findOrganisationsResult;
    }

    /**
     * Sets the value of the findOrganisationsResult property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfQualifiedValue }
     *
     */
    public void setFindOrganisationsResult(ArrayOfQualifiedValue value) {
        this.findOrganisationsResult = value;
    }

}
