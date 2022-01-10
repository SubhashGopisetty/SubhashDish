package com.dish.assignment.service;

import com.dish.assignment.dao.EmployeeDao;
import com.dish.assignment.model.Employee;
import com.dish.assignment.model.EmployeeEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EmployeeProcessor {

    @Autowired
    private EmployeeDao employeeDao;


public List<Employee> getEmployees(){
    log.info("Start of get Employee method {}",2);
    List <EmployeeEntity> employeeEntityList = employeeDao.employeeData();
    List<Employee> employeeList = new ArrayList<>();
   // Employee employee =null;
    for(EmployeeEntity employeeEntity:employeeEntityList){
        employeeList.add(
          Employee.builder()
                  .empId(employeeEntity.getEmpId())
                  .firstName(employeeEntity.getFirstName())
                  .lastName(employeeEntity.getLastName())
                  .age(employeeEntity.getAge())
                  .dob(employeeEntity.getDob())
                  .salary(employeeEntity.getSalary())
                  .phNo(employeeEntity.getPhNo())
                  .build()
        );
//        employee= new Employee();
//        employee.setEmpId(employeeEntity.getEmpId());
//        employee.setFirstName(employeeEntity.getFirstName());
//        employee.setLastName(employeeEntity.getLastName());
//        employee.setDob(employeeEntity.getDob());
//        employee.setAge(employeeEntity.getAge());
//        employee.setSalary(employeeEntity.getSalary());
//        employee.setPhNo(employeeEntity.getPhNo());
//        employeeList.add(employee);
   }
    return employeeList;

}

public Employee getEmployeeById(int id){
    List <EmployeeEntity> employeeEntityList = employeeDao.employeeData();
    List<Employee> employeeList = new ArrayList<>();
   // Employee employee =null;
    for(EmployeeEntity employeeEntity:employeeEntityList){
        employeeList.add(
                Employee.builder()
                        .empId(employeeEntity.getEmpId())
                        .firstName(employeeEntity.getFirstName())
                        .lastName(employeeEntity.getLastName())
                        .age(employeeEntity.getAge())
                        .dob(employeeEntity.getDob())
                        .salary(employeeEntity.getSalary())
                        .phNo(employeeEntity.getPhNo())
                        .build()
        );
//        employee= new Employee();
//        employee.setEmpId(employeeEntity.getEmpId());
//        employee.setFirstName(employeeEntity.getFirstName());
//        employee.setLastName(employeeEntity.getLastName());
//        employee.setDob(employeeEntity.getDob());
//        employee.setAge(employeeEntity.getAge());
//        employee.setSalary(employeeEntity.getSalary());
//        employee.setPhNo(employeeEntity.getPhNo());
//        employeeList.add(employee);
    }
    for(Employee emp:employeeList){
        if(id==emp.getEmpId())
        {
            return emp;
        }
    }
    return null;


    }
}
