package com.example.studentmanagementapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentManagementAppApplicationTests {

	@Autowired
	StudentService studentService;

	@BeforeEach
	public void prepare(){
		studentService.addStudent(new Student(1 , "Ruturaj" , 25 , "Cricket"));
		studentService.addStudent(new Student(2 , "Mohit" , 25 , "Cricket"));
		studentService.addStudent(new Student(3 , "Rohit" , 25 , "Cricket"));
	}
	@Test
	public void addStudentTest(){
		Student student = new Student(1 , "Ruturaj" , 25 , "Cricket");
		studentService.addStudent(student);

		Student expectedOutput = new Student(1 , "Ruturaj" , 25 , "Cricket");
		Student actualOutput = studentService.getStudent(1);

		Assertions.assertEquals(expectedOutput.getRegNo() , actualOutput.getRegNo());
		Assertions.assertEquals(expectedOutput.getName() , actualOutput.getName());
		Assertions.assertEquals(expectedOutput.getAge() , actualOutput.getAge());
		Assertions.assertEquals(expectedOutput.getCourse() , actualOutput.getCourse());
	}
	@Test
	public void getStudentTest(){

		Student expectedOutput = new Student(3 , "Rohit" , 25 , "Cricket");
		Student actualOutput = studentService.getStudent(3);

		Assertions.assertEquals(expectedOutput.getRegNo() , actualOutput.getRegNo());
		Assertions.assertEquals(expectedOutput.getName() , actualOutput.getName());
		Assertions.assertEquals(expectedOutput.getAge() , actualOutput.getAge());
		Assertions.assertEquals(expectedOutput.getCourse() , actualOutput.getCourse());
	}
	@Test
	void contextLoads() {
	}

}
