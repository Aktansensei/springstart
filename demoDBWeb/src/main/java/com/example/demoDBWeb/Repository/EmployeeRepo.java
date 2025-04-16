package com.example.demoDBWeb.Repository;

import com.example.demoDBWeb.Model.Employee;
import com.example.demoDBWeb.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Optional<Employee> findByName(String name);
}

