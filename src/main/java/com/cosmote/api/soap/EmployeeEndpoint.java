package com.cosmote.api.soap;

import com.cosmote.api.model.Employee;
import com.cosmote.api.xjc.EmployeeType;
import com.cosmote.api.xjc.GetEmployeeByIdRequest;
import com.cosmote.api.xjc.GetEmployeeByIdResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndpoint {

    public static final String NAMESPACE_URI = "http://api.cosmote.com/xml/employee";

    private EmployeeEntityService employeeEntityService;

    public EmployeeEndpoint() {
    }

    @Autowired
    public EmployeeEndpoint(EmployeeEntityService employeeEntityService) {
        this.employeeEntityService = employeeEntityService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeByIdRequest")
    @ResponsePayload
    public GetEmployeeByIdResponse getStudent(@RequestPayload GetEmployeeByIdRequest request) {
        GetEmployeeByIdResponse response = new GetEmployeeByIdResponse();
        Employee employee = this.employeeEntityService.getEntityById(request.getEmployeeid());
        EmployeeType employeeType = new EmployeeType();
        BeanUtils.copyProperties(employee, employeeType);
        response.setEmployeeType(employeeType);
        return response;
    }

}
