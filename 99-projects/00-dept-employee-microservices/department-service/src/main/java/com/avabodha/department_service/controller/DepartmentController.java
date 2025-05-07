package com.avabodha.department_service.controller;

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
import com.avabodha.department_service.client.EmployeeClient;
import com.avabodha.department_service.model.Department;
import com.avabodha.department_service.repository.DepartmentRepository;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

  private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

  @Autowired
  private DepartmentRepository repository;

  @Autowired
  private EmployeeClient employeeClient;

  @PostMapping
  public Department add(@RequestBody Department department) {
    LOGGER.info("Adding new department with id: {}", department.getId());
    return repository.addDepartment(department);
  }

  @GetMapping
  public List<Department> list() {
    LOGGER.info("listing all departments");
    List<Department> departments = repository.findAll();
    departments.forEach(department -> department
        .setEmployees(employeeClient.findByDepartmentId(department.getId())));
    return departments;
  }

  @GetMapping("/{id}")
  public Department getById(@PathVariable("id") Long id) {
    LOGGER.info("Getting department with id: {}", id);
    Department department = repository.findById(id);
    department.setEmployees(employeeClient.findByDepartmentId(department.getId()));
    return department;
  }
}
