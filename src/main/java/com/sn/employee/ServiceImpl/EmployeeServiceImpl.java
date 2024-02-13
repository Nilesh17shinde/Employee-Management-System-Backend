package com.sn.employee.ServiceImpl;

import com.sn.employee.entity.Employee;
import com.sn.employee.exception.ResourceNotFoundException;
import com.sn.employee.repository.EmployeeRepo;
import com.sn.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee, Long employeeId) {
        Employee updateEmployee=this.employeeRepo.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee","employeeId",employeeId));
        updateEmployee.setFirstName(employee.getFirstName());
        updateEmployee.setLastName(employee.getLastName());
        updateEmployee.setEmail(employee.getEmail());
        return this.employeeRepo.save(updateEmployee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return this.employeeRepo.findById(employeeId).orElseThrow(()->
                new ResourceNotFoundException("Employee","employeeId",employeeId));
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee>employees=this.employeeRepo.findAll();
        return employees;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
    Employee deleteEmployee=this.employeeRepo.findById(employeeId)
            .orElseThrow(()->new ResourceNotFoundException("Employee","employeeId",employeeId));
        this.employeeRepo.delete(deleteEmployee);
    }
}
