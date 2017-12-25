
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Parallel"/>
 *     &lt;enumeration value="Sequential"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ApprovalType")
@XmlEnum
public enum ApprovalType {

    @XmlEnumValue("Parallel")
    PARALLEL("Parallel"),
    @XmlEnumValue("Sequential")
    SEQUENTIAL("Sequential");
    private final String value;

    ApprovalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApprovalType fromValue(String v) {
        for (ApprovalType c: ApprovalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
