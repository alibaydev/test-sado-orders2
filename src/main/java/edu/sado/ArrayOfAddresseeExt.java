
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfAddresseeExt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAddresseeExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresseeExt" type="{http://www.infpres.com/IEDMS}addresseeExt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddresseeExt", propOrder = {
    "addresseeExt"
})
public class ArrayOfAddresseeExt {

    @XmlElement(nillable = true)
    protected List<AddresseeExt> addresseeExt;

    /**
     * Gets the value of the addresseeExt property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresseeExt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresseeExt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddresseeExt }
     *
     *
     */
    public List<AddresseeExt> getAddresseeExt() {
        if (addresseeExt == null) {
            addresseeExt = new ArrayList<AddresseeExt>();
        }
        return this.addresseeExt;
    }

}
