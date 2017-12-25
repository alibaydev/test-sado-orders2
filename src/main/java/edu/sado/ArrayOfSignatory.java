
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfSignatory complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfSignatory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signatory" type="{http://www.infpres.com/IEDMS}signatory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSignatory", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "signatory"
})
public class ArrayOfSignatory {

    protected List<Signatory> signatory;

    /**
     * Gets the value of the signatory property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatory property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signatory }
     *
     *
     */
    public List<Signatory> getSignatory() {
        if (signatory == null) {
            signatory = new ArrayList<Signatory>();
        }
        return this.signatory;
    }

}
