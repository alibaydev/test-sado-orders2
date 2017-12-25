
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
 *         &lt;element name="CheckDocumentProtectStateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "checkDocumentProtectStateResult"
})
@XmlRootElement(name = "CheckDocumentProtectStateResponse")
public class CheckDocumentProtectStateResponse {

    @XmlElement(name = "CheckDocumentProtectStateResult")
    protected boolean checkDocumentProtectStateResult;

    /**
     * Gets the value of the checkDocumentProtectStateResult property.
     *
     */
    public boolean isCheckDocumentProtectStateResult() {
        return checkDocumentProtectStateResult;
    }

    /**
     * Sets the value of the checkDocumentProtectStateResult property.
     *
     */
    public void setCheckDocumentProtectStateResult(boolean value) {
        this.checkDocumentProtectStateResult = value;
    }

}
