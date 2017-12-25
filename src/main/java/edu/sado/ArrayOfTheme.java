
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfTheme complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfTheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Theme" type="{http://www.infpres.com/IEDMS}Theme" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTheme", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "theme"
})
public class ArrayOfTheme {

    @XmlElement(name = "Theme", nillable = true)
    protected List<Theme> theme;

    /**
     * Gets the value of the theme property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theme property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheme().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Theme }
     *
     *
     */
    public List<Theme> getTheme() {
        if (theme == null) {
            theme = new ArrayList<Theme>();
        }
        return this.theme;
    }

}
