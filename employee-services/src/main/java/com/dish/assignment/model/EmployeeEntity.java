package com.dish.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TBL_EMPLOYEES")
public class EmployeeEntity {

    @Id
    @Column(name = "Id")
    @NotNull
    public int empId;

   // @NotNull(message = "First Name is Mandatory")
    @Column
    @NotNull
    public String firstName;

   // @NotNull(message = "Last Name is Mandatory")
    @Column
    @NotNull
    public String lastName;

//    @Past
    @Column
    public String dob;

    @Min(value = 18,message = "The min Age was 18 years you are not eligible")
    @Column
    public int age;

    @Column
    public int salary;


    @Min(value=9,message = "The contact information should not to be blank")
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
    public EmployeeEntity(EmployeeEntity employeeEntity) {
        this.empId=employeeEntity.getEmpId();
        this.firstName=employeeEntity.getFirstName();
        this.lastName=employeeEntity.getLastName();
        this.dob =employeeEntity.getDob();
        this.age =employeeEntity.getAge();
        this.salary=employeeEntity.getSalary();
        this.phNo =employeeEntity.getPhNo();
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


