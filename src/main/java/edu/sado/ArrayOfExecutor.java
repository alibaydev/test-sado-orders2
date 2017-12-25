
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfExecutor complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfExecutor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Executor" type="{http://www.infpres.com/IEDMS}Executor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExecutor", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "executor"
})
public class ArrayOfExecutor {

    @XmlElement(name = "Executor", nillable = true)
    protected List<Executor> executor;

    /**
     * Gets the value of the executor property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executor property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Executor }
     *
     *
     */
    public List<Executor> getExecutor() {
        if (executor == null) {
            executor = new ArrayList<Executor>();
        }
        return this.executor;
    }

}
