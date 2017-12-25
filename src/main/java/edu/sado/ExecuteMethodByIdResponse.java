
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
 *         &lt;element name="ExecuteMethodByIdResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "executeMethodByIdResult"
})
@XmlRootElement(name = "ExecuteMethodByIdResponse")
public class ExecuteMethodByIdResponse {

    @XmlElement(name = "ExecuteMethodByIdResult")
    protected String executeMethodByIdResult;

    /**
     * Gets the value of the executeMethodByIdResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExecuteMethodByIdResult() {
        return executeMethodByIdResult;
    }

    /**
     * Sets the value of the executeMethodByIdResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExecuteMethodByIdResult(String value) {
        this.executeMethodByIdResult = value;
    }

}
