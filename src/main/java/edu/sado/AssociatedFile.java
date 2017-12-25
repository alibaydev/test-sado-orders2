
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;


/**
 * <p>Java class for associatedFile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="associatedFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group" type="{http://www.infpres.com/IEDMS}fileGroup"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="FileId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Categories" type="{http://www.infpres.com/IEDMS}ArrayOfCategory" minOccurs="0"/>
 *         &lt;element name="IsVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Properties" type="{http://www.infpres.com/IEDMS}ArrayOfProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="localName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="localId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="type" type="{http://www.infpres.com/IEDMS}fileType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "associatedFile", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "group",
    "description",
    "pages",
    "fileId",
    "categories",
    "isVersion",
    "properties"
})
public class AssociatedFile {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FileGroup group;
    protected String description;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pages;
    @XmlElement(name = "FileId", required = true)
    protected String fileId;
    @XmlElement(name = "Categories")
    protected ArrayOfCategory categories;
    @XmlElement(name = "IsVersion")
    protected boolean isVersion;
    @XmlElement(name = "Properties")
    protected ArrayOfProperty properties;
    @XmlAttribute(name = "localName", namespace = "http://www.infpres.com/IEDMS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String localName;
    @XmlAttribute(name = "localId", namespace = "http://www.infpres.com/IEDMS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger localId;
    @XmlAttribute(name = "type", namespace = "http://www.infpres.com/IEDMS")
    protected FileType type;

    /**
     * Gets the value of the group property.
     *
     * @return
     *     possible object is
     *     {@link FileGroup }
     *
     */
    public FileGroup getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     *
     * @param value
     *     allowed object is
     *     {@link FileGroup }
     *
     */
    public void setGroup(FileGroup value) {
        this.group = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the pages property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPages(BigInteger value) {
        this.pages = value;
    }

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
     * Gets the value of the categories property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfCategory }
     *
     */
    public ArrayOfCategory getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategory }
     *
     */
    public void setCategories(ArrayOfCategory value) {
        this.categories = value;
    }

    /**
     * Gets the value of the isVersion property.
     *
     */
    public boolean isIsVersion() {
        return isVersion;
    }

    /**
     * Sets the value of the isVersion property.
     *
     */
    public void setIsVersion(boolean value) {
        this.isVersion = value;
    }

    /**
     * Gets the value of the properties property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfProperty }
     *
     */
    public ArrayOfProperty getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfProperty }
     *
     */
    public void setProperties(ArrayOfProperty value) {
        this.properties = value;
    }

    /**
     * Gets the value of the localName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Gets the value of the localId property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setLocalId(BigInteger value) {
        this.localId = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link FileType }
     *
     */
    public FileType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link FileType }
     *
     */
    public void setType(FileType value) {
        this.type = value;
    }

}
