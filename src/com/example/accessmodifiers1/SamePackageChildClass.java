package com.example.accessmodifiers1;

public class SamePackageChildClass extends SameClass {
	public static void main(String[] args) {
		SamePackageChildClass obj=new SamePackageChildClass();
		obj.publicVar = 12;// we can access public variable from same package
		//obj.privateVar = 10;// we can not access private variable from same package 
		obj.protectedVar = 15;// we can access protected variable from same package 
		obj.defaultVar = 18;// we can access default variable from same package 
	}

}
