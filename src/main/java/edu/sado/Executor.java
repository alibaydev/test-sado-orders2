
package edu.sado;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Executor complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Executor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ExecutorType" type="{http://www.infpres.com/IEDMS}ExecutorTypeValues"/>
 *         &lt;element name="ExecutorNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Employee" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="Task" type="{http://www.infpres.com/IEDMS}Task" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Executor", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "id",
    "executorType",
    "executorNumber",
    "employee",
    "task"
})
public class Executor {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "ExecutorType", required = true)
    @XmlSchemaType(name = "string")
    protected ExecutorTypeValues executorType;
    @XmlElement(name = "ExecutorNumber")
    protected int executorNumber;
    @XmlElement(name = "Employee")
    protected Employee2 employee;
    @XmlElement(name = "Task")
    protected Task task;

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
     * Gets the value of the executorType property.
     *
     * @return
     *     possible object is
     *     {@link ExecutorTypeValues }
     *
     */
    public ExecutorTypeValues getExecutorType() {
        return executorType;
    }

    /**
     * Sets the value of the executorType property.
     *
     * @param value
     *     allowed object is
     *     {@link ExecutorTypeValues }
     *
     */
    public void setExecutorType(ExecutorTypeValues value) {
        this.executorType = value;
    }

    /**
     * Gets the value of the executorNumber property.
     *
     */
    public int getExecutorNumber() {
        return executorNumber;
    }

    /**
     * Sets the value of the executorNumber property.
     *
     */
    public void setExecutorNumber(int value) {
        this.executorNumber = value;
    }

    /**
     * Gets the value of the employee property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setEmployee(Employee2 value) {
        this.employee = value;
    }

    /**
     * Gets the value of the task property.
     *
     * @return
     *     possible object is
     *     {@link Task }
     *
     */
    public Task getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     *
     * @param value
     *     allowed object is
     *     {@link Task }
     *
     */
    public void setTask(Task value) {
        this.task = value;
    }

}
