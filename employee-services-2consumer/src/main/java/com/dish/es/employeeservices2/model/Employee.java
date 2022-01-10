package com.dish.es.employeeservices2.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {

    //empId, firstName, lastName, dob, age, salary, phNumber
        public int empId;
        public String firstName;
        public String lastName;
        public String dob;
        public int age;
        public int salary;
        public int phNo;


    }
