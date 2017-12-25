
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfApproverParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfApproverParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApproverParams" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ApproverParams" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApproverParams", propOrder = {
    "approverParams"
})
public class ArrayOfApproverParams {

    @XmlElement(name = "ApproverParams", nillable = true)
    protected List<ApproverParams> approverParams;

    /**
     * Gets the value of the approverParams property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approverParams property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproverParams().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproverParams }
     *
     *
     */
    public List<ApproverParams> getApproverParams() {
        if (approverParams == null) {
            approverParams = new ArrayList<ApproverParams>();
        }
        return this.approverParams;
    }

}
