package com.avabodha.employee_service.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avabodha.employee_service.model.Employee;
import com.avabodha.employee_service.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

  @Autowired
  private EmployeeRepository repository;

  @PostMapping
  public Employee add(@RequestBody Employee employee) {
    LOGGER.info("Employee with id: {} adding", employee.id());
    return repository.add(employee);
  }

  @GetMapping
  public List<Employee> findAll() {
    LOGGER.info("listing all employees");
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public Employee findById(@PathVariable("id") Long id) {
    LOGGER.info("find employee by id: {}", id);
    return repository.findById(id);
  }

  @GetMapping("/departments/{id}")
  public List<Employee> findByDepartmentId(@PathVariable("id") Long id) {
    LOGGER.info("find employee by department id: {}", id);
    return repository.findByDepartment(id);
  }
}
