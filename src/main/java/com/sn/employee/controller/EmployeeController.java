package com.sn.employee.controller;

import com.sn.employee.entity.ApiResponse;
import com.sn.employee.entity.Employee;
import com.sn.employee.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) {
        Employee savedEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @PutMapping("/update/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee employee, @PathVariable Long employeeId) {
        Employee updatedEmployee = this.employeeService.updateEmployee(employee, employeeId);
        return ResponseEntity.ok(updatedEmployee);
    }
    @GetMapping("/get/{employeeId}")
    public ResponseEntity<Employee>getSingleEmployeeById(@PathVariable Long employeeId){
    return ResponseEntity.ok(this.employeeService.getEmployeeById(employeeId));
    }
    @GetMapping("/index")
    private ResponseEntity<List<Employee>>getAllEmployee(){
        return ResponseEntity.ok(this.employeeService.getAllEmployee());
    }
    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<ApiResponse>deleteEmployee(@PathVariable Long employeeId){
        this.employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Employee deleted successfully",true),HttpStatus.OK);
    }
}
