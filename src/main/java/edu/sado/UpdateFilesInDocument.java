
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="document" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}DocumentItem" minOccurs="0"/>
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
    "document",
    "files"
})
@XmlRootElement(name = "UpdateFilesInDocument")
public class UpdateFilesInDocument {

    protected DocumentItem document;
    protected FilesItem files;

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link DocumentItem }
     *
     */
    public DocumentItem getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentItem }
     *
     */
    public void setDocument(DocumentItem value) {
        this.document = value;
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
