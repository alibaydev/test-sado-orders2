
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartApprovalCycleParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StartApprovalCycleParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Approvers" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfApproverParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartApprovalCycleParams", propOrder = {
    "approvers"
})
public class StartApprovalCycleParams {

    @XmlElement(name = "Approvers")
    protected ArrayOfApproverParams approvers;

    /**
     * Gets the value of the approvers property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfApproverParams }
     *
     */
    public ArrayOfApproverParams getApprovers() {
        return approvers;
    }

    /**
     * Sets the value of the approvers property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfApproverParams }
     *
     */
    public void setApprovers(ArrayOfApproverParams value) {
        this.approvers = value;
    }

}
