
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NotificationItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ServiceItem">
 *       &lt;sequence>
 *         &lt;element name="Notification" type="{http://www.infpres.com/IEDMS}NotificationRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationItem", propOrder = {
    "notification"
})
public class NotificationItem
    extends ServiceItem
{

    @XmlElement(name = "Notification")
    protected NotificationRow notification;

    /**
     * Gets the value of the notification property.
     *
     * @return
     *     possible object is
     *     {@link NotificationRow }
     *
     */
    public NotificationRow getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     *
     * @param value
     *     allowed object is
     *     {@link NotificationRow }
     *
     */
    public void setNotification(NotificationRow value) {
        this.notification = value;
    }

}
