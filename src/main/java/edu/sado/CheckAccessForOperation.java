
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
 *         &lt;element name="profileId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="cardId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="operationId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="stateId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="userId" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "profileId",
    "cardId",
    "operationId",
    "stateId",
    "userId"
})
@XmlRootElement(name = "CheckAccessForOperation")
public class CheckAccessForOperation {

    @XmlElement(required = true)
    protected String profileId;
    @XmlElement(required = true)
    protected String cardId;
    @XmlElement(required = true)
    protected String operationId;
    @XmlElement(required = true)
    protected String stateId;
    @XmlElement(required = true)
    protected String userId;

    /**
     * Gets the value of the profileId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the cardId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardId(String value) {
        this.cardId = value;
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
     * Gets the value of the stateId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStateId(String value) {
        this.stateId = value;
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

}
