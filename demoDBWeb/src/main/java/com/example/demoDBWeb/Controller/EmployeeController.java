package com.example.demoDBWeb.Controller;

import com.example.demoDBWeb.Model.Employee;
import com.example.demoDBWeb.Model.Student;
import com.example.demoDBWeb.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService empservice;

    public EmployeeController(EmployeeService empservice) {
        this.empservice = empservice;
    }

    public EmployeeService getEmpservice() {
        return empservice;
    }

    public void setEmpservice(EmployeeService empservice) {
        this.empservice = empservice;
    }

    @GetMapping("/employees")
    public List<Employee> listAllEmployees() {
        return empservice.listEmployees();
    }

    @PostMapping("employees/add")
    public void addEmployee(@RequestBody Employee emp) {
        empservice.addEmployee(emp);
    }

    @PatchMapping("/employees/update")
    public void changeSalary(@RequestParam String name, @RequestParam Integer salary) {
        empservice.changeSalary(name, salary);
    }

    @GetMapping("/students")
    public List<Student> listAllStudents() {
        return empservice.listStudents();
    }

    @PostMapping("students/add")
    public void addEmployee(@RequestBody Student s) {
        empservice.addStudent(s);
    }

//    @PatchMapping("/students/update")
//    public void changeSalary(@RequestParam String name, @RequestParam Integer salary) {
//        empservice.changeSalary(name, salary);
//    }

}
