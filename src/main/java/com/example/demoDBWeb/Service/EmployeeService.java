package com.example.demoDBWeb.Service;

import com.example.demoDBWeb.Model.Employee;
import com.example.demoDBWeb.Model.Student;
import com.example.demoDBWeb.Repository.EmployeeRepo;
import com.example.demoDBWeb.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepo emprepo;
    private StudentRepo studrepo;

    public EmployeeService(EmployeeRepo emprepo, StudentRepo studrepo) {
        this.emprepo = emprepo;
        this.studrepo = studrepo;
    }

    public EmployeeRepo getEmprepo() {
        return emprepo;
    }

    @Autowired
    public void setEmprepo(EmployeeRepo emprepo) {
        this.emprepo = emprepo;
    }

    public List<Employee> listEmployees() {
        return emprepo.findAll();
    }

    public List<Student> listStudents() {
        return studrepo.findAll();
    }

    public void addEmployee(Employee e) {
        emprepo.save(e);
    }

    public void addStudent(Student s) {
        studrepo.save(s);
    }

    public void changeSalary(String name, Integer salary) {
        Employee emp = emprepo.findByName(name).get();
        emp.setSalary(salary);
        emprepo.save(emp);
    }


}
