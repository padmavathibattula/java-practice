package com.example.accessmodifiers2;

import com.example.accessmodifiers1.SameClass;

public class DifferentPackageDifferentClass {
	public static void main(String[] args) {
		SameClass obj =  new SameClass();
		obj.publicVar = 12;// we can access public variable from differentpackage and different class
		// obj.privateVar = 10;// we can not access private variable from differentPackage and different class
		//obj.protectedVar = 15;// we can access protected variable from differentpackage and different class
		// obj.defaultVar = 18;// we can not access default variable from differentPackage and different class

	}

}
