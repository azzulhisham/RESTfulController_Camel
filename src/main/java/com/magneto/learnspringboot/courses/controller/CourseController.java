package com.magneto.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.magneto.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {

	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Learn Sprint Boot", "Youtube"),
				new Course(2, "Learn Apache Camel", "Youtube"),
				new Course(3, "Learn Apache Nifi", "Youtube"));
	}
	
	//http://localhost:8080/courses/1
	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> getCoursesDetail(@PathVariable(name = "id") int id) {
		
		List<Course> courses = Arrays.asList(new Course(0, "Learn Sprint Boot", "Youtube"),
				new Course(1, "Learn Apache Camel", "Udemy"),
				new Course(2, "Learn Apache Nifi", "Youtube"),
				new Course(3, "Learn Maven", "Udemy"));
		
		
		if (id > 3) {
			 return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		else {
			 return new ResponseEntity<>(courses.get(id), HttpStatus.OK);
		}
			
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return course;
	}
}
