package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> FindAll() {
        return repository.findAll();
    }

    public Student getStudent(String id) {
        return repository.findById(id).get();
    }

    public boolean deleteStudent(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }


    public Student InsertStudent(Student model) {
        return repository.save(model);
    }

    public Student updateStudent(Student model, String id) {
        Student oldModel = repository.findById(id).get();
        model.setId(oldModel.getId());
        return repository.save(model);
    }


}
