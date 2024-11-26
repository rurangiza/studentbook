package org.example.studentbookapp.models;

public class Student {
	private String name;
	private String studentId;

	public Student() {}
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String studentId) {
		this.studentId = studentId;
	}

}
