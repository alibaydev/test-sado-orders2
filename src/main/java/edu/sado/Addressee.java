
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for addressee complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="addressee">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infpres.com/IEDMS}anyone">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressee", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "comment",
    "copyNumber",
    "pageCount"
})
@XmlSeeAlso({
    AddresseeExt.class
})
public class Addressee
    extends Anyone
{

    protected String comment;
    @XmlElement(name = "CopyNumber")
    protected String copyNumber;
    @XmlElement(name = "PageCount")
    protected String pageCount;

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the copyNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCopyNumber() {
        return copyNumber;
    }

    /**
     * Sets the value of the copyNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCopyNumber(String value) {
        this.copyNumber = value;
    }

    /**
     * Gets the value of the pageCount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPageCount(String value) {
        this.pageCount = value;
    }

}
