package com.example.demoDBWeb.Repository;

import com.example.demoDBWeb.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
