package com.example.collections;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String empid1 = o1.getEmpId();
		String empid2 = o2.getEmpId();
		int result = empid1.compareTo(empid2);
		return result;
	}
}
