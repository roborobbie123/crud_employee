package com.robb.crudemployee.Controller;

import com.robb.crudemployee.DAO.EmployeeDAO;
import com.robb.crudemployee.Entity.Employee;
import com.robb.crudemployee.Service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

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

       Employee employee = employeeService.findById(id);

       if(employee == null) {
           throw new RuntimeException("Employee with id " + id + " not found");
       }
       return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {

       // set id to 0 to force a new save, rather than an update
       employee.setId(0);

       Employee dbEmployee = employeeService.save(employee);

       return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {

       Employee dbEmployee = employeeService.save(employee);

       return dbEmployee;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {

       if(employeeService.findById(id) == null) {
           throw new RuntimeException("Employee with id " + id + " not found");
       }

       employeeService.deleteById(id);
    }



}
