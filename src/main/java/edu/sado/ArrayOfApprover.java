
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfApprover complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfApprover">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Approver" type="{http://www.infpres.com/IEDMS}Approver" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApprover", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "approver"
})
public class ArrayOfApprover {

    @XmlElement(name = "Approver", nillable = true)
    protected List<Approver> approver;

    /**
     * Gets the value of the approver property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approver property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprover().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Approver }
     *
     *
     */
    public List<Approver> getApprover() {
        if (approver == null) {
            approver = new ArrayList<Approver>();
        }
        return this.approver;
    }

}
