
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
 *         &lt;element name="sourceDocumentId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="destinationDocumentId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="linkType" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}LinkType"/>
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
    "sourceDocumentId",
    "destinationDocumentId",
    "linkType"
})
@XmlRootElement(name = "CreateLinkEx")
public class CreateLinkEx {

    @XmlElement(required = true)
    protected String profileId;
    @XmlElement(required = true)
    protected String sourceDocumentId;
    @XmlElement(required = true)
    protected String destinationDocumentId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LinkType linkType;

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
     * Gets the value of the sourceDocumentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceDocumentId() {
        return sourceDocumentId;
    }

    /**
     * Sets the value of the sourceDocumentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceDocumentId(String value) {
        this.sourceDocumentId = value;
    }

    /**
     * Gets the value of the destinationDocumentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestinationDocumentId() {
        return destinationDocumentId;
    }

    /**
     * Sets the value of the destinationDocumentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestinationDocumentId(String value) {
        this.destinationDocumentId = value;
    }

    /**
     * Gets the value of the linkType property.
     *
     * @return
     *     possible object is
     *     {@link LinkType }
     *
     */
    public LinkType getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     *
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *
     */
    public void setLinkType(LinkType value) {
        this.linkType = value;
    }

}
