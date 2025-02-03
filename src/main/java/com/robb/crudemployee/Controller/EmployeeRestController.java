package com.robb.crudemployee.Controller;

import com.robb.crudemployee.DAO.EmployeeDAO;
import com.robb.crudemployee.Entity.Employee;
import com.robb.crudemployee.Service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

   private EmployeeServiceImpl employeeService;

   public EmployeeRestController(EmployeeServiceImpl employeeService) {
       this.employeeService = employeeService;
   }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
       return employeeService.findById(id);
    }


}
