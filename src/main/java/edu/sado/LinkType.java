
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ResponseTo"/>
 *     &lt;enumeration value="Done"/>
 *     &lt;enumeration value="LinkedWith"/>
 *     &lt;enumeration value="InPursuanceOf"/>
 *     &lt;enumeration value="LinkedWith2"/>
 *     &lt;enumeration value="InResponse"/>
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="AsAdd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "LinkType")
@XmlEnum
public enum LinkType {

    @XmlEnumValue("ResponseTo")
    RESPONSE_TO("ResponseTo"),
    @XmlEnumValue("Done")
    DONE("Done"),
    @XmlEnumValue("LinkedWith")
    LINKED_WITH("LinkedWith"),
    @XmlEnumValue("InPursuanceOf")
    IN_PURSUANCE_OF("InPursuanceOf"),
    @XmlEnumValue("LinkedWith2")
    LINKED_WITH_2("LinkedWith2"),
    @XmlEnumValue("InResponse")
    IN_RESPONSE("InResponse"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("AsAdd")
    AS_ADD("AsAdd");
    private final String value;

    LinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkType fromValue(String v) {
        for (LinkType c: LinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
