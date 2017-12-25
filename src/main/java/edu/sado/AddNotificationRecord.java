
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notification" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}NotificationItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notification"
})
@XmlRootElement(name = "AddNotificationRecord")
public class AddNotificationRecord {

    protected NotificationItem notification;

    /**
     * Gets the value of the notification property.
     *
     * @return
     *     possible object is
     *     {@link NotificationItem }
     *
     */
    public NotificationItem getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     *
     * @param value
     *     allowed object is
     *     {@link NotificationItem }
     *
     */
    public void setNotification(NotificationItem value) {
        this.notification = value;
    }

}
