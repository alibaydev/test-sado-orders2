
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfQualifiedValue complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfQualifiedValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifiedValue" type="{http://www.infpres.com/IEDMS}qualifiedValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQualifiedValue", propOrder = {
    "qualifiedValue"
})
public class ArrayOfQualifiedValue {

    @XmlElement(nillable = true)
    protected List<QualifiedValue> qualifiedValue;

    /**
     * Gets the value of the qualifiedValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedValue }
     *
     *
     */
    public List<QualifiedValue> getQualifiedValue() {
        if (qualifiedValue == null) {
            qualifiedValue = new ArrayList<QualifiedValue>();
        }
        return this.qualifiedValue;
    }

}
