
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CitizenRequestType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CitizenRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Written"/>
 *     &lt;enumeration value="Verbal"/>
 *     &lt;enumeration value="Electronic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "CitizenRequestType", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum CitizenRequestType {

    @XmlEnumValue("Written")
    WRITTEN("Written"),
    @XmlEnumValue("Verbal")
    VERBAL("Verbal"),
    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic");
    private final String value;

    CitizenRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CitizenRequestType fromValue(String v) {
        for (CitizenRequestType c: CitizenRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
