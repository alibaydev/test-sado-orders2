
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfFileItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfFileItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileItem" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}FileItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFileItem", propOrder = {
    "fileItem"
})
public class ArrayOfFileItem {

    @XmlElement(name = "FileItem", nillable = true)
    protected List<FileItem> fileItem;

    /**
     * Gets the value of the fileItem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileItem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileItem }
     *
     *
     */
    public List<FileItem> getFileItem() {
        if (fileItem == null) {
            fileItem = new ArrayList<FileItem>();
        }
        return this.fileItem;
    }

}
