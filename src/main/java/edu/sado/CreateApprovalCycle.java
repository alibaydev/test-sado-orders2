
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
 *         &lt;element name="files" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}FilesItem" minOccurs="0"/>
 *         &lt;element name="createApprovalCycleParams" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}CreateApprovalCycleParams" minOccurs="0"/>
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
    "files",
    "createApprovalCycleParams"
})
@XmlRootElement(name = "CreateApprovalCycle")
public class CreateApprovalCycle {

    @XmlElement(required = true)
    protected String profileId;
    @XmlElement(required = true)
    protected String documentId;
    protected FilesItem files;
    protected CreateApprovalCycleParams createApprovalCycleParams;

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
     * Gets the value of the files property.
     *
     * @return
     *     possible object is
     *     {@link FilesItem }
     *
     */
    public FilesItem getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     *
     * @param value
     *     allowed object is
     *     {@link FilesItem }
     *
     */
    public void setFiles(FilesItem value) {
        this.files = value;
    }

    /**
     * Gets the value of the createApprovalCycleParams property.
     *
     * @return
     *     possible object is
     *     {@link CreateApprovalCycleParams }
     *
     */
    public CreateApprovalCycleParams getCreateApprovalCycleParams() {
        return createApprovalCycleParams;
    }

    /**
     * Sets the value of the createApprovalCycleParams property.
     *
     * @param value
     *     allowed object is
     *     {@link CreateApprovalCycleParams }
     *
     */
    public void setCreateApprovalCycleParams(CreateApprovalCycleParams value) {
        this.createApprovalCycleParams = value;
    }

}
