//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.10 at 06:50:19 AM EEST 
//


package com.cosmote.api.generic.xjc;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.accenture.com/assets/sdp/commonDataModel/asynch}attribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.accenture.com/assets/sdp/commonDataModel/asynch}list" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attribute",
    "list"
})
@XmlRootElement(name = "list", namespace = "http://www.accenture.com/assets/sdp/commonDataModel/asynch")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
public class List {

    @XmlElement(namespace = "http://www.accenture.com/assets/sdp/commonDataModel/asynch")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    protected java.util.List<Attribute> attribute;
    @XmlElement(namespace = "http://www.accenture.com/assets/sdp/commonDataModel/asynch")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    protected java.util.List<List> list;
    @XmlAttribute(name = "name", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    protected String name;
    @XmlAttribute(name = "value")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    protected String value;

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    public java.util.List<Attribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<Attribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link List }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    public java.util.List<List> getList() {
        if (list == null) {
            list = new ArrayList<List>();
        }
        return this.list;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-04-10T06:50:19+03:00", comments = "JAXB RI v2.3.2")
    public void setValue(String value) {
        this.value = value;
    }

}
