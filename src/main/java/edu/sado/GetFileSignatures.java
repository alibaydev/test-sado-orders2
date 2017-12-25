
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
 *         &lt;element name="fileId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="profileId" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "fileId",
    "profileId"
})
@XmlRootElement(name = "GetFileSignatures")
public class GetFileSignatures {

    @XmlElement(required = true)
    protected String fileId;
    @XmlElement(required = true)
    protected String profileId;

    /**
     * Gets the value of the fileId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

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

}
