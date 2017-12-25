
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Approver complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Approver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee" type="{http://www.infpres.com/IEDMS}addresseeExt" minOccurs="0"/>
 *         &lt;element name="ApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ApprovalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastApprovalStatus" type="{http://www.infpres.com/IEDMS}ApprovalStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Approver", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "employee",
    "approvalDate",
    "approvalType",
    "order",
    "lastApprovalStatus"
})
public class Approver {

    @XmlElement(name = "Employee")
    protected AddresseeExt employee;
    @XmlElement(name = "ApprovalDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    @XmlElement(name = "ApprovalType")
    protected String approvalType;
    @XmlElement(name = "Order")
    protected int order;
    @XmlElement(name = "LastApprovalStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ApprovalStatus lastApprovalStatus;

    /**
     * Gets the value of the employee property.
     *
     * @return
     *     possible object is
     *     {@link AddresseeExt }
     *
     */
    public AddresseeExt getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     *
     * @param value
     *     allowed object is
     *     {@link AddresseeExt }
     *
     */
    public void setEmployee(AddresseeExt value) {
        this.employee = value;
    }

    /**
     * Gets the value of the approvalDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setApprovalDate(XMLGregorianCalendar value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the approvalType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApprovalType() {
        return approvalType;
    }

    /**
     * Sets the value of the approvalType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApprovalType(String value) {
        this.approvalType = value;
    }

    /**
     * Gets the value of the order property.
     *
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     *
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the lastApprovalStatus property.
     *
     * @return
     *     possible object is
     *     {@link ApprovalStatus }
     *
     */
    public ApprovalStatus getLastApprovalStatus() {
        return lastApprovalStatus;
    }

    /**
     * Sets the value of the lastApprovalStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link ApprovalStatus }
     *
     */
    public void setLastApprovalStatus(ApprovalStatus value) {
        this.lastApprovalStatus = value;
    }

}
