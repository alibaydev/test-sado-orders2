
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Organization"/>
 *     &lt;enumeration value="Department"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "CompanyType")
@XmlEnum
public enum CompanyType {

    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department");
    private final String value;

    CompanyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyType fromValue(String v) {
        for (CompanyType c: CompanyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
