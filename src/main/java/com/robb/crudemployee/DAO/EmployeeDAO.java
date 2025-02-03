package com.robb.crudemployee.DAO;

import com.robb.crudemployee.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
