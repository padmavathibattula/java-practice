package com.example.collections;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		String studentid1=o1.getStudentId();
		String studentid2=o2.getStudentId();
		int result=studentid1.compareTo(studentid2);
		return result;
	}

}
