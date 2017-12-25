
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecutorTypeValues.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutorTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Responsible"/>
 *     &lt;enumeration value="Coexecutor"/>
 *     &lt;enumeration value="Examination"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ExecutorTypeValues", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum ExecutorTypeValues {

    @XmlEnumValue("Responsible")
    RESPONSIBLE("Responsible"),
    @XmlEnumValue("Coexecutor")
    COEXECUTOR("Coexecutor"),
    @XmlEnumValue("Examination")
    EXAMINATION("Examination");
    private final String value;

    ExecutorTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutorTypeValues fromValue(String v) {
        for (ExecutorTypeValues c: ExecutorTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
