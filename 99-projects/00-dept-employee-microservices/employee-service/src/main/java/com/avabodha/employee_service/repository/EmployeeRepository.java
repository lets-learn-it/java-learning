package com.avabodha.employee_service.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.avabodha.employee_service.model.Employee;

@Repository
public class EmployeeRepository {
  private List<Employee> employees = new ArrayList<>();

  public Employee add(Employee employee) {
    employees.add(employee);
    return employee;
  }

  public List<Employee> findAll() {
    return employees;
  }

  public Employee findById(Long id) {
    return employees.stream().filter(employee -> employee.id().equals(id)).findFirst()
        .orElseThrow();
  }

  public List<Employee> findByDepartment(Long departmentId) {
    return employees.stream().filter(employee -> employee.departmentId().equals(departmentId))
        .toList();
  }
}
