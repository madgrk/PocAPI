//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.29 at 08:13:36 PM EEST 
//


package com.cosmote.api.tutorial.xjc;

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
 *         &lt;element name="statusCode" type="{http://www.wstutorial.com/ws/TutorialService}statusCode"/&gt;
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
    "statusCode"
})
@XmlRootElement(name = "deleteTutorialResponse", namespace = "http://www.wstutorial.com/ws/TutorialService")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:36+03:00", comments = "JAXB RI v2.3.2")
public class DeleteTutorialResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:36+03:00", comments = "JAXB RI v2.3.2")
    protected StatusCode statusCode;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:36+03:00", comments = "JAXB RI v2.3.2")
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-29T08:13:36+03:00", comments = "JAXB RI v2.3.2")
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
    }

}
