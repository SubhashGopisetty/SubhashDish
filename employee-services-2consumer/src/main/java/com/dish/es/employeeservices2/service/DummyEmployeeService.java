package com.dish.es.employeeservices2.service;

import com.dish.es.employeeservices2.dao.EmplyeeDao;
import com.dish.es.employeeservices2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyEmployeeService {
@Autowired
private EmplyeeDao emplyeeDao;

   public Employee getEmployeeById(int id){
        List<Employee> employeeList =emplyeeDao.employeeData();
        for (Employee employee:employeeList){
            if(employee.getEmpId() == id)
            {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getEmployees() {
        return emplyeeDao.employeeData();
    }
}
