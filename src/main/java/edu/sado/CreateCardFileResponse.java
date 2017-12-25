
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
 *         &lt;element name="CreateCardFileResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "createCardFileResult"
})
@XmlRootElement(name = "CreateCardFileResponse")
public class CreateCardFileResponse {

    @XmlElement(name = "CreateCardFileResult", required = true)
    protected String createCardFileResult;

    /**
     * Gets the value of the createCardFileResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateCardFileResult() {
        return createCardFileResult;
    }

    /**
     * Sets the value of the createCardFileResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateCardFileResult(String value) {
        this.createCardFileResult = value;
    }

}
