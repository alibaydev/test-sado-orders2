
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
 *         &lt;element name="documentId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="startApprovalCycleParams" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}StartApprovalCycleParams" minOccurs="0"/>
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
    "documentId",
    "startApprovalCycleParams"
})
@XmlRootElement(name = "StartApprovalCycle")
public class StartApprovalCycle {

    @XmlElement(required = true)
    protected String profileId;
    @XmlElement(required = true)
    protected String documentId;
    protected StartApprovalCycleParams startApprovalCycleParams;

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
     * Gets the value of the documentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the startApprovalCycleParams property.
     *
     * @return
     *     possible object is
     *     {@link StartApprovalCycleParams }
     *
     */
    public StartApprovalCycleParams getStartApprovalCycleParams() {
        return startApprovalCycleParams;
    }

    /**
     * Sets the value of the startApprovalCycleParams property.
     *
     * @param value
     *     allowed object is
     *     {@link StartApprovalCycleParams }
     *
     */
    public void setStartApprovalCycleParams(StartApprovalCycleParams value) {
        this.startApprovalCycleParams = value;
    }

}
