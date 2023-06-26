package com.example.collections;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		String studentName1 = o1.getStudentName();
		String studentName2 = o2.getStudentName();
		int result = studentName1.compareTo(studentName2);
		if (result < 0) {
			return -1;
		} else if (result > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
