package com.dish.assignment;

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
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ServiceMackitoTest {

    @Mock
    EmployeeDao Dao;

    @InjectMocks
    EmployeeProcessor Processor;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllEmployeesTest(){
        List<EmployeeEntity>myEmployeesList=new ArrayList<>();
        myEmployeesList.add(new EmployeeEntity(1,"somu","RK","20-12-1999",22,222,898982113));
        myEmployeesList.add(new EmployeeEntity(2,"ramnu","kolla","1-09-2001",20,120,996633211));

        when(Dao.employeeData()).thenReturn(myEmployeesList);

        List<Employee>employeeList=Processor.getEmployees();
        assertEquals(2,employeeList.size());
    }

    @Test
    public void getEmployeeById(){
        List<EmployeeEntity>myEmployeesList=new ArrayList<>();
        myEmployeesList.add(new EmployeeEntity(1,"somu","RK","20-12-1999",22,222,898982113));
        myEmployeesList.add(new EmployeeEntity(2,"ramnu","kolla","1-09-2001",20,120,996633211));

        when(Dao.employeeData()).thenReturn(myEmployeesList);

        Employee emp=Processor.getEmployeeById(1);

        assertEquals("somu",emp.getFirstName());
        assertEquals("Rk",emp.getLastName());
    }

    @Test
    public void addEmployeeTest( ){

        EmployeeEntity employee=new EmployeeEntity(1,"somu","RK","20-12-1999",22,222,898982113);
        Processor.addEmployee(employee);
        verify(Dao, times(1)).addEmployee(employee);
    }

}
