
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Property complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="PropertyType" type="{http://www.infpres.com/IEDMS}PropertyParamType"/>
 *         &lt;element name="Values" type="{http://www.infpres.com/IEDMS}ArrayOfAnyType" minOccurs="0"/>
 *         &lt;element name="DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "name",
    "value",
    "propertyType",
    "values",
    "displayValue"
})
public class Property {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Value")
    protected Object value;
    @XmlElement(name = "PropertyType", required = true)
    @XmlSchemaType(name = "string")
    protected PropertyParamType propertyType;
    @XmlElement(name = "Values")
    protected ArrayOfAnyType values;
    @XmlElement(name = "DisplayValue")
    protected String displayValue;

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
     * Gets the value of the propertyType property.
     *
     * @return
     *     possible object is
     *     {@link PropertyParamType }
     *
     */
    public PropertyParamType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     *
     * @param value
     *     allowed object is
     *     {@link PropertyParamType }
     *
     */
    public void setPropertyType(PropertyParamType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the values property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *
     */
    public ArrayOfAnyType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *
     */
    public void setValues(ArrayOfAnyType value) {
        this.values = value;
    }

    /**
     * Gets the value of the displayValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayValue(String value) {
        this.displayValue = value;
    }

}
