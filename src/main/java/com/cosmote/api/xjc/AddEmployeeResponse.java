//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.29 at 11:35:06 PM EEST 
//


package com.cosmote.api.xjc;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="serviceStatus" type="{http://api.cosmote.com/xml/employees}serviceStatus"/&gt;
 *         &lt;element name="EmployeeType" type="{http://api.cosmote.com/xml/employees}EmployeeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceStatus",
    "employeeType"
})
@XmlRootElement(name = "addEmployeeResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T11:35:06+03:00", comments = "JAXB RI v2.3.2")
public class AddEmployeeResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T11:35:06+03:00", comments = "JAXB RI v2.3.2")
    protected ServiceStatus serviceStatus;
    @XmlElement(name = "EmployeeType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T11:35:06+03:00", comments = "JAXB RI v2.3.2")
    protected EmployeeType employeeType;

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T11:35:06+03:00", comments = "JAXB RI v2.3.2")
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T11:35:06+03:00", comments = "JAXB RI v2.3.2")
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T11:35:06+03:00", comments = "JAXB RI v2.3.2")
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T11:35:06+03:00", comments = "JAXB RI v2.3.2")
    public void setEmployeeType(EmployeeType value) {
        this.employeeType = value;
    }

}
