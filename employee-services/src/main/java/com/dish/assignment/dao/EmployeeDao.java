package com.dish.assignment.dao;

import com.dish.assignment.model.EmployeeEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao {
  public static List<EmployeeEntity> employees =new ArrayList<>();
    static {
        employees.add(new EmployeeEntity(1,"subbu","GA","1-09-1999",22,4000,123456678));
        employees.add(new EmployeeEntity(2,"ramnu","kolla","1-09-2001",20,3000,996633211));
        employees.add(new EmployeeEntity(3,"somu","RK","20-12-1999",22,34000,898982113));
        employees.add(new EmployeeEntity(4,"Rajesh","kr","21-09-1998",23,54000,1234568910));
        employees.add(new EmployeeEntity(5,"Rakesh","RK","12-09-1999",22,22000,123456789));
        employees.add(new EmployeeEntity(6,"Raghu","RF","23-03-2000",21,10000,234567890));

    }

    public List<EmployeeEntity> employeeData(){
        return employees;
    }

}

