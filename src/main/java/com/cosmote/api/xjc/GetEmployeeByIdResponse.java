//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 10:06:30 AM EET 
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
    "employeeType"
})
@XmlRootElement(name = "getEmployeeByIdResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-01-11T10:06:30+02:00", comments = "JAXB RI v2.3.2")
public class GetEmployeeByIdResponse {

    @XmlElement(name = "EmployeeType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-01-11T10:06:30+02:00", comments = "JAXB RI v2.3.2")
    protected EmployeeType employeeType;

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-01-11T10:06:30+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-01-11T10:06:30+02:00", comments = "JAXB RI v2.3.2")
    public void setEmployeeType(EmployeeType value) {
        this.employeeType = value;
    }

}
