
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FileItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="File" type="{http://www.infpres.com/IEDMS}associatedFile" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileItem", propOrder = {
    "file",
    "content"
})
public class FileItem {

    @XmlElement(name = "File")
    protected AssociatedFile file;
    @XmlElement(name = "Content")
    protected byte[] content;

    /**
     * Gets the value of the file property.
     *
     * @return
     *     possible object is
     *     {@link AssociatedFile }
     *
     */
    public AssociatedFile getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     *
     * @param value
     *     allowed object is
     *     {@link AssociatedFile }
     *
     */
    public void setFile(AssociatedFile value) {
        this.file = value;
    }

    /**
     * Gets the value of the content property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

}
