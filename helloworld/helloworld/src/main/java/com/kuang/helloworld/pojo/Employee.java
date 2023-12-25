package com.kuang.helloworld.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private  Integer id;
    private  String name;
    private  String email;
    private  Integer gender;
    private  Department department;
    private  Date birth;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employee)) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(id, employee.id) &&
//                Objects.equals(name, employee.name) &&
//                Objects.equals(email, employee.email) &&
//                Objects.equals(gender, employee.gender) &&
//                Objects.equals(department, employee.department) &&
//                Objects.equals(birth, employee.birth);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, email, gender, department, birth);
//    }

    public Employee(Integer id, String name, String email, Integer gender, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.department = department;


    }
}
