package com.dish.assignment.controller;

import com.dish.assignment.dao.EmployeeDao;
import com.dish.assignment.model.Employee;
import com.dish.assignment.model.EmployeeEntity;
import com.dish.assignment.service.EmployeeProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Validated
public class EmployeeController {
    
  


    @Autowired
    private EmployeeProcessor employeeProcessor;

    @GetMapping("/employee-service/employees")
    public ResponseEntity<List<Employee>> getEmployees()
    {
        List<Employee> employees = employeeProcessor.getEmployees();
        if(employees.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        return ResponseEntity.of(Optional.of(employees));
    }

    @GetMapping("/employee-service/employeesId")
    public ResponseEntity<Employee> getEmployeeById(@PathParam(value="employeeId") @NotNull
                                                                @Digits(message = "employeeid should only contains numeric data", integer = 2, fraction = 0) int employeeId)  {

        Employee employee=employeeProcessor.getEmployeeById(employeeId);
//        if(employee==null){
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        }
//        else if (EmployeeDao.employees.size()<employeeId){
//            throw new NoSuchElementException();
//        }
        if(employee==null)
        {
            throw new NoSuchElementException();
        }
        return ResponseEntity.of(Optional.of(employee));
    }

    @PostMapping("/employee-service/employees")
    public String createEmployee(@Valid @RequestBody EmployeeEntity employee){
      return employeeProcessor.addEmployee(employee);
    }
//    @GetMapping(value = "/demo")
//    public String getData(@PathParam("data") @NotNull String data){
//        System.out.println("in the method");
//        return data;
//    }


}
