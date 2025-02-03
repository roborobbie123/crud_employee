package com.robb.crudemployee.DAO;
import com.robb.crudemployee.Entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(Integer id);
}
