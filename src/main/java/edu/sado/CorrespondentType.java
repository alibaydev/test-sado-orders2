
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrespondentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorrespondentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Natural"/>
 *     &lt;enumeration value="Commercial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "CorrespondentType", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum CorrespondentType {

    @XmlEnumValue("Natural")
    NATURAL("Natural"),
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial");
    private final String value;

    CorrespondentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CorrespondentType fromValue(String v) {
        for (CorrespondentType c: CorrespondentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
