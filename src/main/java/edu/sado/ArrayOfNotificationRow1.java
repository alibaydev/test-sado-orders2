
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfNotificationRow1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfNotificationRow1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationRow" type="{http://www.infpres.com/IEDMS}NotificationRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotificationRow1", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "notificationRow"
})
public class ArrayOfNotificationRow1 {

    @XmlElement(name = "NotificationRow", nillable = true)
    protected List<NotificationRow> notificationRow;

    /**
     * Gets the value of the notificationRow property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationRow property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationRow().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationRow }
     *
     *
     */
    public List<NotificationRow> getNotificationRow() {
        if (notificationRow == null) {
            notificationRow = new ArrayList<NotificationRow>();
        }
        return this.notificationRow;
    }

}
