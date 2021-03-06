
package edu.sado;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for messageAcknowledgment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="messageAcknowledgment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hashCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="cookie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageAcknowledgment", namespace = "http://www.infpres.com/IEDMS", propOrder = {
    "time",
    "accepted",
    "comment",
    "hashCodes"
})
public class MessageAcknowledgment {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    protected boolean accepted;
    protected String comment;
    protected MessageAcknowledgment.HashCodes hashCodes;
    @XmlAttribute(name = "uid", namespace = "http://www.infpres.com/IEDMS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uid;
    @XmlAttribute(name = "cookie", namespace = "http://www.infpres.com/IEDMS")
    protected String cookie;

    /**
     * Gets the value of the time property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the accepted property.
     *
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     *
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the hashCodes property.
     *
     * @return
     *     possible object is
     *     {@link MessageAcknowledgment.HashCodes }
     *
     */
    public MessageAcknowledgment.HashCodes getHashCodes() {
        return hashCodes;
    }

    /**
     * Sets the value of the hashCodes property.
     *
     * @param value
     *     allowed object is
     *     {@link MessageAcknowledgment.HashCodes }
     *
     */
    public void setHashCodes(MessageAcknowledgment.HashCodes value) {
        this.hashCodes = value;
    }

    /**
     * Gets the value of the uid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the cookie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * Sets the value of the cookie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCookie(String value) {
        this.cookie = value;
    }


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
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class HashCodes {

        @XmlElement(namespace = "http://www.infpres.com/IEDMS")
        protected List<Item> item;
        @XmlAttribute(name = "algorithm", namespace = "http://www.infpres.com/IEDMS")
        protected String algorithm;

        /**
         * Gets the value of the item property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MessageAcknowledgment.HashCodes.Item }
         *
         *
         */
        public List<Item> getItem() {
            if (item == null) {
                item = new ArrayList<Item>();
            }
            return this.item;
        }

        /**
         * Gets the value of the algorithm property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAlgorithm() {
            return algorithm;
        }

        /**
         * Sets the value of the algorithm property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAlgorithm(String value) {
            this.algorithm = value;
        }


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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
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
            "name",
            "code"
        })
        public static class Item {

            @XmlElement(namespace = "http://www.infpres.com/IEDMS")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String name;
            @XmlElement(namespace = "http://www.infpres.com/IEDMS", type = String.class)
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected byte[] code;

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
             * Gets the value of the code property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public byte[] getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCode(byte[] value) {
                this.code = value;
            }

        }

    }

}
