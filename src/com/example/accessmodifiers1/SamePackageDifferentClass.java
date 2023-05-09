package com.example.accessmodifiers1;

public class SamePackageDifferentClass {
	public static void main(String[] args) {
		SameClass obj=new SameClass();
		obj.publicVar = 12;// we can access public variable from same package and different class
		//obj.privateVar = 10;// we can not access private variable from same package and different class
		obj.protectedVar = 15;// we can access protected variable from same package and different class
		obj.defaultVar = 18;// we can access default variable from same package and different class
	}

}
