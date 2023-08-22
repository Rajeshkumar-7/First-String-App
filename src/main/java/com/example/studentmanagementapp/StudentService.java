package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int regNo) {
        return studentRepository.getStudent(regNo);
    }

    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public Student getStudentByPath(int regNo) {
        return studentRepository.getStudentByPath(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        return studentRepository.updateAge(regNo , newAge);
    }

    public String deleteByPath(int regNo) {
        return studentRepository.deleteByPath(regNo);
    }

    public String deleteByParam(int regNo) {
        return studentRepository.deleteByParam(regNo);
    }

    public Student updateCourseByPath(int regNo, String newCourse) {
        return studentRepository.updateCourseByPath(regNo , newCourse);
    }

    public Student updateCourseByParam(int regNo, String newCourse) {
        return studentRepository.updateCourseByParam(regNo , newCourse);
    }

    public Student updateCourseByBoth(int regNo, String newCourse) {
        return studentRepository.updateCourseByBoth(regNo , newCourse);
    }

    public Student updateCourseAndAge(int regNo, Student student) {
        return studentRepository.updateCourseAndAge(regNo , student);
    }
}
