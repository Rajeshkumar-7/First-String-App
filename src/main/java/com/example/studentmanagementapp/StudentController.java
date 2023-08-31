package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.Logger;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentService studentService;

    // public Logger log = Logger.getLogger(String.valueOf(StudentController.class));

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return studentService.getStudent(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/getByPath/{id}")
    public Student getStudentByPath(@PathVariable("id") int regNo){
        return studentService.getStudentByPath(regNo);
    }

    @PutMapping("/update-age/{q}")
    public Student updateAge(@RequestParam("id") int regNo ,@PathVariable("q") int newAge){
        return studentService.updateAge(regNo , newAge);
    }

    @DeleteMapping("/deleteByPath/{id}")
    public String deleteByPath(@PathVariable("id") int regNo){
        return studentService.deleteByPath(regNo);
    }

    @DeleteMapping("/delete")
    public String deleteByParam(@RequestParam("id") int regNo){
        return studentService.deleteByParam(regNo);
    }

    @PutMapping("/updateCourse/{id}/{course}")
    public Student updateCourseByPath(@PathVariable("id") int regNo ,@PathVariable("course") String newCourse){
        return studentService.updateCourseByPath(regNo , newCourse);
    }

    @PutMapping("/updateCourseByparam")
    public Student updateCourseByParam(@RequestParam("id") int regNo ,@RequestParam("course") String newCourse){
        return studentService.updateCourseByParam(regNo , newCourse);
    }

    @PutMapping("updateCourseByBoth/{course}")
    public Student updateCourseByBoth(@RequestParam("id") int regNo ,@PathVariable("course") String newCourse){
        return studentService.updateCourseByBoth(regNo , newCourse);
    }

    @PutMapping("/updateCourseAndAge")
    public Student updateCourseAndAge(@RequestParam("id") int regNo ,@RequestBody Student student){
        return studentService.updateCourseAndAge(regNo , student);
    }
}
