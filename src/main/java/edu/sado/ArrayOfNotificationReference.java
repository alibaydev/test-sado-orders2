
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfNotificationReference complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfNotificationReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationReference" type="{http://www.infpres.com/IEDMS}NotificationReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotificationReference", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "notificationReference"
})
public class ArrayOfNotificationReference {

    @XmlElement(name = "NotificationReference", nillable = true)
    protected List<NotificationReference> notificationReference;

    /**
     * Gets the value of the notificationReference property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationReference property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationReference().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationReference }
     *
     *
     */
    public List<NotificationReference> getNotificationReference() {
        if (notificationReference == null) {
            notificationReference = new ArrayList<NotificationReference>();
        }
        return this.notificationReference;
    }

}
