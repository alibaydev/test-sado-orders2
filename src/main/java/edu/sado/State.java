
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for State.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="State">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Preparing"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Approving"/>
 *     &lt;enumeration value="Signing"/>
 *     &lt;enumeration value="Sent"/>
 *     &lt;enumeration value="Registering"/>
 *     &lt;enumeration value="Rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "State")
@XmlEnum
public enum State {

    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Preparing")
    PREPARING("Preparing"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Approving")
    APPROVING("Approving"),
    @XmlEnumValue("Signing")
    SIGNING("Signing"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Registering")
    REGISTERING("Registering"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    State(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static State fromValue(String v) {
        for (State c: State.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
