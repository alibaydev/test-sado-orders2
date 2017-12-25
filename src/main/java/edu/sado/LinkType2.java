
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="linkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="� ����� ��"/>
 *     &lt;enumeration value="�� ����������"/>
 *     &lt;enumeration value="��������-���������"/>
 *     &lt;enumeration value="�� �"/>
 *     &lt;enumeration value="�����"/>
 *     &lt;enumeration value="������ �"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "linkType", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum LinkType2 {

//    @XmlEnumValue("\u0412 \u043e\u0442\u0432\u0435\u0442 \u043d\u0430")
//    �_�����_��("\u0412 \u043e\u0442\u0432\u0435\u0442 \u043d\u0430"),
//    @XmlEnumValue("\u0412\u043e \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435")
//    ��_����������("\u0412\u043e \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435"),
//    @XmlEnumValue("\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442-\u043e\u0441\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
//    ��������_���������("\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442-\u043e\u0441\u043d\u043e\u0432\u0430\u043d\u0438\u0435"),
//    @XmlEnumValue("\u041d\u0430 \u2116")
//    ��("\u041d\u0430 \u2116"),
//    @XmlEnumValue("\u041e\u0442\u0432\u0435\u0442")
//    �����("\u041e\u0442\u0432\u0435\u0442"),
//    @XmlEnumValue("\u0421\u0432\u044f\u0437\u0430\u043d \u0441")
//    ������_�("\u0421\u0432\u044f\u0437\u0430\u043d \u0441");
    @XmlEnumValue("Temp")
    Temp("Temp");
    private final String value;

    LinkType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkType2 fromValue(String v) {
        for (LinkType2 c: LinkType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
