package com.dish.assignment;

import com.dish.assignment.controller.EmployeeController;
import com.dish.assignment.dao.EmployeeDao;
import com.dish.assignment.model.Employee;
import com.dish.assignment.model.EmployeeEntity;
import com.dish.assignment.service.EmployeeProcessor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ControllerMockitoTest {

    @Mock
    EmployeeProcessor processor;



    @InjectMocks
    EmployeeController controller;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getEmployeesTest(){
        List<Employee>list=new ArrayList<>();
        list.add(new Employee(1,"somu","RK","20-12-1999",22,222,898982113));
        list.add(new Employee(2,"ramnu","kolla","1-09-2001",20,120,996633211));

        when(processor.getEmployees()).thenReturn(list);

       ResponseEntity<List<Employee>> employeeList =controller.getEmployees();

       assertEquals(2,employeeList.getBody().size());
       assertEquals(HttpStatus.OK,employeeList.getStatusCode());

    }

    @Test
    public void getEmployeesByIdTest(){

        when(processor.getEmployeeById(1)).thenReturn(new Employee(1,"somu","RK","20-12-1999",22,222,898982113));

        Employee employee =controller.getEmployeeById(1).getBody();

        assertEquals("somu",employee.getFirstName());
        assertEquals(22,employee.getAge());
        assertEquals(898982113,employee.getPhNo());
    }

    @Test
    public void saveEmployeeTest(){
        EmployeeEntity employee = new EmployeeEntity(1,"somu","RK","20-12-1999",22,222,898982113);

        controller.createEmployee(employee);

        verify(processor,times(1)).addEmployee(employee);
    }

}
