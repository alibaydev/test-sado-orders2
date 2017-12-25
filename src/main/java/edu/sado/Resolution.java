
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Resolution complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Resolution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Parts" type="{http://www.infpres.com/IEDMS}ArrayOfPart" minOccurs="0"/>
 *         &lt;element name="State" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Approver" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="Signer" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="ApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ParentTask" type="{http://microsoft.com/wsdl/types/}guid"/>
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
@XmlType(name = "Resolution", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "description",
    "changeDate",
    "createDate",
    "id",
    "parts",
    "state",
    "approver",
    "signer",
    "operator",
    "approvalDate",
    "parentTask",
    "name"
})
public class Resolution {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Parts")
    protected ArrayOfPart parts;
    @XmlElement(name = "State", required = true, nillable = true)
    protected String state;
    @XmlElement(name = "Approver")
    protected Employee2 approver;
    @XmlElement(name = "Signer")
    protected Employee2 signer;
    @XmlElement(name = "Operator")
    protected Employee2 operator;
    @XmlElement(name = "ApprovalDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    @XmlElement(name = "ParentTask", required = true)
    protected String parentTask;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the changeDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the createDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

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
     * Gets the value of the parts property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfPart }
     *
     */
    public ArrayOfPart getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfPart }
     *
     */
    public void setParts(ArrayOfPart value) {
        this.parts = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the approver property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getApprover() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setApprover(Employee2 value) {
        this.approver = value;
    }

    /**
     * Gets the value of the signer property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getSigner() {
        return signer;
    }

    /**
     * Sets the value of the signer property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setSigner(Employee2 value) {
        this.signer = value;
    }

    /**
     * Gets the value of the operator property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setOperator(Employee2 value) {
        this.operator = value;
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
     * Gets the value of the parentTask property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentTask() {
        return parentTask;
    }

    /**
     * Sets the value of the parentTask property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentTask(String value) {
        this.parentTask = value;
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
