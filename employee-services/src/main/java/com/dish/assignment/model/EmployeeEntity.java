package com.dish.assignment.model;

import javax.persistence.*;

@Entity
@Table(name = "TBL_EMPLOYEES")
public class EmployeeEntity {

    @Id
    @Column(name = "Id")@GeneratedValue()
    public int empId;
    @Column
    public String firstName;
    @Column
    public String lastName;
    @Column
    public String dob;
    @Column
    public int age;
    @Column
    public int salary;
    @Column
    public int phNo;


    public EmployeeEntity(int empId, String firstName, String lastName, String dob, int age, int salary, int phNo) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        this.salary = salary;
        this.phNo = phNo;
    }

    public EmployeeEntity() {

    }

    public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getPhNo() {
            return phNo;
        }

        public void setPhNo(int phNo) {
            this.phNo = phNo;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empId=" + empId +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", dob='" + dob + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", phNo=" + phNo +
                    '}';
        }
    }


