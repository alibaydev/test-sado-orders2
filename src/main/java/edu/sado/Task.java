
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Task complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Task">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="State" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="TaskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ExtSourceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Author" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="Appointed" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="AppointedType" type="{http://www.infpres.com/IEDMS}ExecutorTypeValues"/>
 *         &lt;element name="Controller" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="TaskText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlTerm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InspectTerm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ActualTerm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RootTask" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Executes" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="Curator" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="RegCard" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ParentPart" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Resolution" type="{http://www.infpres.com/IEDMS}Resolution" minOccurs="0"/>
 *         &lt;element name="Notifications" type="{http://www.infpres.com/IEDMS}ArrayOfNotificationRow1" minOccurs="0"/>
 *         &lt;element name="Kind" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PursuanceRequire" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Reports" type="{http://www.infpres.com/IEDMS}ArrayOfReport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "description",
    "createDate",
    "id",
    "state",
    "taskNumber",
    "taskId",
    "extSourceId",
    "author",
    "appointed",
    "appointedType",
    "controller",
    "taskText",
    "controlTerm",
    "inspectTerm",
    "actualTerm",
    "rootTask",
    "executes",
    "curator",
    "regCard",
    "parentPart",
    "resolution",
    "notifications",
    "kind",
    "pursuanceRequire",
    "reports"
})
public class Task {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "State", required = true, nillable = true)
    protected String state;
    @XmlElement(name = "TaskNumber")
    protected String taskNumber;
    @XmlElement(name = "TaskId", required = true, nillable = true)
    protected String taskId;
    @XmlElement(name = "ExtSourceId", required = true, nillable = true)
    protected String extSourceId;
    @XmlElement(name = "Author")
    protected Employee2 author;
    @XmlElement(name = "Appointed")
    protected Employee2 appointed;
    @XmlElement(name = "AppointedType", required = true)
    @XmlSchemaType(name = "string")
    protected ExecutorTypeValues appointedType;
    @XmlElement(name = "Controller")
    protected Employee2 controller;
    @XmlElement(name = "TaskText")
    protected String taskText;
    @XmlElement(name = "ControlTerm", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar controlTerm;
    @XmlElement(name = "InspectTerm", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inspectTerm;
    @XmlElement(name = "ActualTerm", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualTerm;
    @XmlElement(name = "RootTask", required = true, nillable = true)
    protected String rootTask;
    @XmlElement(name = "Executes")
    protected Employee2 executes;
    @XmlElement(name = "Curator")
    protected Employee2 curator;
    @XmlElement(name = "RegCard", required = true, nillable = true)
    protected String regCard;
    @XmlElement(name = "ParentPart", required = true, nillable = true)
    protected String parentPart;
    @XmlElement(name = "Resolution")
    protected Resolution resolution;
    @XmlElement(name = "Notifications")
    protected ArrayOfNotificationRow1 notifications;
    @XmlElement(name = "Kind", required = true, nillable = true)
    protected String kind;
    @XmlElement(name = "PursuanceRequire")
    protected boolean pursuanceRequire;
    @XmlElement(name = "Reports")
    protected ArrayOfReport reports;

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
     * Gets the value of the taskNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaskNumber() {
        return taskNumber;
    }

    /**
     * Sets the value of the taskNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaskNumber(String value) {
        this.taskNumber = value;
    }

    /**
     * Gets the value of the taskId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the extSourceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExtSourceId() {
        return extSourceId;
    }

    /**
     * Sets the value of the extSourceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExtSourceId(String value) {
        this.extSourceId = value;
    }

    /**
     * Gets the value of the author property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setAuthor(Employee2 value) {
        this.author = value;
    }

    /**
     * Gets the value of the appointed property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getAppointed() {
        return appointed;
    }

    /**
     * Sets the value of the appointed property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setAppointed(Employee2 value) {
        this.appointed = value;
    }

    /**
     * Gets the value of the appointedType property.
     *
     * @return
     *     possible object is
     *     {@link ExecutorTypeValues }
     *
     */
    public ExecutorTypeValues getAppointedType() {
        return appointedType;
    }

    /**
     * Sets the value of the appointedType property.
     *
     * @param value
     *     allowed object is
     *     {@link ExecutorTypeValues }
     *
     */
    public void setAppointedType(ExecutorTypeValues value) {
        this.appointedType = value;
    }

    /**
     * Gets the value of the controller property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getController() {
        return controller;
    }

    /**
     * Sets the value of the controller property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setController(Employee2 value) {
        this.controller = value;
    }

    /**
     * Gets the value of the taskText property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaskText() {
        return taskText;
    }

    /**
     * Sets the value of the taskText property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaskText(String value) {
        this.taskText = value;
    }

    /**
     * Gets the value of the controlTerm property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getControlTerm() {
        return controlTerm;
    }

    /**
     * Sets the value of the controlTerm property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setControlTerm(XMLGregorianCalendar value) {
        this.controlTerm = value;
    }

    /**
     * Gets the value of the inspectTerm property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getInspectTerm() {
        return inspectTerm;
    }

    /**
     * Sets the value of the inspectTerm property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setInspectTerm(XMLGregorianCalendar value) {
        this.inspectTerm = value;
    }

    /**
     * Gets the value of the actualTerm property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getActualTerm() {
        return actualTerm;
    }

    /**
     * Sets the value of the actualTerm property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setActualTerm(XMLGregorianCalendar value) {
        this.actualTerm = value;
    }

    /**
     * Gets the value of the rootTask property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRootTask() {
        return rootTask;
    }

    /**
     * Sets the value of the rootTask property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRootTask(String value) {
        this.rootTask = value;
    }

    /**
     * Gets the value of the executes property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getExecutes() {
        return executes;
    }

    /**
     * Sets the value of the executes property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setExecutes(Employee2 value) {
        this.executes = value;
    }

    /**
     * Gets the value of the curator property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getCurator() {
        return curator;
    }

    /**
     * Sets the value of the curator property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setCurator(Employee2 value) {
        this.curator = value;
    }

    /**
     * Gets the value of the regCard property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegCard() {
        return regCard;
    }

    /**
     * Sets the value of the regCard property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegCard(String value) {
        this.regCard = value;
    }

    /**
     * Gets the value of the parentPart property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentPart() {
        return parentPart;
    }

    /**
     * Sets the value of the parentPart property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentPart(String value) {
        this.parentPart = value;
    }

    /**
     * Gets the value of the resolution property.
     *
     * @return
     *     possible object is
     *     {@link Resolution }
     *
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     *
     * @param value
     *     allowed object is
     *     {@link Resolution }
     *
     */
    public void setResolution(Resolution value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the notifications property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationRow1 }
     *
     */
    public ArrayOfNotificationRow1 getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationRow1 }
     *
     */
    public void setNotifications(ArrayOfNotificationRow1 value) {
        this.notifications = value;
    }

    /**
     * Gets the value of the kind property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the pursuanceRequire property.
     *
     */
    public boolean isPursuanceRequire() {
        return pursuanceRequire;
    }

    /**
     * Sets the value of the pursuanceRequire property.
     *
     */
    public void setPursuanceRequire(boolean value) {
        this.pursuanceRequire = value;
    }

    /**
     * Gets the value of the reports property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfReport }
     *
     */
    public ArrayOfReport getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfReport }
     *
     */
    public void setReports(ArrayOfReport value) {
        this.reports = value;
    }

}
