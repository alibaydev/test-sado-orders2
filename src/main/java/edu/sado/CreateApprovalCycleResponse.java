
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
 *         &lt;element name="CreateApprovalCycleResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "createApprovalCycleResult"
})
@XmlRootElement(name = "CreateApprovalCycleResponse")
public class CreateApprovalCycleResponse {

    @XmlElement(name = "CreateApprovalCycleResult", required = true)
    protected String createApprovalCycleResult;

    /**
     * Gets the value of the createApprovalCycleResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateApprovalCycleResult() {
        return createApprovalCycleResult;
    }

    /**
     * Sets the value of the createApprovalCycleResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateApprovalCycleResult(String value) {
        this.createApprovalCycleResult = value;
    }

}
