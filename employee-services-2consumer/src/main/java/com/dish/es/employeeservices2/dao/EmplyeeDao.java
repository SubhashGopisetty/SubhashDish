package com.dish.es.employeeservices2.dao;

import com.dish.es.employeeservices2.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmplyeeDao {

    public static List<Employee> employees =new ArrayList<>();
    static {
        employees.add(new Employee(1,"subbu","GA","1-09-1999",22,4000,123456678));
        employees.add(new Employee(2,"ramnu","kolla","1-09-2001",20,3000,996633211));
        employees.add(new Employee(3,"somu","RK","20-12-1999",22,34000,898982113));
        employees.add(new Employee(4,"Rajesh","kr","21-09-1998",23,54000,1234568910));
        employees.add(new Employee(5,"Rakesh","RK","12-09-1999",22,22000,123456789));
        employees.add(new Employee(6,"Raghu","RF","23-03-2000",21,10000,234567890));

    }
    public List<Employee> employeeData() {

        return employees;
    }
}
