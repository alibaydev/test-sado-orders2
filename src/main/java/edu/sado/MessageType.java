
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="��������"/>
 *     &lt;enumeration value="�����������"/>
 *     &lt;enumeration value="���������"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "messageType", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum MessageType {

//    @XmlEnumValue("\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
//    ��������("\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442"),
//    @XmlEnumValue("\u0423\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u0435")
//    �����������("\u0423\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u0435"),
//    @XmlEnumValue("\u041a\u0432\u0438\u0442\u0430\u043d\u0446\u0438\u044f")
//    ���������("\u041a\u0432\u0438\u0442\u0430\u043d\u0446\u0438\u044f");

    @XmlEnumValue("Temp")
    Temp("Temp");
    private final String value;

    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
