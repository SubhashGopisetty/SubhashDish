package com.dish.assignment.controller;

import com.dish.assignment.model.Employee;
import com.dish.assignment.service.EmployeeProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeProcessor employeeProcessor;

    @GetMapping("/employee-service/employees")
    public ResponseEntity<List<Employee>> getEmployees()
    {
        List<Employee> employees = employeeProcessor.getEmployees();
        if(employees.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employees));
    }

    @GetMapping("/employee-service/employee")
    public ResponseEntity<Employee> getEmployeeById(@RequestParam(value="employeeId") int employeeId){
        Employee employee=employeeProcessor.getEmployeeById(employeeId);
        if(employee==null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.of(Optional.of(employee));
    }


}
