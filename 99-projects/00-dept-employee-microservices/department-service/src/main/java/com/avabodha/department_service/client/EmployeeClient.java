package com.avabodha.department_service.client;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import com.avabodha.department_service.model.Employee;

@HttpExchange
public interface EmployeeClient {

  @GetExchange("employees/departments/{id}")
  public List<Employee> findByDepartmentId(@PathVariable("id") Long id);
}
