package com.cosmote.api.soap;

import com.cosmote.api.model.Employee;
import com.cosmote.api.rest.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeEntityServiceImpl implements EmployeeEntityService {

    private EmployeeRepository employeeRepository;

    public EmployeeEntityServiceImpl() {
    }

    @Autowired
    public EmployeeEntityServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEntityById(long id) {
        Optional<Employee> o = this.employeeRepository.findById(id);
        return o.isPresent() ? o.get() : null;
    }

    @Override
    public List<Employee> getAllEntities() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee addEnity(Employee entity) {
        try {
            return this.employeeRepository.save(entity);
        } catch (Exception exc) {
            exc.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateEntity(Employee entity) {
        try {
            this.employeeRepository.save(entity);
            return true;
        } catch (Exception exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteEntity(long id) {
        try {
            this.employeeRepository.deleteById(id);
            return true;
        } catch (Exception exc) {
            exc.printStackTrace();
            return false;
        }
    }

}
