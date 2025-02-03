package com.robb.crudemployee.Service;

import com.robb.crudemployee.DAO.EmployeeDAO;
import com.robb.crudemployee.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // define employeeDAO
    private EmployeeDAO employeeDAO;
    // constructor injection
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
