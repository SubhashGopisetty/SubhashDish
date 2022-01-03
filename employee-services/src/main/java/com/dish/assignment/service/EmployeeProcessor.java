package com.dish.assignment.service;

import com.dish.assignment.dao.EmployeeDao;
import com.dish.assignment.model.Employee;
import com.dish.assignment.model.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeProcessor {
@Autowired
    public EmployeeDao employeeDao;

public List<Employee> getEmployees(){
    List <EmployeeEntity> employeeEntityList = employeeDao.employeeData();
    List<Employee> employeeList = new ArrayList<>();
    Employee employee =null;
   for(EmployeeEntity employeeEntity:employeeEntityList){
        employee= new Employee();
        employee.setEmpId(employeeEntity.getEmpId());
        employee.setFirstName(employeeEntity.getFirstName());
        employee.setLastName(employeeEntity.getLastName());
        employee.setDob(employeeEntity.getDob());
        employee.setAge(employeeEntity.getAge());
        employee.setSalary(employeeEntity.getSalary());
        employee.setPhNo(employeeEntity.getPhNo());
        employeeList.add(employee);
   }
    return employeeList;
}

public Employee getEmployeeById(int id){
    List <EmployeeEntity> employeeEntityList = employeeDao.employeeData();
    List<Employee> employeeList = new ArrayList<>();
    Employee employee =null;
    for(EmployeeEntity employeeEntity:employeeEntityList){
        employee= new Employee();
        employee.setEmpId(employeeEntity.getEmpId());
        employee.setFirstName(employeeEntity.getFirstName());
        employee.setLastName(employeeEntity.getLastName());
        employee.setDob(employeeEntity.getDob());
        employee.setAge(employeeEntity.getAge());
        employee.setSalary(employeeEntity.getSalary());
        employee.setPhNo(employeeEntity.getPhNo());
        employeeList.add(employee);
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
