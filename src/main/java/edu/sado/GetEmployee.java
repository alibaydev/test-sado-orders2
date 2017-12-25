
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profileid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="employeeId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profileid",
    "employeeId"
})
@XmlRootElement(name = "GetEmployee")
public class GetEmployee {

    @XmlElement(required = true)
    protected String profileid;
    @XmlElement(required = true)
    protected String employeeId;

    /**
     * Gets the value of the profileid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfileid() {
        return profileid;
    }

    /**
     * Sets the value of the profileid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProfileid(String value) {
        this.profileid = value;
    }

    /**
     * Gets the value of the employeeId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

}
