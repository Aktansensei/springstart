package com.example.demoDBWeb.Repository;

import com.example.demoDBWeb.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    List<Student> findByName(String name);
}
