package com.example.demoDBWeb.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer salary;
    private String role;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department dep;

    public Employee(String name, Integer salary, String role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
