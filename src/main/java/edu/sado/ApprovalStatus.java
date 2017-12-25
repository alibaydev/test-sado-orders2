
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalStatus.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Remarks"/>
 *     &lt;enumeration value="NotApproved"/>
 *     &lt;enumeration value="Overdue"/>
 *     &lt;enumeration value="Interrupted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ApprovalStatus", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum ApprovalStatus {

    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Remarks")
    REMARKS("Remarks"),
    @XmlEnumValue("NotApproved")
    NOT_APPROVED("NotApproved"),
    @XmlEnumValue("Overdue")
    OVERDUE("Overdue"),
    @XmlEnumValue("Interrupted")
    INTERRUPTED("Interrupted");
    private final String value;

    ApprovalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApprovalStatus fromValue(String v) {
        for (ApprovalStatus c: ApprovalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
