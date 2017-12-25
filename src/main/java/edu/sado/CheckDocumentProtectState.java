
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
 *         &lt;element name="regCardId" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "regCardId"
})
@XmlRootElement(name = "CheckDocumentProtectState")
public class CheckDocumentProtectState {

    @XmlElement(required = true)
    protected String regCardId;

    /**
     * Gets the value of the regCardId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegCardId() {
        return regCardId;
    }

    /**
     * Sets the value of the regCardId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegCardId(String value) {
        this.regCardId = value;
    }

}
