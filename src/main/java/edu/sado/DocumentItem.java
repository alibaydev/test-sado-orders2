
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ServiceItem">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://www.infpres.com/IEDMS}communication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentItem", propOrder = {
    "document"
})
public class DocumentItem
    extends ServiceItem
{

    @XmlElement(name = "Document")
    protected Communication document;

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link Communication }
     *
     */
    public Communication getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link Communication }
     *
     */
    public void setDocument(Communication value) {
        this.document = value;
    }

}
