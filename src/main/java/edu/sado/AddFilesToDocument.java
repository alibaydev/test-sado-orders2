
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
 *         &lt;element name="id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="profileId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="files" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}FilesItem" minOccurs="0"/>
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
    "id",
    "profileId",
    "files"
})
@XmlRootElement(name = "AddFilesToDocument")
public class AddFilesToDocument {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String profileId;
    protected FilesItem files;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
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

}
