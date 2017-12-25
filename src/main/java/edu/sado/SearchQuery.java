
package edu.sado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchQuery complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SearchQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchPatternId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueryParams" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ParamsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchQuery", propOrder = {
    "searchPatternId",
    "queryParams"
})
public class SearchQuery {

    @XmlElement(name = "SearchPatternId")
    protected int searchPatternId;
    @XmlElement(name = "QueryParams")
    protected ParamsList queryParams;

    /**
     * Gets the value of the searchPatternId property.
     *
     */
    public int getSearchPatternId() {
        return searchPatternId;
    }

    /**
     * Sets the value of the searchPatternId property.
     *
     */
    public void setSearchPatternId(int value) {
        this.searchPatternId = value;
    }

    /**
     * Gets the value of the queryParams property.
     *
     * @return
     *     possible object is
     *     {@link ParamsList }
     *
     */
    public ParamsList getQueryParams() {
        return queryParams;
    }

    /**
     * Sets the value of the queryParams property.
     *
     * @param value
     *     allowed object is
     *     {@link ParamsList }
     *
     */
    public void setQueryParams(ParamsList value) {
        this.queryParams = value;
    }

}
