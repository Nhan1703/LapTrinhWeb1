package com.example.studentmanager.controller;

import com.example.studentmanager.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot API";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Xin chào " + name;
    }

    @GetMapping("/students/search")
    public String search(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "1") int page) {
        return "keyword=" + keyword + ", page=" + page;
    }

    @GetMapping("/student/{id}")
    public String getStudentById(@PathVariable int id) {
        return "Sinh viên có mã: " + id;
    }

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(1, "Đinh Ngọc Thế Nhân", 20);
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
    List<Student> list = new ArrayList<>();
    list.add(new Student(1, "A", 20));
    list.add(new Student(2, "B", 21));
    return list;
    }

}
