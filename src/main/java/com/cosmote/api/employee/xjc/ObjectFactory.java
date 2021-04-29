//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.29 at 08:13:37 PM EEST 
//


package com.cosmote.api.employee.xjc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cosmote.api.employee.xjc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeFault_QNAME = new QName("http://localhost:8080/ws/EmployeeService", "employeeFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cosmote.api.employee.xjc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllEmployeesRequest }
     * 
     */
    public GetAllEmployeesRequest createGetAllEmployeesRequest() {
        return new GetAllEmployeesRequest();
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link EmployeeTypes }
     * 
     */
    public EmployeeTypes createEmployeeTypes() {
        return new EmployeeTypes();
    }

    /**
     * Create an instance of {@link StatusCode }
     * 
     */
    public StatusCode createStatusCode() {
        return new StatusCode();
    }

    /**
     * Create an instance of {@link EmployeeType }
     * 
     */
    public EmployeeType createEmployeeType() {
        return new EmployeeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://localhost:8080/ws/EmployeeService", name = "employeeFault")
    public JAXBElement<String> createEmployeeFault(String value) {
        return new JAXBElement<String>(_EmployeeFault_QNAME, String.class, null, value);
    }

}