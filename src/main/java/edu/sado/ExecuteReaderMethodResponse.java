
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
 *         &lt;element name="ExecuteReaderMethodResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "executeReaderMethodResult"
})
@XmlRootElement(name = "ExecuteReaderMethodResponse")
public class ExecuteReaderMethodResponse {

    @XmlElement(name = "ExecuteReaderMethodResult")
    protected String executeReaderMethodResult;

    /**
     * Gets the value of the executeReaderMethodResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExecuteReaderMethodResult() {
        return executeReaderMethodResult;
    }

    /**
     * Sets the value of the executeReaderMethodResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExecuteReaderMethodResult(String value) {
        this.executeReaderMethodResult = value;
    }

}
