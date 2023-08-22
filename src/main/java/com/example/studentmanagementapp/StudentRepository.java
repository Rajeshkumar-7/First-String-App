package com.example.studentmanagementapp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer , Student> db = new HashMap<>();

    public Student getStudent(int regNo) {
        return db.get(regNo);
    }

    public String addStudent(Student student) {
        db.put(student.getRegNo() , student);
        return "Student has been added successfully";
    }

    public Student getStudentByPath(int regNo) {
        return db.get(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    public String deleteByPath(int regNo) {
        db.remove(regNo);
        return "Student info has been Deleted";
    }

    public String deleteByParam(int regNo) {
        db.remove(regNo);
        return "Student info has been Deleted";
    }

    public Student updateCourseByPath(int regNo, String newCourse) {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student updateCourseByParam(int regNo, String newCourse) {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student updateCourseByBoth(int regNo, String newCourse) {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student updateCourseAndAge(int regNo, Student student) {
        db.get(regNo).setCourse(student.getCourse());
        db.get(regNo).setAge(student.getAge());
        return db.get(regNo);
    }
}
