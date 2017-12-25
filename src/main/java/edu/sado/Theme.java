
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Theme complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Theme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Results" type="{http://www.infpres.com/IEDMS}ArrayOfResult" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Theme", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "id",
    "name",
    "questionType",
    "results",
    "subject"
})
public class Theme {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "QuestionType")
    protected String questionType;
    @XmlElement(name = "Results")
    protected ArrayOfResult results;
    @XmlElement(name = "Subject")
    protected String subject;

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
     * Gets the value of the questionType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * Sets the value of the questionType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQuestionType(String value) {
        this.questionType = value;
    }

    /**
     * Gets the value of the results property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfResult }
     *
     */
    public ArrayOfResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfResult }
     *
     */
    public void setResults(ArrayOfResult value) {
        this.results = value;
    }

    /**
     * Gets the value of the subject property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
