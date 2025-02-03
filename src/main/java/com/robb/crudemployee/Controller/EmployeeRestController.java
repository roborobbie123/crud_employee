package com.robb.crudemployee.Controller;

import com.robb.crudemployee.DAO.EmployeeDAO;
import com.robb.crudemployee.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    // define employeeDAO
    private EmployeeDAO employeeDAO;

    // constructor injection
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeDAO.findAll();
    }

}
