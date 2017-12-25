
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApproverParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ApproverParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="SignaruteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsApproved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsParallel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproverParams", propOrder = {
    "id",
    "signaruteType",
    "isApproved",
    "isParallel"
})
public class ApproverParams {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SignaruteType")
    protected String signaruteType;
    @XmlElement(name = "IsApproved")
    protected boolean isApproved;
    @XmlElement(name = "IsParallel")
    protected boolean isParallel;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the signaruteType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSignaruteType() {
        return signaruteType;
    }

    /**
     * Sets the value of the signaruteType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSignaruteType(String value) {
        this.signaruteType = value;
    }

    /**
     * Gets the value of the isApproved property.
     *
     */
    public boolean isIsApproved() {
        return isApproved;
    }

    /**
     * Sets the value of the isApproved property.
     *
     */
    public void setIsApproved(boolean value) {
        this.isApproved = value;
    }

    /**
     * Gets the value of the isParallel property.
     *
     */
    public boolean isIsParallel() {
        return isParallel;
    }

    /**
     * Sets the value of the isParallel property.
     *
     */
    public void setIsParallel(boolean value) {
        this.isParallel = value;
    }

}
