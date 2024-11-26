package org.example.studentbookapp.controllers;

import org.example.studentbookapp.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {

	private final List<Student> students;

	public StudentController(List<Student> students) {
		this.students = new ArrayList<Student>();
		this.students.add(new Student("Eric", "1"));
		this.students.add(new Student("Bobby", "2"));
		this.students.add(new Student("David", "3"));
		this.students.add(new Student("Bulma", "4"));
		this.students.add(new Student("Greg", "5"));
	}

	@GetMapping()
	public List<Student> getStudents() {
		return this.students;
	}

	@GetMapping("/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable String studentId) {
		for (Student student : this.students) {
			if (student.getId().equals(studentId)) {
				return (ResponseEntity.ok(student));
			}
		}
		return ResponseEntity.notFound().build();
	}

}
