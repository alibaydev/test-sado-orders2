
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Part complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Part">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PartText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ControlTerm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ActualTerm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InspectTerm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Inspector" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="Curator" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="Canceled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DepCurator" type="{http://www.infpres.com/IEDMS}Employee" minOccurs="0"/>
 *         &lt;element name="Executors" type="{http://www.infpres.com/IEDMS}ArrayOfExecutor" minOccurs="0"/>
 *         &lt;element name="Reports" type="{http://www.infpres.com/IEDMS}ArrayOfReport" minOccurs="0"/>
 *         &lt;element name="Categories" type="{http://www.infpres.com/IEDMS}ArrayOfCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Part", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "id",
    "partText",
    "partNumber",
    "controlTerm",
    "actualTerm",
    "inspectTerm",
    "inspector",
    "curator",
    "canceled",
    "depCurator",
    "executors",
    "reports",
    "categories"
})
public class Part {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "PartText")
    protected String partText;
    @XmlElement(name = "PartNumber")
    protected int partNumber;
    @XmlElement(name = "ControlTerm", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar controlTerm;
    @XmlElement(name = "ActualTerm", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualTerm;
    @XmlElement(name = "InspectTerm", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inspectTerm;
    @XmlElement(name = "Inspector")
    protected Employee2 inspector;
    @XmlElement(name = "Curator")
    protected Employee2 curator;
    @XmlElement(name = "Canceled")
    protected boolean canceled;
    @XmlElement(name = "DepCurator")
    protected Employee2 depCurator;
    @XmlElement(name = "Executors")
    protected ArrayOfExecutor executors;
    @XmlElement(name = "Reports")
    protected ArrayOfReport reports;
    @XmlElement(name = "Categories")
    protected ArrayOfCategory categories;

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
     * Gets the value of the partText property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPartText() {
        return partText;
    }

    /**
     * Sets the value of the partText property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPartText(String value) {
        this.partText = value;
    }

    /**
     * Gets the value of the partNumber property.
     *
     */
    public int getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     *
     */
    public void setPartNumber(int value) {
        this.partNumber = value;
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
     * Gets the value of the inspector property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getInspector() {
        return inspector;
    }

    /**
     * Sets the value of the inspector property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setInspector(Employee2 value) {
        this.inspector = value;
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
     * Gets the value of the canceled property.
     *
     */
    public boolean isCanceled() {
        return canceled;
    }

    /**
     * Sets the value of the canceled property.
     *
     */
    public void setCanceled(boolean value) {
        this.canceled = value;
    }

    /**
     * Gets the value of the depCurator property.
     *
     * @return
     *     possible object is
     *     {@link Employee2 }
     *
     */
    public Employee2 getDepCurator() {
        return depCurator;
    }

    /**
     * Sets the value of the depCurator property.
     *
     * @param value
     *     allowed object is
     *     {@link Employee2 }
     *
     */
    public void setDepCurator(Employee2 value) {
        this.depCurator = value;
    }

    /**
     * Gets the value of the executors property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfExecutor }
     *
     */
    public ArrayOfExecutor getExecutors() {
        return executors;
    }

    /**
     * Sets the value of the executors property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfExecutor }
     *
     */
    public void setExecutors(ArrayOfExecutor value) {
        this.executors = value;
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

    /**
     * Gets the value of the categories property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfCategory }
     *
     */
    public ArrayOfCategory getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategory }
     *
     */
    public void setCategories(ArrayOfCategory value) {
        this.categories = value;
    }

}
