package com.demo.pack1;

public class Student implements Comparable<Student> {
	private int studentId;
	private String studentName;
	private float marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, float marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-25s %-10s", studentId, studentName, marks);
	}

	@Override
	public int compareTo(Student o) {
		return studentId - o.studentId;
	}

}
