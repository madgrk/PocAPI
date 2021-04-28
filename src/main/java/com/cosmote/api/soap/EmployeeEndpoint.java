package com.cosmote.api.soap;

import com.cosmote.api.model.Employee;
import com.cosmote.api.rest.EmployeeRepository;
import com.cosmote.api.xml.employee.EmployeeDetailsRequest;
import com.cosmote.api.xml.employee.EmployeeDetailsResponse;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndpoint {

    private static final String NAMESPACE_URI = "http://api.cosmote.com/xml/employee";

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeEndpoint(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EmployeeDetailsRequest")
    @ResponsePayload
    public EmployeeDetailsResponse getStudent(@RequestPayload EmployeeDetailsRequest request) {
        EmployeeDetailsResponse response = new EmployeeDetailsResponse();
        Optional<Employee> o = this.employeeRepository.findById(request.getId());
        if (o.isPresent()) {
            com.cosmote.api.xml.employee.Employee employee = new com.cosmote.api.xml.employee.Employee();
            employee.setId(o.get().getId());
            employee.setName(o.get().getName());
            employee.setEmail(o.get().getEmail());
            response.setEmployee(employee);
        } else {
            response.setEmployee(null);
        }
        return response;
    }

}
