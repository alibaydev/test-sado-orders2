
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CitizenRequestDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CitizenRequestDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infpres.com/IEDMS}SubjectDocument">
 *       &lt;sequence>
 *         &lt;element name="Applicant" type="{http://www.infpres.com/IEDMS}Applicant" minOccurs="0"/>
 *         &lt;element name="CitizenRequestType" type="{http://www.infpres.com/IEDMS}CitizenRequestType"/>
 *         &lt;element name="FrequencyRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RedirectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Themes" type="{http://www.infpres.com/IEDMS}ArrayOfTheme" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenRequestDocument", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "applicant",
    "citizenRequestType",
    "frequencyRate",
    "receiptDate",
    "redirectionDate",
    "themes"
})
public class CitizenRequestDocument
    extends SubjectDocument
{

    @XmlElement(name = "Applicant")
    protected Applicant applicant;
    @XmlElement(name = "CitizenRequestType", required = true)
    @XmlSchemaType(name = "string")
    protected CitizenRequestType citizenRequestType;
    @XmlElement(name = "FrequencyRate")
    protected int frequencyRate;
    @XmlElement(name = "ReceiptDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlElement(name = "RedirectionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar redirectionDate;
    @XmlElement(name = "Themes")
    protected ArrayOfTheme themes;

    /**
     * Gets the value of the applicant property.
     *
     * @return
     *     possible object is
     *     {@link Applicant }
     *
     */
    public Applicant getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     *
     * @param value
     *     allowed object is
     *     {@link Applicant }
     *
     */
    public void setApplicant(Applicant value) {
        this.applicant = value;
    }

    /**
     * Gets the value of the citizenRequestType property.
     *
     * @return
     *     possible object is
     *     {@link CitizenRequestType }
     *
     */
    public CitizenRequestType getCitizenRequestType() {
        return citizenRequestType;
    }

    /**
     * Sets the value of the citizenRequestType property.
     *
     * @param value
     *     allowed object is
     *     {@link CitizenRequestType }
     *
     */
    public void setCitizenRequestType(CitizenRequestType value) {
        this.citizenRequestType = value;
    }

    /**
     * Gets the value of the frequencyRate property.
     *
     */
    public int getFrequencyRate() {
        return frequencyRate;
    }

    /**
     * Sets the value of the frequencyRate property.
     *
     */
    public void setFrequencyRate(int value) {
        this.frequencyRate = value;
    }

    /**
     * Gets the value of the receiptDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the redirectionDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRedirectionDate() {
        return redirectionDate;
    }

    /**
     * Sets the value of the redirectionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRedirectionDate(XMLGregorianCalendar value) {
        this.redirectionDate = value;
    }

    /**
     * Gets the value of the themes property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfTheme }
     *
     */
    public ArrayOfTheme getThemes() {
        return themes;
    }

    /**
     * Sets the value of the themes property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfTheme }
     *
     */
    public void setThemes(ArrayOfTheme value) {
        this.themes = value;
    }

}
