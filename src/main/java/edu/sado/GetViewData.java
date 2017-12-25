
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
 *         &lt;element name="profileId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="searchQuery" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}SearchQuery" minOccurs="0"/>
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
    "profileId",
    "searchQuery"
})
@XmlRootElement(name = "GetViewData")
public class GetViewData {

    @XmlElement(required = true)
    protected String profileId;
    protected SearchQuery searchQuery;

    /**
     * Gets the value of the profileId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the searchQuery property.
     *
     * @return
     *     possible object is
     *     {@link SearchQuery }
     *
     */
    public SearchQuery getSearchQuery() {
        return searchQuery;
    }

    /**
     * Sets the value of the searchQuery property.
     *
     * @param value
     *     allowed object is
     *     {@link SearchQuery }
     *
     */
    public void setSearchQuery(SearchQuery value) {
        this.searchQuery = value;
    }

}
