
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationStatus.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Prepared"/>
 *     &lt;enumeration value="Sended"/>
 *     &lt;enumeration value="Received"/>
 *     &lt;enumeration value="Processed"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "NotificationStatus", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum NotificationStatus {

    @XmlEnumValue("Prepared")
    PREPARED("Prepared"),
    @XmlEnumValue("Sended")
    SENDED("Sended"),
    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    NotificationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationStatus fromValue(String v) {
        for (NotificationStatus c: NotificationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
