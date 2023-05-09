package com.example.accessmodifiers1;

public class SameClass {
	// default,public,private,protected
	
	public int publicVar;// public variable
	private int privateVar;// private variable
	protected int protectedVar;// protected variable
	int defaultVar;// default variable
	
	public static void main(String[] args) {
		SameClass obj=new SameClass();
		obj.publicVar=12;// we can access from same class
		obj.privateVar=10;// we can access from same class
		obj.protectedVar=15;// we can access from same class
		obj.defaultVar=18;// we can access from same class
	}

}
