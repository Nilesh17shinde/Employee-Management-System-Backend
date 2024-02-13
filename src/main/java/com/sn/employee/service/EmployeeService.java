package com.sn.employee.service;

import com.sn.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee,Long employeeId);
    Employee getEmployeeById(Long employeeId);
    List<Employee>getAllEmployee();
    void deleteEmployee(Long employeeId);
}
