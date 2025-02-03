package com.robb.crudemployee.Service;

import com.robb.crudemployee.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(Integer id);
}
