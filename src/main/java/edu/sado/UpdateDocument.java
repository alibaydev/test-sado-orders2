
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="task" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}DocumentItem" minOccurs="0"/>
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
    "task"
})
@XmlRootElement(name = "UpdateDocument")
public class UpdateDocument {

    protected DocumentItem task;

    /**
     * Gets the value of the task property.
     *
     * @return
     *     possible object is
     *     {@link DocumentItem }
     *
     */
    public DocumentItem getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentItem }
     *
     */
    public void setTask(DocumentItem value) {
        this.task = value;
    }

}