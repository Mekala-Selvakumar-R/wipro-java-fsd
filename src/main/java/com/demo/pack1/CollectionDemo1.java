package com.demo.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionDemo1 {

	public static void main(String[] args) {
//		Integer bonus = null;
//		int total = bonus + 10;

		ArrayList<Student> studentList = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String choice = "yes";
		while ("Yes".equalsIgnoreCase(choice)) {
			System.out.println("Enter studentId");
			int studentId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter StudentName");
			String studentName = sc.nextLine();
			System.out.println("Enter Marks");
			float marks = sc.nextFloat();
			Student student = new Student(studentId, studentName, marks);
//			System.out.println(student);
			studentList.add(student);
			System.out.println("Do you like to More Student: ");
			choice = sc.next();
		}
		studentList.forEach(System.out::println);
		System.out.println("---------------------");

		Collections.sort(studentList);
		studentList.forEach(System.out::println);

		System.out.println("---------------------");

		Collections.sort(studentList, new MarkComparator());
		studentList.forEach(System.out::println);

		System.out.println("Enter Student Id to delete");
		int id = sc.nextInt();
//		Iterator<Student> it = studentList.iterator();
//		boolean found = false;
//		while (it.hasNext()) {
//			Student s1 = it.next();
//			if (s1.getStudentId() == id) {
//				it.remove();
//				found = true;
//				System.out.println(s1);
//				System.out.println("Stduent - deleted");
//				break;
//			}
//		}
//		if (found == false) {
//			System.out.println("Invalid Student Id");
//		}

//		boolean found = false;
//		Student student1 = null;
//		for (Student student : studentList) {
//			if (student.getStudentId() == id) {
//				student1 = student;
//				found = true;
//				break;
//			}
//
//		}
//		studentList.remove(student1);

		studentList.removeIf(s -> s.getStudentId() == id);
		System.out.println(studentList);

	}

}
