
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MethodArgument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MethodArgument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ArgumentType" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArgumentType"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodArgument", propOrder = {
    "value",
    "argumentType",
    "name"
})
public class MethodArgument {

    @XmlElement(name = "Value")
    protected Object value;
    @XmlElement(name = "ArgumentType", required = true)
    @XmlSchemaType(name = "string")
    protected ArgumentType argumentType;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the argumentType property.
     *
     * @return
     *     possible object is
     *     {@link ArgumentType }
     *
     */
    public ArgumentType getArgumentType() {
        return argumentType;
    }

    /**
     * Sets the value of the argumentType property.
     *
     * @param value
     *     allowed object is
     *     {@link ArgumentType }
     *
     */
    public void setArgumentType(ArgumentType value) {
        this.argumentType = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

}
