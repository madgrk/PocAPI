package com.cosmote.api.soap;

import com.cosmote.api.model.Employee;
import com.cosmote.api.xjc.AddEmployeeRequest;
import com.cosmote.api.xjc.AddEmployeeResponse;
import com.cosmote.api.xjc.EmployeeType;
import com.cosmote.api.xjc.GetAllEmployeesRequest;
import com.cosmote.api.xjc.GetAllEmployeesResponse;
import com.cosmote.api.xjc.GetEmployeeByIdRequest;
import com.cosmote.api.xjc.GetEmployeeByIdResponse;
import com.cosmote.api.xjc.ServiceStatus;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Slf4j
@Endpoint
public class EmployeeEndpoint {

    public static final String NAMESPACE_URI = "http://api.cosmote.com/xml/employees";

    private EmployeeEntityService employeeEntityService;

    public EmployeeEndpoint() {
    }

    @Autowired
    public EmployeeEndpoint(EmployeeEntityService employeeEntityService) {
        this.employeeEntityService = employeeEntityService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeByIdRequest")
    @ResponsePayload
    public GetEmployeeByIdResponse getEmployeeById(@RequestPayload GetEmployeeByIdRequest request) {
        GetEmployeeByIdResponse response = new GetEmployeeByIdResponse();
        Employee employee = this.employeeEntityService.getEntityById(request.getEmployeeid());
        EmployeeType employeeType = new EmployeeType();
        BeanUtils.copyProperties(employee, employeeType);
        response.setEmployeeType(employeeType);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmployeesRequest")
    @ResponsePayload
    public GetAllEmployeesResponse getAllEmployees(@RequestPayload GetAllEmployeesRequest request) {
        GetAllEmployeesResponse response = new GetAllEmployeesResponse();
        List<Employee> employees = this.employeeEntityService.getAllEntities();
        List<EmployeeType> employeeTypes = new ArrayList<>();
        for (Employee employee : employees) {
            EmployeeType type = new EmployeeType();
            BeanUtils.copyProperties(employee, type);
            employeeTypes.add(type);
        }
        response.getEmployeeType().addAll(employeeTypes);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addEmployeeRequest")
    @ResponsePayload
    public AddEmployeeResponse addEmployee(@RequestPayload AddEmployeeRequest request) {
        AddEmployeeResponse response = new AddEmployeeResponse();
        EmployeeType employeeType = new EmployeeType();
        ServiceStatus serviceStatus = new ServiceStatus();

        Employee newEmployeeEntity = new Employee();
        newEmployeeEntity.setName(request.getName());
        newEmployeeEntity.setEmail(request.getEmail());

        Employee savedEmployeeEntity = this.employeeEntityService.addEnity(newEmployeeEntity);

        if (savedEmployeeEntity == null) {
            serviceStatus.setStatusCode("CONFLICT");
            serviceStatus.setMessage("Exception while adding Entity");
        } else {
            BeanUtils.copyProperties(savedEmployeeEntity, employeeType);
            serviceStatus.setStatusCode("SUCCESS");
            serviceStatus.setMessage("Content Added Successfully");
        }

        response.setEmployeeType(employeeType);
        response.setServiceStatus(serviceStatus);
        return response;
    }

}
