package com.demo.pack1;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
// 		return ( int) (student1.getMarks() - student2.getMarks());
		int result = 0;
		if (student1.getMarks() > student2.getMarks()) {
			result = 1;
		} else if (student1.getMarks() < student2.getMarks()) {
			result = -1;
		}
		return result;
	}

}
