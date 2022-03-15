package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
    @Id
    private String id;
    private String name;
    private String classStud;
    private int age;
    private double avg;

    public Student(String name, String classStud, int age, double avg) {
        this.name = name;
        this.classStud = classStud;
        this.age = age;
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStud() {
        return classStud;
    }

    public void setClassStud(String classStud) {
        this.classStud = classStud;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
