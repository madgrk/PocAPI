package com.cosmote.api.soap;

import com.cosmote.api.model.Employee;
import java.util.List;

public interface EmployeeEntityService {

    public Employee getEntityById(long id);

    public List<Employee> getAllEntities();

    public Employee addEnity(Employee entity);

    public boolean updateEntity(Employee entity);

    public boolean deleteEntity(long id);
}
