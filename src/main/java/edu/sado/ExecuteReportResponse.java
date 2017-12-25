
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
 *         &lt;element name="ExecuteReportResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "executeReportResult"
})
@XmlRootElement(name = "ExecuteReportResponse")
public class ExecuteReportResponse {

    @XmlElement(name = "ExecuteReportResult")
    protected String executeReportResult;

    /**
     * Gets the value of the executeReportResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExecuteReportResult() {
        return executeReportResult;
    }

    /**
     * Sets the value of the executeReportResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExecuteReportResult(String value) {
        this.executeReportResult = value;
    }

}
