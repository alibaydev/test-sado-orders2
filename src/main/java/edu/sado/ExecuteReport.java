
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
 *         &lt;element name="reportId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="arguments" type="{http://schemas.digdes.com/IntegrationSystem/2012/02/IntegrationService}ArrayOfMethodArgument" minOccurs="0"/>
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
    "reportId",
    "arguments"
})
@XmlRootElement(name = "ExecuteReport")
public class ExecuteReport {

    @XmlElement(required = true)
    protected String profileId;
    @XmlElement(required = true)
    protected String reportId;
    protected ArrayOfMethodArgument arguments;

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
     * Gets the value of the reportId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the arguments property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfMethodArgument }
     *
     */
    public ArrayOfMethodArgument getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfMethodArgument }
     *
     */
    public void setArguments(ArrayOfMethodArgument value) {
        this.arguments = value;
    }

}
