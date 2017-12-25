
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArgumentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArgumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Bool"/>
 *     &lt;enumeration value="Guid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ArgumentType")
@XmlEnum
public enum ArgumentType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Bool")
    BOOL("Bool"),
    @XmlEnumValue("Guid")
    GUID("Guid");
    private final String value;

    ArgumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArgumentType fromValue(String v) {
        for (ArgumentType c: ArgumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
