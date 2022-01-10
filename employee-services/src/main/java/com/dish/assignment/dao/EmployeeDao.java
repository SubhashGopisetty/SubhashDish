package com.dish.assignment.dao;

import com.dish.assignment.model.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Repository
//@Component
public class EmployeeDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

  public static List<EmployeeEntity> employees =new ArrayList<>();
//    static {
//        employees.add(new EmployeeEntity(1,"subbu","GA","1-09-1999",22,4000,123456678));
//        employees.add(new EmployeeEntity(2,"ramnu","kolla","1-09-2001",20,3000,996633211));
//        employees.add(new EmployeeEntity(3,"somu","RK","20-12-1999",22,34000,898982113));
//        employees.add(new EmployeeEntity(4,"Rajesh","kr","21-09-1998",23,54000,1234568910));
//        employees.add(new EmployeeEntity(5,"Rakesh","RK","12-09-1999",22,22000,123456789));
//        employees.add(new EmployeeEntity(6,"Raghu","RF","23-03-2000",21,10000,234567890));
//
//    }

    private RowMapper<EmployeeEntity> rowMapper=(ResultSet rs,int rowNum)->{
        EmployeeEntity employeeEntity= new EmployeeEntity();
        employeeEntity.setEmpId(rs.getInt(1));
        employeeEntity.setFirstName(rs.getString(2));
        employeeEntity.setLastName(rs.getString(3));
        employeeEntity.setDob(rs.getString(4));
        employeeEntity.setAge(rs.getInt(5));
        employeeEntity.setSalary(rs.getInt(6));
        employeeEntity.setPhNo(rs.getInt(7));

        return employeeEntity;
    };
    public List<EmployeeEntity> employeeData(){

        //return employees;

    return jdbcTemplate.query("SELECT * FROM TBL_EMPLOYEES",rowMapper);
    }
//    public EmployeeEntity employeeDataById(int id){
//        return jdbcTemplate.query("SELECT * FROM TBL_EMPLOYEES WHERE EMP_ID=id",rowMapper);
//    }


}

