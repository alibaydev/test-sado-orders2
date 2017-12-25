
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
 *         &lt;element name="GetFolderContentResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfGuid" minOccurs="0"/>
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
    "getFolderContentResult"
})
@XmlRootElement(name = "GetFolderContentResponse")
public class GetFolderContentResponse {

    @XmlElement(name = "GetFolderContentResult")
    protected ArrayOfGuid getFolderContentResult;

    /**
     * Gets the value of the getFolderContentResult property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *
     */
    public ArrayOfGuid getGetFolderContentResult() {
        return getFolderContentResult;
    }

    /**
     * Sets the value of the getFolderContentResult property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *
     */
    public void setGetFolderContentResult(ArrayOfGuid value) {
        this.getFolderContentResult = value;
    }

}
