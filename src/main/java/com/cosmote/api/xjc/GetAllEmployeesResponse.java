//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.29 at 08:13:38 PM EEST 
//


package com.cosmote.api.xjc;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="EmployeeType" type="{http://api.cosmote.com/xml/employees}EmployeeType" maxOccurs="unbounded"/&gt;
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
@XmlRootElement(name = "getAllEmployeesResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:38+03:00", comments = "JAXB RI v2.3.2")
public class GetAllEmployeesResponse {

    @XmlElement(name = "EmployeeType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:38+03:00", comments = "JAXB RI v2.3.2")
    protected List<EmployeeType> employeeType;

    /**
     * Gets the value of the employeeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:38+03:00", comments = "JAXB RI v2.3.2")
    public List<EmployeeType> getEmployeeType() {
        if (employeeType == null) {
            employeeType = new ArrayList<EmployeeType>();
        }
        return this.employeeType;
    }

}
