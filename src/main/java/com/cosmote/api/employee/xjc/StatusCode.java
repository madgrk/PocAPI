//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.29 at 08:13:37 PM EEST 
//


package com.cosmote.api.employee.xjc;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusCode", namespace = "http://localhost:8080/ws/EmployeeService", propOrder = {
    "code"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:37+03:00", comments = "JAXB RI v2.3.2")
public class StatusCode {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:37+03:00", comments = "JAXB RI v2.3.2")
    protected long code;

    /**
     * Gets the value of the code property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:37+03:00", comments = "JAXB RI v2.3.2")
    public long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:37+03:00", comments = "JAXB RI v2.3.2")
    public void setCode(long value) {
        this.code = value;
    }

}