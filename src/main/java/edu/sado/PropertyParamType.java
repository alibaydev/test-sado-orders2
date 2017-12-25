
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyParamType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyParamType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Role"/>
 *     &lt;enumeration value="Universal"/>
 *     &lt;enumeration value="PartnerEmployee"/>
 *     &lt;enumeration value="PartnerDepartment"/>
 *     &lt;enumeration value="CardRef"/>
 *     &lt;enumeration value="CardType"/>
 *     &lt;enumeration value="CardState"/>
 *     &lt;enumeration value="GateVariable"/>
 *     &lt;enumeration value="Enum"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="Button"/>
 *     &lt;enumeration value="Numerator"/>
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="Folder"/>
 *     &lt;enumeration value="UniversalType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "PropertyParamType", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum PropertyParamType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Role")
    ROLE("Role"),
    @XmlEnumValue("Universal")
    UNIVERSAL("Universal"),
    @XmlEnumValue("PartnerEmployee")
    PARTNER_EMPLOYEE("PartnerEmployee"),
    @XmlEnumValue("PartnerDepartment")
    PARTNER_DEPARTMENT("PartnerDepartment"),
    @XmlEnumValue("CardRef")
    CARD_REF("CardRef"),
    @XmlEnumValue("CardType")
    CARD_TYPE("CardType"),
    @XmlEnumValue("CardState")
    CARD_STATE("CardState"),
    @XmlEnumValue("GateVariable")
    GATE_VARIABLE("GateVariable"),
    @XmlEnumValue("Enum")
    ENUM("Enum"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Button")
    BUTTON("Button"),
    @XmlEnumValue("Numerator")
    NUMERATOR("Numerator"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Folder")
    FOLDER("Folder"),
    @XmlEnumValue("UniversalType")
    UNIVERSAL_TYPE("UniversalType");
    private final String value;

    PropertyParamType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyParamType fromValue(String v) {
        for (PropertyParamType c: PropertyParamType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
