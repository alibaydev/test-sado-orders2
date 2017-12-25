
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CreateApprovalCycleParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CreateApprovalCycleParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Author" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Performer" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="SignApproved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ApprovalType" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ApprovalType"/>
 *         &lt;element name="FileAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateApprovalCycleParams", propOrder = {
    "author",
    "performer",
    "signApproved",
    "approvalType",
    "fileAccess"
})
public class CreateApprovalCycleParams {

    @XmlElement(name = "Author", required = true)
    protected String author;
    @XmlElement(name = "Performer", required = true, nillable = true)
    protected String performer;
    @XmlElement(name = "SignApproved")
    protected boolean signApproved;
    @XmlElement(name = "ApprovalType", required = true)
    @XmlSchemaType(name = "string")
    protected ApprovalType approvalType;
    @XmlElement(name = "FileAccess")
    protected boolean fileAccess;

    /**
     * Gets the value of the author property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the performer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPerformer() {
        return performer;
    }

    /**
     * Sets the value of the performer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPerformer(String value) {
        this.performer = value;
    }

    /**
     * Gets the value of the signApproved property.
     *
     */
    public boolean isSignApproved() {
        return signApproved;
    }

    /**
     * Sets the value of the signApproved property.
     *
     */
    public void setSignApproved(boolean value) {
        this.signApproved = value;
    }

    /**
     * Gets the value of the approvalType property.
     *
     * @return
     *     possible object is
     *     {@link ApprovalType }
     *
     */
    public ApprovalType getApprovalType() {
        return approvalType;
    }

    /**
     * Sets the value of the approvalType property.
     *
     * @param value
     *     allowed object is
     *     {@link ApprovalType }
     *
     */
    public void setApprovalType(ApprovalType value) {
        this.approvalType = value;
    }

    /**
     * Gets the value of the fileAccess property.
     *
     */
    public boolean isFileAccess() {
        return fileAccess;
    }

    /**
     * Sets the value of the fileAccess property.
     *
     */
    public void setFileAccess(boolean value) {
        this.fileAccess = value;
    }

}
