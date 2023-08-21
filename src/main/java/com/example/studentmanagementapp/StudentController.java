package com.example.studentmanagementapp;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

    Map<Integer , Student> db = new HashMap<>();

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){

        return db.get(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        db.put(student.getRegNo() , student);
        return "Student has been added successfully";
    }

    @GetMapping("/getByPath/{id}")
    public Student getStudentByPath(@PathVariable("id") int regNo){
        return db.get(regNo);
    }

    @PutMapping("/update-age/{q}")
    public Student updateAge(@RequestParam("id") int regNo ,@PathVariable("q") int newAge){
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    @DeleteMapping("/deleteByPath/{id}")
    public String deleteByPath(@PathVariable("id") int regNo){
        db.remove(regNo);
        return "Student info has been Deleted";
    }

    @DeleteMapping("/delete")
    public String deleteByParam(@RequestParam("id") int regNo){
        db.remove(regNo);
        return "Student info has been Deleted";
    }

    @PutMapping("/updateCourse/{id}/{course}")
    public Student updateCourseByPath(@PathVariable("id") int regNo ,@PathVariable("course") String newCourse){
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    @PutMapping("/updateCourseBypath")
    public Student updateCourseByParam(@RequestParam("id") int regNo ,@RequestParam("course") String newCourse){
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    @PutMapping("updateCourseByBoth/{course}")
    public Student updateCourseByBoth(@RequestParam("id") int regNo ,@PathVariable("course") String newCourse){
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    @PutMapping("/updateCourseAndAge")
    public Student updateCourseAndAge(@RequestParam("id") int regNo ,@RequestBody Student student){
        db.get(regNo).setCourse(student.getCourse());
        db.get(regNo).setAge(student.getAge());
        return db.get(regNo);
    }
}
