
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilesItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FilesItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ServiceItem">
 *       &lt;sequence>
 *         &lt;element name="Files" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfFileItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilesItem", propOrder = {
    "files"
})
public class FilesItem
    extends ServiceItem
{

    @XmlElement(name = "Files")
    protected ArrayOfFileItem files;

    /**
     * Gets the value of the files property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfFileItem }
     *
     */
    public ArrayOfFileItem getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileItem }
     *
     */
    public void setFiles(ArrayOfFileItem value) {
        this.files = value;
    }

}
