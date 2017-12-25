
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
 *         &lt;element name="CreateTaskResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "createTaskResult"
})
@XmlRootElement(name = "CreateTaskResponse")
public class CreateTaskResponse {

    @XmlElement(name = "CreateTaskResult", required = true)
    protected String createTaskResult;

    /**
     * Gets the value of the createTaskResult property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateTaskResult() {
        return createTaskResult;
    }

    /**
     * Sets the value of the createTaskResult property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateTaskResult(String value) {
        this.createTaskResult = value;
    }

}
