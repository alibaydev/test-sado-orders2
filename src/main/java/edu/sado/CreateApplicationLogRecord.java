
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
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="resourceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="operationId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="userId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="parentId" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "message",
    "typeId",
    "resourceId",
    "operationId",
    "userId",
    "parentId"
})
@XmlRootElement(name = "CreateApplicationLogRecord")
public class CreateApplicationLogRecord {

    protected String message;
    @XmlElement(required = true)
    protected String typeId;
    @XmlElement(required = true)
    protected String resourceId;
    @XmlElement(required = true)
    protected String operationId;
    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String parentId;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the typeId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeId(String value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the resourceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the operationId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

    /**
     * Gets the value of the userId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the parentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

}
