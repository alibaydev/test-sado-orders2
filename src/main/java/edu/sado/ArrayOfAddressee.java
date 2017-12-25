
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfAddressee complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAddressee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressee" type="{http://www.infpres.com/IEDMS}addressee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddressee", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "addressee"
})
public class ArrayOfAddressee {

    protected List<Addressee> addressee;

    /**
     * Gets the value of the addressee property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressee property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressee().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addressee }
     *
     *
     */
    public List<Addressee> getAddressee() {
        if (addressee == null) {
            addressee = new ArrayList<Addressee>();
        }
        return this.addressee;
    }

}
