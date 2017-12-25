
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ParamsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchParameters" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfSearchParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsList", propOrder = {
    "searchParameters"
})
public class ParamsList {

    @XmlElement(name = "SearchParameters")
    protected ArrayOfSearchParameter searchParameters;

    /**
     * Gets the value of the searchParameters property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfSearchParameter }
     *
     */
    public ArrayOfSearchParameter getSearchParameters() {
        return searchParameters;
    }

    /**
     * Sets the value of the searchParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchParameter }
     *
     */
    public void setSearchParameters(ArrayOfSearchParameter value) {
        this.searchParameters = value;
    }

}
