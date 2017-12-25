
package edu.sado;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fileType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pdf"/>
 *     &lt;enumeration value="tif"/>
 *     &lt;enumeration value="doc"/>
 *     &lt;enumeration value="txt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "fileType", namespace = "http://www.infpres.com/IEDMS")
@XmlEnum
public enum FileType {

    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("tif")
    TIF("tif"),
    @XmlEnumValue("doc")
    DOC("doc"),
    @XmlEnumValue("txt")
    TXT("txt");
    private final String value;

    FileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileType fromValue(String v) {
        for (FileType c: FileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
