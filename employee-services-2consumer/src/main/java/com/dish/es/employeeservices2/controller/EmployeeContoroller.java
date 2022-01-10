package com.dish.es.employeeservices2.controller;

import com.dish.es.employeeservices2.model.Employee;
import com.dish.es.employeeservices2.service.DummyEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeContoroller {
    @Autowired
    public RestTemplate restTemplate;
@Autowired
private DummyEmployeeService dummyEmployeeService;

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getEmployees(){

       // ResponseEntity<Employee> responseEntity ;
      //  return (List<Employee>) new RestTemplate().getForObject("http://localhost:8081/api/employee-service/employees", EmployeeList.class);
        List<Employee> list =dummyEmployeeService.getEmployees();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

   @GetMapping("/getEmployeeById/{employeeId}")
    public Employee getEmployeeById(@PathVariable(value = "employeeId") int id){
//       HttpHeaders headers = new HttpHeaders();
//       headers.setContentType(MediaType.APPLICATION_JSON);
//
//       HttpEntity<Employee> requestEntity = new HttpEntity(headers);

       ResponseEntity<Employee> response =restTemplate.getForEntity("http://localhost:8081/api/employee-service/employeesId?employeeId="+id,
               Employee.class);
       return response.getBody();

//       return restTemplate.exchange("http://localhost:8081/api/employee-service/employeesId/1",
//               HttpMethod.GET,
//               requestEntity,
//               Employee.class).getBody();


   }

}
