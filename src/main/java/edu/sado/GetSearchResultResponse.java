
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
 *         &lt;element name="GetSearchResultResult" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfGuid" minOccurs="0"/>
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
    "getSearchResultResult"
})
@XmlRootElement(name = "GetSearchResultResponse")
public class GetSearchResultResponse {

    @XmlElement(name = "GetSearchResultResult")
    protected ArrayOfGuid getSearchResultResult;

    /**
     * Gets the value of the getSearchResultResult property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *
     */
    public ArrayOfGuid getGetSearchResultResult() {
        return getSearchResultResult;
    }

    /**
     * Sets the value of the getSearchResultResult property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *
     */
    public void setGetSearchResultResult(ArrayOfGuid value) {
        this.getSearchResultResult = value;
    }

}
