package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BaseController {
    @Autowired
    private StudentService service;


    @GetMapping(value = {"","/"})
    public List<Student> index(){
        return  service.FindAll();
    }

    @GetMapping(value = {"/{id}"})
    public Student student(@PathVariable("id") String studentId){
        return  service.getStudent(studentId);
    }

    @PostMapping(value = {"/students"})
    public Student saveStudent(@RequestBody Student student){
        return service.InsertStudent(student);
    }

    @DeleteMapping("/students/del/{id}")
    public boolean delStudent(@PathVariable("id") String studentId){
         return  service.deleteStudent(studentId);
    }

    @PostMapping(value = {"/students/{id}"})
    public Student updateStudent(@RequestBody Student student,@PathVariable("id") String studentId){
        return service.updateStudent(student,studentId);
    }

    @GetMapping(value = {"/index"})
    public String hello(){
        return  "Hello World";
    }

}
