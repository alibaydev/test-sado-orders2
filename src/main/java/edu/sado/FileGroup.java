
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fileGroup.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fileGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="����� ���������"/>
 *     &lt;enumeration value="����� ����������"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "fileGroup", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum FileGroup {

//    @XmlEnumValue("\u0422\u0435\u043a\u0441\u0442 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430")
//    �����_���������("\u0422\u0435\u043a\u0441\u0442 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430"),
//    @XmlEnumValue("\u0422\u0435\u043a\u0441\u0442 \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u044f")
//    �����_����������("\u0422\u0435\u043a\u0441\u0442 \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u044f");

    @XmlEnumValue("Temp")
    Temp("Temp");
    private final String value;

    FileGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileGroup fromValue(String v) {
        for (FileGroup c: FileGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
