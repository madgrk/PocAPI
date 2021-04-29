package com.cosmote.api.soap;

import com.cosmote.api.model.Employee;
import com.cosmote.api.xjc.AddEmployeeRequest;
import com.cosmote.api.xjc.AddEmployeeResponse;
import com.cosmote.api.xjc.DeleteEmployeeRequest;
import com.cosmote.api.xjc.DeleteEmployeeResponse;
import com.cosmote.api.xjc.EmployeeType;
import com.cosmote.api.xjc.GetAllEmployeesRequest;
import com.cosmote.api.xjc.GetAllEmployeesResponse;
import com.cosmote.api.xjc.GetEmployeeByIdRequest;
import com.cosmote.api.xjc.GetEmployeeByIdResponse;
import com.cosmote.api.xjc.ServiceStatus;
import com.cosmote.api.xjc.UpdateEmployeeRequest;
import com.cosmote.api.xjc.UpdateEmployeeResponse;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
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
        ServiceStatus serviceStatus = new ServiceStatus();
        Employee employee = this.employeeEntityService.getEntityById(request.getId());
        EmployeeType employeeType = new EmployeeType();

        if (employee == null) {
            serviceStatus.setStatusCode("NOT FOUND");
            serviceStatus.setMessage(String.format("Employee = %s not found", request.getId()));
            response.setEmployeeType(null);
        } else {
            BeanUtils.copyProperties(employee, employeeType);
            response.setEmployeeType(employeeType);
        }

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmployeesRequest")
    @ResponsePayload
    public GetAllEmployeesResponse getAllEmployees(@RequestPayload GetAllEmployeesRequest request) {
        GetAllEmployeesResponse response = new GetAllEmployeesResponse();
        List<Employee> employees = this.employeeEntityService.getAllEntities();
        List<EmployeeType> employeeTypes = new ArrayList<>();
        employees.stream().map((Employee employee) -> {
            EmployeeType type = new EmployeeType();
            BeanUtils.copyProperties(employee, type);
            return type;
        }).forEachOrdered(type -> {
            employeeTypes.add(type);
        });
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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateEmployeeRequest")
    @ResponsePayload
    public UpdateEmployeeResponse updateEmployee(@RequestPayload UpdateEmployeeRequest request) {

        UpdateEmployeeResponse response = new UpdateEmployeeResponse();
        ServiceStatus serviceStatus = new ServiceStatus();

        // 1. Find the Employee
        Employee employeeFromDB = this.employeeEntityService.getEntityById(request.getId());
        if (employeeFromDB == null) {
            serviceStatus.setStatusCode("NOT FOUND");
            serviceStatus.setMessage(String.format("Employee id %s not found", request.getId()));
        } else {

            // 2. Get updated employee information from the request
            employeeFromDB.setId(request.getId());
            employeeFromDB.setEmail(request.getEmail());
            employeeFromDB.setName(request.getName());

            // 3. update the employee in database
            boolean flag = this.employeeEntityService.updateEntity(employeeFromDB);

            if (false == flag) {
                serviceStatus.setStatusCode("CONFLICT");
                serviceStatus.setMessage(String.format("Exception while updating Entity %s", request.getName()));
            } else {
                serviceStatus.setStatusCode("SUCCESS");
                serviceStatus.setMessage("Content updated Successfully");
            }
        }

        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteEmployeeRequest")
    @ResponsePayload
    public DeleteEmployeeResponse deleteEmployee(@RequestPayload DeleteEmployeeRequest request) {
        DeleteEmployeeResponse response = new DeleteEmployeeResponse();
        ServiceStatus serviceStatus = new ServiceStatus();

        Employee employee = this.employeeEntityService.getEntityById(request.getId());
        if (null == employee) {
            serviceStatus.setStatusCode("FAIL");
            serviceStatus.setMessage(String.format("Exception while deleting Entity id %s", request.getId()));
        } else {
            this.employeeEntityService.deleteEntity(request.getId());
            serviceStatus.setStatusCode("SUCCESS");
            serviceStatus.setMessage("Content Deleted Successfully");
        }

        response.setServiceStatus(serviceStatus);
        return response;
    }

}
