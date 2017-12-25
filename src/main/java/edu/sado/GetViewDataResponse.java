
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
 *         &lt;element name="GetViewDataResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getViewDataResult"
})
@XmlRootElement(name = "GetViewDataResponse")
public class GetViewDataResponse {

    @XmlElement(name = "GetViewDataResult")
    protected String getViewDataResult;

    /**
     * Gets the value of the getViewDataResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGetViewDataResult() {
        return getViewDataResult;
    }

    /**
     * Sets the value of the getViewDataResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGetViewDataResult(String value) {
        this.getViewDataResult = value;
    }

}
