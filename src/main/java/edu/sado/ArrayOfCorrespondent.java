
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfCorrespondent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfCorrespondent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correspondent" type="{http://www.infpres.com/IEDMS}correspondent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCorrespondent", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "correspondent"
})
public class ArrayOfCorrespondent {

    protected List<Correspondent> correspondent;

    /**
     * Gets the value of the correspondent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspondent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Correspondent }
     *
     *
     */
    public List<Correspondent> getCorrespondent() {
        if (correspondent == null) {
            correspondent = new ArrayList<Correspondent>();
        }
        return this.correspondent;
    }

}
