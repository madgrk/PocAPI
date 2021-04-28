package com.cosmote.api.rest;

import com.cosmote.api.model.Employee;
import com.cosmote.api.rest.errors.EntityNotFoundException;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(path = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> retrieveAllEmployess() throws EntityNotFoundException {
        return this.employeeRepository.findAll();
    }

    @GetMapping(path = "/employees/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee retrieveExployee(@PathVariable long id) throws EntityNotFoundException {
        Optional<Employee> o = this.employeeRepository.findById(id);
        return o.isPresent() ? o.get() : null;
    }

    @PostMapping(path = "/employees", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createEmployee(@RequestBody Employee e) throws EntityNotFoundException {
        Employee savedEmployee = this.employeeRepository.save(e);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedEmployee.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping(path = "/employees/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee e, @PathVariable long id) throws EntityNotFoundException {
        Optional<Employee> o = this.employeeRepository.findById(id);
        if (!o.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        e.setId(id);;
        this.employeeRepository.save(e);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/employees/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable long id) throws EntityNotFoundException {
        Optional<Employee> o = this.employeeRepository.findById(id);
        if (o.isPresent()) {
            this.employeeRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
