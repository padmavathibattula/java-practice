package com.example.accessmodifiers2;

import com.example.accessmodifiers1.SameClass;

public class DifferentPackageChildClass extends SameClass {
	public static void main(String[] args) {
		DifferentPackageChildClass obj = new DifferentPackageChildClass();
		obj.publicVar = 12;// we can access public variable from differentpackageChildClass
		// obj.privateVar = 10;// we can not access private variable from differentPackageChildClass
		obj.protectedVar = 15;// we can access protected variable from same package
		// obj.defaultVar = 18;// we can not access default variable from differentPackageChildClass

	}
}
